# 1186. Maximum Subarray Sum With One Deletion

**Language:** Java

## Difficulty

Medium
## Topics

- Array
- Kadanes algorithm
- Dynamic

## Problem Statement

Given an array of integers, return the maximum sum for a non-empty subarray (contiguous elements) with at most one element deletion. In other words, you want to choose a subarray and optionally delete one element from it so that there is still at least one element left and the sum of the remaining elements is maximum possible.

Note that the subarray needs to be non-empty after deleting one element..

## Approach

1. Base Case: If the array has only 1 element, return it immediately
2. Initialization: Set Nodeletion, deletion, and ans to the first element (arr[0]).
3. Traverse: Loop through the array starting from index 1.
4. Update Choices: For each element arr[i]:
    1. currdlt: Max of skipping arr[i] (Nodeletion) or including it in an existing skip (deletion + arr[i]).
    2. currnodlt: Max of starting fresh (arr[i]) or extending the current subarray (Nodeletion + arr[i]).

5. Track Global Max: Update ans with the highest value between Nodeletion and deletion.
6. Return: Output ans after completing the loop.

## Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

## Java Solution


See `Solution.java`.