import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {

        static Logger LOGGER;    static {
                try (FileInputStream ins = new FileInputStream("log.config")) {            
                        LogManager.getLogManager().readConfiguration(ins);
                        LOGGER = Logger.getLogger(Main.class.getName());
                        } 
                catch (Exception ignore) {
                ignore.printStackTrace();        
        }
    }

    public static void main(String[] args) {
                CalculateComplex calcCompl1 = new CalculateComplex(15, 37);
        calcCompl1.setW(0.2);

        if (calcCompl1.getW() == 0){
                LOGGER.log(Level.INFO,"Пользователь ввел нулевое значение(Для примера)");   
        }
        calcCompl1.setZ(3.3);
        LOGGER.log(Level.INFO, "sum = " + calcCompl1.sum());
        LOGGER.log(Level.INFO, "diff = " + calcCompl1.diff()); 
        LOGGER.log(Level.INFO, "mult = " + calcCompl1.mult());
        LOGGER.log(Level.INFO, "div = " + calcCompl1.div());  
        RationalCalculate calcRat1 = new RationalCalculate(5, 10);
        LOGGER.log(Level.INFO, "Rational numbers = " + RationalCalculate.getA() + " & " + RationalCalculate.getB() + "\n");                    
        LOGGER.log(Level.INFO, "sum = " + calcRat1.sum()); 
        LOGGER.log(Level.INFO, "diff = " + calcRat1.diff()); 
        LOGGER.log(Level.INFO, "mult = " + calcRat1.mult()); 
        LOGGER.log(Level.INFO, "div = " + calcRat1.div()); 
        }
    
}