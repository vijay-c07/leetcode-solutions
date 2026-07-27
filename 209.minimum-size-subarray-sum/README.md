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

### Approach

1. Initialize two pointers, `low` and `high`, to `0` to represent the sliding window.
2. Initialize `sum` as `0` and `minLength` as `Integer.MAX_VALUE`.
3. Traverse the array by moving the `high` pointer from `0` to `nums.length - 1`.
4. Add `nums[high]` to `sum` to expand the current window.
5. While `sum` is greater than or equal to the `target`:

   1. Update `minLength` with the minimum of its current value and the current window size (`high - low + 1`).
   2. Subtract `nums[low]` from `sum`.
   3. Increment `low` to shrink the window from the left.
6. Repeat Steps 4 and 5 until the `high` pointer reaches the end of the array.
7. If `minLength` is still `Integer.MAX_VALUE`, return `0`; otherwise, return `minLength`.

## Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

## Java Solution


See `Solution.java`.
