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
        // Verifica il corretto funzionamento della conversione per i numeri validi
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("III", IntegerToRoman.convert(3));

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
        // Verifica che numeri > 3 lancino l'eccezione
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(4);
        });
    }
}


