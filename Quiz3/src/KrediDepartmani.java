public class KrediDepartmani extends Departman{
    public boolean islemUygunMu(Islem islem)
    {
        if(islem.getTur().getIsim() == "Para Transferi")
        {
            return false;
        }
        return true;
    }
    public void islemIsle(Islem islem)
    {
        System.out.println(islem.getDetaylar()+ " "+ islem.getTur().getIsim()+ " Kredi Departmanında işlendi");
    }
}
