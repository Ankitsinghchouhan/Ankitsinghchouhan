class MultiCatch{
    public static void main(String args [])
    {
        String s = null;
        int arr[] = {10,20,30};
        try{
            System.out.println(arr[3]);
            System.out.println(s.length());
           
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Exception Index out of bound" +ex );
        }
        catch(NullPointerException e2){
            System.out.println("Exception Null pointer"+e2);
        }
    }
}
