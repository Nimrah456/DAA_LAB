import java.util.Random;

class Sorting
{
    public void quicksort(int a[], int lb, int ub)
    {
        if (lb < ub)
        {
            int loc = partition(a, lb, ub);
            quicksort(a, lb, loc - 1);
            quicksort(a, loc + 1, ub);
        }
    }

    public int partition(int a[], int lb, int ub)
    {
        int pivot = a[lb];
        int start = lb;
        int end = ub;

        while (start < end)
        {
            while (start <= ub && a[start] <= pivot)
                start++;

            while (a[end] > pivot)
                end--;

            if (start < end)
            {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }

        int temp = a[lb];
        a[lb] = a[end];
        a[end] = temp;

        return end;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        int n = 6000;
        int a[] = new int[n];

        Random r = new Random();

        for (int i = 0; i < n; i++)
            a[i] = r.nextInt(100000);

        Sorting obj = new Sorting();

        long startTime = System.nanoTime();
        obj.quicksort(a, 0, n - 1);
        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Number of elements: " + n);
        System.out.println("Execution Time (ns): " + executionTime);
        System.out.println("Execution Time (ms): " + (executionTime / 1_000_000.0));
    }
}
