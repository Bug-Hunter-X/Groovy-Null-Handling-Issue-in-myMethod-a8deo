```groovy
def myMethod(param) {
  if (param == null) {
    throw new NullPointerException("Param cannot be null")
  }
  // ... rest of the method
}
```
This version explicitly throws a `NullPointerException` if `param` is null. This makes the error more explicit and simplifies debugging, since it doesn't mask the problem by returning a potentially misleading 0 value.