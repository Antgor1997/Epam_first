import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random rand=new Random();
        int attempts=0;
        int rand_number=rand.nextInt(('z'-'a'))+'a';
        int user_number=0;

        while(rand_number!=user_number){
            System.out.print("Please, enter the latin letter: ");
            String users_symbol=in.next().toLowerCase();

            if (users_symbol.length()!=1){
                System.out.println("Please input only one symbol!");
            }else {
                user_number = (int) users_symbol.charAt(0);

                if (user_number>'z'|user_number<'a') {
                    System.out.println("Check the rules!");
                } else {
                    //System.out.println("user_number = " + user_number);
                    //System.out.println("rand_number = " + rand_number);

                    if (rand_number == user_number) {
                        System.out.println("You win!!!");
                    } else if (rand_number > user_number) {
                        System.out.println("Too low! Try again!");
                    } else {
                        System.out.println("Too high! Try again!");
                    }
                }
            }
            attempts++;
        }
        System.out.println("Total attempts = " + attempts);
    }
}
