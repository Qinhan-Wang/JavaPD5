
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
		System.out.println("1.Please enter your GPA:");
		double GPA = Input.readDouble();
		double result1 = gpa(GPA);
		System.out.println("The result is:" +result1);
  

		System.out.println("2.Please enter your credit:");
		double credit = Input.readDouble();
		System.out.println("2.Please enter your grade:");
		Integer  grade = Input.readInt();
		boolean result2 = isGraduating(grade, credit);

		if(result2 == true)
        System.out.println("Student is Graduating");

        else
        System.out.println("Student is NOT Graduating");
		
		System.out.println("The result is:" +result2);


		System.out.println("3.Please enter your weight:");
		double weight = Input.readDouble();
		System.out.println("3.Please enter your height:");
		double height = Input.readDouble();
		String result3 =  BMI(weight, height);
		System.out.println("The your BMI is:" +result3);


		System.out.println("4.Please enter your pounds:");
		double pounds = Input.readDouble();
		double result4 = shippingCost(pounds);
		System.out.println("The your cost is:" +result4);


		System.out.println("5.Please enter your THz:");
		double THz = Input.readDouble();
		boolean result5 = blueOrViolet(THz);
		System.out.println("The result is:" +result5);

  }
     double gpa(double GPA){

        if(GPA > 90)
		   return GPA * 1.1;
		else
		   return GPA;
	 }
     

	 boolean isGraduating(Integer grade, double credit){

		 if(grade == 12 && credit >= 44)
			return true;
		 else 
		    return false;

	 }


	 String BMI(double weight , double height){

		  double BMI = (weight / Math.pow(height,2)) * 703;
		  if(BMI >= 40.0)
			return "Obese";

		  else if(BMI <= 39.9 && BMI >= 25.0)
			return "Overweight";

		  else if(BMI <= 24.9 && BMI >= 18.5)
			return "Normal";

		  else 
			return "Underweight";
	 }
     

	 double shippingCost(double pounds){

		  if(pounds > 25)
			return 10.00 + (pounds - 25)*0.02;

		  else if(pounds <= 25 && pounds > 15)
			return 10.00;

		  else if(pounds <= 15 && pounds > 10)
			return 5.00;

		  else 
			return 0.00;
	 }


	  boolean blueOrViolet(double THz){
		  
		   if(THz >= 600 && THz <= 670)
			return true;
		
		   else if (THz >= 700 && THz <= 750)
			return true;
		   
		   else
			return false;
	 }

	}