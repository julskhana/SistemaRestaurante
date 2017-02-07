package bd;

//import entidades.Universidad;
//import entidades.Usuario;
import Objetos.*;
import java.sql.*;
import java.util.ArrayList;

public class ConexionBase {
    
       private Connection con;
       private static final String DRIVER = "com.mysql.jdbc.Driver";
       private static final String DBMS = "mysql";
       private static final String HOST = "127.0.0.1";
       private static final String PORT = "3306";
       private static final String DATABASE = "base_restaurante1";
       private static final String USER = "root";
       private static final String PASSWORD = "";

    void Conexion(){}
    
    /*METODO CONECTAR*/
   
    public void conectar ()throws Exception{
        try {
            Class.forName(DRIVER);
        }catch(ClassNotFoundException ce){
        }
        
            try{
                this.con = DriverManager.getConnection("jdbc:" + DBMS + "://" + HOST + ":" + PORT + "/" + DATABASE, USER, PASSWORD);                
                System.out.println("CONEXION EXITOSA CON LA BASE DE DATOS");
            }catch(SQLException exception){
                System.out.println("ERROR: NO SE PUDO CONECTAR CON LA BASE DE DATOS: "+exception);
            }             
    }
    
    public boolean desconectar()
    {
        try
        {
            this.con.close();
            return(true);
        }
        catch(Exception e)
        {
            return(false);
        }    
    }
    
    public boolean esUsuarioValido(Usuario u)
    {        
        boolean resultado = false;
        ResultSet rs = null;                       
        PreparedStatement st = null;
        try
        {            
            st = con.prepareStatement("SELECT * FROM usuario WHERE cuenta = ? AND clave = ? AND estado = ?");            
            st.setString(1,u.getCuenta());         
            st.setString(2,u.getClave());
            st.setString(3,"activo");
            rs = st.executeQuery();            
            if(rs.next()){
                u.setRol(rs.getString("rol"));
                resultado = true;
            } 
            rs.close();
            st.close();
        }
        catch(Exception e){
            System.out.println(e);
            resultado = false;
        }           
     return resultado; 
    }
    
    //funcion para ingresar cliente a bd
    public boolean ingresarCliente(Cliente cliente){
        
        try{
            //Ingreso de Datos de Cliente
            PreparedStatement st=null;
            st = con.prepareStatement("INSERT INTO Cliente(cedula,nombre,apellido,correo,tipo,edad,fecha_nacimiento,sexo,direccion,telefono) VALUES(?,?,?,?,?,?,?,?,?,?)");
            st.setString(1,cliente.getCedula());
            st.setString(2,cliente.getNombres());
            st.setString(3,cliente.getApellidos());
            st.setString(4,cliente.getCorreo());
            st.setString(5,cliente.getTipo());
            st.setInt(6,cliente.getEdad());
            st.setString(7,cliente.getFecha_nacimiento());
            st.setString(8,cliente.getSexo());
            //st.setString(9,cliente.getEstado());
            st.setString(9,cliente.getDireccion());
            st.setString(10,cliente.getTelefono());
            
            st.executeUpdate();
            st.close();
            
            System.out.println("Cliente Ingresado a DB...");
            return true;
        }catch (Exception e){
            System.out.println("Error al ingrear cliente a DB...");
            return false;
        }
    }
    
