# 0152. Maximum Product Subarray

**Language:** Java

## Difficulty

Medium

## Topics

- Array
- Dynamic Programming

## Problem Statement

Given an integer array `nums`, find a contiguous non-empty subarray within the array that has the largest product, and return the product.

## Approach

This solution keeps track of three variables while traversing the array:

- `minend` stores the minimum product ending at the current index.
- `maxend` stores the maximum product ending at the current index.
- `res` stores the maximum product found so far.

Algorithm:

1. Initialize `minend`, `maxend`, `bestend`, and `res` with the first element.
2. Traverse the array starting from the second element.
3. For each element, calculate:
   - The current element itself.
   - The product of the current element with `minend`.
   - The product of the current element with `maxend`.
4. Update `minend` as the minimum among these three values.
5. Update `maxend` as the maximum among these three values.
6. Assign the larger of `minend` and `maxend` to `bestend`.
7. Update `res` if `bestend` is greater.
8. Return `res`.

## Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

## Java Solution

See `Solution.java` for the complete implementation.