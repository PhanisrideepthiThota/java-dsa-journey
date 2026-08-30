# Marks from Ranks

## Problem

We are given intervals of valid marks.

* `l[i]` is the starting mark.
* `r[i]` is the ending mark.
* All marks between them are valid.
* Given some ranks, find the mark at each rank.

## Example

```text
l = [1, 6, 14]
r = [3, 9, 15]

Valid marks:

1 2 3 | 6 7 8 9 | 14 15
```

So:

```text
Rank 1 → 1
Rank 2 → 2
Rank 5 → 7
Rank 8 → 14
```

## Logic

For every requested rank:

1. Go through the intervals.
2. Find how many marks are present in each interval.
3. Keep track of how many marks came before the current interval.
4. If the required rank falls inside the current interval, calculate the mark.

The number of marks in an interval is:

```text
r[i] - l[i] + 1
```

The mark is calculated using:

```text
l[i] + (rank - count - 1)
```

## Complexity

* Time: `O(rank.length × l.length)`
* Space: `O(rank.length)`

## Key Learning

The intervals are already sorted and non-overlapping, so we can find the required mark by keeping track of the number of valid marks seen so far.
