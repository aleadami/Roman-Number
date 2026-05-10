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
    
    @Test
    void testPrintNumberFour() {
        String expected = 
            "  _____  __      __ \n" +
            " |_   _| \\ \\    / / \n" +
            "   | |    \\ \\  / /  \n" +
            "   | |     \\ \\/ /   \n" +
            "  _| |_     \\  /    \n" +
            " |_____|     \\/     \n";
        assertEquals(expected, RomanPrinter.print(4));
    }

    @Test
    void testPrintNumberTen() {
        String expected = 
            " __   __ \n" +
            " \\ \\ / / \n" +
            "  \\ V /  \n" +
            "   > <   \n" +
            "  / . \\  \n" +
            " /_/ \\_\\ \n";
        assertEquals(expected, RomanPrinter.print(10));
    }

    @Test
    void testPrintNumberForty() {
        String expected = 
            " __   __   _      \n" +
            " \\ \\ / /  | |     \n" +
            "  \\ V /   | |     \n" +
            "   > <    | |     \n" +
            "  / . \\   | |____ \n" +
            " /_/ \\_\\  |______|\n";
        assertEquals(expected, RomanPrinter.print(40));
    }

    @Test
    void testPrintNumberFifty() {
        String expected = 
            "  _      \n" +
            " | |     \n" +
            " | |     \n" +
            " | |     \n" +
            " | |____ \n" +
            " |______|\n";
        assertEquals(expected, RomanPrinter.print(50));
    }

    @Test
    void testPrintNumberNinety() {
        String expected = 
            " __   __   _____ \n" +
            " \\ \\ / /  / ____|\n" +
            "  \\ V /  | |     \n" +
            "   > <   | |     \n" +
            "  / . \\  | |____ \n" +
            " /_/ \\_\\  \\_____|\n";
        assertEquals(expected, RomanPrinter.print(90));
    }

    @Test
    void testPrintNumberNinetyNine() {
        String expected = 
            " __   __   _____   _____   __   __ \n" +
            " \\ \\ / /  / ____| |_   _| \\ \\ / / \n" +
            "  \\ V /  | |        | |    \\ V /  \n" +
            "   > <   | |        | |     > <   \n" +
            "  / . \\  | |____   _| |_   / . \\  \n" +
            " /_/ \\_\\  \\_____| |_____| /_/ \\_\\ \n";
        assertEquals(expected, RomanPrinter.print(99));
    }

    @Test
    void testPrintNumberHundred() {
        String expected = 
            "   _____ \n" +
            "  / ____|\n" +
            " | |     \n" +
            " | |     \n" +
            " | |     \n" +
            "  \\_____|\n";
        // Nota: se la riga 5 della tua 'C' è " | |____ ", aggiungila qui sotto
        // altrimenti la riga 5 rimarrà " | |     "
        assertEquals(expected, RomanPrinter.print(100));
    }

    /*@Test
    void testPrintNumberFour() {
        // Verifica che la stampa del numero 4 sia corretta
        String expected = 
            "  _____  __      __ \n" +
            " |_   _| \\ \\    / / \n" +
            "   | |    \\ \\  / /  \n" +
            "   | |     \\ \\/ /   \n" +
            "  _| |_     \\  /    \n" +
            " |_____|     \\/     \n";

        assertEquals(expected, RomanPrinter.print(4));
    }

    @Test
    void testPrintNumberTen() {
        // Verifica che la stampa del numero 10 sia corretta
        String expected = 
            " __   __ \n" +
            " \\ \\ / / \n" +
            "  \\ V /  \n" +
            "   > <   \n" +
            "  / . \\  \n" +
            " /_/ \\_\\ \n";

        assertEquals(expected, RomanPrinter.print(10));
    }

    @Test
    void testPrintNumberFourty() {
        // Verifica che la stampa del numero 40 sia corretta
        String expected = 
            " __   __  _      \n" +
            " \\ \\ / / | |     \n" +
            "  \\ V /  | |     \n" +
            "   > <   | |     \n" +
            "  / . \\  | |____ \n" +
            " /_/ \\_\\ |______|\n";

        assertEquals(expected, RomanPrinter.print(40));
    }

    @Test
    void testPrintNumberFifthy() {
        // Verifica che la stampa del numero 50 sia corretta
        String expected = 
            " _      \n" +
            "| |     \n" +
            "| |     \n" +
            "| |     \n" +
            "| |____ \n" +
            "|______|\n";

        assertEquals(expected, RomanPrinter.print(50));
    }

    @Test
    void testPrintNumberNinety() {
        // Verifica che la stampa del numero 90 sia corretta
        String expected = 
            " __   __   _____  \n" +
            " \\ \\ / /  / ____| \n" +
            "  \\ V /  | |      \n" +
            "   > <   | |      \n" +
            "  / . \\  | |____  \n" +
            " /_/ \\_\\  \\_____| \n";

        assertEquals(expected, RomanPrinter.print(90));
    }

    @Test
    void testPrintNumberNintynine() {
        // Verifica che la stampa del numero 99 sia corretta
        String expected = 
            " __   __   _____   _____  __   __ \n" +
            " \\ \\ / /  / ____| |_   _| \\ \\ / / \n" +
            "  \\ V /  | |        | |    \\ V /  \n" +
            "   > <   | |        | |     > <   \n" +
            "  / . \\  | |____   _| |_   / . \\  \n" +
            " /_/ \\_\\  \\_____| |_____| /_/ \\_\\ \n";

        assertEquals(expected, RomanPrinter.print(99));
    }

    @Test
    void testPrintNumberHundred() {
        // Verifica che la stampa del numero 100 sia corretta
        String expected = 
            "   _____ \n" +
            "  / ____|\n" +
            " | |     \n" +
            " | |     \n" +
            " | |____ \n" +
            "  \\_____|\n";

        assertEquals(expected, RomanPrinter.print(100));
    }

    @Test
    void testPrintThrowsExceptionForInvalidNumbers() {
        // Verifica che l'eccezione funzioni anche per Printer
        assertThrows(IllegalArgumentException.class, () -> {
            RomanPrinter.print(0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            RomanPrinter.print(101);
        });
    }*/
}