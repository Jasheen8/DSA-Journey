# Notes - LeetCode 2 Add Two Numbers

## Pattern

Linked List + Simulation

## Intuition

The digits are stored in reverse order.

This allows us to add numbers exactly like elementary school addition:

* Add current digits
* Add carry from previous step
* Store the last digit
* Carry the remaining value forward

## Approach

1. Create a dummy node for the result list.

2. Maintain a carry variable.

3. Traverse both linked lists simultaneously.

4. Calculate:

   sum = digit1 + digit2 + carry

5. Store:

   digit = sum % 10

6. Update:

   carry = sum / 10

7. Continue until:

   * l1 becomes null
   * l2 becomes null
   * carry becomes 0

8. Return dummy.next.

## Dry Run

l1 = [2,4,3]

l2 = [5,6,4]

Step 1:

2 + 5 = 7

Result: 7

Carry: 0

Step 2:

4 + 6 = 10

Result: 7 -> 0

Carry: 1

Step 3:

3 + 4 + 1 = 8

Result: 7 -> 0 -> 8

Final Answer:

[7,0,8]

## Why Dummy Node?

Without a dummy node, handling the first insertion becomes messy.

Using a dummy node allows us to build the linked list uniformly.

## Complexity Analysis

Time Complexity: O(max(n, m))

Space Complexity: O(max(n, m))

Where:

* n = length of first linked list
* m = length of second linked list

## Key Learning

* How to traverse two linked lists simultaneously.
* How carry works in linked list arithmetic.
* Importance of dummy nodes in linked list problems.
* Common interview pattern for linked list construction.

## Similar Problems

* LeetCode 445 - Add Two Numbers II
* LeetCode 21 - Merge Two Sorted Lists
* LeetCode 206 - Reverse Linked List
