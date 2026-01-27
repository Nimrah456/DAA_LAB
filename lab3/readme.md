🔹 Explanation (Insertion Sort)

Insertion Sort is a simple comparison-based sorting algorithm.
The array is divided into two parts: sorted and unsorted.

Initially, the first element is considered sorted. Each subsequent element is selected and compared with elements in the sorted part. Larger elements are shifted one position to the right, and the selected element is inserted into its correct position. This process continues until the entire array is sorted.

🔹 Algorithm: Insertion Sort

Step 1: Start
Step 2: Read the size of the array n
Step 3: Read n elements into array a
Step 4: For i = 1 to n − 1
    a) Set temp = a[i]
    b) Set j = i − 1
    c) While j ≥ 0 and a[j] > temp
        • Shift a[j] to a[j+1]
        • Decrement j
    d) Insert temp at position a[j+1]
Step 5: Display the sorted array
Step 6: Stop

🔹 Pseudocode: Insertion Sort
INSERTION_SORT(a, n)
BEGIN
    FOR i ← 1 TO n - 1 DO
        temp ← a[i]
        j ← i - 1

        WHILE j ≥ 0 AND a[j] > temp DO
            a[j + 1] ← a[j]
            j ← j - 1
        END WHILE

        a[j + 1] ← temp
    END FOR
END

🔹 Time and Space Complexity

Best Case: O(n)

Average Case: O(n²)

Worst Case: O(n²)

Space Complexity: O(1)

🔹 Conclusion

Insertion Sort arranges elements by inserting each element into its correct position in the sorted portion of the array.
