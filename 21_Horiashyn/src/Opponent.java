import java.util.ArrayList;

public class Opponent {
    public int Collect(ArrayList<Card> list){
        int score=0;
        ArrayList<Card> opponents_list=new ArrayList<>();
        while(score<17){
            opponents_list.add(list.get(0));
            score+=list.get(0).cost;
            System.out.println("Current score(opponent): "+score);
            list.remove(0);
        }
        System.out.println("Opponents deck: ");
        for (int i=0; i<opponents_list.size(); i++){
            System.out.println(i+" Card: "+"Cost - "+opponents_list.get(i).cost+", Suit - "+opponents_list.get(i).suit+", Name - "+opponents_list.get(i).name+';');
        }

        return score;
    }
}
