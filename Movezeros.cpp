#include<iostream>
#include<vector>
using namespace std;

void movezeros(vector<int> &nums ){
    int i = 0;
    for(int j = 0 ; j<nums.size() ; j++){
        if(nums[j]!= 0){
            swap(nums[j] , nums[i]);
            i++;
        }
    }
}

int main(){

   vector<int> nums = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
    movezeros(nums);
    for (auto &it : nums) {
        cout << it << " ";
    }
    cout << '\n';
    
return 0;
}