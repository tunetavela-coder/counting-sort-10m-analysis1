# counting-sort-10m-analysis1
Implementation and performance analysis of the Counting Sort algorithm for sorting 10 million integers.
# Counting Sort Performance Analysis (10 Million Items)

## Project Overview

This project presents the implementation and performance evaluation of the **Counting Sort algorithm** for sorting a dataset containing **10 million integers**.

Counting Sort is a non-comparison based sorting algorithm that sorts elements by counting the number of occurrences of each value in the dataset.

The goal of this project is to analyze the algorithm’s efficiency when applied to large datasets.

---

## Algorithm Description

Counting Sort operates by counting the frequency of each value in the dataset and reconstructing the sorted output using this frequency information.

### Algorithm Steps

1. Create a counting array with size equal to the range of values.
2. Traverse the input dataset and record the frequency of each value.
3. Reconstruct the sorted dataset using the counts.

---

## Dataset Characteristics

Dataset Size: **10,000,000 integers**

Value Range: **0 – 10,000**

Randomly generated using Java's `Random` class.

---

## Time Complexity Analysis

| Case | Complexity |
|-----|-------------|
| Best Case | O(n + k) |
| Average Case | O(n + k) |
| Worst Case | O(n + k) |

Where:

- **n** = number of elements
- **k** = range of values

---

## Benchmark Methodology

The algorithm was executed **three times** to obtain reliable benchmark results.

The average execution time was calculated to reduce the effect of runtime fluctuations.

---

## Results Summary

Average execution time for sorting **10 million integers** was approximately **1.9 seconds** on a standard machine.

These results confirm the linear scalability of Counting Sort.

---

## Conclusion

The experiment demonstrates that Counting Sort is highly efficient for large datasets when the value range is limited.

However, the algorithm requires additional memory proportional to the value range, which may limit its applicability when sorting data with extremely large ranges.
