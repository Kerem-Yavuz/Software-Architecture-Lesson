public class SporArabaFactory implements IAracFactory{
    @Override
    public IMotor motoruUret() {
        IMotor motor = new SporArabaMotor();
        motor.motoruUret();
        return motor;
    }

    @Override
    public ILastik lastigiUret() {
        ILastik Ilastik = new SporArabaLastik();
        Ilastik.lastigiUret();
        return Ilastik;
    }

    @Override
    public IIcMekan icMekanUret() {
        IIcMekan iIcMekan = new SporArabaIcMekan();
        iIcMekan.icMekanUret();
        return iIcMekan;
    }
}
