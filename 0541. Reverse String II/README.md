# 0541. Reverse String II

**Language:** Java

## Difficulty

Easy

## Topics

- String
- Two Pointers
- Simulation

## Problem Statement

Given a string `s` and an integer `k`, reverse the first `k` characters for every `2k` characters counting from the start of the string.

If there are fewer than `k` characters left, reverse all of them.

If there are between `k` and `2k` characters left, reverse only the first `k` characters.

## Approach

1. Convert the string into a character array.
2. Traverse the array in steps of `2 * k`.
3. For each segment:
   - Set `start` to the current index.
   - Set `end` to the smaller of `i + k - 1` and the last index of the array.
4. Reverse the characters between `start` and `end` using the two-pointer technique.
5. Convert the character array back to a string and return it.

## Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

## Java Solution


See `Solution.java`.
