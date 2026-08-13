# Notes - LeetCode 4 Median of Two Sorted Arrays

## Difficulty

Hard

---

## Pattern

Binary Search on Partition

---

## Core Idea

Instead of merging both arrays,

we find a partition such that:

All elements on the left side
≤
All elements on the right side.

---

## Why Binary Search?

Brute Force:

Merge arrays first.

Time Complexity:

O(m+n)

But question requires:

O(log(m+n))

Therefore we use Binary Search.

---

## Important Observation

Always perform Binary Search on the smaller array.

```java
if(nums1.length > nums2.length)
{
    return findMedianSortedArrays(
        nums2,
        nums1
    );
}
```

This guarantees:

O(log(min(m,n)))

---

## Partition Concept

Example:

nums1 = [2]

nums2 = [1,3]

Valid Partition:

2 | 

1 | 3

Combined:

Left Side:

[2,1]

Right Side:

[3]

Condition:

maxLeftX <= minRightY

AND

maxLeftY <= minRightX

---

## Partition Variables

partitionX

Cut position in nums1

partitionY

Cut position in nums2

---

## Boundary Values

maxLeftX

Largest value on left side of nums1

minRightX

Smallest value on right side of nums1

maxLeftY

Largest value on left side of nums2

minRightY

Smallest value on right side of nums2

---

## Correct Partition Condition

maxLeftX <= minRightY

AND

maxLeftY <= minRightX

When true:

Partition found.

---

## Odd Length Median

Example:

[1,2,3]

Median:

2

Formula:

max(maxLeftX,maxLeftY)

---

## Even Length Median

Example:

[1,2,3,4]

Median:

(2+3)/2

Formula:

(
 max(maxLeftX,maxLeftY)
 +
 min(minRightX,minRightY)
)
/
2.0

---

## Why Use Integer.MIN_VALUE?

When partition is at beginning:

| 2 3

No left value exists.

Use:

Integer.MIN_VALUE

to represent:

-∞

---

## Why Use Integer.MAX_VALUE?

When partition is at end:

2 3 |

No right value exists.

Use:

Integer.MAX_VALUE

to represent:

+∞

---

## Dry Run

Input:

nums1 = [1,3]

nums2 = [2]

After swapping:

nums1 = [2]

nums2 = [1,3]

Partition:

2 |

1 | 3

Values:

maxLeftX = 2

minRightX = +∞

maxLeftY = 1

minRightY = 3

Check:

2 <= 3

1 <= +∞

Valid Partition

Median:

max(2,1)

= 2

---

## Complexity Analysis

Time Complexity:

O(log(min(m,n)))

Binary Search on smaller array.

Space Complexity:

O(1)

No extra space used.

---

## Key Learning

This problem teaches:

- Binary Search is not only for finding elements.
- Binary Search can be used on answers/partitions.
- Partitioning technique is common in Hard interview questions.

---

## Similar Problems

- 35. Search Insert Position
- 33. Search in Rotated Sorted Array
- 153. Find Minimum in Rotated Sorted Array
- 540. Single Element in Sorted Array

---

## Interview Takeaway

Whenever you see:

Two Sorted Arrays

and

O(log n)

Think:

Binary Search on Partition.