# 904.Fruit into baskets

**Language:** Java

## Difficulty

Medium

## Topics

- Array
- Two Pointers

## Problem Statement

You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where ``fruits[i]`` is the type of fruit the ith tree produces.

You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
Given the integer array fruits, return the maximum number of fruits you can pick.

 

Example 1:

Input: fruits = ```[1,2,1]```
Output: ```3```
Explanation: We can pick from all 3 trees.

## Approach

This solution uses the **Sliding window pattern**.

- Initilize two pointers left ,right to zero  and maxlength=0 
- Declare hashmap named basket with Integer key,and Value
- Start interating through array from first to arr.length with the help of right pointer
  - put the fruits[right] in basket if with frequency ```Use basket.getOrDefault(fruits[right],0)+1) function``ie if the key key already exists then  the  frequency should increase
  ***The expression basket.getOrDefault(key, 0) + 1 is a universal frequency counter pattern used in Java***
  - check the number of unique values in the basket 
    - if (unique values>2)
        - decrease the frequency of the left key from the basket 
        - if basket contains the key with 0 frequency then remove that key
        - shrink window by 1 ie left++
  - Now the select the maxlength from maximum of (maxLen,right-left+1)
 - return maxLen


## Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

## Java Solution

See `Solution.java` for the complete implementation.