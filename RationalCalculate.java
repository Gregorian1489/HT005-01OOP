public class RationalCalculate extends RationalNumbers implements Calculating<RationalNumbers> {

    public RationalCalculate(double a, double b){
        super(a, b);
    }

    @Override
    public RationalNumbers sum() {
        return new RationalNumbers(a + b);
    }

    @Override
    public RationalNumbers diff() {
        return new RationalNumbers(a - b);
    }

    @Override
    public RationalNumbers mult() {
        return new RationalNumbers(a * b);
    }

    @Override
    public RationalNumbers div() {
        return new RationalNumbers(a / b);
    }
    
}
