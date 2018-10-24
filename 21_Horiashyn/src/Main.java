import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Deck deck=new Deck();
        ArrayList<Card> list=deck.Creation();
        User user=new User();
        Opponent opponent=new Opponent();

        int users_score=user.Collect(list);
        System.out.println("Users score = "+users_score);
        System.out.println("Main deck size: "+list.size());
        System.out.println();

        int opponents_score=opponent.Collect(list);
        System.out.println("Opponents score = "+opponents_score);
        System.out.println("Main deck size: "+list.size());
        System.out.println();

        if(users_score>21&&opponents_score>21){
            System.out.println("You loose!!!");
        }else if (opponents_score>21){
            System.out.println("You win!!!");
        }else if (users_score>21){
            System.out.println("You loose!!!");
        }else{
            if(users_score>opponents_score){
                System.out.println("You win!!!");
            }else{
                System.out.println("You loose!!!");
            }
        }
    }
}