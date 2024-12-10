public class KilifEklentisi extends TelefonAksesuarlar{
    KilifEklentisi(ITelefon telefon) {
        super(telefon);
    }

    @Override
    public String telefonDetay()
    {
        return aksesuarliTelefon.telefonDetay() + " Kılıf eklendi";
    }
}
