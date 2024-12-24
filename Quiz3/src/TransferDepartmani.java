public class TransferDepartmani extends Departman{
    public boolean islemUygunMu(Islem islem)
    {
        if(islem.getTur().getIsim() == "Para Transferi")
        {
            return true;
        }
        return false;
    }
    public void islemIsle(Islem islem)
    {
        System.out.println(islem.getDetaylar()+ " "+ islem.getTur().getIsim()+ " Transfer Departmanında işlendi");
    }
}
