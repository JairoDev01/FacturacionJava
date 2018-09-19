package conexion;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class CreateConnection {
    static Properties props = new Properties();
    
    String hostname = null;
    String port = null;
    String database = null;
    String username = null;
    String password = null;
    
    public CreateConnection (){
        InputStream in = null;
        try{
            
            in = Files.newInputStream(FileSystems.getDefault().getPath("c:\\facturacion\\db_props.properties"));
                    props.load(in);
                    in.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }finally{
            try{
                in.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
        //Metodo que se manda a llamar para cargar las propiedades para conectar a db:
        LoadProperties();
    }

    private void LoadProperties() {
        hostname = props.getProperty("hostname");
        port = props.getProperty("port");
        database = props.getProperty("database");
        username = props.getProperty("username");
        password = props.getProperty("password");
    }
    
    public Connection getConnection() throws SQLException{
        Connection conn = null;
        String jdbcUrl = "jdbc:oracle:thin:@"+this.hostname+":"+this.port+":"+this.database;
        
        conn = DriverManager.getConnection(jdbcUrl,this.username,this.password);
        System.out.println("Conexion Establecida");
        return conn;
    }
    
   /* public Connection getDSConnectio(){
        Connection conn = null;
        try{
            Context ctx = new InitialContext();
            DataSource ds = (Data)
        }catch(Exception ex ){
            
        }
        
        return conn;
    }*/
}
