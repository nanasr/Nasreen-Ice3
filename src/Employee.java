/**
 *
 * @author nasre
 */
public class Employee {
     protected String _name;// name of the employee
    protected double _wage; // hour they get paid for
    protected double _numhours;
    //constructor
    public Employee(String s, double r, double p){
      _name = s;
      _wage = r;
      _numhours = p;
    }
    public String getName() {
        return _name;
    }
    
    public void setName(String _name) {
        this._name = _name;
    }

   public double calculatePay(){
  return (_wage*_numhours);
       
   } 
    
}
