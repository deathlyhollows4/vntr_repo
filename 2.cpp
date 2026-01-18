#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
   int arr[n];
    
    for(int i = 0; i<n; i++){
        cin>>arr[i];
    }

    int hash[15] = {0};

    for(int i = 0; i<n; i++){
        hash[arr[i]] += 1;
    }

    int query;
    cin>>query;

    cout<<hash[query];

}