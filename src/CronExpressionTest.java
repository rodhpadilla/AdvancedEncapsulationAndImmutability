import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CronExpressionTest {
    @Test
    void testValidExpressionsSingleCharacter(){
        CronExpression cron = new CronExpression("*");
        Assertions.assertEquals("*", cron.getCronValue());
    }

    @Test
    void testValidExpressionSingleCharacterAndTime(){
        CronExpression cron = new CronExpression("*/15");
        Assertions.assertEquals("*/15", cron.getCronValue());
    }

    @Test
    void testEmptyExpression(){
        assertThrows(IllegalArgumentException.class, () -> {
            new CronExpression("");
        });
    }

    @Test
    void testNullExpression(){
        assertThrows(IllegalArgumentException.class, () -> {
           new CronExpression(null);
        });
    }

    @Test
    void testInvalidExpression1(){
        assertThrows(IllegalArgumentException.class, () -> {
            new CronExpression("A*B*C");
        });
    }

    @Test
    void testInvalidExpression2(){
        assertThrows(IllegalArgumentException.class, () -> {
            new CronExpression("07:00");
        });
    }
}
