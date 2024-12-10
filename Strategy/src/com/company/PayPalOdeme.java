package com.company;

public class PayPalOdeme implements OdemeYontemi{

    @Override
    public void odemeYap(Double tutar) {
        System.out.println(tutar+ " Paypal İle Ödendi");
    }
}
