package model;


import java.util.*;

public class Bacheca {

    private TitoloBacheca titolo;
    private String descrizione;
    private List <Utente> utente;
    private List <ToDo> ToDo;
    //costruttore
    public Bacheca(TitoloBacheca titolo, String descrizione, List<Utente> utente,List<ToDo> todo){
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.utente = new ArrayList<Utente>();
        this.ToDo= new ArrayList<ToDo>();
    }

    public TitoloBacheca getTitolo() {
        return titolo;
    }

    public void setTitolo(TitoloBacheca titolo) {
        this.titolo = titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }


}