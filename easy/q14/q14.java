public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {return "";}

        int len = strs.length;
        char[][] matrix = new char[len][];
        
        for (int i = 0; i < len; i++) {matrix[i] = strs[i].toCharArray();}

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 200; i++) {
            if (i >= matrix[0].length) {return result.toString();}

            char comp = matrix[0][i];

            for (int j = 1; j < len; j++) {
                if (i >= matrix[j].length || matrix[j][i] != comp) {return result.toString();}
            }

            result.append(comp);
        }

        return result.toString();
    }
}
