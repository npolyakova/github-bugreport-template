import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainClassTest extends Assertions {

    @Test
    public void simpleTest() {
        MainClass example = new MainClass();
        int res = example.returnSomeValue(4);
        Assertions.assertEquals(res, 11);
    }
}
