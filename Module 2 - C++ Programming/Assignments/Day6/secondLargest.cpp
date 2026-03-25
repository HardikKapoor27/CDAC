#include<iostream>
#include<limits>
using namespace std;

void  findSecontLagrest(int arr[], int n) {
        
    int first = INT_MIN;
    int second = INT_MIN;

    for(int i=0;i<n;i++) {
        first = max(first, arr[i]);
    }

    for(int i=0;i<n;i++) {
        if(arr[i] != first ){
            second = max(second, arr[i]);
        }
    }

    cout<< "The second largest element is : "<< second<<endl;
}

int main() {

    int n;
    cout<<"Enter the size of the array: ";
    cin>>n;

    int arr[n];

    for(int i=0;i<n;i++) {
        cout<<"Enter the element at index " << i<<": ";
        cin>>arr[i];
    }

    findSecontLagrest(arr,n);

    return 0;
}