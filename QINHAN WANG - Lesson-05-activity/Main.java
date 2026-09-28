class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
    

/*  
    Challenge 1:
    Create two integer variables and Assign values to them. 
    Calculate the sum of the two numbers and store the 
    calculated sum and then display it.
*/
    int x1 = 20;
    int x2 = 30;
    int sum = x1 + x2;
    System.out.println("The sum is "+sum);

/*  
    Challenge 2:s
    Create three variables to assign three grades and Assign values to each grade. 
    Calculate the sum of the three grades and store the 
    calculated sum and then display it.
    
*/
    int grade1 = 90;
    int grade2 = 95;
    int grade3 = 100;
    sum = grade1 + grade2 + grade3;
    System.out.println(sum);

/*  
    Challenge 3:
    Calculate the average from the three grades from challenge 2,
    store the value and then display it.
    Declare and assign values to any new variables
    NOTE: Does it look correct, check with a calculator?
*/
    double average = (grade1 + grade2 + grade3) / 3;
    System.out.println(average);

/*  
    Challenge 4:
    Write the following equation in EQ1.PNG file in Java; store the result and the display it:
    Declare and assign values to any new variables

*/
    int A = 5; 
    int x = 4; 
    double y = A / (x + 1);
    System.out.println(y);

/*  
    Challenge 5:
    Using the variables same variables from challenge4 above, write the following equation in EQ2.PNG file in Java, store the result and the display it:

    Declare and assign values to any new variables

*/
    double y1 = (2 * x * ( x + 1 ) * ( x * - 1/2) ) / A;
    System.out.println(y1);

/*  
    Challenge 6:
    Create the variables and write the equation in
    file  EQ3.PNG

    Declare and assign values to any new variables
*/
    int b = 6;
    int h = 10;
    double area = ( b * h ) / 2;
    System.out.println(area);

/*  
    **** Bonus Challenge ****:
    Create a variable that stores the total number of eggs 
    and assign it 100. We want to fill as many baskets with 
    eggs as we can. Each basket can hold only 12 eggs.s

    1) Write the java code that will calcute how many baskets
    of 12 eggs can we fill fully.

    HINT: What do we get when we divide an integer by 
    an integer in Java

    2) Write the java code that will calculate how many eggs
    are left over after we filled as many baskets of 12 eggs.
*/
    int sumegg = 100;
    int Eachbasket = 12;
    int baskets = sumegg / Eachbasket;
    System.out.println(baskets);

    int leftover = sumegg % Eachbasket;
    System.out.println(leftover);

    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}