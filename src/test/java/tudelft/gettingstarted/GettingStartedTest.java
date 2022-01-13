package tudelft.gettingstarted;SZdceadsasdaDS	12E`F2RQWGWR3`2R1`312EWR
3E2QWRZFDS\

































	]\
		
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
<<<<<<< HEAD
//Todo cambio es dificil
=======
>>>>>>> bede19ac43edbbf4829771352e1e616d0009ba15
// Write this test
public void addFiveToMinusTwenty() {
    int result = new GettingStarted().addFive(-20);

