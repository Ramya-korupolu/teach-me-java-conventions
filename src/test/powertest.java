package powerpackage;


import org.junit.Test;
import static org.junit.Assert.*;  

public class PowerTest {
    @Test
    public void one_raised_to_one_is_one() {
        assertEquals(1, PowerFinder.calculatePower(1,1));
    }

    @Test
    public void two_raised_to_one_is_2() {
        assertEquals(2, PowerFinder.calculatePower(2,1));
    }

    @Test
    public void two_power_2_is_4() {
        assertEquals(4, PowerFinder.calculatePower(2, 2));
    }

    @Test
    public void three_power_2_is_Nine() {
        assertEquals(9, PowerFinder.calculatePower(3, 2));
    }
}
