import Odemeler.KrediKartiAdapter;
import Odemeler.OdemeYontemi;
import Siniflar.SiparisYoneticisi;

public class Main {
    public static void main(String[] args) {
        SiparisYoneticisi siparisYoneticisi = new SiparisYoneticisi();
        siparisYoneticisi.siparisIsle("1234tsay", 2, "adres123123123123123");

        OdemeYontemi odemeYontemi = new KrediKartiAdapter();
        odemeYontemi.odemeYap(299.99);
    }
}
