package com.pluralsight;

import java.time.Period;

public class JavaMain {
    public static void main(String []args) {

        // referance pour la fabrique
        KeyFabric keyFabric = new KeyFabric();
        // referance pour la clé
        // puis que fabrique fontion retourn une clé on peut l'egaliser a key
        Key key = keyFabric.CreateNewKey("Door");
        key.CreateKeyCode(3);
        key.Show();


    }

}
