package Prepinsta_Top_100;

public class AsciiValue {
        public static void main(String[] args) {

            char ch = 'A'; // Meeru ikkada 'a', 'Z', '5' edaina ivvachu

            // Asalu magic ikkade undi.
            // Character ni Integer dabba lo pedithe, adhi ASCII value aipothundi.
            int asciiValue = ch;

            System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);

            // Extra bonus: Meeku total A to Z table kavali ante oka chinna loop rayachu
        /*
        for(char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c + " -> " + (int)c);
        }
        */
        }
    }

    /* Motham table meeru batti kottalsina avasaram ledu (No mugging up!). DSA ki ee 3 ranges gurtupettukunte chalu:

Capital Letters ('A' to 'Z'): 65 to 90

Small Letters ('a' to 'z'): 97 to 122

Numbers as characters ('0' to '9'): 48 to 57

(Observe chesara? 'A' ki 65, 'a' ki 97. Difference exactly 32 untundi. Idhi string manipulation codes lo chala use avthundi!)*/