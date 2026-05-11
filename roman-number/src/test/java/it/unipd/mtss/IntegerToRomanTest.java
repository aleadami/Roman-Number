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

        // Verifica le eccezioni sottrattive e i simboli precedenti (V, X, L, C)
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));

        // Verifica numeri composti per assicurarsi che il ciclo funzioni bene
        assertEquals("XIV", IntegerToRoman.convert(14));
        assertEquals("XXXIX", IntegerToRoman.convert(39));

        // Verifica i casi limite superiori precedenti (fino a 100)
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("L", IntegerToRoman.convert(50));
        assertEquals("XC", IntegerToRoman.convert(90));
        assertEquals("XCIX", IntegerToRoman.convert(99));
        assertEquals("C", IntegerToRoman.convert(100));

        // Verifica casi limite fino a 1000 (400, 500, 900, 999, 1000)
        assertEquals("CD", IntegerToRoman.convert(400));
        assertEquals("D", IntegerToRoman.convert(500));
        assertEquals("CM", IntegerToRoman.convert(900));
        assertEquals("CMXCIX", IntegerToRoman.convert(999));
        assertEquals("M", IntegerToRoman.convert(1000));

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
        // Verifica che numeri > 1000 lancino l'eccezione
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(1001);
        });
    }
}


