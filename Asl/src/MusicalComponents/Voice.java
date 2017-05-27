package MusicalComponents;

import java.util.ArrayList;

public class Voice {

    public static int last_id = 0;
    private int id;
    private ArrayList<String> notes;
    private String instrument;

    public Voice(int id){

        if (id <= last_id) throw new IllegalArgumentException("id < last_id");
        if( id < 0 | id>15) throw new IllegalArgumentException("id out of bounds 0..15");
        last_id = id;
        this.id = id;
        instrument = "Piano";

    }

    public void addInstrument(String instrument){this.instrument = instrument;}

    public String getString(){
        String head = "V"+this.id+" ";
        String instrument = this.instrument.equals("") ? "" : "I["+this.instrument+"] ";
        String notes = "";
        for (String s: this.notes) {notes += " "+s;}
        return head+instrument+notes;
    }

}
