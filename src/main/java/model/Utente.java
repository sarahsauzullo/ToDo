package model;

import java.util.*;

public class Utente {
    private String login;
    private String password;
    private List<Condivisione> condivisione;
    private List<ToDo> ToDo;
    private List<Bacheca> bacheca;
    //costruttore
    public Utente(String login, String password, List<Condivisione> condivisione, List<Bacheca> bacheca, List<ToDo> ToDo, List<ToDo> toDo){
        this.login = login;
        this.password = password;
        this.ToDo = toDo;
        this.condivisione = new ArrayList<>();
        this.bacheca = new ArrayList<>();
    }

    public void CreaBacheca(Bacheca bacheca) {
    }

    public void ModificaBacheca(Bacheca bacheca) {
    }

    public void EliminaBacheca(Bacheca bacheca) {

    }

    public void LeggereUtenti(ToDo todo){

    }

    public void ModificaSfondo(ToDo todo){

    }

    public void RicercaToDo(ToDo todo){

    }
    public void CreaToDo(ToDo todo){

    }
    public void ModificaToDo(ToDo todo){

    }
    public void SpostaToDo(ToDo todo){

    }
    public void OrdinaTodo(ToDo todo){

    }
    public void ToDoInScadenza(ToDo todo){

    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Condivisione> getCondivisione() {
        return condivisione;
    }

    public void setCondivisione(List<Condivisione> condivisione) {
        this.condivisione = condivisione;
    }

    public List<Bacheca> getBacheca() {
        return bacheca;
    }

    public void setBacheca(List<Bacheca> bacheca) {
        this.bacheca = bacheca;
    }

    public List<ToDo> getToDo() {
        return ToDo;
    }

    public void setToDo(List<ToDo> toDo) {
        ToDo = toDo;
    }
}