import java.util.Scanner;

public class FortuneTeller{

public static void main(String[]args){
  Scanner scanner = new Scanner (System.in);

     printInstructions();
     boolean play = scanner.nextBoolean();
    while(play){
     System.out.println("Please enter 4 colors with spaces: ");
     String userColors = scanner.nextLine().trim();
     String[] colors = userColors.split(" ");
     int i = 0;
     System.out.println("The colors you chose are: ");
     while(i < colors.length) {
     System.out.println(colors[i++]);

     }
     printNumberOptions(chosenColor);
     System.out.print(pickFirstNumber());
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
  System.out.printf("These are your number options, please choose a number.");
  int firstNumber=TextIO.getlnInt();
  return firstNumber;
  }
  public static void printInstructions(){
     System.out.printf("%nWelcome to the Virtual Paper Fortune Teller!%n What is your name: ");
     String name = scanner.nextLine();
     System.out.printf ("Hello %s, Are you ready to play? Please enter Yes or No ",name);
  }
    






}

