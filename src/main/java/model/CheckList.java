package model;

import java.util.*;

public class CheckList {
    private List<Attivita> attivita;
    private ToDo todo;
    //costruttore
    public CheckList(ToDo todo){
        this.todo = todo;
        this.attivita = new ArrayList<>();
    }
    public CheckList(ArrayList<Attivita> attivita, ToDo todo){
        this.todo = todo;
        this.attivita=new ArrayList<>();

    }

    private void AggiungiAttivita(Attivita attivita){

    }

    private void RimuoviAttivita(Attivita attivita){

    }

    public List<Attivita> getAttivita() {
        return attivita;
    }

    public void setAttivita(List<Attivita> attivita) {
        this.attivita = attivita;
    }

    public ToDo getTodo() {
        return todo;
    }

    public void setTodo(ToDo todo) {
        this.todo = todo;
    }
}