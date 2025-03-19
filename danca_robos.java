import java.util.HashMap;
import java.util.Arrays;

public class danca_robos {
    static int n = 191;
    static int[] arr = {190, 151, 189, 31, 129, 101, 121, 118, 66, 183, 145, 99, 49, 153, 71, 43, 67, 44, 177, 15, 1, 75, 69, 82, 45, 37, 42, 150, 38, 135, 27, 4, 78, 11, 8, 65, 173, 33, 174, 168, 79, 172, 157, 170, 83, 21, 111, 34, 102, 20, 70, 137, 103, 161, 127, 119, 5, 24, 114, 125, 48, 122, 85, 160, 72, 58, 109, 106, 81, 184, 52, 156, 110, 152, 88, 108, 126, 113, 91, 63, 51, 120, 154, 143, 57, 140, 181, 90, 182, 158, 86, 29, 3, 16, 54, 171, 12, 149, 128, 25, 40, 32, 188, 167, 17, 39, 166, 116, 186, 117, 133, 179, 155, 0, 148, 105, 59, 87, 123, 28, 23, 89, 104, 165, 180, 22, 178, 26, 175, 56, 2, 139, 19, 46, 107, 92, 147, 96, 76, 55, 47, 130, 6, 35, 134, 7, 95, 141, 136, 13, 98, 10, 53, 77, 80, 185, 132, 100, 14, 61, 94, 115, 187, 93, 144, 84, 9, 36, 138, 64, 162, 30, 169, 176, 50, 164, 97, 18, 159, 62, 60, 41, 124, 74, 146, 142, 68, 131, 163, 73, 112};
    static HashMap<String, Integer> memo = new HashMap<>();
    
    static int[] troca(int[] array, int n) {
        int[] newArray = new int[n];
        for (int i = 0; i < n; i++) {
            newArray[i] = array[array[i]];
        }
        return newArray;
    }
    
    static boolean check(String key) {
        if (memo.containsKey(key) && memo.get(key) > 1) {
            return true;
        }
        return false;
    }
    
    static int danca(int[] arr, int n) {
        String chave = Arrays.toString(arr);
        int[] arrayAtual = arr.clone();
        
        while (true) {
            arrayAtual = troca(arrayAtual, n);
            chave = Arrays.toString(arrayAtual);
            
            if (memo.containsKey(chave)) {
                memo.put(chave, memo.get(chave) + 1);
            } else {
                memo.put(chave, 1);
            }
            
            if (check(chave)) {
                return memo.size();
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println(danca(arr, n));
    }
}