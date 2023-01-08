package ec.epn.edu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Participante participante;
        Sala sala;
        ArrayList<Registro> registros, registros2;

        sala=new Sala();
        participante=new Participante();
        participante.validarParametrosContrasenia("Kevin080808R");

        registros = new ArrayList<>();
        registros.add(new Registro(50,1,100));
        registros.add(new Registro(51,1,100));
        registros.add(new Registro(52,1,100));
        registros.add(new Registro(53,1,100));
        registros2 = new ArrayList<>();
        registros2.add(new Registro(80,1,150));
        registros2.add(new Registro(80,1,150));
        registros2.add(new Registro(82,2,150));
        registros2.add(new Registro(83,1,150));

        sala.controlarRolJuez(registros);
        sala.controlarRolJuez(registros2);
        sala.verificarQuorum(7 , 8);
        sala.verificarQuorum(9,9);


            }
}
