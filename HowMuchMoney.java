import java.util.Scanner;
public class HowMuchMoney {
        public static void main(String [] args){
                Scanner R1 = new Scanner(System.in);
                Scanner R2 = new Scanner(System.in);
                Scanner R3 = new Scanner(System.in);
                Scanner R4 = new Scanner(System.in);

            System.out.println("Enter current balance:");
            double userResponse = R1.nextDouble();

            System.out.println("How many hours did you work? (Answer as a double)");
            double userHours = R2.nextDouble();

            double hoursWorth = 16.5 * userHours;

            double solution1 = userResponse + hoursWorth;

            System.out.println("Your new balance is: " + solution1);

            System.out.println("Would you like to know your balance after a purchase?");
            String after = R3.next();

            if(after.equals("Yes")){
                System.out.println("How many money will you spend?");
                double spending = R4.nextDouble();

                double afterspending = solution1 - spending;

                System.out.println("Your updated balance is: " + afterspending);
            }else if(after.equals("yes")){
                System.out.println("How many money will you spend?");
                double spending = R4.nextDouble();

                double afterspending = solution1 - spending;

                System.out.println("Your updated balance is: " + afterspending);
                //The above is the exact same code as the "yes" if statement (AKA the first one)
            }else{
                
            }
        }
}
