public class StockAlert {

    public static boolean checkAlert(double currentPrice, double thresholdPrice) {
        return currentPrice >= thresholdPrice;
    }

    public static String getAlertMessage(double currentPrice, double thresholdPrice) {
        if (checkAlert(currentPrice, thresholdPrice)) {
            return "ALERT: Stock price reached threshold!";
        } else {
            return "No Alert";
        }
    }

    public static void main(String[] args) throws InterruptedException {

        double threshold = 100;

        // Continuous execution (Keeps container RUNNING)
        while (true) {

            // Simulated stock price (changes randomly)
            double currentPrice = 80 + Math.random() * 100;

            String message = getAlertMessage(currentPrice, threshold);

            System.out.println("Current Price: " + currentPrice);
            System.out.println(message);
            System.out.println("-----------------------------");

            // Wait for 10 seconds
            Thread.sleep(10000);
        }
    }
}