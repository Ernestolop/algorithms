# Merge Sort 🧩

The **Merge Sort** algorithm is a divide-and-conquer sorting method that divides the array into two halves, sorts them recursively, and then merges them back together in sorted order.

---

## 📌 How does it work?

1. Divide the array into two halves.
2. Recursively sort each half.
3. Merge the two sorted halves together into a single sorted array.

## 📐 Time Complexity Formula

The runtime of the algorithm depends on how the array is divided and merged.

For an array of size **n**:

- Best case (already sorted array):  
  **T(n) = Θ(n log n)**  
  (even if the array is sorted, merge steps still happen)

- Worst case (reversed order array):  
  **T(n) = Θ(n log n)**  
  (regardless of the initial order, the merge sort divides and merges equally)

### General formula for merge sort:

T(n) = 2T(n/2) + Θ(n)


---

## 🚀 Complexity

| Case              | Time        |
|-------------------|-------------|
| Best case        | Θ(n log n)  |
| Average case     | Θ(n log n)  |
| Worst case       | Θ(n log n)  |

---

## ✅ When to use Merge Sort?

- When you need a stable sorting algorithm.
- When working with large data sets.
- When you require guaranteed performance in the worst case.

---

## ❌ When to avoid it?

- When working with small arrays, as simpler algorithms like QuickSort or Insertion Sort might perform better.
- When you need to minimize memory usage, as Merge Sort requires additional space for merging.


