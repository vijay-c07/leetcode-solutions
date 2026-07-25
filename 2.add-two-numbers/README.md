# 0002. Add Two Numbers

**Language:** Java

## Difficulty

Medium

## Topics

- Linked List
- Math

## Problem Statement

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each node contains a single digit.

Add the two numbers and return the sum as a linked list.

## Approach

This solution follows these steps:

1. Traverse the first linked list and construct the corresponding number.
2. Reverse the constructed number to obtain its actual value.
3. Repeat the same process for the second linked list.
4. Add the two numbers.
5. Create a new linked list by extracting each digit of the sum using the modulo (`%`) operator.
6. Insert each digit at the end of the result linked list.
7. If the resulting sum is `0`, return a linked list containing a single node with value `0`.

## Complexity Analysis

- **Time Complexity:** O(n²)
- **Space Complexity:** O(1) *(excluding the output linked list)*

## Java Solution

See `Solution.java` for the complete implementation.