package creational.factorymethod;

import java.text.NumberFormat;

public class example {
    public static void main(String[] args) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();

        double x = 0.1;

        System.out.println(currencyFormatter.format(x)); // $0.10를 출력한다.
        System.out.println(percentFormatter.format(x)); // 10%를 출력한다.
    }
}
