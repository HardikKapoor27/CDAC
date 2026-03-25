#include<iostream>
using namespace std;

void merge (int arr1[], int arr2[], int n, int k){

    int res[n+k];

    for(int i=0; i<n; i++){
        res[i] = arr1[i];
    }

    cout<<" ";

    for(int i = 0; i < k; i++) {
        res[n + i] = arr2[i];
    }

    cout<<"\nThe Merged Array is: ";

    for(int i=0; i<n+k; i++){
    cout<<res[i]<<" ";
    }

}
int main(){

    int n;
    int k;
    cout<<"Enter the size of the first array: ";
    cin>>n;
    int arr1[n];

    for(int i=0;i<n;i++) {
        cout<<"Enter the element for 1st Array at index " << i<<": ";
        cin>>arr1[i];
    }

    cout<<"\nEnter the size of the second array: ";
    cin>>k;
    int arr2[k];

    for(int i=0;i<k;i++) {
        cout<<"Enter the element for 2nd Array at index " << i<<": ";
        cin>>arr2[i];
    }

    // for(int i=0;i<n;i++) {
        
    //     cout<<arr1[i]<<" ";
    // }
    // cout<<endl;
    // for(int i=0;i<k;i++) {
       
    //     cout<<arr2[i]<<" ";
    // }

    merge(arr1, arr2, n , k);

    return 0;
}