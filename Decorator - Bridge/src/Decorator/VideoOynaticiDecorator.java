package Decorator;

import Bridge.IIsletimSistemi;

public abstract class VideoOynaticiDecorator extends VideoOynatici {
    public VideoOynatici oynatici;


    VideoOynaticiDecorator(VideoOynatici videoOynatici) {
        super(videoOynatici.os);
        this.oynatici = videoOynatici;
    }

    public void oynat(String dosyaAdi)
    {
        oynatici.oynat(dosyaAdi);
    }
}
