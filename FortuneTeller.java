import java.util.Scanner;

public class FortuneTeller{

public static void main(String[]args){
  Scanner scanner = new Scanner (System.in);
  boolean play = true;
  do {
     printInstructions();
     String[] colors = stepOne();
     printColors(colors);
     int chosenColor = pickColor(colors);
     printNumberOptions(chosenColor);
     System.out.print(pickFirstNumber());
     System.out.printf("Do you want to play again?");
     play = TextIO.getlnBoolean( );
   } while (play); {
     System.out.print("Good luck in your future");

    }
  }

     public static int Count(int n){
      int count = 0;
       for(int i =0; i<n;i++){
        count++;
       }
        return count;
     }
     public static int pickColor (String [] colors) {
      Scanner scanner = new Scanner (System.in);
      System.out.println("Pick one of your colors: ");
      String oneColor = scanner.nextLine();
      int length = 0;
      for (int i = 0; i < colors.length; i++){
       if (oneColor.equals(colors[i]) ) {
          length = oneColor.length();
       }
      }
        return length;
  }
    public static void printNumberOptions(int chosenColor){

  if (chosenColor%2==0){
    System.out.printf("0, 1, 5, 4");
  }
  else{
    System.out.printf("2, 3, 7, 6");
  }


  }
  public static int pickFirstNumber(){
  System.out.printf("%nThese are your number options, please choose a number: ");
  int firstNumber=TextIO.getlnInt();
  return firstNumber;
  }
  public static void printInstructions(){
    Scanner scanner = new Scanner (System.in);
     System.out.printf("%nWelcome to the Virtual Paper Fortune Teller!%n What is your name: ");
     String name = scanner.nextLine();
     System.out.printf ("%n Hello %s, Let's get started!",name);
  }
  public static String[] stepOne(){
    Scanner scanner = new Scanner (System.in);
    System.out.printf("%nPlease enter 4 colors with spaces: ");
    String userColors = scanner.nextLine().trim();
    String[] color = userColors.split(" ");
    return color;
  }
  public static void printColors(String[] array){
    int i = 0;
    System.out.println("The colors you chose are: ");
    while(i < array.length) {
    System.out.println(array[i++]);

    }
  }







}
