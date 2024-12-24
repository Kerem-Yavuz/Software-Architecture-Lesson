public class BankaKartiOdeme implements IOdemeStratejisi{
    @Override
    public void odemeYap(Double miktar) {
        System.out.println(miktar + " Banka Karti ile odendi");
    }
}
