public class CalculateComplex extends ComplexNumbers implements Calculating<ComplexNumbers> {

    public CalculateComplex(double x, double y) {
        super(x, y);
    }



    @Override
    public ComplexNumbers diff() {
        return new ComplexNumbers((x - y) + (w - z));
    }

    @Override
    public ComplexNumbers div() {
        return new ComplexNumbers((x*y - w*z) +  (w*y + x*z));
    }

    @Override
    public ComplexNumbers mult() {
        return new ComplexNumbers(((x*y + w*z)/(y*y + z*z)) +  ((w*y + x*z)/(y*y + z*z)));
    }

    @Override
    public ComplexNumbers sum() {
        return new ComplexNumbers((x + y) + (w + z));
    }

    
}
