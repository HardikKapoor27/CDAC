#include<iostream>
#include<algorithm>
#include<string>
using namespace std;

void inputMarks(int marks[], string names[], int n){
    cin.ignore();
    for(int i = 0; i < n; i++){
        cout << "Enter name of student " << i+1 << ": ";
        getline(cin, names[i]);
        cout << "Enter marks of " << names[i] << ": ";
        cin >> marks[i];
        cin.ignore();
    }
}

void displayMarks(int marks[], string names[], int n){
    cout << "\n--- Student Marks ---" << endl;
    for(int i = 0; i < n; i++){
        cout << names[i] << " : " << marks[i] << endl;
    }
}

int partition(int marks[], string names[], int low, int high){
    int pivot = marks[high];
    int i = low - 1;

    for(int j = low; j < high; j++){
        if(marks[j] >= pivot){
            i++;
            swap(marks[i], marks[j]);
            swap(names[i], names[j]);
        }
    }
    swap(marks[i+1], marks[high]);
    swap(names[i+1], names[high]);
    return i + 1;
}

void quickSort(int marks[], string names[], int low, int high){
    if(low < high){
        int pi = partition(marks, names, low, high);
        quickSort(marks, names, low, pi - 1);
        quickSort(marks, names, pi + 1, high);
    }
}

void assignRanks(int marks[], string names[], int n){
    int tempMarks[n];
    string tempNames[n];
    for(int i = 0; i < n; i++){
        tempMarks[i] = marks[i];
        tempNames[i] = names[i];
    }

    quickSort(tempMarks, tempNames, 0, n-1);

    cout << "\n--- Ranks ---" << endl;
    int rank = 1;
    for(int i = 0; i < n; i++){
        if(i > 0 && tempMarks[i] == tempMarks[i-1]){
            cout << "Rank " << rank << " (Tie) : " << tempNames[i] << " - " << tempMarks[i] << endl;
        } else {
            rank = i + 1;
            cout << "Rank " << rank << " : " << tempNames[i] << " - " << tempMarks[i] << endl;
        }
    }
}

int main(){
    int n = 0;
    cout << "Enter number of students: ";
    cin >> n;

    int marks[n];
    string names[n];

    inputMarks(marks, names, n);
    displayMarks(marks, names, n);
    assignRanks(marks, names, n);

    return 0;
}