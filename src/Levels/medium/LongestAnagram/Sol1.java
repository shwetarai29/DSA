package Levels.medium.LongestAnagram;

import java.util.*;

public class Sol1 {
    // O(w * n * log(n)) time | O(wn) space - where w is the number of words and n i
    // the longest word
    public static List<List<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            if (anagrams.containsKey(sortedWord)) {
                anagrams.get(sortedWord).add(word);
            } else {
                anagrams.put(sortedWord, new ArrayList<>(Arrays.asList(word)));
            }
        }
        List<List<String>> output = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : anagrams.entrySet()) {
            output.add(entry.getValue());
        }
        return output;
    }

}
