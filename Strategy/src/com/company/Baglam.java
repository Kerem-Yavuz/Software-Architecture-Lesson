package com.company;

public class Baglam {
    private OdemeYontemi odemeYontemi;

    public void setOdemeYontemi(OdemeYontemi odemeYontemi) {
        this.odemeYontemi = odemeYontemi;
    }

    public void odemeyiTamamla(Double tutar)
    {
        odemeYontemi.odemeYap(tutar);
    }
}
