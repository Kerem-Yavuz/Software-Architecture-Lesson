public class AracKiralamakVeOdemeYapmak {
    IAracFactory SUVFactory = new SUVFactory();
    IAracFactory SporArabaFactory = new SporArabaFactory();
    IAracFactory SedanFactory = new SedanFactory();


    IOdemeStratejisi nakit = new NakitOdeme();
    IOdemeStratejisi krediKarti = new KrediKartiOdeme();
    IOdemeStratejisi bankaKarti = new BankaKartiOdeme();
    public void aracKirala(String aracTipi)
    {
        if(aracTipi == "SUV")
        {
            SUVFactory.icMekanUret();
            SUVFactory.lastigiUret();
            SUVFactory.motoruUret();
        }
        else if (aracTipi == "Spor Araba")
        {
            SporArabaFactory.icMekanUret();
            SporArabaFactory.lastigiUret();
            SporArabaFactory.motoruUret();
        }
        else if (aracTipi == "Sedan")
        {
            SedanFactory.icMekanUret();
            SedanFactory.lastigiUret();
            SedanFactory.motoruUret();
        }
        else
        {
            System.out.println("Invalid aracTipi");
        }

    }
    public void odemeYap(String odemeTuru, Double miktar)
    {

        if(odemeTuru == "Nakit")
        {
            nakit.odemeYap(miktar);
        }
        else if (odemeTuru == "Kredi Karti")
        {
            krediKarti.odemeYap(miktar);
        }
        else if (odemeTuru == "Banka Karti")
        {
            bankaKarti.odemeYap(miktar);
        }
        else
        {
            System.out.println("Invalid Odeme Yontemi");
        }

    }
}
