public class RiskAnaliziZiyaretci implements IZiyaretci{

    @Override
    public void ziyaretEt(Islem islem) {
        System.out.println("Risk Analizci Ziyaret Etti "+ islem.getDetaylar()+ " "+ islem.getTur().getIsim());
    }
}
