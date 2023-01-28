import java.util.Scanner;
public class Calculator{
  public static void main(String[]args){
    Scanner Hello = new Scanner(System.in);
    Scanner Continue = new Scanner(System.in);
    boolean rest = true;
    while(rest){
    System.out.println("Give me the 1st number");
    int response1 = Hello.nextInt();
    System.out.println("Give me the 2nd number");
    int response2 = Hello.nextInt();
    System.out.println("What operation?");
    char operation = Hello.next().charAt(0);
    if(operation =='+'){
      int addition = response1+response2;
      System.out.println(addition);
    }else if(operation == '-'){
        int subtraction = response1-response2;
        System.out.println(subtraction);
    }else if(operation == '*'){
        int multiplication = response1*response2;
        System.out.println(multiplication);
    }else if(operation == '/'){
        int division = response1/response2;
        System.out.println(division);
    }else{
        System.out.println("ihateyou");
    }System.out.println("Continue?");
    String Hey = Continue.next();
    if(Hey.equals("yes")){
        rest = true;
    }else if(Hey.equals("no")){
        rest = false;
    }else{
        System.out.println("continuing");
    }
    }
  }
}