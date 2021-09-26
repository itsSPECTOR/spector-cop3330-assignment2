package org.example.ex26;

public class PaymentCalculator {

    static void calculateMonthsUntilPaidOff(String balance, String rate, String monthly){

        double bal, apr, mon, time;

        //convert strings to double
        bal = Double.parseDouble(balance);
        apr = Double.parseDouble(rate) / 100;
        mon = Double.parseDouble(monthly);

        time = (-1.0/30.0) * Math.log(1 + ((bal/mon) * (1 - (Math.pow((1 + apr), 30)))));
        //Math.log(1 + ((balance/payment) * (1 - (Math.pow((1 + APR), 30)))))

        System.out.print(time);

    }

}