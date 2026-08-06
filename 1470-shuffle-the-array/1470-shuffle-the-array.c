int* shuffle(int* nums, int numsSize, int n, int* returnSize){
    int *res ;
    res = malloc(sizeof(int)*numsSize);
    int j=0;
    for(int i=0;i<n;i++){
        res[j++] = nums[i];
        res[j++] = nums[i+n];
    }
    *returnSize = numsSize;
    return res;
}