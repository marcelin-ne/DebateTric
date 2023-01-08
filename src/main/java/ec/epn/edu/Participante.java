package ec.epn.edu;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Participante {
    private int id_participante;
    private String nombre;
    private String _nickname;
    private String sociedad_debate;
    private String contrasenia;


    public boolean validarParametrosContrasenia(String contrasenia) {
        Pattern pat = Pattern.compile("^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,16}$");
        Matcher mat = pat.matcher(contrasenia);
        if (mat.matches()) {
            System.out.println("Contraseña válida");
            return true;
        } else {
            System.out.println("Contraseña invalida");
            return false;
        }
    }

}