import java.util.*;

public class Problem10_CardsFrequencies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();
        String[] sCards = text.split("[♥♣♦♠]");
        ArrayList<String> lCards = new ArrayList<>();

        for (String card : sCards) {
            lCards.add(card.trim());
        }

        Map<String, Integer> countMap = new TreeMap<String, Integer>();
        Set<String> unique = new HashSet<String>(lCards);

        for (String key : unique) {
            int acc = Collections.frequency(lCards, key);
            countMap.put(key, acc);
        }

        for (int i = 0; i < lCards.size(); i++) {
            System.out.printf("%s -> %.2f%%%n", lCards.get(i), (((float)countMap.get(lCards.get(i))/sCards.length) * 100));

            for (int j = i+1; j < lCards.size(); j++) {
                if (lCards.get(i).equals(lCards.get(j))){
                    lCards.remove(j);
                    j--;
                }
            }
        }
    }
}
