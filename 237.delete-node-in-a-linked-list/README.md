# 237. Delete node in a linkedlist

**Language:** Java

## Difficulty

Easy

## Topics

- Linkedlist

## Problem Statement

There is a singly-linked list head and we want to delete a node node in it.

You are given the node to be deleted node. You will not be given access to the first node of head.

All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.

Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:

The value of the given node should not exist in the linked list.
The number of nodes in the linked list should decrease by one.
All the values before node should be in the same order.
All the values after node should be in the same order.

## Approach

## Approach

1. Start from the given node (the node that needs to be deleted).
2. Traverse the linked list from the given node until reaching the second-last node.
3. During each iteration:

   * Copy the value of the next node into the current node.
   * If the next node is the last node:

     * Copy its value into the current node.
     * Remove the last node by setting the current node's `next` pointer to `NULL`.
     * Stop the traversal.
   * Otherwise, move to the next node and repeat the process.
4. This effectively shifts all subsequent node values one position to the left and removes the original last node, making it appear as though the given node was deleted.
## Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

## Java Solution


See `Solution.java`.