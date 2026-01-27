This program sorts an array of integers using the Selection Sort technique.
The user enters the size of the array and its elements.
The algorithm repeatedly finds the smallest element from the unsorted part of the array and places it at the correct position.
This process continues until the entire array is sorted in ascending order.

Algorithm (Selection Sort):

Start

Read the size of the array n

Read n array elements

For each position i from 0 to n-2

Assume a[i] is the minimum

Compare it with remaining elements

Find the smallest element

Swap it with a[i]

Display the sorted array

Stop

Pseudocode:
START
READ n
DECLARE array a[n]

FOR i = 0 TO n-2
    min = i
    FOR j = i+1 TO n-1
        IF a[j] < a[min] THEN
            min = j
        END IF
    END FOR
    SWAP a[min] AND a[i]
END FOR

PRINT sorted array
STOP
