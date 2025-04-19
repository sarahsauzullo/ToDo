package model;

import java.awt.*;
import java.util.*;
import java.util.List;

public class ToDo {
    private String titolo;
    private String scadenza;
    private String link;
    private String url;
    private String descrizione;
    private Image immagine;
    private String coloresfondo;
    private StatoToDo stato= StatoToDo.NONCOMPLETATO;
    private String Posizione;
    private Bacheca bacheca;

    private List<Condivisione> condivisione;
    private CheckList checklist;
    //costruttore
    public ToDo(String titolo, String scadenza, String link, String url, String descrizione, Image immagine,
                String coloresfondo, ArrayList <Condivisione> condivisione, StatoToDo stato, String posizione, Bacheca bacheca){
        this.titolo = titolo;
        this.scadenza = scadenza;
        this.link = link;
        this.url = url;
        this.descrizione = descrizione;
        this.immagine = immagine;
        this.coloresfondo = coloresfondo;
        this.stato = stato;
        this.Posizione = posizione;
        this.bacheca = bacheca;

        this.condivisione=new ArrayList<>();
        this.checklist= checklist;
    }


    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getScadenza() {
        return scadenza;
    }

    public void setScadenza(String scadenza) {
        this.scadenza = scadenza;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Image getImmagine() {
        return immagine;
    }

    public void setImmagine(Image immagine) {
        this.immagine = immagine;
    }

    public String getColoresfondo() {
        return coloresfondo;
    }

    public void setColoresfondo(String coloresfondo) {
        this.coloresfondo = coloresfondo;
    }


    public CheckList getChecklist() {
        return checklist;
    }

    public void setChecklist(CheckList checklist) {
        this.checklist = checklist;
    }

    public List<Condivisione> getCondivisione() {
        return condivisione;
    }

    public void setCondivisione(List<Condivisione> condivisione) {
        this.condivisione = condivisione;
    }

    public String getPosizione() {
        return Posizione;
    }

    public void setPosizione(String posizione) {
        Posizione = posizione;
    }

    public StatoToDo getStato() {
        return stato;
    }

    public void setStato(StatoToDo stato) {
        this.stato = stato;
    }


    public Bacheca getBacheca() {
        return bacheca;
    }

    public void setBacheca(Bacheca bacheca) {
        this.bacheca = bacheca;
    }
}
