#include<iostream>
using namespace std;

int main() {
    int i;
    int *iptr;

    i = 5;
    iptr = &i;

    cout<<"\ni : "<< i;
    cout<<"\n&i : "<< &i;
    cout<<"\niptr : "<< iptr;
    cout<<"\n*iptr : "<< *iptr;
    cout<<"\n&iptr : "<< &iptr;

    return 0;
}