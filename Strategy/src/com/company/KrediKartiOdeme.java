package com.company;

public class KrediKartiOdeme implements OdemeYontemi{

    @Override
    public void odemeYap(Double tutar) {
        System.out.println(tutar+ " Kredi Karti İle Ödendi");
    }
}
