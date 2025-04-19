package model;

import java.util.*;

public class Condivisione {
    private String autore;
    private List<Utente> partecipanti;
    private ToDo todo;

    //costruttore
    public Condivisione(String autore, ArrayList<Utente> partecipanti, Utente utente, ToDo todo) {
        this.autore = autore;
        this.partecipanti = new ArrayList<>();
        this.todo = todo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public List<Utente> getPartecipanti() {
        return partecipanti;
    }

    public void setPartecipanti(List<Utente> partecipanti) {
        this.partecipanti = partecipanti;
    }

    public void AggiungiCondivisione(){

    }
    public void EliminaCondivisione(){}

    public ToDo getTodo() {
        return todo;
    }

    public void setTodo(ToDo todo) {
        this.todo = todo;
    }
}
