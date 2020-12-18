import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;

class TaskHelperTest {

    @Test
    void getSumProgression() {
        TaskHelper helper = new TaskHelper();

        Integer result1 = helper.getSumProgression(5, 5);
        Integer result2 = helper.getSumProgression(2, 10);
        Integer result3 = helper.getSumProgression(3, 30);

        Integer expected1 = 12;
        Integer expected2 = 230;
        Integer expected3 = 6525;

        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);

    }
}