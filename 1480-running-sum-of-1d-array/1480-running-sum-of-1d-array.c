int* runningSum(int* nums, int numsSize, int* returnSize) {
    int * result;
    result =malloc(numsSize * sizeof(nums));
    result[0] = nums[0];
    for(int i = 1; i < numsSize; i++){
        result[i] = result[i-1] + nums[i];
    }
    *returnSize = numsSize;
    return result;
}