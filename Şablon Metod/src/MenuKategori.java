import java.util.ArrayList;
import java.util.List;

public class MenuKategori implements MenuElemani{
    public String ad;
    public ArrayList<MenuElemani> elemanlar = new ArrayList<MenuElemani>();

    MenuKategori(String ad)
    {
        this.ad = ad;
    }

    @Override
    public void goster(String girinti) {
        System.out.println(girinti+ "Kategori: "+ this.ad);
        for(MenuElemani eleman:elemanlar)
        {
            eleman.goster(girinti + " ");
        }

    }

    public void sil(MenuElemani eleman)
    {
        elemanlar.remove(eleman);
    }
    public void ekle(MenuElemani eleman)
    {
        elemanlar.add(eleman);
    }
}
