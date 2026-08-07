# Notes - LeetCode 121 Best Time to Buy and Sell Stock

## Pattern

Greedy

## Key Observation

Profit = Selling Price - Buying Price

To maximize profit:

* Buy at the lowest price
* Sell at the highest future price

## Approach

1. Track the minimum price seen so far.
2. For each day:

   * Calculate profit if sold today.
   * Update maximum profit.
3. Return maximum profit.

## Dry Run

prices = [7,1,5,3,6,4]

minPrice = 7

maxProfit = 0

Price = 1

minPrice = 1

Price = 5

profit = 5 - 1 = 4

maxProfit = 4

Price = 6

profit = 6 - 1 = 5

maxProfit = 5

Answer = 5

## Complexity Analysis

Time Complexity:

O(n)

Space Complexity:

O(1)

## Key Learning

* Track the minimum value seen so far.
* Calculate profit on every step.
* Common greedy pattern.
* Avoid O(n²) brute force solutions.

## Similar Problems

* LeetCode 122 - Best Time to Buy and Sell Stock II
* LeetCode 714 - Best Time to Buy and Sell Stock with Transaction Fee
* LeetCode 309 - Best Time to Buy and Sell Stock with Cooldown

## Interview Takeaway

Whenever you need:

* Maximum difference
* Buy before sell
* Best profit

Think:

Track minimum so far + update maximum profit.
