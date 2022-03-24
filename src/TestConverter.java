import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// detta är originalet.
public class TestConverter {

    @Test //testa om A blir *- (Engelska till morse)
    public void testEtoM() {
        Converter converter = new Converter();
        String actual = null;
        actual = converter.EtoM("A"); // bokstaven som ska översättas
        assertEquals("*-", actual); // kontroll att resultatet blir rätt
        System.out.println("A: konverterat blir " + actual);// printar resultatet av testet
    }

    @Test   // morse till Engelska
    public void testMtoE() {
        Converter converter = new Converter();
        String actual = null;
        actual = converter.MtoE("-***");
        assertEquals("B", actual);
        System.out.println("-***: konverterat blir " + actual);
    }

    @Test   // Testa siffra till morse
    public void testNrtoM() {
        Converter converter = new Converter();
        String actual = null;
        actual = converter.NrtoM("1"); //testar siffran 1
        assertEquals("*----", actual);
        System.out.println("1 konverterat blir " + actual);
    }

    @Test// Testa morse till siffra
    public void testMtoNr() {
        Converter converter = new Converter();
        String actual = null;
        actual = converter.MtoNr("**---"); //testar siffran 1
        assertEquals("2", actual);
        System.out.println("**--- konverterat blir " + actual);
    }

    @Test   // testa ett ord till morse
    public void testWordtoM() {
        Converter converter = new Converter();
        String actual = null;
        actual = converter.Translate("HELLO");
        assertEquals(" **** * *-** *-** ---", actual);
        System.out.println("HELLO: converterat blir " + actual);
    }

    @Test   // testa ett morse ord till engelska
    public void testMWordtoE() {
        Converter converter = new Converter();
        String actual = null;
        actual = converter.Translate("**** * *-** *-** ---");
        assertEquals("HELLO", actual);
        System.out.println("**** * *-** *-** ---: converterat blir " + actual);
    }
}