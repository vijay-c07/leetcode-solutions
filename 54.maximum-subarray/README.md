# 0053. Maximum Subarray

**Language:** Java

## Difficulty

Medium

## Topics

- Array
- Dynamic Programming
- Kadane's Algorithm

## Problem Statement

Given an integer array `nums`, find the contiguous subarray that has the largest sum and return its sum.

## Approach

This solution uses **Kadane's Algorithm**, which efficiently finds the maximum subarray sum in a single traversal.

1. Initialize `bestEnd` and `res` with the first element.
2. For each remaining element:
   - Either start a new subarray from the current element.
   - Or extend the previous subarray by adding the current element.
3. Store the maximum of these two choices in `bestEnd`.
4. Update `res` if `bestEnd` is greater.
5. Return `res` after traversing the entire array.

## Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

## Key Insight

At every index, the maximum subarray ending at that position is either:
- The current element itself (start a new subarray), or
- The previous maximum subarray ending there plus the current element.

This greedy decision forms the basis of **Kadane's Algorithm**.

## Java Solution

See `Solution.java` for the complete implementation.