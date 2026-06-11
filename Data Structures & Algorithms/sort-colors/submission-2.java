class Solution {
    public void sortColors(int[] arr) {
        // int lo=0,m=0;
        // int n = arr.length;
        // int hi = n-1;
        // while(m<=hi){
        //     if(arr[m]==0){
        //         int temp = arr[m];
        //         arr[m] = arr[lo];
        //         arr[lo] = temp;
        //         lo++;
        //         m++;
        //     }
        //     else if(arr[m]==1){
        //         m++;
        //     }
        //     else if(arr[m]==2){
        //         int temp = arr[m];
        //         arr[m] = arr[hi];
        //         arr[hi] = temp;
        //         hi--;
        //     }
        // }

        int count0=0;
        int count1=0;
        int count2=0;

        for (int i=0; i<arr.length; i++){
            if (arr[i]==0)
                count0++;
            else if (arr[i]==1)
                count1++;
            else 
                count2++;
        }

        for (int i=0; i<arr.length; i++){
            if (i<count0)
                arr[i]=0;
            else if (i<count0+count1)
                arr[i]=1;
            else 
                arr[i]=2;
        }

        
    }
}