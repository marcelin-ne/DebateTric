package ec.epn.edu;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sala {

    private int id_sala;
    ArrayList<Registro> registros = new ArrayList<>();
    private String nombreSala;
    private String horario;
    private int numDebatientes;
    private int quorum;
    private String estado;
    /*Nuevos*/
    String meets;
    int id_mocion;
    String ganador;



    /*Extras*/
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public int limit=2;
    public Sala() {
    }

    public Sala(String nombreSala, String horario, int numDebatientes, int quorum) {
        this.nombreSala = nombreSala;
        this.horario = horario;
        this.numDebatientes = numDebatientes;
        this.quorum = quorum;
    }


    public String verificarQuorum(int numDebatientes, int quorum){
        if(numDebatientes>=quorum){
            this.estado="No disponible";
        }else{
            this.estado="Disponible";

        }
        System.out.println("Test Quorum en estado:" + this.estado);
        return this.estado;
    }
    public int controlarRolJuez(ArrayList<Registro> registros){
        this.limit=2;
        for(int i = 0; i< registros.size(); i++){
            if(registros.get(i).getId_rol()==2 && registros.get(i).getId_sala()==this.id_sala){
                limit=1;
            }else{
                limit=2;
            }
        }
        System.out.println("Test Rol de Juez Inscrito:" + limit);
        return limit;
    }









    public boolean verificarVictoria(int posicion_final){
        if(posicion_final==1){
            return true;
        }else{
            return false;
        }
    }




    @Override
    public String toString(){
        System.out.println("\n******************RESUMEN******************");
        return id_sala+"\t|"+ nombreSala + "\t|"+ horario+"\t|N°Participantes:"+ numDebatientes+ "\t|Quorum:"+ quorum+ "\t|"+ANSI_RED +estado +ANSI_RESET

                +"\nLINK DE MEETS:"+this.meets
                +"\n******************RESUMEN******************";
    }
}


