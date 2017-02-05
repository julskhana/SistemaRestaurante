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
                //u.setRol(rs.getString("rol").charAt(0));
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
    
    //funcion para cargar al sistema datos de los clientes
    public ArrayList<Cliente>  cargarClientes() throws Exception{
        //coneccion a base
        ConexionBase cdb = new ConexionBase();
        cdb.conectar();
        //comando para 
        Statement st=null;
        st = con.createStatement();
        String sql = "SELECT * FROM cliente";
        ResultSet rst;
        rst = st.executeQuery(sql);
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        while (rst.next()){
            Cliente c = new Cliente(); // falta codigo
        }
        
        return null;
    }
    
    
    //funcion para consultar clientes en bd
    public ArrayList<Cliente> consultarCli(String busqueda, String tip){
        
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
                Cliente cli = new Cliente(cedula,nombre,apellido,correo,tipo,edad,fecha_nacimiento,sexo,direccion,telefono);
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