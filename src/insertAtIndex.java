public class insertAtIndex
{
    public static void main(String[] args)
    {
        int[] a = {10,20,30,40,50};
        int index_pos = 2;
        int element = 100;
        int last_ele = a[a.length-1];
        System.out.println("last element:" +last_ele);
        for(int i=a.length-1; i>index_pos; i--)
        {
            a[i] = a[i-1];
        }
        a[index_pos] = element;
        for(int i = 0; i<a.length; i++)
        {
            System.out.println("Array:" +a[i]);
        }
    }
}
