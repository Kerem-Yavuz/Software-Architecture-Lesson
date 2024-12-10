public class TelefonAksesuarlar implements ITelefon{
    ITelefon aksesuarliTelefon;
    TelefonAksesuarlar(ITelefon telefon)
    {
        this.aksesuarliTelefon = telefon;
    }

    @Override
    public String telefonDetay() {
        return aksesuarliTelefon.telefonDetay();
    }
}
