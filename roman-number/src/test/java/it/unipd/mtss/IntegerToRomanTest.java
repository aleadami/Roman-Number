////////////////////////////////////////////////////////////////////
// ALESSANDRO ADAMI 2076065
// ALBERTO JOSÉ TONIOLO 2066745
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegerToRomanTest {
    @Test
    public void testConvert_ValidNumbers() {
        // Verifica il corretto funzionamento della conversione per i primi numeri
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("III", IntegerToRoman.convert(3));

        // Verifica le eccezioni sottrattive e i nuovi simboli (V, X, L, C)
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));

        // Verifica numeri composti per assicurarsi che il ciclo funzioni bene
        assertEquals("XIV", IntegerToRoman.convert(14));
        assertEquals("XXXIX", IntegerToRoman.convert(39));

        // Verifica i casi limite superiori
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("L", IntegerToRoman.convert(50));
        assertEquals("XC", IntegerToRoman.convert(90));
        assertEquals("XCIX", IntegerToRoman.convert(99));
        assertEquals("C", IntegerToRoman.convert(100));

    }

    @Test
    public void testConvert_UnderLimit() {
        // Verifica che numeri < 1 lancino l'eccezione
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(0);
        });
    }

    @Test
    public void testConvert_OverLimit() {
        // Verifica che numeri > 100 lancino l'eccezione
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(101);
        });
    }
}


