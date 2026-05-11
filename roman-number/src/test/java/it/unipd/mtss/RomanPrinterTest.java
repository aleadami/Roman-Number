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
        // Verifica che la stampa del numero 4 sia corretta
        String expected = 
            "  _____  __      __\n" +
            " |_   _| \\ \\    / /\n" +
            "   | |    \\ \\  / / \n" +
            "   | |     \\ \\/ /  \n" +
            "  _| |_     \\  /   \n" +
            " |_____|     \\/    \n";

        assertEquals(expected, RomanPrinter.print(4));
    }

    @Test
    void testPrintNumberTen() {
        String expected = 
            // Verifica che la stampa del numero 10 sia corretta
            " __   __\n" +
            " \\ \\ / /\n" +
            "  \\ V / \n" +
            "   > <  \n" +
            "  / . \\ \n" +
            " /_/ \\_\\\n";

        assertEquals(expected, RomanPrinter.print(10));
    }

    @Test
    void testPrintNumberForty() {
        String expected = 
            // Verifica che la stampa del numero 40 sia corretta
            " __   __  _      \n" +
            " \\ \\ / / | |     \n" +
            "  \\ V /  | |     \n" +
            "   > <   | |     \n" +
            "  / . \\  | |____ \n" +
            " /_/ \\_\\ |______|\n";

        assertEquals(expected, RomanPrinter.print(40));
    }

    @Test
    void testPrintNumberFifty() {
        String expected = 
            // Verifica che la stampa del numero 50 sia corretta
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
            // Verifica che la stampa del numero 90 sia corretta
            " __   __   _____ \n" +
            " \\ \\ / /  / ____|\n" +
            "  \\ V /  | |     \n" +
            "   > <   | |     \n" +
            "  / . \\  | |____ \n" +
            " /_/ \\_\\  \\_____|\n";
;
        assertEquals(expected, RomanPrinter.print(90));
    }

    @Test
    void testPrintNumberNinetyNine() {
        // Verifica che la stampa del numero 99 sia corretta
        String expected = 
            " __   __   _____   _____  __   __\n" +
            " \\ \\ / /  / ____| |_   _| \\ \\ / /\n" +
            "  \\ V /  | |        | |    \\ V / \n" +
            "   > <   | |        | |     > <  \n" +
            "  / . \\  | |____   _| |_   / . \\ \n" +
            " /_/ \\_\\  \\_____| |_____| /_/ \\_\\\n";
        assertEquals(expected, RomanPrinter.print(99));
    }

    @Test
    void testPrintNumberHundred() {
        String expected = 
            // Verifica che la stampa del numero 100 sia corretta
            "   _____ \n" +
            "  / ____|\n" +
            " | |     \n" +
            " | |     \n" +
            " | |____ \n" +
            "  \\_____|\n";

        assertEquals(expected, RomanPrinter.print(100));
    }

    @Test
    void testPrintNumberFourHundred() {
        String expected = 
            // Verifica che la stampa del numero 400 sia corretta
            "   _____   _____  \n" +
            "  / ____| |  __ \\ \n" +
            " | |      | |  | |\n" +
            " | |      | |  | |\n" +
            " | |____  | |__| |\n" +
            "  \\_____| |_____/ \n";

        assertEquals(expected, RomanPrinter.print(400));
    }

    @Test
    void testPrintNumberFiveHundred() {
        String expected = 
            // Verifica che la stampa del numero 500 sia corretta
            "  _____  \n" +
            " |  __ \\ \n" +
            " | |  | |\n" +
            " | |  | |\n" +
            " | |__| |\n" +
            " |_____/ \n";

        assertEquals(expected, RomanPrinter.print(500));
    }

    @Test
    void testPrintNumberNineHundred() {
        String expected = 
            // Verifica che la stampa del numero 900 sia corretta
            "   _____   __  __ \n" +
            "  / ____| |  \\/  |\n" +
            " | |      | \\  / |\n" +
            " | |      | |\\/| |\n" +
            " | |____  | |  | |\n" +
            "  \\_____| |_|  |_|\n";

        assertEquals(expected, RomanPrinter.print(900));
    }

    @Test
    void testPrintNumberNineHundredNinetyNine() {
        String expected = 
            // Verifica che la stampa del numero 999 sia corretta
            "   _____   __  __  __   __   _____   _____  __   __\n" +
            "  / ____| |  \\/  | \\ \\ / /  / ____| |_   _| \\ \\ / /\n" +
            " | |      | \\  / |  \\ V /  | |        | |    \\ V / \n" +
            " | |      | |\\/| |   > <   | |        | |     > <  \n" +
            " | |____  | |  | |  / . \\  | |____   _| |_   / . \\ \n" +
            "  \\_____| |_|  |_| /_/ \\_\\  \\_____| |_____| /_/ \\_\\\n";

        assertEquals(expected, RomanPrinter.print(999));
    }

    @Test
    void testPrintNumberThousand() {
        String expected = 
            // Verifica che la stampa del numero 1000 sia corretta
            "  __  __ \n" +
            " |  \\/  |\n" +
            " | \\  / |\n" +
            " | |\\/| |\n" +
            " | |  | |\n" +
            " |_|  |_|\n";

        assertEquals(expected, RomanPrinter.print(1000));
    }

    @Test
    void testPrintThrowsExceptionForInvalidNumbers() {
        // Verifica che l'eccezione funzioni anche per Printer
        assertThrows(IllegalArgumentException.class, () -> {
            RomanPrinter.print(0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            RomanPrinter.print(1001);
        });
    }
}