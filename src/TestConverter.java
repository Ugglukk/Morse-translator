
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestConverter {

    @Test
    public void testConverter() {
        Converter converter = new Converter();
        Converter actual = Converter("A");
        assertEquals("*-", actual);

    }


}