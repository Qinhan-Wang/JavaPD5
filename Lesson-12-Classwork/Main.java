class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
  //Problem 1//
   System.out.println("Please enter the college course code:");
   String code = Input.readString();
   boolean result1 = collegeCredit(code);
   System.out.println("Your college course code is:" +result1);

   //Problem 2//
    System.out.println("Please enter your class code:");
    String classcode = Input.readString();
    String result2 = getCounsoler(classcode);
    System.out.println("Your counselor is:" +result2);

    //Problem 3//
    System.out.println("Please enter your filename:");
    String filename = Input.readString();
    String result3 = imageType(filename);
    System.out.println("Your image type is:" +result3);
  }
//Problem 1//
   boolean collegeCredit(String code){
    String first = code.substring(5,6);
    if(first.equals("M") || first.equals("E"))
      return true;
    else
      return false;
   }
 
 //Problem 2//
  String getCounsoler(String classcode){
     int index = classcode.length();
     String head = classcode.substring(0, 1);
     String middle = classcode.substring(index / 2, (index / 2) + 1);

     if(head.equals("B") || middle.equals("B") )
     return "Berrouet";

     else if(head.equals("C") || middle.equals("C") )
     return "Chu";

     else if(head.equals("D") || middle.equals("D") )
     return "Dinn";

     else if(head.equals("E") || middle.equals("E") )
     return "Eyzengart";

     else if(head.equals("F") || middle.equals("F") )
     return "Flores";

     else if(head.equals("G") || middle.equals("G") )
     return "Gibson";

     else if(head.equals("L") || middle.equals("L") )
     return "Shim Lee";

     else if(head.equals("M") || middle.equals("M") )
     return "Meltzer";

     else if(head.equals("P") || middle.equals("P") )
     return "Paccione";

     else if(head.equals("S") || middle.equals("S") )
     return "Fiore";

     else if(head.equals("T") || middle.equals("T") )
     return "Tsai";
     
     else if(head.equals("Z") || middle.equals("Z") )
     return "Zayes";

     else
     return "none";
  }

   //Problem 3//
    String imageType(String filename){
    int pos = filename.indexOf(".");
    String extension = filename.substring(pos + 1);

    if(extension.equals("JPEG") || extension.equals("JPG"))
    return "Joint Photographic Experts Group";

    else if(extension.equals("PNG"))
    return "Portable Network Graphics";
   
    else if(extension.equals("GIF"))
    return "Graphics Interchange Format";

    else if(extension.equals("PDF"))
    return "Portalble Document Format";

    else 
    return "None";
   }

}