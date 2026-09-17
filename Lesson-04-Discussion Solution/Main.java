class Main {
  
  public static void main(String[] args) {
    (new Main()).init();
  }

  // Init function which runs when the 
  // program begins.  

  void init(){
    //Number of cars
    int numOfCars = 5;

    // investment amount in currency
    double investmentAmount = 15100.50;

    //Persons first name
    String firstName = "Jack";
    
    //Is a game over
    boolean gameOver = false;
    
    //store an first initial

    char firstInit = 'E';

    // Maximum number of customer in a theater.
    // declare it has a constant (ie, never changes)

    final int maxNumOfSeats =100;
    
System.out.println(numOfCars);
System.out.println(investmentAmount);
System.out.println(firstName);
System.out.println(gameOver);
System.out.println(firstInit);
System.out.println(maxNumOfSeats);
  }

}