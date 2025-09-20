package ar.edu.unahur.obj2.composite.consumibles.producto.comestible.medialuna;

import ar.edu.unahur.obj2.composite.consumibles.producto.comestible.Comestible;

public class Medialuna extends Comestible {

    private TipoMedialuna tipo;

    public Medialuna(String nombre, Double precioBase, Integer pesoGr, TipoMedialuna tipo) {
        super(nombre, precioBase, pesoGr);
        this.tipo = tipo;
    }

    @Override
    public Double doCosto() {

        return switch(tipo) {
            case TipoMedialuna.CON_DULCE_DE_LECHE -> 500.0;
            case TipoMedialuna.DE_GRASA -> 250.0;
            case TipoMedialuna.DE_MANTECA -> 550.0;
            default -> 0.0;

        };
    }

}
