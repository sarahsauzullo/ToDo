package model;

import java.util.ArrayList;

/**
 * The type Utente.
 */
public class Utente {
    private final String login;
    private String password;


    //serve a gestire la relazione 3..* con Bacheca
    private ArrayList<Bacheca> bacheca = new ArrayList<Bacheca>();
    public Utente(Bacheca b1, Bacheca b2, Bacheca b3){
    }


    //in questo modo gestisco la relazione * con Condivisione
    private ArrayList<Condivisione> condivisione = new ArrayList<Condivisione>();


    //costruttore
    public Utente(String login, String password) {
        this.login = login;
        this.password = password;
    }


    //funzioni future
    public void CreaToDo(){}
    public void ModificaToDo(){}
    public void EliminaToDo(){}
    public void SpostaToDo(){}
    public void OrdinaToDo(){}
    public void LeggiUtenti(){}
    public void RicercaToDo(){}
    public void ToDoInScadenza(){}
    public void CreaBacheca(){}
    public void ModificaBacheca(){}
    public void EliminaBacheca(){}
    public void ModificaSfondo(){}


    public String getLogin() {
        return login;
    }
}
