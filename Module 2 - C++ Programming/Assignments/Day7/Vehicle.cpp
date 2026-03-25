#include<iostream>
using namespace std;

class Vehicle {
    protected:
        string brand;
        float rentPerDay;
        float totalRent;

    public:
        Vehicle(string brand, float rentPerDay) {
            this->brand = brand;
            this->rentPerDay = rentPerDay;
            this->totalRent = 0;
        }

        string getBrand()     { return brand; }
        float getRentPerDay() { return rentPerDay; }

        static Vehicle takeInput() {
            string brand;
            float rentPerDay;
            cout << "\nEnter Brand: ";      cin >> brand;
            cout << "Enter Rent Per Day: "; cin >> rentPerDay;
            return Vehicle(brand, rentPerDay);
        }

        void calcRent(int days) {
            totalRent = rentPerDay * days;
        }

        void Bill() {
            cout << "\n<====== Rent Bill ======>" << endl;
            cout << "\nBrand: " << brand << endl;
            cout << "\nRent Per Day: " << rentPerDay << endl;
        }
};

class Bike : public Vehicle {
    private:
        float helmCharge;

    public:
        Bike(string brand, float rentPerDay, float helmCharge)
            : Vehicle(brand, rentPerDay) {
            this->helmCharge = helmCharge;
        }

        static Bike takeInput() {
            Vehicle v = Vehicle::takeInput();
            float helmCharge;
            cout << "Enter Helmet Charge: "; cin >> helmCharge;
            return Bike(v.getBrand(), v.getRentPerDay(), helmCharge);
        }

        void calcRent(int days) {
            totalRent = (rentPerDay * days) + helmCharge;
        }

        void Bill(int days) {
            Vehicle::Bill();
            cout << "\nNo of Days: " << days << endl;
            cout << "\nHelmet Charge: " << helmCharge << endl;
            cout << "\n==================================" << endl;
            cout << "\nTotal Rent: ((Rent Per Day * Days) + Helmet Charge) = " << totalRent << endl;
        }
};

class Car : public Vehicle {
    private:
        float acCharge;

    public:
        Car(string brand, float rentPerDay, float acCharge)
            : Vehicle(brand, rentPerDay) {
            this->acCharge = acCharge;
        }

        static Car takeInput() {
            Vehicle v = Vehicle::takeInput();
            float acCharge;
            cout << "Enter AC Charge Per Day: "; cin >> acCharge;
            return Car(v.getBrand(), v.getRentPerDay(), acCharge);
        }

        void calcRent(int days) {
            totalRent = (rentPerDay * days) + (acCharge * days);
        }

        void Bill(int days) {
            Vehicle::Bill();
            cout << "\nNo of Days: " << days << endl;
            cout << "\nAC Charge Per Day: " << acCharge << endl;
            cout << "\n==================================" << endl;
            cout << "\nTotal Rent: ((Rent Per Day * days) + (AC Charge * days)) = " << totalRent << endl;
        }
};

int main() {
    int nb;
    cout << "Enter no of Bikes Rented: ";
    cin >> nb;

    Bike* b[nb];
    for(int i = 0; i < nb; i++) {
        cout << "\n--- Bike " << i+1 << " ---";
        Bike temp = Bike::takeInput();
        b[i] = new Bike(temp);
        int days;
        cout << "Enter No of Days: "; cin >> days;
        b[i]->calcRent(days);
        b[i]->Bill(days);
    }

    int nc;
    cout << "\nEnter no of Cars Rented: ";
    cin >> nc;

    Car* c[nc];
    for(int i = 0; i < nc; i++) {
        cout << "\n--- Car " << i+1 << " ---";
        Car temp = Car::takeInput();
        c[i] = new Car(temp);
        int days;
        cout << "Enter No of Days: "; cin >> days;
        c[i]->calcRent(days);
        c[i]->Bill(days);
    }

    for(int i = 0; i < nb; i++) delete b[i];
    for(int i = 0; i < nc; i++) delete c[i];

    return 0;
}