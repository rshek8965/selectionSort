package com.company;

public class method {

    public static void swap(int[]arr, int i, int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void selectionSort(int[] list1)
    {
        //declare two ints for remembering the position we are swapping into, and the current minimum, initialize them to 0
        int pos = 0;
        int currentMin = 0;
        // for loop through the entire array using an index variable
        for (int i = 0; i < list1.length; i++)
        {
            //set swap position to index, and current minimum to the number at index
            pos = i;
            currentMin = list1[i];
            //if you find a number less than the min, set swap position and current minimum
            int j=pos;
            for (j=j+1; j<list1.length;j++)
            {
                //if element at j-1 is greater than element at j, swap them
                if (list1[j]<currentMin)
                {
                    currentMin=j;
                }
                //swap the number at index with the number at swap position
                swap(list1, currentMin, pos);
            }
        }
    }
}
