package Decorator;

public class SubtitleAddon extends VideoOynaticiDecorator{
    SubtitleAddon(VideoOynatici videoOynatici) {
        super(videoOynatici);
    }
    public void oynat(String dosyaAdi){
        super.oynat(dosyaAdi);
        showSubtitle();
    }
    public void showSubtitle()
    {
        System.out.println("Altyazi Eklendi");
    }
}
