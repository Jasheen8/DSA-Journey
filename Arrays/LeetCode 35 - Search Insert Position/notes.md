# Notes - LeetCode 35 Search Insert Position

## Pattern

Binary Search

## Key Observation

The array is sorted and the problem requires O(log n) time complexity.

Whenever you see:

* Sorted Array
* O(log n)

Think:

Binary Search

## Approach

1. Initialize:

   * left = 0
   * right = nums.length - 1

2. While left <= right:

   * Find middle index
   * If target equals nums[mid], return mid
   * If target is greater, search right half
   * Otherwise search left half

3. If target is not found:

   * Return left
   * left automatically becomes the correct insertion position

## Dry Run

Input:

nums = [1,3,5,6]

target = 2

Initial:

left = 0

right = 3

Iteration 1:

mid = 1

nums[mid] = 3

2 < 3

right = 0

Iteration 2:

mid = 0

nums[mid] = 1

2 > 1

left = 1

Loop Ends:

left = 1

right = 0

Return:

1

## Why Return left?

When Binary Search finishes:

* left points to the first position where target can be inserted
* This keeps the array sorted

Example:

nums = [1,3,5,6]

target = 2

Result:

[1,2,3,5,6]

Target should be inserted at index 1.

## Complexity Analysis

Time Complexity:

O(log n)

Binary Search cuts the search space in half every iteration.

Space Complexity:

O(1)

Only a few variables are used.

## Interview Takeaway

For sorted arrays requiring O(log n) complexity:

* Use Binary Search
* If target exists → return its index
* If target does not exist → return left

This is a very common Binary Search pattern used in many interview questions.

## Similar Problems

* LeetCode 704 - Binary Search
* LeetCode 34 - Find First and Last Position of Element in Sorted Array
* LeetCode 33 - Search in Rotated Sorted Array
* LeetCode 69 - Sqrt(x)
