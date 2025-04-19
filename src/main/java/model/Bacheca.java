package model;

import java.util.ArrayList;

public class Bacheca {
    private String descrizione;

    //gestisco enumerazione
    private TitoloBacheca titolo = TitoloBacheca.UNIVERSITA;


    //gestisco todo
    private ArrayList<ToDo> todo = new ArrayList<ToDo>();

    //gestisco la relazione con utente (1)
    private Utente utente;
    public Bacheca(Utente u) {
        utente= u;
    }

    //costruttore
    public Bacheca(String descrizione){
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}