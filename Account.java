import java.text.DecimalFormat;
import java.util.Scanner;

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
public double calcCheckingWithdraw(double amount){
    checkingBalance = (checkingBalance-amount);
    return checkingBalance;
}
public calcSavingwithdraw(double amount){
    savingBalance = (savingBalance-amount);
    return savingBalance;
}
public double calcCheckingDeposit(double amount){
    checkingBalance = (checkingBalance+amount);
    return checkingBalance;
}
public calcSavingDeposit(double amount){
    savingBalance = (savingBalance-amount);
    return savingBalance;
}
public void getCheckingWithdrawInput(){
    System.out.println("checking Account Balance:"+moneyFormat.format(CheckingBalance));
    System.out.println("Amount You want to withdraw from Checking Account:");
    double amount=input.nextDouble();
    if((CheckingBalance-amount)>=0){
        calcCheckingWithdraw(amount);
        System.out.println("new checking Account Balance"+moneyFormat.format(checkingBalance));
    }else{
        System.out.println("Balance Cannot Be negative "+"/n");
    }
}
public void getSavingWithdrawInput(){
    System.out.println("saving Account Balance:"+moneyFormat.format(savingBalance));
    System.out.println("Amount You want to withdraw from saving Account:");
    double amount=input.nextDouble();
    if((SavingBalance-amount)>=0){
        calcSavingWithdraw(amount);
        System.out.println("new Saving Account Balance"+moneyFormat.format(savingBalance));
    }else{
        System.out.println("Balance Cannot Be negative "+"/n");
    }
}
public void getCheckingDepositInput(){
    System.out.println("checking Account Balance:"+moneyFormat.format(CheckingBalance));
    System.out.println("Amount You want to deposit to Checking Account:");
    double amount=input.nextDouble();
    if((CheckingBalance+amount)>=0){
        calcCheckingDeposit(amount);
        System.out.println("new checking Account Balance"+moneyFormat.format(checkingBalance));
    }else{
        System.out.println("Balance Cannot Be negative "+"/n");
    }
}
public void getSavingDepositInput(){
    System.out.println("saving Account Balance:"+moneyFormat.format(savingBalance));
    System.out.println("Amount You want to Deposit to saving Account:");
    double amount=input.nextDouble();
    if((SavingBalance+amount)>=0){
        calcSavingDeposit(amount);
        System.out.println("new Saving Account Balance"+moneyFormat.format(savingBalance));
    }else{
        System.out.println("Balance Cannot Be negative "+"/n");
    }
}
private int customerNumber;
private int pinNumber;
private double CheckingBalance=0;
private double savingBalance=0;

}
