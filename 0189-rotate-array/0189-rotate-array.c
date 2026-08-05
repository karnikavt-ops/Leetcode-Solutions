void reverse(int* nums, int s, int e){
    while(s<e){
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
        s++;
        e--;
    }
}

void rotate(int* nums, int numsSize, int k) {
    k = k% numsSize;
    if(k!=0){
        reverse(nums,0,numsSize-1);
        reverse(nums,0,k-1);
        reverse(nums,k,numsSize-1);
    }
}

