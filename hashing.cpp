#include <iostream>
using namespace std;

int main() {
    int n;
    cout<< "define array size: ";
    cin >> n;
    int arr[n];
    
    for(int i = 0; i<n; i++){
        cout<<i+1<<": ";
        cin>>arr[i];
        cout<<endl;
    }

    int hash[15] = {0};

    for(int i = 0; i<n; i++){
        hash[arr[i]] += 1;
    }

    int query;
    cout<<"how many x: input(x) ";
    cin>>query;

    cout<<hash[query];

}