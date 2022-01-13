package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

    @Test
    // Add the correct numbers
    public void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5,result);
    }

    @Test
//Todo cambio es dificil
// Write this test
public void addFiveToMinusTwenty() {
    int result = new GettingStarted().addFive(-20);
    Assertions.assertEquals(-15, result);
}
}