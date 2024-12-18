package powerpackage;


import org.junit.Test;
import static org.junit.Assert.*;  

public class PowerTest {
    @Test
    public void one_raised_to_one_is_one() {
        assertEquals(1, powerFinder.OF(1,1));
    }

    @Test
    public void twoRaised_to_one_is_2() {
        assertEquals(2, powerFinder.OF(2,1));
    }

    @Test
    public void two_power_2_is_4() {
        assertEquals(4, powerFinder.OF(2, 2));
    }

    @Test
    public void three_power_2_Is_Nine() {
        assertEquals(9, powerFinder.OF(3, 2));
    }
}
