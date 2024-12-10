package Siniflar;

public class StokSistemi {
    protected boolean stokKontrolEt(String urunKodu)
    {
        System.out.println(urunKodu+ " kodlu ürün stokta var");
        return true;
    }
    protected void stokGuncelle(String urunKodu, int miktar)
    {
        System.out.println(urunKodu + " kodlu ürün miktarı "+ miktar + " olarak güncellenmiştir");
    }
}
