package easy.q125;
public class q125 {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\p{Punct}", "");
        s = s.replaceAll("\\s", "");
        s = s.toLowerCase();
        
        char[] array = s.toCharArray();
        for (int i=0; i< array.length; i++){
            if (array[i] != array[array.length - 1 -i]) return false;
        }
        return true;
    }
}
