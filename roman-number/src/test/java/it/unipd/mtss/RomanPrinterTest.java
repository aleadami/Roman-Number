////////////////////////////////////////////////////////////////////
// ALESSANDRO ADAMI 2076065
// ALBERTO JOSÉ TONIOLO 2066745
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RomanPrinterTest {

    @Test
    void testPrintNumberOne() {
        // Verifica che la stampa del numero 1 sia corretta
        String expected = 
            "  _____ \n" +
            " |_   _|\n" +
            "   | |  \n" +
            "   | |  \n" +
            "  _| |_ \n" +
            " |_____|\n";

        assertEquals(expected, RomanPrinter.print(1));
    }

    @Test
    void testPrintNumberTwo() {
        // Verifica che la stampa del numero 2 sia corretta
        String expected = 
            "  _____   _____ \n" +
            " |_   _| |_   _|\n" +
            "   | |     | |  \n" +
            "   | |     | |  \n" +
            "  _| |_   _| |_ \n" +
            " |_____| |_____|\n";

        assertEquals(expected, RomanPrinter.print(2));
    }

    @Test
    void testPrintNumberThree() {
        // Verifica che la stampa del numero 3 sia corretta
        String expected = 
            "  _____   _____   _____ \n" +
            " |_   _| |_   _| |_   _|\n" +
            "   | |     | |     | |  \n" +
            "   | |     | |     | |  \n" +
            "  _| |_   _| |_   _| |_ \n" +
            " |_____| |_____| |_____|\n";

        assertEquals(expected, RomanPrinter.print(3));
    }

    /*@Test
    void testPrintThrowsExceptionForInvalidNumbers() {
        // Verifica che l'eccezione funzioni anche per Printer
        assertThrows(IllegalArgumentException.class, () -> {
            RomanPrinter.print(0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            RomanPrinter.print(4);
        });
    } */
}