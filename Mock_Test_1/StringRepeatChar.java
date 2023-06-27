
"""
		First Unique Character in a String

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1

Constraints:
a. 1 <= s.length <= 10^5
b. s consists of only lowercase English letters.


		"""

import java.util.HashMap;
import java.util.Map;

public class StringRepeatChar {
    public static int firstUniqChar(String s) {

        Map<Character, Integer> charFrequencies = new HashMap<>();

        for (char c : s.toCharArray()) {
            charFrequencies.put(c, charFrequencies.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (charFrequencies.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println("First non-repeating character index in '" + s1 + "': " + firstUniqChar(s1));

        String s2 = "loveleetcode";
        System.out.println("First non-repeating character index in '" + s2 + "': " + firstUniqChar(s2));

        String s3 = "aabb";
        System.out.println("First non-repeating character index in '" + s3 + "': " + firstUniqChar(s3));
    }
}

