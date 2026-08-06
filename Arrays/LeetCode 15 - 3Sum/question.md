# LeetCode 15 - 3Sum

## Problem Statement

Given an integer array nums, return all the triplets:

[i, j, k]

such that:

* i != j
* i != k
* j != k

and

nums[i] + nums[j] + nums[k] == 0

The solution set must not contain duplicate triplets.

## Example 1

Input:

nums = [-1,0,1,2,-1,-4]

Output:

[[-1,-1,2],[-1,0,1]]

Explanation:

(-1) + (-1) + 2 = 0

(-1) + 0 + 1 = 0

## Example 2

Input:

nums = [0,1,1]

Output:

[]

Explanation:

No triplet sums to 0.

## Example 3

Input:

nums = [0,0,0]

Output:

[[0,0,0]]

Explanation:

The only possible triplet sums to 0.

## Constraints

* 3 <= nums.length <= 3000
* -100000 <= nums[i] <= 100000

## Tags

* Array
* Two Pointers
* Sorting
