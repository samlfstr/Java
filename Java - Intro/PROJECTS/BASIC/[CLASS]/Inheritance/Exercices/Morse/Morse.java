/*
* Created by ISA OZSOY
* 2.1.2018
* 00:03
*/

public class Morse {

    /*
    * 1. Bir tire (-) üç noktaya eşit
    * 2. Her kelimenin kendi harfleri arasındaki bekleme süresi bir nokta kadar
    * 3. Her kelime arasındaki bekleme süresi yedi nokta kadar
    */

    private String phrase;
    public String get_phrase(){ return this.phrase; }
    public void set_phrase(String phrase){ this.phrase = phrase; }

    public Morse() {
    }

    public Morse(String phrase) {
        this.phrase = phrase;
    }

    public void StringToMorse() {

        String[] words = get_phrase().split(" ");
        String[] letters = get_phrase().split("");
        String word = "";
        int numberOfLetters = 0, j = 0;

        String listOfLetters[] = new String[26];
        listOfLetters[0] = ".-";   // a
        listOfLetters[1] = "-..."; // b
        listOfLetters[2] = "-.-."; // c
        listOfLetters[3] = "-..."; // d
        listOfLetters[4] = ".";    // e
        listOfLetters[5] = "..-."; // f
        listOfLetters[6] = "..-."; // g
        listOfLetters[7] = "...."; // h
        listOfLetters[8] = "..";   // i
        listOfLetters[9] = ".---"; // j
        listOfLetters[10] = "-.-"; // k
        listOfLetters[11] = ".-..";// l
        listOfLetters[12] = "--";  // m
        listOfLetters[13] = "-.";  // n
        listOfLetters[14] = "---"; // o
        listOfLetters[15] = ".--.";// p
        listOfLetters[16] = "--.-";// q
        listOfLetters[17] = ".-."; // r
        listOfLetters[18] = "..."; // s
        listOfLetters[19] = "-";   // t
        listOfLetters[20] = "..-"; // u
        listOfLetters[21] = "...-";// v
        listOfLetters[22] = ".--"; // w
        listOfLetters[23] = "-..-";// x
        listOfLetters[24] = "-.--";// y
        listOfLetters[25] = "--..";
        // ...

        for (int i = 0; i < letters.length; i++) {


            switch (letters[i]){
                case "a":
                    System.out.print(listOfLetters[0] + " ");
                    numberOfLetters += 1;
                    break;
                case "b":
                    System.out.print(listOfLetters[1] + " ");
                    numberOfLetters += 1;
                    break;
                case "c":
                    System.out.print(listOfLetters[2] + " ");
                    numberOfLetters += 1;
                break;
                case "d":
                    System.out.print(listOfLetters[3] + " ");
                    numberOfLetters += 1;
                    break;
                case "e":
                    System.out.print(listOfLetters[4] + " ");
                    numberOfLetters += 1;
                    break;
                case "f":
                    System.out.print(listOfLetters[5] + " ");
                    numberOfLetters += 1;
                    break;
                case "g":
                case "ğ":
                    System.out.print(listOfLetters[6] + " ");
                    numberOfLetters += 1;
                    break;
                case "h":
                    System.out.print(listOfLetters[7] + " ");
                    numberOfLetters += 1;
                    break;
                case "ı": // for Turkey
                case "i":
                    System.out.print(listOfLetters[8] + " ");
                    numberOfLetters += 1;
                    break;
                case "j":
                    System.out.print(listOfLetters[9] + " ");
                    numberOfLetters += 1;
                    break;
                case "k":
                    System.out.print(listOfLetters[10] + " ");
                    numberOfLetters += 1;
                    break;
                case "l":
                    System.out.print(listOfLetters[11] + " ");
                    numberOfLetters += 1;
                    break;
                case "m":
                    System.out.print(listOfLetters[12] + " ");
                    numberOfLetters += 1;
                    break;
                case "n":
                    System.out.print(listOfLetters[13] + " ");
                    numberOfLetters += 1;
                    break;
                case "o":
                case "ö":
                    System.out.print(listOfLetters[14] + " ");
                    numberOfLetters += 1;
                    break;
                case "p":
                    System.out.print(listOfLetters[15] + " ");
                    numberOfLetters += 1;
                    break;
                case "q":
                    System.out.print(listOfLetters[16] + " ");
                    numberOfLetters += 1;
                    break;
                case "r":
                    System.out.print(listOfLetters[17] + " ");
                    numberOfLetters += 1;
                    break;
                case "s":
                    System.out.print(listOfLetters[18] + " ");
                    numberOfLetters += 1;
                    break;
                case "t":
                    System.out.print(listOfLetters[19] + " ");
                    numberOfLetters += 1;
                    break;
                case "u":
                    System.out.print(listOfLetters[20] + " ");
                    numberOfLetters += 1;
                    break;
                case "v":
                    System.out.print(listOfLetters[21] + " ");
                    numberOfLetters += 1;
                    break;
                case "w":
                    System.out.print(listOfLetters[22] + " ");
                    numberOfLetters += 1;
                    break;
                case "x":
                    System.out.print(listOfLetters[23] + " ");
                    numberOfLetters += 1;
                    break;
                case "y":
                    System.out.print(listOfLetters[24] + " ");
                    numberOfLetters += 1;
                    break;
                case "z":
                    System.out.print(listOfLetters[25] + " ");
                    numberOfLetters += 1;
                    break;
            }

            /*
            *(1)Eğer harf sayısı kelime sayısının uzunluğuna eşitse
            *(2)Yedi nokta ekle
            *(3)J yi 1 artır (sonraki kelimeye geç)
            *(4)Hesaplanan harf sayısını sıfırla
            *(5)Değilse devam et
            */
            if (numberOfLetters == words[j].length()){
                System.out.println("/wait .......");
                j+=1;
                numberOfLetters = 0;
            }
        }
    }

}
