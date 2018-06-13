package com.pluralsight;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args){


        ArrayList<Character> characters = new ArrayList<>();
        characters.add(new Queen());
        characters.add(new Knight());
        characters.add(new Knight());
        characters.add(new Knight());
        characters.get(3).setWeaponBehavior(new Gun());

        characters.forEach(Character::attack);

    }



}
