////////////////////////////////////////////////////////////////////
// ALESSANDRO ADAMI 2076065
// ALBERTO JOSÉ TONIOLO 2066745
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    //Nasconde il costruttore pubblico di default
    private IntegerToRoman() { }

    public static String convert(int number){

        if (number < 1 || number > 100) {
            throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 100");
        }

        // Definizione delle lettere romane e dei loro valori corrispondenti
        String[] romanLetters = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder romanNumber = new StringBuilder();

        // Itera attraverso i valori romani e aggiungi le lettere corrispondenti
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                romanNumber.append(romanLetters[i]);
            }
        }

        return romanNumber.toString();

    }
}