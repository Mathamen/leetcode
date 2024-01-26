package easy.q118;

import java.util.ArrayList;
import java.util.List;

public class Q118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> retorno = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> oldRow = retorno.get(i - 1);
                    int sum = oldRow.get(j - 1) + oldRow.get(j);
                    row.add(sum);
                }
            }
            retorno.add(row);
        }
        return retorno;
    }
}
