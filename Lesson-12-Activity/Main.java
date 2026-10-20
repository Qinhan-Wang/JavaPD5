class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    //Challenge 1//
    System.out.println("Please enter your credit card number:");
    String card = Input.readString();
    String result1 = creditCardType(card);
    System.out.println("Your credit card type is: " + result1);


    //Challenge 2//
    System.out.println("Please enter a word:");
    String word = Input.readString();
    String result2 = pigLatin(word);
    System.out.println("Your Pig Latin word is: " + result2);


    //Challenge 3//
    System.out.println("Please enter your zip code:");
    String zip = Input.readString();
    String result3 = nycLocate(zip);
    System.out.println("Your NYC location is: " + result3);


    //Challenge 4//
    System.out.println("Please enter a date in MM/DD/YYYY:");
    String date = Input.readString();
    String result4 = getMonth(date);
    System.out.println("The month is: " + result4);


    //Challenge 5//
    System.out.println("Please enter a password:");
    String password = Input.readString();
    boolean result5 = validatePswd(password);
    System.out.println("Your password is valid: " + result5);
   
  }
  
  //Challenge 1//
   String creditCardType(String card){
   
    if(card.substring(0,1).equals("4"))
    return "Visa";
    
    else if(card.substring(0,2).equals("34") || card.substring(0,2).equals("37"))
    return "American Express";

    else if(card.substring(0,2).equals("36"))
    return "Diner Club";

    else if(card.substring(0,2).equals("51") || card.substring(0,2).equals("55"))
    return "Mastercard";

    else if(card.substring(0,2).equals("65") || card.substring(0,4).equals("6011"))
    return "Discovery"; 

    else
    return "None";
  }
   
  //Challenge 2//
  String pigLatin(String word){

  int index = word.length();
  String fistletter = word.substring(0,1);
  String afterletter = word.substring(1,index);
  return afterletter + fistletter + "ay";

  }
  
  //Challenge 3//
  String nycLocate(String zip){
    
    String firstthree = zip.substring(0,3);
    
    if(firstthree.equals("100") || firstthree.equals("101") || firstthree.equals("102"))
    return "Manhattan";

    else if(firstthree.equals("103"))
    return "Staten Island";

    else if(firstthree.equals("104"))
    return "Bronx";

    else if(firstthree.equals("112"))
    return "Brooklyn";

    else if(firstthree.equals("113") || firstthree.equals("114") || firstthree.equals("111"))
    return "Queens";

    else
    return "none" ;
  }
  
  //Challenge 4//
  String getMonth(String date){

   String month = date.substring(0,2);

   if(month.equals("01"))
   return "January";

   else if(month.equals("02"))
   return "February";

   else if(month.equals("03"))
   return "March";

   else if(month.equals("04"))
   return "April";

   else if(month.equals("05"))
   return "May";

   else if(month.equals("06"))
   return "June";

   else if(month.equals("07"))
   return "July";

   else if(month.equals("08"))
   return "August";

   else if(month.equals("09"))
   return "September";

   else if(month.equals("10"))
   return "October";

   else if(month.equals("11"))
   return "November";

   else if(month.equals("12"))
   return "December";

   else
   return "None";
  }

  //Challenge 5//
boolean validatePswd(String password){

    if(password.length() >= 5 && password.length() <= 8 && password.indexOf("^") == -1 && password.indexOf("*") == -1 && password.indexOf("(") == -1 && password.indexOf(")") == -1)
        return true;

    else
        return false;
}
}