public class DeleteAtIndex
{
    public static void main(String args[])
    {
        int[] a = {10,20,30,40,50,60};
        int del_pos = 2;
        int count = 0;
        for(int i =0; i<a.length; i++)
        {
            if(del_pos == i)
            {
                for(int j = i; j<a.length-1; j++)
                {
                    a[j] = a[j+1];
                }
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.println("Element not deleted");
        }
        else
        {
            System.out.println("Element got deleted");
            for(int i = 0; i< a.length-1; i++)
            {
                System.out.println(a[i]);
            }
        }
    }
}
