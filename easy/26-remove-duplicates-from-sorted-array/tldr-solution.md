# Too Long; Didn't Read:

This is a `two-pointers` solution. The `right` and `left` pointers starts at index `1`, and then the `right` pointer start iterating the array checking in each iteration if this is the first time that you're seeing this number.
If it is, you place the current number in the index `left`, after that you increade `left`by one.

- O(1) memory, O(n) time
