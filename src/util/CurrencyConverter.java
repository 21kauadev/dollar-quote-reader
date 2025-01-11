package util;

public class CurrencyConverter {
    public static final double IOF = 0.06; // taxa

    public static double converter(double dolarPrice, double dollarsBought) {
        double convertedValue = dollarsBought * dolarPrice;
        double additionalTaxAmount = convertedValue * IOF;

        return convertedValue + additionalTaxAmount;
    }
}
