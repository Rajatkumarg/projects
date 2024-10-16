package pp_BasedQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EditDistance{
	public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";
        System.out.println(minDistance(word1, word2)); //3
        
        word1 = "intention";
        word2 = "execution";
        System.out.println(minDistance(word1, word2)); //5
        
        word1 = "kitten";
        word2 = "sitting";
        System.out.println(minDistance(word1, word2)); //3
        
        word1 = "flaw";
        word2 = "lawn";
        System.out.println(minDistance(word1, word2)); //2
        
        word1 = "abcd";
        word2 = "efgh";
        System.out.println(minDistance(word1, word2)); //4
        
        word1 = "abc";
        word2 = "abc";
        System.out.println(minDistance(word1, word2)); //0
    }

    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        
        int[][] dp = new int[m + 1][n + 1];
        
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
            }
        }
        
        return dp[m][n];
    }
}
