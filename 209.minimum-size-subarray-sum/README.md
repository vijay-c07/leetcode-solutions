# 209.Minimum Size Subarray Sum

**Language:** Java

## Difficulty

Medium

## Topics

- Array
- Two Pointers
- Sliding window(Dynamic window)

## Problem Statement

Given an array of positive integers `nums` and a positive integer `target`, return the `minimal length` of a subarray whose `sum is greater than or equal to target`. If there is no such subarray, return 0 instead..

## Approach

1. Initialize two pointers, left and right, to represent the current sliding window.
2. Initialize sum as 0 and minLength as a very large value (Integer.MAX_VALUE).
3. Traverse the array by moving the right pointer one step at a time.
4. Add the current element (nums[right]) to sum.
5. While sum is greater than or equal to the target:
6. Update minLength with the smaller of the current minLength and the current window size (right - left + 1).
7. Remove nums[left] from sum.
8. Increment left to shrink the window.
9. Continue until the right pointer reaches the end of the array.
10. If minLength was never updated, return 0; otherwise, return minLength.t.

## Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

## Java Solution


See `Solution.java`.
