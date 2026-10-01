class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
  //Challege1//
  System.out.println("1.Please enter your string");
  String word = Input.readString();
  print(word);
  

  //Challege2//
  System.out.println("2.Please enter your Fahrenheit");
  double Fahrenheit = Input.readDouble();
  double result2 = FtoC(Fahrenheit);
  System.out.println("The temperature in Celcius is:" + result2);


  //Challege3//
  System.out.println("3.Please enter your radius");
  double radius = Input.readDouble();
  double result3 = sphereVolume(radius);
  System.out.println("The volume of a sphere is:" + result3);


  //Challege4//
  System.out.println("4.Please enter your radius again");
  double r = Input.readDouble();
  System.out.println("Please enter your height");
  double h = Input.readDouble();
  double result4 = coneVolume(r,h);
  System.out.println("The volume of a cone is:" + result4);


  //Challege5//
  System.out.println("5.Please enter your x1");
  double x1 = Input.readDouble();
  System.out.println("6.Please enter your x2");
  double x2 = Input.readDouble();
  System.out.println("7.Please enter your y1");
  double y1 = Input.readDouble();
  System.out.println("8.Please enter your y2");
  double y2 = Input.readDouble();

  double result5 = distance(x1,x2,y1,y2);
  System.out.println("The distance is:" + result5);
}




  //Challege1//
  void print(String word) {
  System.out.println(word);
}
  

  //Challege2//
  double FtoC(double Fahrenheit){
         double Celsius = (Fahrenheit - 32) * (5.0 / 9.0);
		     return Celsius;
  }
  

  //Challege3//
  double sphereVolume(double radius){
         double area = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		     return area;
  }


  //Challege4//
  double coneVolume(double r,double h){
         double v = (1.0 / 3.0) * Math.PI * Math.pow(r, 2)*h;
		     return v;
}
  

  //Challege5//
  double distance(double x1, double x2, double y1, double y2){
         double d = Math.sqrt(Math.pow((y2 - y1),2) + Math.pow((x2 - x1),2));
         return d;
  }

}