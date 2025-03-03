import java.util.Scanner;
class FindTarget
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Enter the element at index "+i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        int index = findTarget(arr, target);
        System.out.println("The target is present at "+ index);
    }

    public static int findTarget(int[] arr, int target)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == target)
            {
                //target found return index
                return i;
            }
        }
        return -1;
    }
}