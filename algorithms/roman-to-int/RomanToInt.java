import java.util.HashMap;

public class RomanToInt {
    public static int romanToInt(String s) {
        int result = 0;
        HashMap<Character, Integer> data = new HashMap<Character, Integer>();
        data.put('I', 1);
        data.put('V', 5);
        data.put('X', 10);
        data.put('L', 50);
        data.put('C', 100);
        data.put('D', 500);
        data.put('M', 1000);
        for (int i = 0; i < s.length(); i++) {
            if (i+1 < s.length() && data.get(s.charAt(i)) < data.get(s.charAt(i + 1))) {
                result -= data.get(s.charAt(i));
            } else {
                result += data.get(s.charAt(i));

            }
        }
        return result;
    }

    public static void main(String[] args) {
        String data = "IX";
        int result = romanToInt(data);
        System.out.println(data + " = " + result);
    }
}
