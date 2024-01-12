import org.junit.jupiter.api.Test;
//Import main
import java.util.LinkedList;
import java.util.Stack;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {
    @Test
    void twoSum() {
        int[] nums = {2, 7, 11, 15};
        assertEquals(0, Main.twoSum(nums, 9)[0]);
        assertEquals(1, Main.twoSum(nums, 9)[1]);

        int[] nums2 = {3, 2, 4};
        assertEquals(1, Main.twoSum(nums2, 6)[0]);
        assertEquals(2, Main.twoSum(nums2, 6)[1]);

        int[] nums3 = {3, 3};
        assertEquals(0, Main.twoSum(nums3, 6)[0]);
        assertEquals(1, Main.twoSum(nums3, 6)[1]);

    }

    @Test
    void isPalindrome() {

        assertTrue(Main.isPalindrome(121));
        assertFalse(Main.isPalindrome(-121));
        assertFalse(Main.isPalindrome(10));

    }

    @Test
    void longestCommonPrefix() {

        String[] strs = {"flower", "flow", "flight"};
        assertEquals("fl", Main.longestCommonPrefix(strs));

        String[] strs2 = {"hi", "flow", "rock"};
        assertEquals("", Main.longestCommonPrefix(strs2));

    }

    @Test
    void roman() {

        assertEquals(3, Main.roman("III"));
        assertEquals(58, Main.roman("LVIII"));
        assertEquals(1994, Main.roman("MCMXCIV"));

    }


    @Test
    void validbrack() {


        assertEquals (true, Main.validbrack("()"));
        assertEquals (true, Main.validbrack("()[]{}"));
        assertEquals (false, Main.validbrack("(]"));
        assertEquals (false, Main.validbrack("([)]"));
        assertEquals (true, Main.validbrack("{[]}"));

    }

    @Test
    void merge() {

        LinkedList<Integer> nums1 = new LinkedList<>();
        LinkedList<Integer> nums2 = new LinkedList<>();

       nums1.add(1);
       nums1.add(2);
       nums1.add(4);

       nums2.add(1);
       nums2.add(3);
       nums2.add(4);


       Main.merge(nums1, nums2);

       assertEquals(1, Main.merge(nums1, nums2).get(0));
       assertEquals(1, Main.merge(nums1, nums2).get(1));
       assertEquals(2, Main.merge(nums1, nums2).get(2));
       assertEquals(3, Main.merge(nums1, nums2).get(3));
       assertEquals(4, Main.merge(nums1, nums2).get(4));
       assertEquals(4, Main.merge(nums1, nums2).get(5));
    }

    @Test
    void largeint() {

        int[] nums2 = {1, 2, 3};
        int[] result = Main.largeint(nums2);

        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(4, result[2]);

        int[] nums3 = {4, 3, 2, 1};
        int[] result2 = Main.largeint(nums3);

        assertEquals(4, result2[0]);
        assertEquals(3, result2[1]);
        assertEquals(2, result2[2]);

        int[] nums4 = {9};
        int[] result3 = Main.largeint(nums4);

        assertEquals(1, result3[0]);
        assertEquals(0, result3[1]);

    }
}
