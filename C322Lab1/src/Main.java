import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {


    }

    //Problem 1: Function to generate indices
    public static int[] twoSum(int[] nums, int target) {
        for (int j = 0; j < nums.length; j++) {
            for (int k = j + 1; k < nums.length; k++) {
                if (nums[j] + nums[k] == target) {
                    return new int[] {j, k};
                }
            }
        }
        return new int[] {0, 0};
    }


    //Problem 2: Determine if an int is a palin

    public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        if (s.equals(reverse)) {
            return true;
        }
        return false;
    }

    //Problem 3:Write a function to find the longest common prefix string

    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        int min = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < strs[min].length()) {
                min = i;
            }
        }

        for (int j = 0; j < strs[min].length(); j++) {
            for (int k = 0; k < strs.length; k++) {
                if (strs[k].charAt(j) != strs[min].charAt(j)) {
                    return prefix;
                }
            }
            prefix += strs[min].charAt(j);
        }
        return prefix;
    }

    //Problem 4: Convert roman numeral to an integer.
    public static int roman(String rn) {
        int sum = 0;

        for (int i = 0; i < rn.length(); i++) {
            if (rn.charAt(i) == 'I') {
                sum += 1;
            } else if (rn.charAt(i) == 'V') {
                sum += 5;

                if (i > 0 && rn.charAt(i - 1) == 'I') {
                    sum -= 2;
                }
            } else if (rn.charAt(i) == 'X') {
                sum += 10;

                if (i > 0 && rn.charAt(i - 1) == 'I') {
                    sum -= 2;
                }
            } else if (rn.charAt(i) == 'L') {
                sum += 50;

                if (i > 0 && rn.charAt(i - 1) == 'X') {
                    sum -= 20;
                }
            } else if (rn.charAt(i) == 'C') {
                sum += 100;

                if (i > 0 && rn.charAt(i - 1) == 'X') {
                    sum -= 20;
                }
            } else if (rn.charAt(i) == 'D') {
                sum += 500;

                if (i > 0 && rn.charAt(i - 1) == 'C') {
                    sum -= 200;
                }
            } else if (rn.charAt(i) == 'M') {
                sum += 1000;

                if (i > 0 && rn.charAt(i - 1) == 'C') {
                    sum -= 200;
                }
            }
        }

        return sum;
    }


    //Problem 5: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
    //determine if the input string is valid.

    public static boolean validbrack(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            else if (s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                else if (s.charAt(i) == '}' && stack.peek() != '{') {
                    return false;
                }
                else if (s.charAt(i) == ']' && stack.peek() != '[') {
                    return false;
                }
                else if (s.charAt(i) == ')' && stack.peek() != '(') {
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    //Problem 6: Merge two linked lists into one sorted list
    public static LinkedList<Integer> merge(LinkedList<Integer> l1, LinkedList<Integer> l2)
    {
        LinkedList<Integer> mergedList = new LinkedList<>();

        int i = 0, j = 0;

        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) <= l2.get(j)) {
                mergedList.add(l1.get(i));
                i++;
            } else {
                mergedList.add(l2.get(j));
                j++;
            }
        }

        while (i < l1.size()) {
            mergedList.add(l1.get(i));
            i++;
        }

        while (j < l2.size()) {
            mergedList.add(l2.get(j));
            j++;
        }

        return mergedList;
    }


    //Problem 7: Large integer
    public static int[] largeint (int[] nums) {
        String s = "";
        int num;

        for (int i = 0; i < nums.length; i++) {
            s += Integer.toString(nums[i]);
        }

        num = Integer.parseInt(s);
        num += 1;

        s = Integer.toString(num);
        int[] result = new int[s.length()];

        for (int j = 0; j < s.length(); j++) {
            result[j] = Character.getNumericValue(s.charAt(j));
        }

        return result;
    }


}