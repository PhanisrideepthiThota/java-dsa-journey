# Minimum Cost Selection

## Problem

We have 3 choices in each row.

* Select exactly one choice from every row.
* The same choice should not be selected in two adjacent rows.
* Find the minimum total cost.

## Logic

This is a **Dynamic Programming** problem because we need the minimum cost.

`dp[j]` means the minimum cost up to the current row when choice `j` is selected.

For every new row:

* If we select choice `0`, the previous row can use choice `1` or `2`.
* If we select choice `1`, the previous row can use choice `0` or `2`.
* If we select choice `2`, the previous row can use choice `0` or `1`.

So, we take the minimum cost from the valid choices of the previous row and add the current cost.

## Transition

```java
newDp[0] = mat[i][0] + Math.min(dp[1], dp[2]);
newDp[1] = mat[i][1] + Math.min(dp[0], dp[2]);
newDp[2] = mat[i][2] + Math.min(dp[0], dp[1]);
```

After processing a row:

```java
dp = newDp;
```

The current row's DP becomes the previous row for the next iteration.

## Important Point

**Adjacent** means only the immediately previous row.

Valid:

```text
Choice 0 → Choice 1 → Choice 0
```

Invalid:

```text
Choice 0 → Choice 0
```

## Final Answer

After processing all rows:

```java
Math.min(dp[0], Math.min(dp[1], dp[2]));
```

## Complexity

* Time: `O(n)`
* Space: `O(1)`

## Key Learning

The current choice cannot be the same as the previous choice, so we only need the previous row's DP values.

**Pattern:** Minimum cost + adjacent restriction → DP using previous state.
