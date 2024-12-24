public class Islem {
    private IslemTuru tur;
    private String detaylar;
    private IslemTuruFabrikasi fabrika = new IslemTuruFabrikasi();
    public Islem(String turisim, String detaylar) {
        this.tur = fabrika.getIslemTuru(turisim);
        this.detaylar = detaylar;
    }

    public IslemTuru getTur() {
        return tur;
    }

    public String getDetaylar() {
        return detaylar;
    }

    public void kabulEt(IZiyaretci ziyaretci)
    {
        ziyaretci.ziyaretEt(this);
    }

}
