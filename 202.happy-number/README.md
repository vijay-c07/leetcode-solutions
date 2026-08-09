# 202. Happy Number

**Language:** Java

## Difficulty

Medium

## Topics

- Hashtable 
- slow Fast pointer
- HashSet

## Problem Statement

Write an algorithm to determine if a number n is happy.

A **happy number** is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it **loops endlessly in a cycle** which does not include 1.
Those numbers for which this process **ends in 1** are happy.
Return `true` if n is a happy number, and `false` if not.

## Approach

1. Create a HashSet to store numbers that have already appeared.
2. Continue while n is not 1 and has not been seen before.
3. Add the current n to the set.
4. Calculate the sum of squares of its digits.
5. Store the sum back in n.
6. Repeat the process.
7. If n becomes 1, return true; otherwise, a cycle was detected, so return false.

## Complexity Analysis

- **Time Complexity:** O(logn)
- **Space Complexity:** O(1)

## Java Solution


See `Solution.java`.