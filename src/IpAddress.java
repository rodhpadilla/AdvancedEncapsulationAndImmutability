import java.util.regex.Pattern;

public class IpAddress {
    private final String value;
    private static final Pattern IP_PATTERN = Pattern.compile("^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$");

    public IpAddress(String rawIp) {
        if (rawIp == null || !IP_PATTERN.matcher(rawIp).matches()) {
            throw new IllegalArgumentException("Invalid IP format " + rawIp);
        }
        this.value = rawIp;
    }

    public String getValue() {
        return value;
    }
}
