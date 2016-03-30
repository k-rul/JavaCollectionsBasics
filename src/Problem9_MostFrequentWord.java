import java.util.*;

public class Problem9_MostFrequentWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> lWords = Arrays.asList(in.nextLine().toLowerCase().split("\\P{Alpha}+"));

        Map<String, Integer> countMap = new TreeMap<String, Integer>();
        Set<String> unique = new HashSet<String>(lWords);
        for (String key : unique) {
            int acc = Collections.frequency(lWords, key);
            countMap.put(key, acc);
        }

        Map.Entry<String, Integer> maxEntry = null;

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        for (Map.Entry<String, Integer> me : countMap.entrySet()) {
            if (me.getValue() == maxEntry.getValue()) {
                System.out.printf("%s -> %s times%n", me.getKey(), me.getValue());
            }
        }
    }
}
