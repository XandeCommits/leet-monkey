# Too Long; Didn't Read:

This is a `two-pointers` solution. The `right` and `left` pointers start at index `1`, and then the `right` pointer starts iterating the array checking in each iteration if this is the first time you've seen this number. 
If it is, you place the current number at the index `left`, then increase the `left` pointer by `1`.

- O(1) memory, O(n) time
