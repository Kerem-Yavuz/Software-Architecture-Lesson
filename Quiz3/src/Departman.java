public class Departman {
    protected Departman sonraki;

    public void setSonraki(Departman sonraki)
    {
        this.sonraki = sonraki;
    }
    public void islemYap(Islem islem)
    {
        if(islemUygunMu(islem))
        {
            islemIsle(islem);
        }
        else
        {
            sonraki.islemYap(islem);
        }
    }
    protected boolean islemUygunMu(Islem islem)
    {
        return false;
    }
    protected void islemIsle(Islem islem)
    {

    }
}
