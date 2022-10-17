import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainClassTest extends Assertions {
    private MainClass example;
    @BeforeEach
    public void setUp(){
        example = new MainClass("Welcome");
    }

    @Test
    public void simpleTest() {
        int res = example.returnSomeValue(4);
        Assertions.assertEquals(res, 11);
    }

    @Test
    public void checkString(){
        assertEquals(example.someString, "Welcome");
    }
}
