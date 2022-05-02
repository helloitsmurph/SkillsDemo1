import static org.junit.Assert.*;
import org.junit.*;

public class SkillsDemo1Tester {
    @Test
    public void getAverageTest() {
        int[] dataSet = {1,2,3,4,5};
        assertEquals(3, SkillsDemo1.getAverage(dataSet));
    }
}
