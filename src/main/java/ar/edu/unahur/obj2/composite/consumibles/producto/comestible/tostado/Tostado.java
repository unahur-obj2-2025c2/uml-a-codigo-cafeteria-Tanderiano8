package ar.edu.unahur.obj2.composite.consumibles.producto.comestible.tostado;

import ar.edu.unahur.obj2.composite.consumibles.producto.comestible.Comestible;

public class Tostado extends Comestible {

    private TipoTostado tipo;

    public Tostado(String nombre, Double precioBase, Integer pesoGr, TipoTostado tipo) {
        super(nombre, precioBase, pesoGr);
        this.tipo = tipo;
    }

    @Override
    public Double doCosto(){
        return switch(tipo){
            case TipoTostado.JAMON_Y_QUESO -> 400.0;
            case TipoTostado.SALAME_Y_QUESO -> 600.0;
            default -> 0.0;
        };
    }

   

}
