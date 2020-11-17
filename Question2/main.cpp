
#include<iostream>
#include<stack>
#include <algorithm> // std::make_heap, std::pop_heap, std::push_heap, std::sort_heap
#include <vector> // std::vector
#include <chrono> //std::chrono;


using namespace std;
using namespace std::chrono; 

//one that declares a large array statically
void StaticArray()
{
static int arr[50000];
}


//one that declares the same large array on the stack
void StaticStack()
{
int staticIntArray[50000];//array on the stack
//int *ptrArray = new int[50000];//pointer on the stack

//nonstatic array memory allocation is done on the stack
//Apparently,internally it will 

}


void Heap()
{

//allocates a memory from the heap memory
static int *arrHeap=(int*)malloc(50000*sizeof(int));

}

int main(){
int i;
//StaticArray() 1
auto start1 = high_resolution_clock::now(); 
for(i=0;i<100000;i++){
StaticArray();
}
auto stop1 = high_resolution_clock::now();
auto duration1 = duration_cast<microseconds>(stop1 - start1);
cout << "Time taken by StaticArray function: "
         << duration1.count() << " microseconds" << endl; 
//


//StaticStack() 2
int j;
auto start2 = high_resolution_clock::now(); 
for(j=0;j<100000;j++){
StaticStack();
}
auto stop2 = high_resolution_clock::now();
auto duration2 = duration_cast<microseconds>(stop2 - start2);
cout << "Time taken by StaticStack function: "
         << duration2.count() << " microseconds" << endl; 
//


//Heap() 3
int k;
auto start3 = high_resolution_clock::now(); 
for(j=0;j<100000;j++){
Heap();
}
auto stop3 = high_resolution_clock::now();
auto duration3 = duration_cast<microseconds>(stop3 - start3);
cout << "Time taken by Heap function: "
         << duration3.count() << " microseconds" << endl; 
//
return 0;
}
