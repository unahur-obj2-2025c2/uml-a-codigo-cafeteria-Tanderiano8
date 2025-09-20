package ar.edu.unahur.obj2.composite.consumibles.producto.bebible.jugoDeNaranja;

import ar.edu.unahur.obj2.composite.consumibles.producto.bebible.Bebible;

public class JugoDeNaranja  extends Bebible{

    public JugoDeNaranja(String nombre, Double precioBase, Integer capacidadMl) {
        super(nombre, precioBase, capacidadMl);
    }

    @Override
    public Double costo(){
        return super.costo() * capacidadMl;
    }



}
