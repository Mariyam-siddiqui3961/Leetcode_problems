//-----------------Shuffle Array---------------
int [] result = new int[2 * n];

        int index = 0;

        for(int i = 0; i< n; i++){
            result[index] = nums[i];
            index += 1;