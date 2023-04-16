  /*
  * name= Samuel ebuka peters
  * matric no = 19/095344033
  * department= Statistics
  * level= 200
  */
  import java.util.Scanner; // import the Scanner class 
  class Main {
  public static void main(String[] args) {
        for(int i=1; i<=50; i++){
    Scanner myObj = new Scanner(System.in);
  String CustomerName;
  int UserId;
  int ammount=4000;
  int Quantity;
    System.out.println("Customer :" + i);
        // Enter customer name and press Enter
  System.out.println("Enter Customer's Name"); 
  CustomerName = myObj.nextLine();
  //enter customer id
    System.out.println("Enter Customer Id"); 
  UserId = myObj.nextInt();
        //enter quantity
    System.out.println("Enter Quantity" ); 
  Quantity = myObj.nextInt();
    int x = Quantity*ammount;
  //output
      System.out.println('\n');
      System.out.println("Customer name is: " + CustomerName +",");    
          System.out.println("ID is: " + UserId +","); 
          System.out.println("Quantity is: " + Quantity +","); 
          System.out.println("Total Ammount is:" + x +'\n'+'\n');
  } 
  }     
    }