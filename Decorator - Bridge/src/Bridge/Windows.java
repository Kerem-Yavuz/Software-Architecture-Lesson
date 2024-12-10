package Bridge;

public class Windows implements IIsletimSistemi{

    public void islemiGerceklestir(String dosyaAdi) {
        System.out.println(dosyaAdi + " isimli medya windows üzerinde oynamaya başladı");
    }
}
