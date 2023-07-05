package org.example;

import org.example.modelos.Usuario;

public class Main {
    public static void main(String[] args){
        Integer edad = 34;

        Universidad cesde = new Universidad("Cesde");

        Usuario usuario = new Usuario();

        System.out.println(cesde.nombre);
        System.out.println();
    }
}