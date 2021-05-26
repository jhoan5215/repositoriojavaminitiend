//@joaopktr
package mysqlcun;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conecta
{
    public static final String URL = "jdbc:mysql://localhost:3307/poo";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "usbw";

    //public static Connection getConnection()
    public static Connection abrebase()
    {
        Connection connection = null;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conectados a la base");
        } catch (Exception e)
        {
            System.out.println(e);
        }
        return connection;
    }
}
