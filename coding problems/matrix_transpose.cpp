#include<bits/stdc++.h>
using namespace std;
void fun(int m, int n)
{
	int a[n][m];
	for(int i=0;i<m;i++)
		for(int j=0;j<n;j++)
			cin>>a[j][i];
	for(int i=0;i<n;i++)
	for(int j=0;j<m;j++)
	cout<<a[i][j]<<' ';
	
}
int main()
{
	int m, n;
	cin >> m >> n;
	fun(m, n);
}
