package com.company;

public class BankaTransferiOdeme implements OdemeYontemi{
    @Override
    public void odemeYap(Double tutar) {
        System.out.println(tutar+ " Banka Transferi İle Ödendi");
    }
}
