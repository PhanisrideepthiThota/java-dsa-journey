# Dynamic Programming - Problem 2 : Frog Jump

## Problem Statement

A frog starts from stair `0` and wants to reach the last stair.

Each stair has a height.

The frog can jump:

* 1 stair
* 2 stairs

Energy used in one jump is

```
abs(height[current] - height[next])
```

Find the minimum total energy required.

---

# Intuition

Always think backwards.

To reach stair `i`, the frog can only come from

* stair `i-1`
* stair `i-2`

For every choice, calculate

```
Energy already spent
+
Current jump energy
```

Choose the smaller answer.

---

# DP State

```
dp[i]
```

represents

> Minimum energy required to reach stair `i`.

---

# Recurrence

```
left  = dp[i-1] + abs(height[i]-height[i-1])

right = dp[i-2] + abs(height[i]-height[i-2])

dp[i] = min(left, right)
```

---

# Base Case

```
dp[0] = 0
```

Reason:

The frog is already standing at stair 0.

No energy is required.

---

# Important Observation

Never compare only jump costs.

Wrong

```
min(jump1, jump2)
```

Correct

```
min(totalEnergyPath1, totalEnergyPath2)
```

because previous energy already spent must also be considered.

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

Optimization DP.

Operation used:

```
Math.min()
```

---

# Next Problem

Frog Jump with K Distance

Same idea.

Instead of 2 choices, we will have K choices.
