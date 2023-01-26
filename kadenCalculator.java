import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner newScanner = new Scanner(System.in);
    System.out.println("Type First Number");
    int numberOne = newScanner.nextInt();
    System.out.println("Type Second Number");
    int numberTwo = newScanner.nextInt();
    System.out.println("Type the Operator");
    char operator = newScanner.next().charAt(0);

    if(operator == '+'){
      int ryanChan = numberOne + numberTwo;
        if (ryanChan % 2 == 0){
          System.out.println("Even");
        }
      else {
        System.out.println("Odd");
      }
      System.out.println("Answer: " +  ryanChan);
    }
    else if(operator == '-'){
      int ryanChan2 = numberOne - numberTwo;
        if (ryanChan2 % 2 == 0){
          System.out.println("Even");
        }
      else {
        System.out.println("Odd");
      }
      System.out.println("Answer: " +  ryanChan2);
    }
    else if(operator == '*'){
       int ryanChan3 = numberOne * numberTwo;
      if (ryanChan3 % 2 == 0){
          System.out.println("Even");
        }
      else {
        System.out.println("Odd");
      }
      System.out.println("Answer: " +  ryanChan3);
    }
    else if(operator == '/'){
      int ryanChan4 = numberOne / numberTwo;
      if (ryanChan4 % 2 == 0){
          System.out.println("Even");
        }
      else {
        System.out.println("Odd");
      }
       if(ryanChan4 == 0){
         System.out.println("(Improper)Fractional Answer: " + numberOne + '/' + numberTwo);
       }
      System.out.println("Answer: " +  ryanChan4);
    }
    else if(operator == '%'){
      int ryanChan5 = numberOne % numberTwo;
      if (ryanChan5 % 2 == 0){
          System.out.println("Even");
      }
      else {
        System.out.println("Odd");
      }
      System.out.println("Answer: " + ryanChan5);
    }
      else if(operator =='^'){
      double squareRoot = Math.sqrt(numberOne);
      System.out.println("Answer: " + squareRoot);
    }
    else {
      System.out.println("Ryan needs Help.");
        
    }
  }
}