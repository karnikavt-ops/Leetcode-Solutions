int* buildArray(int* nums, int numsSize, int* returnSize) {
    int * res ;
    res = malloc(sizeof(int)*numsSize);
    for(int i=0 ;i<numsSize; i++){
        res[i] = nums[nums[i]];
    }    
    *returnSize =  numsSize;
    return res;
}