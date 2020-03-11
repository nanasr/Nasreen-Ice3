

/**
 *
 * @author nasre
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Employee E1 = new Employee ("Nasreen", 15.11, 8.0);
          Manager M1 = new Manager ("Rashad", 17.11 , 8.0, 100, 10.0);
          SalesAssociate S1 = new SalesAssociate ("Joya", 20.0 , 17.0, 11.0);
          System.out.println("The Paycheque of the Employee "+E1.getName()+" is: $"+E1.calculatePay());
          System.out.println("The Paycheque of the Manager "+M1.getName()+ " is: $"+M1.calculatePay());
          System.out.println("The Paycheque of the SalesAssociate " +S1.getName()+" is: $"+S1.calculatePay());
    }
 }
