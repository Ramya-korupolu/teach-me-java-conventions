package powerpackage;


import org.junit.Test;
import static org.junit.Assert.*;  

public class Powertest {
    @Test
    public void one_raised_to_one_is_one() {
        assertEquals(1, powerfinder.OF(1,1));
    }

    @Test
    public void twoRaised_to_one_is_2() {
        assertEquals(2, powerfinder.OF(2,1));
    }

    @Test
    public void two_power_2_is_4() {
        assertEquals(4, powerfinder.OF(2, 2));
    }

    @Test
    public void three_power_2_Is_Nine() {
        assertEquals(9, powerfinder.OF(3, 2));
    }
}
