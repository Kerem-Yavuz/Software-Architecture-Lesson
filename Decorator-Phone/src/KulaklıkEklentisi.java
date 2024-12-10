public class KulaklıkEklentisi extends TelefonAksesuarlar{
    KulaklıkEklentisi(ITelefon telefon) {
        super(telefon);
    }

    @Override
    public String telefonDetay()
    {
        return aksesuarliTelefon.telefonDetay() + " Kulaklık eklendi";
    }
}
