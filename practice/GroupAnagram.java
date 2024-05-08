package practice;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("heart", "data", "listen", "silent", "enlist", "earth");
        Collection<List<String>> result = groupAnagram(list);
        System.out.println(result);

    }

    public static Collection<List<String>> groupAnagram(List<String> list) {
        Map<String, List<String>> map = new TreeMap<>(Comparator.comparingInt(String::length).reversed());

        for (String li : list) {
            char[] charArray = li.toCharArray();
            Arrays.sort(charArray);
            String str = String.valueOf(charArray);
            if (map.containsKey(str)) {
                List<String> anagrams = map.get(str);
                anagrams.add(li);
                map.put(str,anagrams);
            } else {
                List<String> anagrams = new ArrayList<>();
                anagrams.add(li);
                map.put(str,anagrams);
            }
        }
        return map.values();
    }
}
