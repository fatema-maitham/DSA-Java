/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week1;

import java.util.ArrayList;
/**
 *
 * @author fatemamaitham
 */
public class Week1 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Mohamed");
        names.add("Ali");
        names.add("Mohsen");
        names.add("Fatema");
        names.add("Hussain");
        
        names.add(1,"Hassan");
        
        String firstName = names.get(0);
        System.out.println(firstName);
//        names.remove(1);
//        names.remove("Ali");
        System.out.println(names);
        System.out.println(names.contains("Hassan"));
        System.out.println(names.contains("Alya"));
        System.out.println(names.size());

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Python");
        languages.add("Ruby");
        languages.add("JavaScript");

        String old = languages.set(1, "Java");
        String current = languages.get(1);

        System.out.println(languages);
        System.out.println("Old value: " + old);
        System.out.println("Curr value: " + current);
        
    }
}
