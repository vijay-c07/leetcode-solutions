# 141. LinkedList cycle 

**Language:** Java

## Difficulty

Easy

## Topics

- Linkedlist
- Slow fast pointer

## Problem Statement

Given `head`, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the `next` pointer. Internally, `pos` is used to denote the index of the node that tail's `next` pointer is connected to. Note that `pos` is not passed as a parameter.

Return` true` if there is a cycle in the linked list. Otherwise, return `false`.

 
## Approach

Algorithm:

1. Initialize both slow and fast with the head of the linked list.
2. Traverse the linked list while fast and fast.next are not null.
3. Move slow one step using slow = slow.next.
4. Move fast two steps using fast = fast.next.next.
5. If slow and fast point to the same node, a cycle exists, so return true.
6. If fast reaches null, there is no cycle.
7. Return false after completing the traversal.

## Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

## Java Solution

See `Solution.java` for the complete implementation.