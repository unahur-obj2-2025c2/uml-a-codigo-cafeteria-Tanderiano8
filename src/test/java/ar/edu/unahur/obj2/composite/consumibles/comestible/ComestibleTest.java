package ar.edu.unahur.obj2.composite.consumibles.comestible;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.composite.consumibles.Consumible;
import ar.edu.unahur.obj2.composite.consumibles.producto.comestible.Comestible;
import ar.edu.unahur.obj2.composite.consumibles.producto.comestible.medialuna.Medialuna;
import ar.edu.unahur.obj2.composite.consumibles.producto.comestible.medialuna.TipoMedialuna;


public class ComestibleTest {

     @Test
     void testCosto(){
        Consumible medialuna = new Medialuna("medialuna de manteca", 150.0, 200, TipoMedialuna.DE_MANTECA);
        Double valorEsperado = (200 * 550.0);
        assertEquals(valorEsperado, medialuna.costo());
    }

}
