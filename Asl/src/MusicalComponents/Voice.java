package MusicalComponents;

import java.util.ArrayList;

public class Voice {

    public static int avaiable_id = 0;
    private int id;
    private ArrayList<String> compas;
    private String instrument;

    public Voice(int id){

        if (id < avaiable_id) throw new IllegalArgumentException("id < avaiable_id");
        if( id < 0 | id>15) throw new IllegalArgumentException("id out of bounds 0..15");
        avaiable_id++;
        this.id = id;
        instrument = "Piano";
        compas = new ArrayList<>();

    }

    public void addInstrument(String instrument){this.instrument = instrument;}

    public String getString(){
        String head = "V"+this.id+" ";
        String instrument = this.instrument.equals("") ? "" : "I["+this.instrument+"] ";
        String notes = "";
        for (String s: this.compas) {notes += " "+s;}
        return head+instrument+notes;
    }

    public void addCompas(String s){
        compas.add(s);
    }

}
