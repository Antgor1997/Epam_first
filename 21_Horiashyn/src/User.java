import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
    public int Collect(ArrayList<Card> list){
        Scanner in=new Scanner(System.in);
        int command_identifier=2;
        int score=0;
        int dop=0;
        ArrayList<Card> users_list=new ArrayList<>();
        while (command_identifier!=1&&score<22){
            users_list.add(list.get(0));
            score+=list.get(0).cost;
            System.out.println("Current score: "+score);
            list.remove(0);
            if (command_identifier==0){
                command_identifier=2;
            }
            while(command_identifier!=0&&command_identifier!=1){
                if(dop>0){
                    System.out.println("Check the rules!");
                }
                System.out.println("Do you want to finish collecting your cards?");
                System.out.println("1-Yes 0-No");
                try {
                    command_identifier = in.nextInt();
                }catch(InputMismatchException e){
                    in.next();
                }
                dop++;
            }
        }

        System.out.println("Users deck: ");
        for (int i=0; i<users_list.size(); i++){
            System.out.println(i+" Card: "+"Cost - "+users_list.get(i).cost+", Suit - "+users_list.get(i).suit+", Name - "+users_list.get(i).name+';');
        }
        return score;
    }
}