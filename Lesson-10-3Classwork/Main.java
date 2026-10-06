class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){

    System.out.println("Please enter your ticket of number");
    int x = Input.readInt();
    double cost = groupSavings(x);
    System.out.println("The final cost is:" +cost);  
    
    System.out.println("Please enter your stores");
    double t = Input.readDouble();
    System.out.println("Please enter your cans");
    int c = Input.readInt();
    double saving = groceryDiscount(t, c);
    System.out.println("The final cost bill is:" +saving);  
    
  }

    /*
      Problem 1:      
      Write a function groupSavings that takes number of tickets wanting 
      to purchase. Return the total cost by apply the following discount:
      1 to 8 tickets  : each ticket cost $11,
      9 to 16 tickets : each ticket cost $10.50
      over 16 tickts  : each ticket cost $8.50
    */
    
    double groupSavings(int ticket){
      double result;

      if(ticket > 16){
        return result = ticket * 8.50;
      }
      else if(ticket >= 9 && ticket <= 16){
        return result = ticket * 10.50;
      }
      else if (ticket >= 1 && ticket <= 8){
        return result = ticket * 11;
      }
      else{
        return 0;
      }
    }
  
    
  /*
      Write a function groceryDiscount that takes the total amount spent at 
      a grocery store and the number of cans of beans purchased.
      Depending on the total amount and number of can of
      beans purchase, you get a savings on their total bill.
      Return the savings amount:
        Spent $100 to $200 and purchase at least 3 cans of 
        beans: $10 savings
        Spent over $200 and purchase more than 4 cans 
        of beans: $25 savings
        Otherwise: $0 savings.
    */
  double  groceryDiscount(double total, int cans){
         double result;
        if(total >= 100 && total <= 200 && cans >= 3){
          return result = 10;
        }
        else if(total > 200 && cans > 4){
          return result = 25;
        }
        else{
          return result = 0;
        }
      }

}