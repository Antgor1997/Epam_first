import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Deck {
    enum Suits{Hearts, Diamonds, Spades, Clubs}

    public ArrayList<Card> Creation(){
        Map<String, Integer> hashMap=new HashMap<>();
        hashMap.put("Jack",2);
        hashMap.put("Queen", 3);
        hashMap.put("King", 4);
        hashMap.put("Ace", 11);
        for (int i=6; i<11; i++){
            hashMap.put(String.valueOf(i),i);
        }
        ArrayList<Card> list=new ArrayList<>();
        for (Suits suit: Suits.values()){
            for (Map.Entry entry: hashMap.entrySet()){
                list.add(new Card((int)entry.getValue(), entry.getKey().toString(), suit));
            }
        }
        Collections.shuffle(list);
        return list;
    }
}
