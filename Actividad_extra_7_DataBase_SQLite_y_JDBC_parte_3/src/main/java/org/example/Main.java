package org.example;

import org.example.persistencia.DemoLibroDB;

public class Main {
    public static void main(String[] args) {

        DemoLibroDB demo = new DemoLibroDB();
        demo.insertarStatement();
        System.out.println("Con prepared");
        demo.insertarPreparedStatement();
    }
}