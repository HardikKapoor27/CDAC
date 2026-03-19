//sum of first n number
#include<iostream>
using namespace std;

int main() {
    int n;
    int sum = 0;

    cout<<"Enter the number of terms : ";
    cin>>n;

    for(int i = 0; i <= n; i++) {
        sum += i; 
    }

    cout<<"Sum of "<<n<<" terms is "<<sum;
}