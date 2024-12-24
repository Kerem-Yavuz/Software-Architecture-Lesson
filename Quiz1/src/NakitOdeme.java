public class NakitOdeme implements IOdemeStratejisi{
    @Override
    public void odemeYap(Double miktar) {
        System.out.println(miktar + " Nakit ile Odendi");
    }
}
