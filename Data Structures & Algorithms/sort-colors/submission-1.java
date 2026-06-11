class Solution {
    public void sortColors(int[] arr) {
        int lo=0,m=0;
        int n = arr.length;
        int hi = n-1;
        while(m<=hi){
            if(arr[m]==0){
                int temp = arr[m];
                arr[m] = arr[lo];
                arr[lo] = temp;
                lo++;
                m++;
            }
            else if(arr[m]==1){
                m++;
            }
            else if(arr[m]==2){
                int temp = arr[m];
                arr[m] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }
    }
}