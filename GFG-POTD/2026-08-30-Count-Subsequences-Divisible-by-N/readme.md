# Count Subsequences Divisible by N

## Problem

Given a numeric string and a number `n`, count the non-empty subsequences whose numeric value is divisible by `n`.

## Logic

We cannot generate all subsequences because there can be `2^length` subsequences.

So we use Dynamic Programming based on **remainders**.

```text
dp[r] = number of subsequences having remainder r
```

There are only `n` possible remainders:

```text
0, 1, 2, ..., n-1
```

For every digit, we have 3 possibilities:

1. Start a new subsequence with the digit.
2. Add the digit to existing subsequences.
3. Don't take the digit.

When adding a digit:

```text
newRemainder = (oldRemainder * 10 + digit) % n
```

We use `newDp` so that the same digit is not used more than once during one iteration.

At the end:

```text
dp[0]
```

is the answer because remainder `0` means the number is divisible by `n`.

## Complexity

```text
Time: O(|s| * n)
Space: O(n)
```

## Key Learning

**Don't store every subsequence. Store the count of subsequences for each remainder.**

Pattern:

```text
Subsequences
     ↓
Too many → 2^length
     ↓
Store remainder
     ↓
dp[remainder] = count
     ↓
Start / Take / Skip
     ↓
Answer = dp[0]
```
