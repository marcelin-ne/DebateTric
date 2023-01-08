package ec.epn.edu;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Registro {
    Sala sala;
    Participante participante;

    int id_participante;
    int id_rol;
    int id_sala;
    String camara;
    int posicionFinal;
    String retroalimentacion;
    boolean victoria;
    int speakerPoints;

    Scanner sc = new Scanner(System.in);

    public Registro(Participante participante) {
        this.participante = participante;sala=new Sala();
    }

    public Registro( int id_participante, int id_rol, int id_sala) {
        this.id_participante = id_participante;
        this.id_rol = id_rol;
        this.id_sala = id_sala;
    }
    public Registro( int id_participante, int id_rol, int id_sala, String camara, int posicionFinal, String retroalimentacion, boolean victoria, int speakerPoints) {
        this.id_participante = id_participante;
        this.id_rol = id_rol;
        this.id_sala = id_sala;
        this.camara=camara;
        this.posicionFinal=posicionFinal;
        this.retroalimentacion=retroalimentacion;
        this.victoria=victoria;
        this.speakerPoints=speakerPoints;
    }


    public int getId_rol() {
        return id_rol;
    }

    public int getId_sala(){
        return id_sala;
    }

    public int getId_participante() {
        return id_participante;
    }

    public int getSpeakerPoints() {
        return speakerPoints;
    }

    public boolean isVictoria() {
        return victoria;
    }

    public String getCamara() {
        return camara;
    }
    @Override
    public String toString() {
        return
                "ID Participante: " + id_participante +
                "\t ID Rol: " + id_rol +
                "\t ID Sala:" + id_sala+
                "\t Camara:" + camara+
                "\t Pos:" + posicionFinal+
                "\t Retro:" + retroalimentacion+
                "\t Victoria:" + victoria+
                "\t Speakerpoints:" + speakerPoints;
    }


}
