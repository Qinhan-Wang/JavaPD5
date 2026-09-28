
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/
    System.out.println("Please enter your x value:");
    double x = Input.readDouble();
    double y = Math.pow(x , 7);
    System.out.println("The result is:" +y);

/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/
    System.out.println("Please enter your z value:");
    double z = Input.readDouble();
    double q = Math.pow(z , 3) + 5;
    System.out.println("The result is:" +q);

/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/
    System.out.println("Please enter your t value:");
    double t = Input.readDouble();
    
    System.out.println("Please enter your r value:");
    double r = Input.readDouble();
    
    double s = Math.pow(t , 5) * Math.pow(r + 2, 4);
    System.out.println("The result is:" +s);
 

/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/
    System.out.println("Please enter your A value:");
    double A = Input.readDouble();

    System.out.println("Please enter your B value:");
    double B = Input.readDouble();

    double C = Math.pow(A + B , 0.5);
    System.out.println("The result is:" +C);


/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/
    System.out.println("Please enter your x1 value:");
    double x1 = Input.readDouble();
    System.out.println("Please enter your x2 value:");
    double x2 = Input.readDouble();

    System.out.println("Please enter your y2 value:");
    double y2 = Input.readDouble();
    System.out.println("Please enter your y1 value:");
    double y1 = Input.readDouble();

    double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    System.out.println("The result is:" +d);

/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/
    System.out.println("Please enter your deg value:");
    double deg = Input.readDouble();
    double g = Math.sin(deg);
    System.out.println("The result is:" +g);

/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/
    System.out.println("Please enter your m value:");
    double m = Input.readDouble();
    System.out.println("Please enter your n value:");
    double n = Input.readDouble();

    double k = Math.pow(m , 5) / Math.sqrt(n + 1);
    System.out.println("The result is:" +k);

/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/
    System.out.println("Please enter your b value:");
    double b = Input.readDouble();
    System.out.println("Please enter your a value:");
    double a = Input.readDouble();
    System.out.println("Please enter your c value:");
    double c = Input.readDouble();

    double X1 = (-b + Math.sqrt(b * b - 4*a*c)) / (2*a);
    double X2 = (-b - Math.sqrt(b * b - 4*a*c)) / (2*a);
    System.out.println("The result is:" + X1);
    System.out.println("The result is:" + X2);
    

    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}