import java.util.LinkedList;
import java.util.List;

public class Gamer {
    List<Card> deck = new LinkedList<>();

    public void addCard(Card card){
        deck.add(card);
    }
    public int countValues(){
        int sum = 0;
        for(Card card : deck){
            sum += card.getValue();
        }
        return sum;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Masz karty: ");
        for(Card card : deck){
            stringBuilder.append(card.toString() + ", ");
        }
        stringBuilder.append(" o wartości: " + countValues());
        return stringBuilder.toString();
    }

    public boolean doubleA() {
        return  deck.size() == 2;
    }

    public int numberCards() { return deck.size(); }
}
