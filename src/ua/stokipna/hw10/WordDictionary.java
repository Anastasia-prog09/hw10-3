package ua.stokipna.hw10;

import java.util.*;

public class WordDictionary {
    Map<String, Integer> wordToCount = new HashMap<>();

    public void processWord(String word) {
        int counter = wordToCount.getOrDefault(word, 0);
        counter++;
        wordToCount.put(word, counter);
    }

    public void processWords(String[] words) {
        for (String word : words) {
            if (!word.isBlank()) {
                processWord(word);
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(wordToCount.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return Integer.compare(o2.getValue(), o1.getValue());
            }
        });

        for (Map.Entry<String, Integer> stringIntegerEntry : entryList) {
            result = result + stringIntegerEntry.getKey() + " " + stringIntegerEntry.getValue() + "\n";
        }
        return result;
    }
}
