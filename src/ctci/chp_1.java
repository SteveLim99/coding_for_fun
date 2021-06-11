package ctci;

public class chp_1 {

    public static void main(String[] args){
        boolean res = is_unique_1_dot_1("tes");
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
}
