class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    
  }

  //challenge1//
int allowance(){
    double result = 0.01;
    int count = 1;

    while(!(result >= 5.00)){
        result = result * 2;
        count++;
    }

    return count;
}
  
  //challenge2//
   void addTwoNumbers(){

    int num1 = randInt(0,99);
    int num2 = randInt(0,99);
    int sum = num1 + num2;

    print("please enter your guess number:");
    int guess = Input.readInt();

    while(sum != guess){
      system.out.println("please try again!");
      guess = Input.readInt();
    }

    print("Right!");

  }
  
  //challenge3//
 int GCF(int num1, int num2){

    int gcf;

    if(num1 < num2)
        gcf = num1;
    else
        gcf = num2;

    while(!(num1 % gcf == 0 && num2 % gcf == 0)){
        gcf--;
    }

    return gcf;
}


  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}