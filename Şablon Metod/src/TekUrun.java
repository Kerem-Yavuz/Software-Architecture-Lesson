public class TekUrun implements MenuElemani{
    public String ad;
    public Double fiyat;

    TekUrun(String ad, Double fiyat)
    {
        this.ad = ad;
        this.fiyat = fiyat;
    }

    @Override
    public void goster(String girinti) {
        System.out.println(girinti+ "Ad: "+ this.ad +" Fiyat: "+ this.fiyat);
    }
}
