#include<iostream>
#include<fstream>
#include<cstdio>
using namespace std;
class boys;
class girls
{
char data1[100];
char name1[100];
int attractiveness1;
int intelligence1;

public:
void gnames()
{
ifstream myfile;
myfile.open("girls.txt",ios::in);
if(myfile.is_open()){
while(!myfile.eof() ){
myfile>> data1;
cout<<data1<<'\n';
}
}
myfile.close();
}

friend void pairing(girls ,boys);
};                                       


class boys
{
char data2[100];
char name2[100];
int attractiveness2;
int intelligence2;
public:
void bnames()
{
ifstream myfile;
myfile.open("boys.txt",ios::in);
if(myfile.is_open()){
while(!myfile.eof()){
myfile>>data2;
cout<<data2<<'\n';
}
}
myfile.close();
}
friend void pairing(girls,boys);

};

void pairing(girls g,boys b)
{
ifstream myfile1,myfile2;
myfile1.open("girls.txt",ios::in);
myfile2.open("boys.txt",ios::in);
if(myfile1.is_open() && myfile2.is_open())
{
myfile1>>g.data1;
myfile2>>b.data2;
cout<<g.data1 <<'\t'<< b.data2<<'\n';
while(!myfile1.eof() && !myfile2.eof() )
{
myfile1>>g.data1;
myfile2>>b.data2;
cout<<g.data1 <<'\t'<< b.data2<<'\n';
}
}
}

int main()
{
girls g;
boys b;
//g.gnames();
//b.bnames();
pairing(g,b);
return 0;
}
   
