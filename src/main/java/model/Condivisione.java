package model;

import java.util.ArrayList;

public class Condivisione {
    private String autore;
    private ArrayList<Utente> partecipanti;

    //gestisco la relazione con utente
    private Utente utente;
    public Condivisione (Utente u) {
        utente = u;
    }

    //gestisco la relazione con todo
    private ToDo todo;
    private Condivisione (ToDo t) {
        todo=t;
    }

    //costruttore
    public Condivisione (String autore, String partecipanti) {
        this.autore = autore;
        this.partecipanti = partecipanti;
    }

    //funzioni future
    public void AggiungiCondivisioni(){}
    public void EliminaCondivisione(){}

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getPartecipanti() {
        return partecipanti;
    }

    public void setPartecipanti(String partecipanti) {
        this.partecipanti = partecipanti;
    }
}
