
/**
 *
 * @author nasre
 */
public class SalesAssociate extends Employee {
    protected double _vacPay;
    public SalesAssociate(String s, double r, double p , double e){
     super(s, r, p);  
     _vacPay = e;
    }
    @Override
    public double calculatePay(){
        return (_wage*_numhours)+_vacPay;
    }
    
}
