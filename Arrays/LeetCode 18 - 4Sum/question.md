# LeetCode 18 - 4Sum

## Problem Statement

Given an array of integers `nums` and an integer `target`, return all unique quadruplets:

[a, b, c, d]

such that:

* 0 <= a, b, c, d < n
* a, b, c, and d are distinct indices
* nums[a] + nums[b] + nums[c] + nums[d] == target

The solution set must not contain duplicate quadruplets.

## Example 1

Input:

nums = [1,0,-1,0,-2,2]

target = 0

Output:

[
[-2,-1,1,2],
[-2,0,0,2],
[-1,0,0,1]
]

## Example 2

Input:

nums = [2,2,2,2,2]

target = 8

Output:

[
[2,2,2,2]
]

## Constraints

* 1 <= nums.length <= 200
* -10⁹ <= nums[i] <= 10⁹
* -10⁹ <= target <= 10⁹

## Tags

* Array
* Sorting
* Two Pointers
