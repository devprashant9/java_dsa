# Understanding Recursion in Detail

```java
public static void printOne(int num){
    System.out.println(num);
    printOne(num);
}
```

In the above code when the control moves inside the `printOne()` method it first encounters a print statement and then encounters the `printOne()` method.

The `printOne()` method will call this function again and this process will keep executing and ultimately results in a infinite execution.

So we can see that inside a function same function was called this method **`function calling itself`** is known as recursion.

To prevent the infinite recursion we must specify certain condition to stop the recursion which is known as the **`base case`** where actually the recursion halts.

## Where Does Previous Function Calls Go?

Each function is loaded in the stack space when they are called and can be visualized in the following way. All refers to same variable number are given to mark different calls.

Every function calls keeps getting pushed into stack. The `printOne(num1)` called `printOne(num2)` and is waiting. In similar fashion `printOne(num2)` called `printOne(num3)` and is waiting and this applies to all other calls. All this calls waits in the memory and if the memory gets full it results into `stack overflow` error.

    | printOne(num5)|
    |---------------|
    | printOne(num4)|
    |---------------|
    | printOne(num3)|
    |---------------|
    | printOne(num2)|
    |---------------|
    | printOne(num1)|
    -----------------

## How to Implement Base Case?

The below code shows implementation of base case in a recursive call and understand how it executes.

```java
    class Counter {
    public static void main(String[] args) {
        int num = 1;
        increaseCounter(num);
    }
    public static void increaseCounter(int num) {
        if(num > 5) {
            return;
        }
        System.out.println(num);
        increaseCounter(num + 1);
    }
}
```

    | (6 > 5) false     |
    | return            |
    |-------------------|
    | print(5)          |
    | increaseCounter(6)|
    | ------------------|
    | print(4)          |
    | increaseCounter(5)|
    | ------------------|
    | print(3)          |
    | increaseCounter(4)|
    | ------------------|
    | print(2)          |
    | increaseCounter(3)|
    | ------------------|
    | print(1)          |
    | increaseCounter(2)|
    ---------------------

The `return` keyword returns the control to the point from where the function was invoked with or without a `value`. Once a function is completely executed it is removed from the `stack` also. Any line after `return` is never executed.

Thus, when `num = 6` and `num > 5` becomes true the control is transfered to `increaseCounter(6)` without any value and it transfer back the control to `increaseCounter(5)` and itself gets removed from stack.

Same happens for `increaseCounter(5)` also and when control is transfered from `increaseCounter(2)` to `main()` where no more code exists the program ends.

## What is Functional Recursion?

Look at the below code and the dry run explained in the stack. Here each of the previous call is waiting to return a value from the next function call.

```java
public static int factorial(int num) {
    if(num == 1 || num == 0) {
        return 1;
    }
    return num * factorial(num - 1);
}
```
Let us consider `num = 5` as example

Before the `return` statement is encountered stack will something be like this.

    | (1 == 1) true          |
    |   return 1;            |
    | -----------------------|
    | return 2 * factorial(1)|
    | -----------------------|
    | return 3 * factorial(2)|
    | -----------------------|
    | return 4 * factorial(3)|
    | -----------------------|
    | return 5 * factorial(4)|
    --------------------------

After the `return` statement is encountered stack will something be like this with `returned values`.

    |   return 1;  |
    | -------------|
    | return 2 * 1 |
    | => 2         |
    | -------------|
    | return 3 * 2 |
    | => 6         |
    | -------------|
    | return 4 * 6 |
    | => 24        |
    | -------------|
    | return 5 * 24|
    | => 120       |
    ----------------

Thus at last `120` will be returned to the `main function` from where this recursive function was called for the first time.