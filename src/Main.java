public class Main {
    public static void main(String[] args) {
        CronExpression cron = new CronExpression("*/45");
        System.out.println(cron.getCronValue());
    }
}
