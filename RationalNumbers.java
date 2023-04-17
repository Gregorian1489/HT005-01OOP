public class RationalNumbers extends ValuesNumber {

    public RationalNumbers(double res) {
        super.res = res;
        

    }

    public RationalNumbers(double a, double b) {
        super.a = a;
        super.b = b;
    }

    @Override
    public String toString() {
        return "[" + 
                res + "]"+  "\n";
    }

    
    
}
