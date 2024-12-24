public class SedanFactory implements IAracFactory{
    @Override
    public IMotor motoruUret() {
        IMotor motor = new SedanMotor();
        motor.motoruUret();
        return motor;
    }

    @Override
    public ILastik lastigiUret() {
        ILastik Ilastik = new SedanLastik();
        Ilastik.lastigiUret();
        return Ilastik;
    }

    @Override
    public IIcMekan icMekanUret() {
        IIcMekan iIcMekan = new SedanIcMekan();
        iIcMekan.icMekanUret();
        return iIcMekan;
    }
}
