#include<iostream>
using namespace std;

void calcFreq(int arr[], int n) {
    for(int i = 0; i < n; i++) {
        
        // Skip if this element was already counted
        bool alreadyCounted = false;
        for(int j = 0; j < i; j++) {
            if(arr[j] == arr[i]) {
                alreadyCounted = true;
                break;
            }
        }

        if(alreadyCounted) continue;

        // Count frequency of arr[i]
        int count = 1;
        for(int j = i + 1; j < n; j++) {
            if(arr[j] == arr[i]) {
                count++;
            }
        }

        cout << "Frequency of " << arr[i] << " is: " << count << endl;
    }
}

int main() {
    int n;
    cout << "Enter the size of the array: ";
    cin >> n;

    int arr[n];

    for(int i = 0; i < n; i++) {
        cout << "Enter the element for 1st Array at index " << i << ": ";
        cin >> arr[i];
    }

    calcFreq(arr, n);
    cout<<"End";
}