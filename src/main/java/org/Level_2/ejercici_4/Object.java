package org.Level_2.ejercici_4;

import java.util.ArrayList;

public class Object {

    private static ArrayList<Object> objects = new ArrayList<>();

    private String adjective;
    private String noun;

    public Object(String adjective, String noun) {
        this.adjective = adjective;
        this.noun = noun;
    }

    public static ArrayList<Object> getObjects() {
        return objects;
    }

}