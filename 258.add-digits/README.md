# 258. Add Digits

**Language:** Java

## Difficulty

Easy

## Topics

- Simulation

## Problem Statement

Given an integer `num`, repeatedly add all its digits until the result has `only one digit`, and return it.
**Example 1:**

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it

## Approach

1. Start with the given number num.
2. Repeat while num has more than one digit.
3. Initialize sum = 0.
4. Extract the last digit using num % 10.
5. Add the digit to sum.
6. Remove the last digit using num / 10.
7. Assign sum back to num.
8. Repeat until num becomes a single digit.
9. Return num.

## Complexity Analysis

- **Time Complexity:** O(logn)
- **Space Complexity:** O(1)

## Java Solution


See `Solution.java`.