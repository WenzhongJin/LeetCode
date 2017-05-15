"""
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Difficulty: Easy

"""

// My Solution
public class Solution {
    public int hammingDistance(int x, int y) {
        int temp = x ^ y;
        String s = Integer.toBinaryString(temp);
        char[] arr = s.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                count++;
            }
        }
        return count;
    }
}


// Best Solution:
public class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}