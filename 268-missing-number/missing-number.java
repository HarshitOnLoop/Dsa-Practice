class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int suma=0;
        int sum=0;
for(int i=0; i<n; i++){
    suma += nums[i];
}

for(int i=0; i<=n; i++){
    sum += i;
}

return sum-suma;

    }
}