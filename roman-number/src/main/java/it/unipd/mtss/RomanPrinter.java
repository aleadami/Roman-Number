////////////////////////////////////////////////////////////////////
// ALESSANDRO ADAMI 2076065
// ALBERTO JOSÉ TONIOLO 2066745
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    //Nasconde il costruttore pubblico di default
    private RomanPrinter() { }

    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber){
        StringBuilder asciiArt = new StringBuilder();
    
        // Metodo che definisce la asciart orizzontalmente stampando per righe
        String[][] asciiLetters = {
            {//Riga1
                "   _____ ",      // C
                "  _      ",      // L
                " __   __",       // X
                " __      __",    // V
                "  _____ "        // I
            },

            {//Riga2
                "  / ____|",      // C
                " | |     ",      // L
                " \\ \\ / /",     // X
                " \\ \\    / /",  // V
                " |_   _|"        // I
            },

            {//Riga3
                " | |     ",      // C
                " | |     ",      // L
                "  \\ V / ",      // X
                "  \\ \\  / / ",  // V
                "   | |  "        // I
            },

            {//Riga4
                " | |     ",      // C
                " | |     ",      // L
                "   > <  ",       // X
                "   \\ \\/ /  ",  // V
                "   | |  "        // I
            },
                
            {//Riga5
                " | |____ ",      // C
                " | |____ ",      // L
                "  / . \\ ",      // X
                "    \\  /   ",   // V
                "  _| |_ "        // I
            },
                
            {//Riga6
                "  \\_____|",     // C
                " |______|",      // L
                " /_/ \\_\\",     // X
                "     \\/    ",   // V
                " |_____|"        // I
            },
        };
        
        for( int z=0; z<6; z++) {
            for (char c : romanNumber.toCharArray()) {
                // Aggiungi la rappresentazione ASCII art orizzontale della lettera corrente
                asciiArt.append(asciiLetters[z]["I".indexOf(c)]);
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }
}