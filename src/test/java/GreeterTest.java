import org.junit.Test;
import static org.junit.Assert.*;

public class GreeterTest {
    @Test
    public void testAppHasAGreetingOk() {
        assertEquals("Hello!", Greeter.greeting());
    }

    // Uncomment the following code to see
    // an example of a failing test

    // @Test
    // public void testAppHasAGreetingFailed() {
    //     assertEquals("Bye!", Greeter.greeting());
    // }
}
