# Notes - LeetCode 26 Remove Duplicates from Sorted Array

## Pattern

Two Pointers

## Key Observation

The array is already sorted.

This means duplicate values will always appear next to each other.

Example:

[1,1,2,2,3,3]

Since duplicates are adjacent, we only need to compare the current element with the last unique element.

## Approach

Use two pointers:

* i → points to the last unique element
* j → scans the array

Steps:

1. Start i = 0.
2. Traverse the array using j from index 1.
3. If nums[j] is different from nums[i]:

   * Move i forward.
   * Place nums[j] at nums[i].
4. Continue until the end.
5. Return i + 1 as the count of unique elements.

## Dry Run

Input:

nums = [1,1,2]

Initial:

i = 0

j = 1

nums[1] = 1

nums[0] = 1

Duplicate found.

Skip.

j = 2

nums[2] = 2

nums[0] = 1

Unique value found.

i = 1

nums[1] = 2

Array becomes:

[1,2,2]

Return:

i + 1 = 2

## Example 2

Input:

[0,0,1,1,1,2,2,3,3,4]

Unique values found:

0,1,2,3,4

Result:

[0,1,2,3,4,...]

Return:

5

## Complexity Analysis

Time Complexity:

O(n)

We traverse the array once.

Space Complexity:

O(1)

No extra data structure is used.

## Key Learning

* Sorted arrays often enable Two Pointer solutions.
* Modify arrays in-place instead of creating a new array.
* The write pointer technique is common in interviews.

## Common Mistakes

1. Creating a new array instead of modifying in-place.
2. Forgetting to return i + 1.
3. Starting j from 0 instead of 1.
4. Not using the sorted property of the array.

## Similar Problems

* LeetCode 27 - Remove Element
* LeetCode 80 - Remove Duplicates from Sorted Array II
* LeetCode 283 - Move Zeroes

## Interview Takeaway

Whenever you see:

* Sorted Array
* Remove duplicates
* In-place modification

Think:

Two Pointers (Read Pointer + Write Pointer)
