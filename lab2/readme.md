Quick Sort is a divide and conquer sorting algorithm.
It works by selecting a pivot element, partitioning the array such that:
Elements less than or equal to pivot are placed on the left
Elements greater than pivot are placed on the right
This process is applied recursively to the left and right sub-arrays until the entire array is sorted.

In this program:

The first element of the array is chosen as the pivot

Partitioning is done using two pointers (start and end)

Execution time is measured using System.nanoTime()

🔹 Algorithm: Quick Sort

Step 1: Start
Step 2: Read number of elements n
Step 3: Generate n random numbers and store them in an array
Step 4: Call QUICKSORT(array, 0, n−1)
Step 5: Record start time
Step 6: Sort the array using Quick Sort
Step 7: Record end time
Step 8: Calculate execution time
Step 9: Display number of elements and execution time
Step 10: Stop

🔹 Algorithm: QUICKSORT(arr, lb, ub)

Step 1: If lb < ub, then
Step 2: Find pivot position using PARTITION(arr, lb, ub)
Step 3: Recursively apply Quick Sort on left sub-array
Step 4: Recursively apply Quick Sort on right sub-array
Step 5: Return

🔹 Algorithm: PARTITION(arr, lb, ub)

Step 1: Set pivot = arr[lb]
Step 2: Set start = lb, end = ub
Step 3: While start < end

Increment start while arr[start] ≤ pivot

Decrement end while arr[end] > pivot

If start < end, swap arr[start] and arr[end]
Step 4: Swap arr[lb] and arr[end]
Step 5: Return end (pivot position)

🔹 Pseudocode
Quick Sort Pseudocode
QUICKSORT(arr, lb, ub)
BEGIN
    IF lb < ub THEN
        loc ← PARTITION(arr, lb, ub)
        QUICKSORT(arr, lb, loc - 1)
        QUICKSORT(arr, loc + 1, ub)
    END IF
END

Partition Pseudocode
PARTITION(arr, lb, ub)
BEGIN
    pivot ← arr[lb]
    start ← lb
    end ← ub

    WHILE start < end DO
        WHILE start ≤ ub AND arr[start] ≤ pivot DO
            start ← start + 1
        END WHILE

        WHILE arr[end] > pivot DO
            end ← end - 1
        END WHILE

        IF start < end THEN
            SWAP arr[start] AND arr[end]
        END IF
    END WHILE

    SWAP arr[lb] AND arr[end]
    RETURN end
END
