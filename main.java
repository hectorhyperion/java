import java.util.Scanner; // import the Scanner class 
class Main {
  public static void main(String[] args) {
         for(int i=1; i<=50; i++){
     Scanner myObj = new Scanner(System.in);
    
    String userName;
    int UserId = 1-50;
    int ammount=4000;
    int Quantity;
     System.out.println("Customer :" + i);
         // Enter username and press Enter
    System.out.println("Enter username"); 
    userName = myObj.nextLine();
    
     System.out.println("Enter Customer Id"); 
    UserId = myObj.nextInt();
     System.out.println("Enter Quantity" ); 
    Quantity = myObj.nextInt();
     int x = Quantity*ammount;

       System.out.println('\n');
        System.out.println("Username is: " + userName +",");    
            System.out.println("ID is: " + UserId +","); 
            System.out.println("Total Ammount is:" + x +'\n'+'\n');
    
   } 
  }
  }
     
