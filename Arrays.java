public class Arrays
{
    int max = Integer.MIN_VALUE;
    //1- Using the Integer.MIN_VALUE to initialize the max variable 
    //2- The FindMax method is used to find the maximum element in the array
    public int FindMax(int[]arr)
    {
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>max)
        {
            max = arr[i];
        }
    }
    System.out.println("The maximum element in the above array is: "+max);
      return max;
    }

    //Type - 2 Taking arr[0] as max element and comparing to the other values of the array 
    public int findMax2(int [] arr)
    {
       int x2= arr[0];
        for(int i=0; i<arr.length;i++)

        {
            if(arr[i]>x2)
        {
            x2 = arr[i];
        }   
    }
    System.out.println("The maximum element in the above array is: "+x2);
    return x2;
    }

    // Sorting of the array
    public void sort(int [] arr)
    {
        int n = arr.length;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Returning the last element of the sorted array as max 
    public int findMax(int [] arr)
    {
       sort(arr);
       
       // The last element in the sorted array will be the largest
       return arr[arr.length - 1];
}
}
