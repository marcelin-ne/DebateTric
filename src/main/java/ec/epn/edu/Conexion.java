package ec.epn.edu;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private static String user = "postgres";
    private static String pass = "Kevincraft54";
    public static Connection connection;

    public static void initConn() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR*****");
            System.out.println(e.getMessage());
        }
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/debate", user, pass);
            //System.out.println("Conectado correctamente");
        } catch (Exception e) {
            System.out.println("ERROR*****");
            System.out.println(e.getMessage());
        }

        /*public Conexion() throws SQLException {
        try{
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Debate", user, pass);
            System.out.println("Conectado correctamente");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }*/
    }
}
