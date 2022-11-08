package JAVA_BASIC_Ejercicio_tema_5;


import poo.Herencia.Coche;

import java.io.File;

public class Main {


   static CocheCRUD cochecrud = new CocheCRUDImpl();

    public static void main(String[] args) {

        cochecrud.save( new CocheCRUDImpl());
        cochecrud.findAll();
        cochecrud.delete();


    }
}
