package ar.edu.unahur.obj2.composite.consumibles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.composite.consumibles.combo.Combo;
import ar.edu.unahur.obj2.composite.consumibles.producto.bebible.cafe.Cafe;
import ar.edu.unahur.obj2.composite.consumibles.producto.comestible.medialuna.Medialuna;
import ar.edu.unahur.obj2.composite.consumibles.producto.comestible.medialuna.TipoMedialuna;


public class ComboTest {
    
    @Test
    void testCosto(){
    Consumible cafe = new Cafe("cafe", 150.0, 200, false);
    Consumible medialuna = new Medialuna("medialuna de manteca", 100.0, 200, TipoMedialuna.DE_MANTECA);
    Combo combo = new Combo("Desayuno", 1000.0);
    combo.agregarConsumible(cafe);  
    combo.agregarConsumible(medialuna);  
    assertEquals(1000.0, combo.costo());
    }


    @Test
    void testCostoConOtraRama(){
    Consumible cafe = new Cafe("cafe", 150.0, 200, false);
    Consumible medialuna = new Medialuna("medialuna de manteca", 100.0, 200, TipoMedialuna.DE_MANTECA);
    Combo combo = new Combo("Desayuno", 100.0);
    combo.agregarConsumible(cafe);  
    combo.agregarConsumible(medialuna);  
    assertEquals(100.0, combo.costo());
    }
}