    public boolean modificarCliente(Cliente cl)
    {
        
        /*
        //obteniendo id desde cedula
        String ced = cl.getCedula();
        System.out.println("Cedula del cliente: "+ced);
        String id_cli="";
        Cliente climod = new Cliente();
        //ResultSet rs = null;                       
        PreparedStatement st = null;
        System.out.println("consulando cedula de cliente para obtener id");
                
        try{
            PreparedStatement st1 = con.prepareStatement("select * from cliente where cedula = "+ced+";");
            ResultSet rs = st1.executeQuery();
            id_cli = rs.getString("id");
            System.out.println("cliente id: "+id_cli);
            st1.close();
            rs.close();
        }catch (Exception e){
            System.out.println(e);
        }
        */
        
        //modificando datos
        try
        {
            int idc = cl.getId();
            System.out.println("id de usuario: "+idc);
            PreparedStatement st2 = null;
            st2 = con.prepareStatement("update cliente set nombre = ?, apellido = ?, correo = ?, tipo = ?, edad = ?, fecha_nacimiento = ?, sexo = ?, estado = 1 , direccion = ?, telefono = ? where id = ?");
            st2.setString(1,cl.getNombres());
            st2.setString(2,cl.getApellidos());
            st2.setString(3,cl.getCorreo());
            st2.setString(4,cl.getTipo());
            st2.setInt(5,cl.getEdad());
            st2.setString(6,cl.getFecha_nacimiento());
            st2.setString(7,cl.getSexo());
            st2.setString(8,cl.getDireccion());
            st2.setString(9,cl.getTelefono());            
            st2.setInt(10,cl.getId());            
            
            st2.executeUpdate();
            st2.close();
            System.out.println("modificacion de cliente exitosa");
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
        
    }
    
    //funcion para cargar al sistema datos de los clientes
    public ArrayList<Cliente> cargarClientes() throws Exception , SQLException{
        //recoleccion de datos de clientes en base de datos a arraylist
        Statement st = this.con.createStatement();
        ResultSet rst = st.executeQuery("SELECT * FROM cliente");
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        while (rst.next()){
            Cliente c = new Cliente(Integer.getInteger(rst.getString("id")),rst.getString("cedula"),rst.getString("nombre"),rst.getString("apellido"),rst.getString("correo"),rst.getString("tipo"),Integer.getInteger(rst.getString("edad")),rst.getString("fecha_nacimiento"),rst.getString("sexo"),rst.getString("estado"),rst.getString("direccion"),rst.getString("telefono"));
            listaClientes.add(c);
        }
        return listaClientes;
    }
    
    //funcion para consultar clientes en bd
    public ArrayList<Cliente> consultarClientes(String busqueda, String tip){
        ArrayList<Cliente> registroC = new ArrayList<Cliente>();
        
        try{
            //rs es resultado
            Statement st = this.con.createStatement();
            ResultSet rs = null;
            
            if (tip.equalsIgnoreCase("cliente")){
                rs = st.executeQuery("SELECT * FROM cliente;");
            }else if (tip.equalsIgnoreCase("huesped")){
                rs = st.executeQuery("select * from cliente where tipo = huesped;");
            }else if (tip.equalsIgnoreCase("cedula")){
                rs = st.executeQuery("select * from cliente where cedula = "+tip+";");
            }else{
                rs = st.executeQuery("SELECT * FROM cliente WHERE "+tip+" LIKE '%"+busqueda+"%';");
            }
            while(rs.next())
            {
                int id = rs.getInt("id");
                String cedula = rs.getString("cedula");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String correo = rs.getString("correo");
                String tipo = rs.getString("tipo");
                int edad = rs.getInt("edad");
                String fecha_nacimiento = rs.getString("fecha_nacimiento");
                String sexo = rs.getString("sexo");
                //int estado = rs.getInt("estado");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                //creacion de cliente desde consulta
                Cliente cli = new Cliente(id,cedula,nombre,apellido,correo,tipo,edad,fecha_nacimiento,sexo,direccion,telefono);
                registroC.add(cli);
            }
            System.out.println("cliente consultado");
        }catch(Exception e){
            System.out.println("error en consulta de cliente db");
        }
        return (registroC);
    }
    
    
    /*
    public boolean ingresarUniversidad(Universidad u)
    {
        try
        {
                PreparedStatement st = null;
                st = con.prepareStatement("INSERT INTO universidad(nombre,direccion,ciudad,telefono) VALUES(?,?,?,?) ");            
                st.setString(1,u.getNombre());
                st.setString(2,u.getDireccion());
                st.setString(3,u.getCiudad());
                st.setString(4,u.getTelefono());
                st.executeUpdate();
                st.close();                        
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }        
    }
    
    public ArrayList<Universidad> consultarUniversidades(String descripcion, String tipo)
    {
        ArrayList<Universidad> universidades = new ArrayList<Universidad>();

        try
        {
            Statement st = this.con.createStatement();
            ResultSet rs = null;  
            
            if(tipo.equalsIgnoreCase("TODOS")){
                rs = st.executeQuery("SELECT * FROM universidad;");
            }else if(tipo.equalsIgnoreCase("ID")){
                rs = st.executeQuery("SELECT * FROM universidad WHERE id = "+descripcion+";");
            }else{
                rs = st.executeQuery("SELECT * FROM universidad WHERE "+tipo+" LIKE '%"+descripcion+"%';");
            }            
                        
            while(rs.next())
            {
                int id              = rs.getInt("id");
                String nombre       = rs.getString("nombre");
                String direccion    = rs.getString("direccion");
                String ciudad       = rs.getString("ciudad");
                String telefono     = rs.getString("telefono");
                Universidad u = new Universidad(id, nombre, direccion, ciudad, telefono);                
                universidades.add(u);
            }
        }
        catch(Exception e){System.out.println(e);}
     return(universidades);
    } 
    
    
    public boolean modificarUniversidad(Universidad u)
    {
        try
        {
            PreparedStatement st = null;
            st = con.prepareStatement("UPDATE universidad SET nombre = ?, ciudad = ?, direccion = ?, telefono = ? WHERE id = ?");                        
            st.setString(1,u.getNombre());
            st.setString(2,u.getCiudad());
            st.setString(3,u.getDireccion());
            st.setString(4,u.getTelefono());
            st.setInt(5,u.getId());                       
            st.executeUpdate();
            st.close();                        
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
        
    }   
    
    public boolean eliminarUniversidad(int id)
    {
        try
        {
            PreparedStatement st = null;
            st = con.prepareStatement("DELETE FROM universidad WHERE id = ?");            
            st.setInt(1,id);         
            st.executeUpdate();
            st.close();                        
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }        
    } 
   
    
    public boolean esUsuarioValido(Usuario u)
    {        
        boolean resultado = false;
        ResultSet rs = null;                       
        PreparedStatement st = null;
        try
        {            
            st = con.prepareStatement("SELECT * FROM usuario WHERE id = ? AND clave = md5(?) AND estado = ?");            
            st.setString(1,u.getId());         
            st.setString(2,u.getClave());
            st.setString(3,"A");
            rs = st.executeQuery();            
            if(rs.next()){
                u.setRol(rs.getString("rol").charAt(0));
                resultado = true;
            } 
            
            rs.close();
            st.close();
        }
        catch(Exception e){
            System.out.println(e);
            resultado = false;
        }           
     return resultado; 
    }
    */
}