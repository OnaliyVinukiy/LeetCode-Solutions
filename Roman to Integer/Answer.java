import java.util.HashMap;

class Solution {
    static HashMap<String, Integer> map = new HashMap<>();

    static {
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);

    }

    public int romanToInt(String s) {
        int size = s.length();
        int answer = 0;
        int i = 0;
        while (i < size) {
            if (i < size - 1) {
                String twoSymbol = s.substring(i, i + 2);
                if (map.containsKey(twoSymbol)) {
                    answer = answer + map.get(twoSymbol);
                    i = i + 2;
                    continue;
                }
            }
            String oneSymbol = s.substring(i, i + 1);
            answer = answer + map.get(oneSymbol);
            i = i + 1;

        }
        return answer;
    }
}