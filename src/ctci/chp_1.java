package ctci;

import java.util.HashMap;

public class chp_1 {

    public static void main(String[] args){
//        boolean res = is_unique_1_dot_1("tes");
//        System.out.println(res);

        boolean res = check_permutation_1_dot_2("test", "tats");
        System.out.println(res);
    }

    private static boolean is_unique_1_dot_1(String input){
        boolean[] all_characters = new boolean[28];

        for (int i = 0; i < input.length(); i++){
            int curr = input.charAt(i) - 'a';

            boolean tmp = all_characters[curr];
            if (tmp) return false;
            all_characters[curr] = true;
        }

        return true;
    }

    private static boolean check_permutation_1_dot_2(String a, String b){
        if (a.length() != b.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length(); i++){
            char curr_a = a.charAt(i);
            char curr_b = b.charAt(i);

            map.put(curr_a, map.getOrDefault(curr_a, 0) + 1);
            map.put(curr_b, map.getOrDefault(curr_b, 0) + 1);
        }

        for (char c : map.keySet()){
            if (map.get(c) % 2 != 0)
                return false;
        }
        return true;
    }


}
