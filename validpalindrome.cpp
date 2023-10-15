#include<iostream>
using namespace std;

bool valid(char ch){
    if((ch >= 'a'&& ch <='z')||(ch >= 'A' && ch <= 'Z') || (ch >= '0'&& ch <= '9')){
        return 1;
    }
    return 0;

}
char toLowercase(char ch){
    if((ch >= 'a'&& ch <= 'z')|| (ch >= '0' && ch <= '9')){
        return ch ;
    }
    else{
        char temp = ch- 'A' + 'a';
        return temp;
    }
}

bool checkPalindrome(string a){
    int s = 0;
    int e = a.length()-1;
    while(s<=e){
        if(a[s]!= a[e]){
            return 0;
        }
        else{
            s++;
            e--;
        }
       

    }
       return 1;
}
bool ispalindrome(string s){
    // eliminatinh waste characters which are not required like @,#
    string temp = " "; //empty string created
    for(int j = 0 ; j < s.length(); j++ ){
        if(valid(s[j])){
            temp.push_back(s[j]);
        }
        
    }
    // changing 
    for(int j = 0; j < temp.length(); j++){
        temp[j] = toLowercase(temp[j]);
    }
    //checkPalindrome
    return checkPalindrome(temp);
}

int main() {
   string input;
   cout << "Enter a string: ";
   cin >> input;

   bool result = checkPalindrome(input);
   
   if(result) {
      cout << "Palindrome" << endl;
   } else {
      cout << "Not a palindrome" << endl;
   }
   
   return 0;
}

