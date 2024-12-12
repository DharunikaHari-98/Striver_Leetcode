class Solution {
    void selectionSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int minindex=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[minindex])
                {
                    minindex=j;
                }
            }
                
                    int temp=arr[minindex];
                    arr[minindex]=arr[i];
                    arr[i]=temp;
                
            
        }
    }
}
