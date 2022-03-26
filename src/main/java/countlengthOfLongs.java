import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aixiwt
 * @date 2022/3/5 22:17
 */

public class countlengthOfLongs {
    public static int lengthOfLongestSubstring(@NotNull String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }

    //Tests
    public static void main(String[] args){
        String s = "pwwkew";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}
