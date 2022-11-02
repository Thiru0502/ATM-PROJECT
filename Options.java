import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Options {
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
    
    
  }catch(Exception e){
  System.out.println("invalid characters(s).only numbers.");
  x=1;
  }for(Entry<Integer,Integer> entry:data.entrySet()){
    if(entry.getKey()==getCustomerNumber() && entry.getvalue()==getPinNumber()){
      
    }
  }
   System.out.println("/n"+"Wrong custom number or pin number "+"/n");

}while(x==1);
}
  }  
}
