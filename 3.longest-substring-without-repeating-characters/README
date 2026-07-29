# 3.Longest Substring Without Repeating Characters

**Language:** Java

## Difficulty

Hard

## Topics

- String
- Sliding window
- Hashmaps

## Problem Statement

Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

**Input:** s = `"abcabcbb"`
**Output:** 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.


## Key Idea:
Use sliding window with hash map to track character indices and maintain unique substring.

## Approach

This solution uses the **Sliding window pattern**.

- Initialize two pointers left ,right to zero  and maxlength=0 
- The string is converted to Char array.
- Declare hashmap named map with (Character,Integer) key-values
- Traverse through an array till the end with the help of right pointer.
    - Check , if the given char exists in map and also index value of the duplicate is greater than or equal to left  or not
        - if yes then update left pointer with the previous index of repeated value.
    - Put the right value in the map with its right index
    - Track the maxLen value in every step ,select the maxlength from maximum of (maxLen,right-left+1) 
 - return maxLen


## Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(Min(M,N))

## Java Solution

See `Solution.java` for the complete implementation.