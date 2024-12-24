public class SUVFactory implements IAracFactory{

    @Override
    public IMotor motoruUret() {
        IMotor motor = new SUVMotor();
        motor.motoruUret();
        return motor;
    }

    @Override
    public ILastik lastigiUret() {
        ILastik Ilastik = new SUVLastik();
        Ilastik.lastigiUret();
        return Ilastik;
    }

    @Override
    public IIcMekan icMekanUret() {
        IIcMekan iIcMekan = new SUVIcMekan();
        iIcMekan.icMekanUret();
        return iIcMekan;
    }
}
