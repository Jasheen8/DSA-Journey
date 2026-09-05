
### `notes.md`

```md
# Plus One Notes

## Approach

Start from the last digit because addition by one affects the number from right to left.

There are two cases.

### Case 1: Current digit is less than 9

If the last digit is not `9`, simply increase it by `1` and return the array.

Example:

```text
[1,2,3]