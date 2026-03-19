#include <iostream>

using namespace std;

int main(){

    int n;
    int fact =1;

    cout<<"Enter The Number: ";
    cin>> n; 
     cout<<"THe Facotoial of the "<< n;

    while(n !=1){
        fact *= n;
        n--;
    }


    cout<< " is : " << fact <<endl;



    return 0;
}