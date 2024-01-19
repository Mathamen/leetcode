package easy.q9;
class q9 {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
