# 0121. Best Time to Buy and Sell Stock

**Language:** Java

## Difficulty

Easy

## Topics

- Array
- Greedy

## Problem Statement

You are given an array `prices` where `prices[i]` represents the price of a given stock on the `iᵗʰ` day.

You want to maximize your profit by choosing a single day to buy one stock and a different day in the future to sell that stock.

Return the maximum profit you can achieve. If no profit is possible, return `0`.

## Approach

The solution maintains two variables throughout the traversal of the array:

- `minPrice` stores the minimum stock price encountered so far.
- `maxProfit` stores the maximum profit that can be achieved.

Algorithm:

1. Initialize `minPrice` with the first stock price.
2. Traverse the array from the beginning.
3. If the current price is smaller than `minPrice`, update `minPrice`.
4. Otherwise, calculate the profit by subtracting `minPrice` from the current price.
5. Update `maxProfit` if the current profit is greater.
6. Return `maxProfit` after processing all prices.

## Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

## Java Solution

See `Solution.java` for the complete implementation.