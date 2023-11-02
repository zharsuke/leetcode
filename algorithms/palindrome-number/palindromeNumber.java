public class palindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        if (x == 0) {
            return true;
        }
        int reversedNumber = 0;
        while (x > reversedNumber) {
            reversedNumber = reversedNumber * 10 + x % 10;
            x = x / 10;
        }
        return x == reversedNumber || x == reversedNumber / 10;
    }

    public static void main(String[] args) {
        int x = 1221;
        boolean result = isPalindrome(x);
        System.out.println(x);
        System.out.println(result);
    }
}
