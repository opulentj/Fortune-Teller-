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
  /**
  Count() will count from 0 to the number that the user chooses
  @param n this is the number that the user chooses
  @return count holds the number of times that the fortune teller is being randomized
  */
    public static int Count(int n){
      int count = 0;
       for(int i =0; i<n;i++){
        count++;
       }
        return count;
     }
     /**
     pickColor() gives the length of the color that the user chooses
     @param colors an array that holds all the colors that the user had chosed before
     @return length the length of the color 
     */
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
  /**
  printnumberOptions() prints the number options given the color that the user chooses
  @param chosenColor the number that the user picks
  */
    public static void printNumberOptions(int chosenColor){

      if (chosenColor%2==0){
        System.out.printf("0, 1, 5, 4");
      }
      else{
        System.out.printf("2, 3, 7, 6");
      }
  }
  /**
  pickFirstNumber() will show the user picking the number from the intNumberOptions()
  @return firstNumber the number that they choose
  */
  public static int pickFirstNumber(){
    System.out.printf("%nThese are your number options, please choose a number: ");
    int firstNumber=TextIO.getlnInt();
    return firstNumber;
  }
  /**
  printInstructions() will print out the name of the user and the introduction
  of the work
  */
  public static void printInstructions(){
    Scanner scanner = new Scanner (System.in);
     System.out.printf("%nWelcome to the Virtual Paper Fortune Teller!%n What is your name: ");
     String name = scanner.nextLine();
     System.out.printf ("%n Hello %s, Let's get started!",name);
  }
  /**
  stepOne() will create an array that holds the color that the user typed in
  @return color the array that that holds the user's colors
  */
  public static String[] stepOne(){
    Scanner scanner = new Scanner (System.in);
    System.out.printf("%nPlease enter 4 colors with spaces: ");
    String userColors = scanner.nextLine().trim();
    String[] color = userColors.split(" ");
    return color;
  }
  /**
  printColors() will print out the colors separately from the array
  @param array
  */
  public static void printColors(String[] array){
    int i = 0;
    System.out.println("The colors you chose are: ");
    while(i < array.length) {
    System.out.println(array[i++]);

    }
  }

}
