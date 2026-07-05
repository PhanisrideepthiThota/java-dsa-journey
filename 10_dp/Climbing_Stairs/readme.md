# Dynamic Programming - Problem 1 : Climbing Stairs

## Problem Statement

A person is standing at stair `0` and wants to reach stair `n`.

He can climb either:

* 1 stair
* 2 stairs

Find the total number of distinct ways to reach the last stair.

---

# Intuition

Instead of thinking:

> "Where can I go?"

Think:

> "Where could I have come from?"

To reach stair `i`, there are only two possibilities:

* From stair `i-1`
* From stair `i-2`

Every way of reaching `i-1` can take one more step.

Every way of reaching `i-2` can take two more steps.

Therefore,

```
Ways(i) = Ways(i-1) + Ways(i-2)
```

This is the DP recurrence.

---

# DP State

```
dp[i]
```

represents

> Number of ways to reach stair `i`.

---

# Base Cases

```
dp[0] = 1
dp[1] = 1
```

Reason:

* Already standing at stair 0 → one valid way.
* Only one way to reach stair 1.

---

# DP Steps

1. Define the state.
2. Find previous choices.
3. Write recurrence.
4. Handle base cases.
5. Compute remaining states.

---

# Time Complexity

```
O(N)
```

---

# Space Complexity

Tabulation

```
O(N)
```

Space Optimized

```
O(1)
```

---

# Pattern Learned

Count the number of ways.

Operation used:

```
+
```

---

# Next Problem

Frog Jump

Question changes from:

"How many ways?"

to

"What is the minimum energy?"

Only the operation changes from `+` to `Math.min()`.
