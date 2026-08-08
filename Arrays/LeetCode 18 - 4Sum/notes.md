# Notes - LeetCode 18 4Sum

## Pattern

Sorting + Two Pointers

## Core Idea

4Sum is an extension of 3Sum.

Pattern:

2Sum → Two Pointers

3Sum → Fix 1 Number + Two Pointers

4Sum → Fix 2 Numbers + Two Pointers

## Approach

### Step 1

Sort the array.

Example:

[1,0,-1,0,-2,2]

becomes:

[-2,-1,0,0,1,2]

### Step 2

Fix the first number using loop i.

### Step 3

Fix the second number using loop j.

### Step 4

Use two pointers:

left = j + 1

right = n - 1

### Step 5

Calculate:

sum = nums[i] + nums[j] + nums[left] + nums[right]

If:

sum == target

Store quadruplet.

If:

sum < target

Move left forward.

If:

sum > target

Move right backward.

### Step 6

Skip duplicate values for:

* i
* j
* left
* right

to avoid duplicate quadruplets.

## Why Use long?

Constraint:

nums[i] can be 1,000,000,000

Example:

1000000000
+1000000000
+1000000000
+1000000000

= 4000000000

This exceeds Java int range.

Therefore:

long sum

must be used.

## Complexity Analysis

Sorting:

O(n log n)

Main loops:

O(n³)

Overall:

O(n³)

Space Complexity:

O(1)

Ignoring output list.

## Key Learning

* Extension of 3Sum.
* Sorting simplifies duplicate handling.
* Two Pointers reduce unnecessary searches.
* Always watch for integer overflow.

## Similar Problems

* LeetCode 1 - Two Sum
* LeetCode 15 - 3Sum
* LeetCode 16 - 3Sum Closest
* LeetCode 167 - Two Sum II

## Interview Takeaway

Whenever you see:

* Find unique combinations
* Sorted array
* Sum equals target

Think:

Sort + Two Pointers
