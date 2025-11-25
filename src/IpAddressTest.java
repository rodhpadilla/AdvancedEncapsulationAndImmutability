import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IpAddressTest {

    @Test
    void validIp_ShouldCreateObject() {
        IpAddress ip = new IpAddress("192.168.1.1");
        Assertions.assertEquals("192.168.1.1", ip.getValue());
    }

    @Test
    void invalidIp_ShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new IpAddress("aa.bb.12.9");
        });
    }
}
