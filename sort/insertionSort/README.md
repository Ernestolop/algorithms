# Insertion Sort 🧩

The **Insertion Sort** algorithm is a simple sorting method that builds the sorted list incrementally by taking one element at a time and inserting it into its correct position.

---

## 📌 How does it work?

1. Iterate through the array starting from the second element.
2. Compare the current element with the previous ones.
3. Shift larger elements one position to the right.
4. Insert the element into its correct position.

## 📐 Time Complexity Formula

The runtime of the algorithm depends on the number of comparisons and shifts it performs.

For an array of size **n**:

- Best case (already sorted array):  
  **T(n) = Θ(n)**  
  (only one comparison per element)

- Worst case (reverse order array):  
  **T(n) = Θ(n²)**  
  (each element is compared and shifted against all previous ones)

### General formula for the worst case:

```
T(n) = ∑(j = 2 to n) (j - 1) = (n(n - 1)) / 2
```

---

## 🚀 Complexity

| Case              | Time        |
|-------------------|-------------|
| Best case        | Θ(n)        |
| Average case     | Θ(n²)       |
| Worst case       | Θ(n²)       |

---

## ✅ When to use Insertion Sort?

- When working with small lists.
- When the data is nearly sorted.
- When you need a simple and easy-to-implement algorithm.

---

## ❌ When to avoid it?

- With large lists, due to its quadratic complexity.
- When high performance is required.