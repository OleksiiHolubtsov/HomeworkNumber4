package app;

public class Main {
        static int day;
        static int quantity;
        static double cost;
        static double totalCost;
        static Double price;
    private final static String CURRENCY = "EUR";
        public static void main(String[] args) {
            quantity = 5;
            price = 2430.68;
            day  = 5;
            cost = quantity * price;
            totalCost = cost / day;

            System.out.printf("%nProduct № 1: smartphone," +
                                "%nTotal sales for %s days is %s %.2f," +
                                "%nsales by day is %s %.2f.",
                                day, CURRENCY, cost, CURRENCY, totalCost);
            quantity = 7;
            price = 1498.12;
            day = 7;
            cost = quantity * price;
            totalCost = cost / day;
            System.out.printf("%nProduct № 2: laptop," +
                                "%nTotal sales for %d days is %s %.2f," +
                                "%nsales by day is %s %.2f.",
                                day, CURRENCY, cost,CURRENCY, totalCost);

    }



}
