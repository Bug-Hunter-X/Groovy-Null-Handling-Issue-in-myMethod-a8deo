# Groovy Null Handling Bug
This repository demonstrates a subtle bug in Groovy related to null handling in a method. The `myMethod` function attempts to handle null input by returning 0, which might not always be the appropriate behavior. This can lead to unexpected errors or incorrect results in parts of the code that depend on the return value of `myMethod`. The solution offers a better way to handle null values, promoting robustness and better error management.

## Bug Description
The initial implementation of `myMethod` returns 0 when the input `param` is null. While this seems harmless, it masks potential problems. If downstream code relies on a specific return type or interprets 0 as a meaningful value, inconsistencies might arise.  A more robust approach would involve explicitly throwing an exception or providing a different default value more appropriate to the method's purpose.

## Solution
The improved version of `myMethod` throws a `NullPointerException` for a null `param` to indicate that the method cannot process such input.  This ensures that the error is not silently ignored but rather raised and handled appropriately higher up in the code execution path. This leads to better error tracking and more predictable program behavior.