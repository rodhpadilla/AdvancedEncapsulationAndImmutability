import java.util.regex.Pattern;

public class CronExpression {
    private final String cronValue;
    private static final Pattern CRON_PATTERN = Pattern.compile("^(\\*|\\*/\\d+)$");

    public CronExpression(String expression) {
        if (expression == null || !CRON_PATTERN.matcher(expression).matches()) {
            throw new IllegalArgumentException("Invalid Cron Expression");
        }
        this.cronValue = expression;
    }

    public String getCronValue(){
        return cronValue;
    }

}
