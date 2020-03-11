
/**
 *
 * @author nasre
 */
public class Manager extends Employee {
    protected double _bonus;// bonus amount for pay period
    protected double _vacPay; //fields for the vacation
    public Manager(String s, double r, double p , int b, double v){
     super(s, r, p);   
     _bonus = b;
     _vacPay = v;
    }
    public void setBonus(double _bonus) {
        this._bonus = _bonus;
    }
    @Override
    public double calculatePay(){
        return (_wage*_numhours)+_vacPay+_bonus;
    }
    
}
