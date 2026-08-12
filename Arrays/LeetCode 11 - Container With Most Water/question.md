# LeetCode 11 - Container With Most Water

## Problem Statement

You are given an integer array `height` of length `n`.

There are `n` vertical lines drawn such that the two endpoints of the `i-th` line are:

(i, 0) and (i, height[i])

Find two lines that together with the x-axis form a container that can store the maximum amount of water.

Return the maximum amount of water the container can store.

You may not slant the container.

---

## Example 1

Input:

height = [1,8,6,2,5,4,8,3,7]

Output:

49

Explanation:

The container formed by heights 8 and 7 stores:

min(8,7) × (8 - 1)

= 7 × 7

= 49

---

## Example 2

Input:

height = [1,1]

Output:

1

---

## Constraints

- 2 <= height.length <= 10^5
- 0 <= height[i] <= 10^4

---

## Tags

- Array
- Two Pointers
- Greedy