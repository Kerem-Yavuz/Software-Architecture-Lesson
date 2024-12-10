package Siniflar;

public class SiparisYoneticisi {
    private StokSistemi stokSistemi = new StokSistemi();
    private KargoSistemi kargoSistemi = new KargoSistemi();
    public void siparisIsle(String urunKodu, int miktar, String adres)
    {
        boolean stoktaVarmi = stokSistemi.stokKontrolEt(urunKodu);
        if(stoktaVarmi)
        {
            stokSistemi.stokGuncelle(urunKodu, miktar);
            kargoSistemi.kargoAyarla(adres);
        }
        else
        {
            System.out.println(urunKodu+ "kodlu ürün Stokta Yok");
        }

    }
}
