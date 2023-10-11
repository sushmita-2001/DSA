#include<iostream>
#include <cstring>
using namespace std;

void reverse(char name[], int n){
    int s=0;    
    int e= n-1;
    while(s<e){
        swap(name[s++], name[e--]);
    }
   
    
}

int main(){
    char ch[20];    
    cout<< "Enter your name"<< endl;
    cin>> ch ;
reverse(ch, strlen(ch));  //The strlen function
//  is used to determine the length of a string in C++
    cout<<"Reverse of your name is"<< " " << ch << endl;
    


}