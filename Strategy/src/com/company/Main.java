package com.company;

public class Main {

    public static void main(String[] args) {
        OdemeYontemi kredikartiOdeme = new KrediKartiOdeme();
        OdemeYontemi paypalOdeme = new PayPalOdeme();
        OdemeYontemi bankaOdeme = new BankaTransferiOdeme();


        Baglam baglam1 = new Baglam();
        
        baglam1.setOdemeYontemi(kredikartiOdeme);
        baglam1.odemeyiTamamla(200.0);

        baglam1.setOdemeYontemi(paypalOdeme);
        baglam1.odemeyiTamamla(150.0);


        baglam1.setOdemeYontemi(bankaOdeme);
        baglam1.odemeyiTamamla(2000.0);
    }
}
