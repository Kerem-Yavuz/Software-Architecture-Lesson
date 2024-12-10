public class main {
    public static void main(String[] args) {
        MenuElemani tekurun1 = new TekUrun("Hamburger", 200.0);
        tekurun1.goster("");


        MenuElemani icecek1 = new TekUrun("kola", 50.0);
        MenuElemani icecek2 = new TekUrun("ayran", 45.0);
        MenuElemani icecek3 = new TekUrun("Doğal Meyve Suyu", 65.0);

        MenuKategori kategori1 = new MenuKategori("İçecekler");
        kategori1.ekle(icecek1);
        kategori1.ekle(icecek2);

        MenuKategori kategori2 = new MenuKategori("Doğal İçecekler");
        kategori2.ekle(icecek3);
        kategori1.ekle(kategori2);

        kategori1.goster("");
    }
}
