import java.util.HashMap;
import java.util.Map;

public class Converter extends MainConverter {


    //Skapa Hashmap för Engelska och Morse alfabetet
    Map<String, String> EMHashMap = new HashMap<String, String>();


    public Converter() {


        // public String Converter; {
        //Read the input data

        //       String Converter = input();
        //hämta in texten som ska översättas
        //  return Converter;
        // }
        Map<String, String> getConverterMap;
        {
            //Fyll Hashmappen med bokstäver och morsekoder
            EMHashMap.put("A", "*-");
            EMHashMap.put("B", "-***");
            EMHashMap.put("C", "-*-*");
            EMHashMap.put("D", "-**");
            EMHashMap.put("E", "*");
            EMHashMap.put("F", "**-*");
            EMHashMap.put("G", "--*");
            EMHashMap.put("H", "****");
            EMHashMap.put("I", "**");
            EMHashMap.put("J", "*---");
            EMHashMap.put("K", "-*-");
            EMHashMap.put("L", "*-**");
            EMHashMap.put("M", "--");
            EMHashMap.put("N", "-*");
            EMHashMap.put("O", "---");
            EMHashMap.put("P", "*--*");
            EMHashMap.put("Q", "--*-");
            EMHashMap.put("R", "*-*");
            EMHashMap.put("S", "***");
            EMHashMap.put("T", "-");
            EMHashMap.put("U", "**-");
            EMHashMap.put("V", "***-");
            EMHashMap.put("W", "*--");
            EMHashMap.put("X", "-**-");
            EMHashMap.put("Y", "-*--");
            EMHashMap.put("Z", "--**");
            EMHashMap.put("1", "*----");
            EMHashMap.put("2", "**---");
            EMHashMap.put("3", "***--");
            EMHashMap.put("4", "****-");
            EMHashMap.put("5", "*****");
            EMHashMap.put("6", "-****");
            EMHashMap.put("7", "--***");
            EMHashMap.put("8", "---**");
            EMHashMap.put("9", "----*");
            EMHashMap.put("0", "-----");
            EMHashMap.put("*-", "A");
            EMHashMap.put("-***", "B");
            EMHashMap.put("-*-*", "C");
            EMHashMap.put("-**", "D");
            EMHashMap.put("*", "E");
            EMHashMap.put("**-*", "F");
            EMHashMap.put("--*", "G");
            EMHashMap.put("****", "H");
            EMHashMap.put("**", "I");
            EMHashMap.put("*---", "J");
            EMHashMap.put("-*-", "K");
            EMHashMap.put("*-**", "L");
            EMHashMap.put("--", "M");
            EMHashMap.put("-*", "N");
            EMHashMap.put("---", "O");
            EMHashMap.put("*--*", "P");
            EMHashMap.put("--*-", "Q");
            EMHashMap.put("*-*", "R");
            EMHashMap.put("***", "S");
            EMHashMap.put("-", "T");
            EMHashMap.put("**-", "U");
            EMHashMap.put("***-", "V");
            EMHashMap.put("*--", "W");
            EMHashMap.put("-**-", "X");
            EMHashMap.put("-*--", "Y");
            EMHashMap.put("--**", "Z");
            EMHashMap.put("*----", "1");
            EMHashMap.put("**---", "2");
            EMHashMap.put("***--", "3");
            EMHashMap.put("****-", "4");
            EMHashMap.put("*****", "5");
            EMHashMap.put("-****", "6");
            EMHashMap.put("--***", "7");
            EMHashMap.put("---**", "8");
            EMHashMap.put("----*", "9");
            EMHashMap.put("-----", "0");
            EMHashMap.put(" ", ","); //mellanslag översätts som kommatecken

            //   return EMHashMap;


            public String Converter (String s){
            return EMHashMap.get(s);
        }
        }
    }

        //   System.out.print(EMHashMap());
    }




