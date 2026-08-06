# Notes - LeetCode 15 3Sum

## Pattern

Sorting + Two Pointers

## Key Observation

A brute-force solution would check every possible triplet:

for i
for j
for k

This takes O(n³) time and is too slow.

Since the array can be sorted, we can use the Two Pointer technique and reduce the complexity to O(n²).

## Approach

### Step 1: Sort the Array

Input:

[-1,0,1,2,-1,-4]

After Sorting:

[-4,-1,-1,0,1,2]

Sorting helps us efficiently move pointers based on the current sum.

### Step 2: Fix One Element

Choose nums[i] as the first number.

Then find two other numbers whose sum equals:

-target

### Step 3: Use Two Pointers

Initialize:

left = i + 1

right = n - 1

Calculate:

sum = nums[i] + nums[left] + nums[right]

Cases:

* If sum == 0 → Triplet found
* If sum < 0 → Move left forward
* If sum > 0 → Move right backward

### Step 4: Skip Duplicates

To avoid duplicate triplets:

Skip duplicate values of i:

if (i > 0 && nums[i] == nums[i - 1])

Skip duplicate values after finding a triplet:

while (left < right && nums[left] == nums[left - 1])

while (left < right && nums[right] == nums[right + 1])

## Dry Run

Input:

[-1,0,1,2,-1,-4]

Sorted:

[-4,-1,-1,0,1,2]

i = 1

nums[i] = -1

left = 2

right = 5

sum = -1 + (-1) + 2 = 0

Triplet Found:

[-1,-1,2]

Move both pointers.

Now:

sum = -1 + 0 + 1 = 0

Triplet Found:

[-1,0,1]

Result:

[
[-1,-1,2],
[-1,0,1]
]

## Complexity Analysis

### Time Complexity

Sorting:

O(n log n)

Two Pointer Search:

O(n²)

Overall:

O(n²)

### Space Complexity

Ignoring the output list:

O(1)

## Key Learning

* Converting a brute-force O(n³) problem into O(n²).
* Using Sorting with Two Pointers.
* Handling duplicate values correctly.
* Common interview pattern for sum-related problems.

## Common Mistakes

1. Forgetting to sort the array.
2. Not skipping duplicate values.
3. Moving the wrong pointer.
4. Using three nested loops (O(n³)).

## Similar Problems

* LeetCode 1 - Two Sum
* LeetCode 16 - 3Sum Closest
* LeetCode 18 - 4Sum
* LeetCode 167 - Two Sum II
* LeetCode 11 - Container With Most Water

## Interview Takeaway

Whenever you see:

* Find pairs or triplets
* Array problems
* Need better than O(n³)

Think:

Sorting + Two Pointers
