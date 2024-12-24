public class KrediKartiOdeme implements IOdemeStratejisi{
    @Override
    public void odemeYap(Double miktar) {
        System.out.println(miktar  + " Kredi kartiyla Odendi");
    }
}
