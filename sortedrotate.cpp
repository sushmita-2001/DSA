#include<iostream>
#include<vector>
using namespace std;

class sortedrotate{       //no paratheses
    public:

bool check(vector<int>&nums){

    int count = 0;
    int n = nums.size();
    for(int i=1 ; i <n; nums[i]){
        if(nums[i-1] > nums[i])
            count++;
        }
         if(nums[n-1] > nums[0])
            count++;
        
         return count <=1;

    }
};
  








// int main(){

// return 0;
// }