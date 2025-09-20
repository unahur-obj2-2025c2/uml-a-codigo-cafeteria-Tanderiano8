package ar.edu.unahur.obj2.composite.consumibles.combo;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.composite.consumibles.Consumible;

public class Combo implements Consumible {
    private String nombre;
    private Double precio;
    List<Consumible> consumibles;

    public Combo(String nombre, Double precio, List<Consumible> consumibles) {
        this.nombre = nombre;
        this.precio = precio;
        this.consumibles = consumibles;
    }

    public Combo(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.consumibles = new ArrayList<>();
    }


    public void agregarConsumible(Consumible consumible){
        consumibles.add(consumible);
    }

    public void eliminarConsumible(Consumible consumible){
        consumibles.remove(consumible);
    }

    @Override
    public Double costo(){
        return Double.min(precio, this.costoDeConsumibles());
    }

    private Double costoDeConsumibles(){
        return consumibles.stream().mapToDouble(Consumible::costo).sum();
    }
}