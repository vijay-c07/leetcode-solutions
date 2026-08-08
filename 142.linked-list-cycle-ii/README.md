# 142. Linked List Cycle II

**Language:** Java

## Difficulty

Medium

## Topics

- Linked-list
- slow fast pointer

## Problem Statement

Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

Do not modify the linked list.

## Approach

1. Initialize both slow and fast with the head of the linked list.
2. Traverse the linked list while fast and fast.next are not null.
3. Move slow one step using slow = slow.next.
4. Move fast two steps using fast = fast.next.next.
5. If slow and fast meet, a cycle exists.
6. Reset slow to the head of the linked list.
7. Move both slow and fast one step at a time.
8. When slow and fast meet again, that node is the beginning of the cycle.
9. Return slow.
10. If fast reaches null, there is no cycle, so return null.

## Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

## Java Solution


See `Solution.java`.