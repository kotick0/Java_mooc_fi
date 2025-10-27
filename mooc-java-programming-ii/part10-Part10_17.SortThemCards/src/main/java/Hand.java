import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        Iterator<Card> iterator = this.hand.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void sort() {
        ArrayList<Card> newHand = new ArrayList<>();
        this.hand.stream()
            .sorted()        
            .forEach(sortedCard -> newHand.add(sortedCard));
            this.hand = newHand;
        }

    public int compareTo(Hand comparedHand) {
        int thisValue = 0;
        int comparedValue = 0;

        for(Card card: this.hand) {
            thisValue += card.getValue();
        }
        for(Card card: comparedHand.hand) {
            comparedValue += card.getValue();
        }
        return thisValue - comparedValue;
    } 

    public void sortBySuit() {
        ArrayList<Card> newHand = new ArrayList<>();
        this.hand.stream()
        .sorted((card1, card2) -> {
            return card1.getSuit().ordinal() - card2.getSuit().ordinal();
        }).forEach(sortedCard -> newHand.add(sortedCard));
        this.hand = newHand;
    }
}
