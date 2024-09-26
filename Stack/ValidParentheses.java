// https://leetcode.com/problems/valid-parentheses/

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = Map.ofEntries(
                Map.entry('(', ')'),
                Map.entry('{', '}'),
                Map.entry('[', ']')
        );
        for (int i=0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.empty() || map.get(stack.pop()) != c) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
