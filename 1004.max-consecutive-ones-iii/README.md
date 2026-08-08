# max-consecutive-ones-iii  

**Language:** Java

## Difficulty

medium

## Topics

- Array
- Sliding window
- Binary search

## Problem Statement


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