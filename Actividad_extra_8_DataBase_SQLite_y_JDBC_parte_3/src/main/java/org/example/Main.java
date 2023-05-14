package org.example;

import org.example.modelo.Libro;
import org.example.persistencia.DemoLibroDB;

public class Main {
    public static void main(String[] args) {

        DemoLibroDB demo = new DemoLibroDB();
        Libro libro = new Libro(0,"El juego", "Desconocido");

     /*   if(demo.insertarLibros(libro)){
            System.out.println("Se inserto correctamente");
        }else{
            System.out.println("No se inserto");
        }
     */
        System.out.println(demo.buscrarLibroPorId(5));

        for (Libro tmp : demo.obtenerTodos()) {
            System.out.println("Libro: " + tmp);
            System.out.println("Titulo: " + tmp.getTitulo());
        }

    }
}