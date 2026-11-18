class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    String[] friends = {"Howe","Sam","Jessie","Kevin","Jordan" };
    int[] tem = {90,80,99,60,50};
   
  }

 int[] convert(int[] tem){

   int[] newArry = new int[tem.length];

  for(int x = 0 ; x <= tem.length - 1 ; x++){

    newArry[x] = celsiusToFarhenheit(tem[x]);

  }

  return newArry;

 }
  

  double celsiusToFarhenheit(double c){
        return c*9/5+32;
  }
}