#include <iostream>
using namespace std;

#define MAX_SIZE 100000

int main(){
	int Stack[MAX_SIZE];
	int K;
	int sum = 0;
	int top = -1;
	cin >> K;
	for (int i = 0; i < K; i++){
		int num;
		cin >> num;
		if (num == 0)
			top--;
		else
			Stack[++top] = num;
	}
	while (top != -1)
		sum += Stack[top--];
	cout << sum << endl;
}