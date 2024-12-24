import java.util.HashMap;
import java.util.Map;

public class IslemTuruFabrikasi {
    private static Map<String, IslemTuru> turler = new HashMap<>();

    public IslemTuru getIslemTuru(String isim)
    {
        if(!turler.containsKey(isim))
        {
            IslemTuru newIslemTuru = new IslemTuru(isim);
            turler.put(isim,newIslemTuru);
        }
        return turler.get(isim);
    }
}
