import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class danca_robos {
    private static Map<String, Integer> memo = new HashMap<>();
    private static final int n = 81;
    private static final int[] arr = {5, 9, 42, 8, 21, 79, 34, 67, 31, 15, 43, 37, 63, 73, 40, 16, 72, 25, 80, 51, 3, 12, 30, 20, 60, 62, 78, 19, 6, 14, 57, 45, 48, 58, 52, 44, 28, 11, 36, 61, 54, 2, 50, 55, 71, 77, 0, 64, 1, 18, 39, 46, 23, 65, 56, 74, 53, 22, 7, 41, 47, 59, 27, 69, 38, 35, 70, 76, 32, 4, 68, 13, 75, 10, 33, 66, 26, 24, 29, 49, 17};
    
    public static int[] troca(int[] tup, int[] pos, int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = tup[pos[i]];
        }
        return result;
    }
    
    public static int danca(int[] arr, int n) {
        int[] chave = arr.clone();
        while (true) {
            chave = troca(chave, arr, n);
            String chaveStr = Arrays.toString(chave);
            
            if (memo.containsKey(chaveStr)) {
                memo.put(chaveStr, memo.get(chaveStr) + 1);
            } else {
                memo.put(chaveStr, 1);
            }
            
            if (memo.get(chaveStr) > 1) {
                return memo.size();
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println(danca(arr, n));
    }
}