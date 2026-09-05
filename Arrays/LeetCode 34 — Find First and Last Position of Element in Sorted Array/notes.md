
### `notes.md`

```md
# Find First and Last Position of Element in Sorted Array Notes

## Approach

The array is already sorted, and the required time complexity is `O(log n)`.

So we use binary search.

We perform binary search twice:

1. Find the first occurrence of `target`.
2. Find the last occurrence of `target`.

The two results give the required range.

## Finding the First Occurrence

During binary search, when:

```text
nums[mid] == target