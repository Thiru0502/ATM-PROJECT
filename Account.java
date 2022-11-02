public class Account {
    Scanner input=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
   public int SetCustomerNumber(int customerNumber){
    this.customerNumber=customerNumber;
    return customerNumber;
   }
   public int getCustomerNumber(){
    return customerNumber;
   }
   public int setpinNumber(int pinNumber){
    this.pinNumber=pinNumber;
    return pinNumber;
   }
   public int getpinNumber{
    return pinNumber;
   }
public double getCheckingBalance(){
    return checkingBalance;
}
public double getSavingBalance(){
    return savingBalance;
}
}
