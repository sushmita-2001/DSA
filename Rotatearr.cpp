#include<iostream>
#include<vector>
using namespace std;

class Rotatearr{
    public:
void rotate(vector<int>& nums, int k) {
      
    // just to practice the modulus approach
      int n = nums.size();
      vector<int> temp(n);


    for(int i = 0 ; i < nums.size() ; i++){
        temp[(i+k)%nums.size()]=nums[i];

    }
    nums = temp;
}
 


};

    int main() {
    vector<int> arr = {1, 2, 3, 4, 5};
    int k = 2;

    Rotatearr rotateArr;
    rotateArr.rotate(arr, k);

    for (int i = 0; i < arr.size(); i++) {
        cout << arr[i] << " ";
    }

    return 0;
}



