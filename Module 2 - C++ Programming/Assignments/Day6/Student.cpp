#include<iostream>
using namespace std;

class Student {

    private:
        int rollno;
        string name;
        float marks[3];
        float totalMarks = 0.0;
        float avgMarks;
    
    public:
        void getStudent();
        void displayStudent();
        void totalAvgMarks();

};

void Student::getStudent() {

    cout<<"Enter student rollno: ";
    cin>>rollno;

    cout<<"Enter student name: ";
    cin>>name;

    cout<<"Enter student marks ";
    for(int i = 0; i < 3; i++) {
        cout<<"for subject "<<i<<" :";
        cin>>marks[i];
    }
}

void Student::displayStudent() {

}
void Student::totalAvgMarks() {

    for(int i = 0; i < 3; i++) {
            totalMarks += marks[i];
    } 

}

int main() {

    int n;
    cout<<"Enter no of students: ";
    cin>>n;

    int s[n];
    for(int i = 0; i < n; i++) {
        Student s[i];
    }
}