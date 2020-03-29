package pro.antonshu.textsearch;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double payment = 123456.789;

        // Write your code here.
        Locale IN = new Locale("INDIA");

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(IN);
        Scanner scan = new Scanner(System.in);
        StringBuilder s = new StringBuilder("sdfsd");
        s.deleteCharAt(s.length()-1);




        System.out.println("US: " + usFormat.format(payment));
        CharSequence old = String.copyValueOf("$".toCharArray());
        CharSequence newSequence = String.copyValueOf("Rs.".toCharArray());
        System.out.println(String.format("India: %s", usFormat.format(payment).replace(old, newSequence)));
        System.out.println("China: " + chinaFormat.format(payment));
        System.out.println("France: " + frFormat.format(payment));
        System.out.println("Штвшф: " + indiaFormat.format(payment));
    }
}
