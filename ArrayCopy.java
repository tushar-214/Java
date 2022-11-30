package arrays;

public class ArrayCopy
{
    public static void main(String[] args) {
        System.out.println("copy array");
        int[] array1={10,20,30,40,50};
        int[] array2=new int[array1.length];
        System.out.println("array 1: ");
        for (int a:array1) {
            System.out.print(a+ "  ");
        }
        for (int i=0;i<array1.length;i++)
        {
            array2[i]=array1[i];
        }
        System.out.println(" \n copied Array  :");
        for (int array:array2) {
            System.out.print(array + "  ");
        }
    }
}
