package org.math;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class Main {
    public static void main(String[] args) {
      NumberFormat currency =  NumberFormat.getCurrencyInstance();
      String result = currency.format(1234567.89);
        System.out.println(result);// $1,234,567.89

        //PERCENT VALUE:
        NumberFormat percent =  NumberFormat.getPercentInstance();
        String result2 = percent.format(0.1); // if you want to change the vars name, right type in the variable -> refactor -> rename and the other references get updated automatically
        System.out.println(result2); // 10%
         // we can also do that
        String result3 = NumberFormat.getPercentInstance().format(0.003);


    }
}