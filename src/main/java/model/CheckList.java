package model;

import java.util.ArrayList;

public class CheckList {
    //gestisco relazioen con todo
    private ToDo todo;
    public CheckList(ToDo t){
        todo = t;
        t.checklist = this;
    }

    //gestisco aggregazione con attivita
    private ArrayList<Attivita> attivita = new ArrayList<Attivita>();
}
