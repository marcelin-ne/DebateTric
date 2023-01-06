package ec.epn.edu.epn.edu;

import ec.epn.edu.Conexion;
import ec.epn.edu.Participante;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class ParticipanteTest {
    Participante p;
    Conexion con;
    private String nickname, contrasenia;
    private boolean expected;
    @Before
    public void setUp(){
        System.out.println("SetUp()");
        p=new Participante();
        con=new Conexion();
        con.initConn();
    }

    @Parameterized.Parameters
    public static  Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{"Kevin08","Kev080808R",true});
        objects.add(new Object[]{"Juan56","Juan565956L",false});
        objects.add(new Object[]{"Cristian26","Cris262626V",true});
        objects.add(new Object[]{"Fer24","Fer242424S",true});
        objects.add(new Object[]{"Rodrigo49","Rodrigo494949F",false});
        objects.add(new Object[]{"Marce57","Marce575757M",true});
        return  objects;
    }

    public ParticipanteTest(String nickname, String contrasenia, boolean expected){
        this.nickname=nickname;
        this.contrasenia=contrasenia;
        this.expected=expected;
    }

    @Test
    public void given_credentials_when_login_then_ok(){
        boolean actual=p.comprobarLogin(nickname, contrasenia);
        assertEquals(expected,actual);
    }


/*
    @Parameterized.Parameters
    public static  Iterable<Object[]> parameters2(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{"aaKe888888888",true});
        /*objects.add(new Object[]{"Juan56","Juan565956L",false});
        objects.add(new Object[]{"Cristian26","Cris262626V",true});
        objects.add(new Object[]{"Fer24","Fer242424S",true});
        objects.add(new Object[]{"Rodrigo49","Rodrigo494949F",false});
        objects.add(new Object[]{"Marce57","Marce575757M",true});
        return  objects;
    }*/

/*
    @Test
    public void given_password_when_register_then_accept(){
        System.out.println("**VALIDACIÓN DE CONTRASEÑA**");
        assertEquals(true,p.validarParametrosContrasenia("Fernando0808080808a"));
    }*/
}