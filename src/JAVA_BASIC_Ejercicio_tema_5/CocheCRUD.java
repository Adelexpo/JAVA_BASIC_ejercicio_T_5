package JAVA_BASIC_Ejercicio_tema_5;

import JAVA_BASIC_Ejercicio_tema_5.CocheCRUDImpl;
import poo.Herencia.Coche;

import java.util.List;

public interface CocheCRUD{

    void save(CocheCRUD cochecrud);

    List<CocheCRUD> findAll();

    void delete(CocheCRUD cochecrud);


    void delete();

    void save(Coche coche);
}
