import java.util.HashMap;
import java.util.Map;

public class Converter extends MainConverter {

    private static Map<String, String> emHashmap = new HashMap<String, String>();

    public Converter() {
    }

    //Skapa Hashmap för Engelska och Morse alfabetet
    static String getFromHashmap(String translated) {
        emHashmap.put("A", "*-");
        emHashmap.put("B", "-***");
        emHashmap.put("C", "-*-*");
        emHashmap.put("D", "-**");
        emHashmap.put("E", "*");
        emHashmap.put("F", "**-*");
        emHashmap.put("G", "--*");
        emHashmap.put("H", "****");
        emHashmap.put("I", "**");
        emHashmap.put("J", "*---");
        emHashmap.put("K", "-*-");
        emHashmap.put("L", "*-**");
        emHashmap.put("M", "--");
        emHashmap.put("N", "-*");
        emHashmap.put("O", "---");
        emHashmap.put("P", "*--*");
        emHashmap.put("Q", "--*-");
        emHashmap.put("R", "*-*");
        emHashmap.put("S", "***");
        emHashmap.put("T", "-");
        emHashmap.put("U", "**-");
        emHashmap.put("V", "***-");
        emHashmap.put("W", "*--");
        emHashmap.put("X", "-**-");
        emHashmap.put("Y", "-*--");
        emHashmap.put("Z", "--**");
        emHashmap.put("1", "*----");
        emHashmap.put("2", "**---");
        emHashmap.put("3", "***--");
        emHashmap.put("4", "****-");
        emHashmap.put("5", "*****");
        emHashmap.put("6", "-****");
        emHashmap.put("7", "--***");
        emHashmap.put("8", "---**");
        emHashmap.put("9", "----*");
        emHashmap.put("0", "-----");
        emHashmap.put("*-", "A");
        emHashmap.put("-***", "B");
        emHashmap.put("-*-*", "C");
        emHashmap.put("-**", "D");
        emHashmap.put("*", "E");
        emHashmap.put("**-*", "F");
        emHashmap.put("--*", "G");
        emHashmap.put("****", "H");
        emHashmap.put("**", "I");
        emHashmap.put("*---", "J");
        emHashmap.put("-*-", "K");
        emHashmap.put("*-**", "L");
        emHashmap.put("--", "M");
        emHashmap.put("-*", "N");
        emHashmap.put("---", "O");
        emHashmap.put("*--*", "P");
        emHashmap.put("--*-", "Q");
        emHashmap.put("*-*", "R");
        emHashmap.put("***", "S");
        emHashmap.put("-", "T");
        emHashmap.put("**-", "U");
        emHashmap.put("***-", "V");
        emHashmap.put("*--", "W");
        emHashmap.put("-**-", "X");
        emHashmap.put("-*--", "Y");
        emHashmap.put("--**", "Z");
        emHashmap.put("*----", "1");
        emHashmap.put("**---", "2");
        emHashmap.put("***--", "3");
        emHashmap.put("****-", "4");
        emHashmap.put("*****", "5");
        emHashmap.put("-****", "6");
        emHashmap.put("--***", "7");
        emHashmap.put("---**", "8");
        emHashmap.put("----*", "9");
        emHashmap.put("-----", "0");
        emHashmap.put(" ", " ");

        return emHashmap.get(translated);
    }

    public String EtoM(String s) {
        return getFromHashmap(s);
    }

    public String MtoE(String s) {
        return getFromHashmap(s);
    }

    public String NrtoM(String s) {
        return getFromHashmap(s);
    }

    public String MtoNr(String s) {
        return getFromHashmap(s);
    }

    //konvertera inmatad information
    public static String Translate(String input) {
        String output = "";
        //kontrollera om det är text eller siffror som matats in annars hoppa ner då det är det morsekod
        if (Character.isLetter(input.charAt(0)) || Character.isDigit(input.charAt(0))) {
            for (int i = 0; i < input.length(); i++) {
                Character character = Character.toUpperCase(input.charAt(i));//gör om alla tecken till stora
                output += " " + getFromHashmap(character.toString());//översätter till output
            }
            return output;  //  return översatt  text;
        }   //nedan översätter morsekod till text
        String character[] = input.split(" ");//delar stringen så den enstaka blir bokstäver
        output = "";
        for (int i = 0; i < character.length; i++) {
            output += getFromHashmap(character[i]);//översätter till output
        }
        return output;  //  return översatt text;
    }


}
