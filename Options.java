import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Options extends Account{
  Scanner menuInput=new Scanner(System.in);
  DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
  HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();

  void login() throws IOException{
    int x=1;
    {
      do{
      try{
        data.put(986677, 7868);
        data.put(897867, 7678);
    System.out.println();
    System.out.println("welcome to login page");
    System.out.println("Enter Your Account Number:");
    SetCustomerNumber(menuInput.nextInt());
    System.out.println("Enter Your Pin Number");
    setpinNumber(menuInput.nextInt());
    
  }catch(Exception e){
  System.out.println("invalid characters(s).only numbers.");
  x=1;
  }for(Entry<Integer,Integer> entry:data.entrySet()){
    if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber()){
      getAccountType();
      
    }
  }
   System.out.println("/n"+"Wrong custom number or pin number "+"/n");

}while(x==1);
}
  }
public void getAccountType(){
  System.out.println("Select the account you want to Access:");
  System.out.println("Type 1 - Checking Account");
  System.out.println("Type 2 - Saving Account");
  System.out.println("Type 3 - exit");
  System.out.println("Choice:");
  
  selection=menuInput.nextInt();
  switch (selection) {
    case 1:
          getChecking();      
      break;
      case 2:
      getSaving();      
      break;
      case 3:
      System.out.println("Thank you for using ATM , bye");
      break;
      default:
      System.out.println("INVALID CHOICE");
      getAccountType();
      break;
  }
}
public void getChecking(){
  System.out.println("checking Account:");
  System.out.println("Type 1 - View Balance");
  System.out.println("Type 2 - Withdraw Input ");
  System.out.println("Type 3 - Deposit Funds ");
  System.out.println("Choice:");
  selection = menuInput.nextInt();
  switch (selection) {
    case 1:
    System.out.println("Checking Account Balance: " +moneyFormat.format(getChecking()));
    getAccountType();
    break;

    case 2:
    getCheckingWithdrawInput();
    getAccountType();
    break;
    case 3:
    getCheckingDepositInput();
    getAccountType();
    break;
    case 4:
   System.out.println("Thank You for using ATM bye.");
    break;
   default:
   System.out.println("\n"+"invalid choice" + "\n");
   getChecking();
     
  }
}
public void getSaving(){
  System.out.println("checking Account:");
  System.out.println("Type 1 - View Balance");
  System.out.println("Type 2 - Withdraw Input ");
  System.out.println("Type 3 - Deposit Funds ");
  System.out.println("Choice:");
  selection = menuInput.nextInt();
  switch (selection) {
    case 1:
    System.out.println("Checking Account Balance: " +moneyFormat.format(getSaving()));
    getAccountType();
    break;

    case 2:
    getSavingWithdrawInput();
    getAccountType();
    break;
    case 3:
    getSavingDepositInput();
    getAccountType();
    break;
    case 4:
   System.out.println("Thank You for using ATM bye.");
    break;
   default:
   System.out.println("\n"+"invalid choice" + "\n");
   getSaving();    
  }
}
int selection;

}  

