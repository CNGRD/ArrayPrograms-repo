class ReverseArray
  {
    public static void main(String[] args)
    {
      System.out.println("Enter the Array elements");
      int[] arr=new int[5];
      arr[0]=2;
      arr[1]=3;
      arr[2]=4;
      arr[3]=5;
      arr[4]=6;
      for(int i=arr.length-1;i>=0;i++)
        {
          System.out.println(arr[i]);
        }
    }
  }
