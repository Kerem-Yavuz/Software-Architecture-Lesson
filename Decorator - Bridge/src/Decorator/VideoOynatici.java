package Decorator;
import Bridge.IIsletimSistemi;

public class VideoOynatici {
    protected IIsletimSistemi os;

    VideoOynatici(IIsletimSistemi isletimSistemi)
    {
        this.os = isletimSistemi;
    }

    public void oynat(String dosyaAdi)
    {
        os.islemiGerceklestir(dosyaAdi);
    }

}
