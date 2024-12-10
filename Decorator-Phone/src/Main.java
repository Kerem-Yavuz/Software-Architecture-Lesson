public class Main {
    public static void main(String[] args) {
        ITelefon telefon = new SadeTelefon();
        System.out.println(telefon.telefonDetay());
        telefon = new KilifEklentisi(telefon);
        System.out.println(telefon.telefonDetay());
        telefon = new KulaklıkEklentisi(telefon);
        System.out.println(telefon.telefonDetay());

        ITelefon telefon2 = new SadeTelefon();
        telefon2 = new KulaklıkEklentisi(telefon2);
        System.out.println(telefon2.telefonDetay());

    }
}
