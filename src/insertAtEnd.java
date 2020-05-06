public class insertAtEnd
{
    public static void main(String[] args){
        int n = 10;
        int element = 50;
        int Arr[] = {1,2,3,4,5,6,7,8,9,10};
        int newArr[] = new int[n+1];
        for(int i = 0; i<n ;i++)
        {
           newArr[i] = Arr[i];
        }
        newArr[n] = element;
        for(int i = 0; i<n+1; i++)
        {
            System.out.println(newArr[i]);
        }
    }
}
