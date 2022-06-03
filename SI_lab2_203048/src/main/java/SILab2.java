import java.util.ArrayList;
import java.util.List;

public class SILab2 {

    public static List<String> function(List<String> list) {//A
        if (list.size() <= 0) {//B
            throw new IllegalArgumentException("List length should be greater than 0");//C
        }
        int n = list.size();//D
        int rootOfN = (int) Math.sqrt(n);//E
        if (rootOfN * rootOfN != n) {//F
            throw new IllegalArgumentException("List length should be a perfect square");//G
        }
        List<String> numMines = new ArrayList<>();//H
        for (int i = 0; i < n; i++) {//I.1,I.2,I.3
            if (!list.get(i).equals("#")) {//J
                int num = 0;//K
                if ((i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#"))) {//L
                    if ((i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#"))) {//M
                        num += 2;//O
                    } else {
                        num += 1;//P
                    }
                }
                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")) {//Q
                    num++;//R
                }
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#")) {
                    num++;//S
                }
                numMines.add(String.valueOf(num));//T
            } else {
                numMines.add(list.get(i));//U
            }
        }
        return numMines;//V
    }
}
