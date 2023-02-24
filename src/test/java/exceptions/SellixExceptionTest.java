package exceptions;

import org.jtonna.exceptions.SellixException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SellixExceptionTest
{

    @Test
    public void testSellixException()
    {
        // Structure of SellixException data
        String data = "Something something something";
        String env = "testunit";
        String error = "something went incredibly wrong";
        String log = "log log log";
        String message = "something went wrong you messed up home boy";
        int status = 500;

        // Create an exception with the data & test the constructor
        SellixException sellixException = new SellixException(data, env, error, log, message, status);

        // Test the getters
        assertEquals(sellixException.getData(), data);
        assertEquals(sellixException.getEnv(), env);
        assertEquals(sellixException.getError(), error);
        assertEquals(sellixException.getLog(), log);
        assertEquals(sellixException.getMessage(), message);
        assertEquals(sellixException.getStatus(), status);

        assertThrows(SellixException.class, () -> {
            throw sellixException;
        });
    }
}
