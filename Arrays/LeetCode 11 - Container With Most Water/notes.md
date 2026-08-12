# Notes - LeetCode 11 Container With Most Water

## Pattern

Two Pointers

---

## Key Formula

Area = Width × Height

Where:

Width = right - left

Height = min(height[left], height[right])

Therefore:

Area = min(height[left], height[right])
       ×
       (right - left)

---

## Main Observation

The water level is limited by the smaller height.

Example:

height[left] = 8
height[right] = 7

Water height:

min(8,7) = 7

---

## Brute Force

Try every pair.

for every i:
    for every j:

Calculate area.

Time Complexity:

O(n²)

Too slow for n = 100000.

---

## Optimal Approach

Use Two Pointers.

Initialize:

left = 0
right = n - 1

While left < right:

1. Calculate current area.
2. Update maximum area.
3. Move the pointer having the smaller height.

---

## Why Move Smaller Height?

Suppose:

left height = 2
right height = 8

Current area uses:

min(2,8) = 2

Moving the larger height inward:

- Width decreases
- Height still limited by 2

Area cannot improve.

So move the smaller height.

This is the core trick.

---

## Dry Run

Input:

[1,8,6,2,5,4,8,3,7]

Initial:

left = 0
right = 8

Area:

min(1,7) × 8

= 8

Move left.

Now:

left = 1
right = 8

Area:

min(8,7) × 7

= 49

Maximum = 49

Continue until pointers meet.

Final Answer:

49

---

## Complexity Analysis

Time Complexity:

O(n)

Each pointer moves at most n times.

Space Complexity:

O(1)

No extra space used.

---

## Key Learning

Whenever:

- Two ends of an array
- Need maximum/minimum value
- Width shrinks every move

Think:

Two Pointers

---

## Similar Problems

- LeetCode 167 - Two Sum II
- LeetCode 15 - 3Sum
- LeetCode 18 - 4Sum
- LeetCode 42 - Trapping Rain Water

---

## Interview Takeaway

The important insight is that moving the taller line is never beneficial because the shorter line determines the water height.

Therefore always move the pointer with the smaller height.