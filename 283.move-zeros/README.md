# 0283. Move Zeroes

**Language:** Java

## Difficulty

Easy

## Topics

- Array
- Two Pointers

## Problem Statement

Given an integer array `nums`, move all `0`s to the end of the array while maintaining the relative order of the non-zero elements.

The operation must be performed in-place without making a copy of the array.

## Approach

This solution uses the two-pointer technique.

- `j` traverses the entire array.
- `i` keeps track of the position where the next non-zero element should be placed.

Algorithm:

1. Initialize two pointers `i` and `j` to `0`.
2. Traverse the array using `j`.
3. Whenever a non-zero element is found, place it at index `i` and increment `i`.
4. After all non-zero elements have been moved to the front, fill the remaining positions from `i` to the end of the array with `0`.
5. The relative order of non-zero elements is preserved throughout the process.

## Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

## Java Solution

See `Solution.java` for the complete implementation.