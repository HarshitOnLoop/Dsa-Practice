class Solution {
    public void sortColors(int[] nums) {
int k=0;
int n=nums.length;
for(int i=0; i<n; i++){
  for(int j=i+1; j<n; j++){
if(nums[i]>nums[j]){
    int t= nums[i];
    nums[i]=nums[j];
    nums[j]=t;
}

  }}

    }
}