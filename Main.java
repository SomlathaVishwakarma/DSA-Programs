import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int arr[];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n = sc.nextInt();
    arr = new int[n];
    System.out.println("Enter the elements for the array");
    for(int i=0;i<arr.length; i++)
    {
        arr[i] = sc.nextInt();
    }
   Arrays obj = new Arrays();
    //method calling for different methods in class Arrays.java 
    // this is the main method for Arrays.java
    obj.FindMax(arr);
    obj.findMax2(arr);
    obj.sort(arr);

  }
}
