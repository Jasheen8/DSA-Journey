# LeetCode 26 - Remove Duplicates from Sorted Array

## Problem Statement

Given an integer array `nums` sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.

The relative order of the elements should be kept the same.

Return the number of unique elements `k`.

The first `k` elements of `nums` should contain the unique elements in sorted order. The remaining elements beyond index `k - 1` can be ignored.

## Example 1

Input:

nums = [1,1,2]

Output:

k = 2

nums = [1,2,_]

Explanation:

The first two elements are the unique values 1 and 2.

## Example 2

Input:

nums = [0,0,1,1,1,2,2,3,3,4]

Output:

k = 5

nums = [0,1,2,3,4,*,*,*,*,_]

Explanation:

The first five elements contain all unique values in sorted order.

## Constraints

* 1 <= nums.length <= 3 × 10⁴
* -100 <= nums[i] <= 100
* nums is sorted in non-decreasing order

## Tags

* Array
* Two Pointers
