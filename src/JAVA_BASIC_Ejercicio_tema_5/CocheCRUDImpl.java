package JAVA_BASIC_Ejercicio_tema_5;

import poo.Herencia.Coche;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save(CocheCRUD cochecrud) {

    }

    @Override
    public List<CocheCRUD> findAll() {
        return null;
    }

    @Override
    public void delete(CocheCRUD cochecrud) {

    }

    @Override
    public void delete() {

    }

    @Override
    public void save(Coche coche) {

    }

    String save = "guardad";
    String findAll = "buscar todos";
    String delete = "Borranr";

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }
}
