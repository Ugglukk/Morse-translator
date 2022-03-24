
import java.util.Scanner;

public class MainConverter {

    public static void main(String[] args) {
        String output = ""; //skapar String output
        String input = "";  //skapar string input

        Scanner scan = new Scanner(System.in);  //initiera scanner

        while (input.isEmpty()) { // om input är tom loopar den.
            System.out.println("Enter English letters,numbers or morse code to be translated");//be om user input
            input = scan.nextLine(); // läser in text och lägger den i stringen input

            if (input.isEmpty()) System.out.println("No input detected, Try again");//fel meddelande

        }
        try {
            output = Converter.Translate(input); //hämtar konverterad text från översättaren till output
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println();
        }
        if (output.contains("null"))
            System.out.println("Translation error. Only letters, numbers or morsecode is translated");
        if (output.contains("null")) System.out.println("Everything else will be null");//

        System.out.println(input + ": Translates to " + output);//Skriver ut vad du matat in och översättningen

    }
}
