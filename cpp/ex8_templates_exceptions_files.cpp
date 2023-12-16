// Queue Management
// It's time to update your Queue management system. The previous version supports only integer numbers and we need to support more types, such as strings, to store customer names in the queue.

// Transform the given Queue class to a class template, which can work with different data types.

#include <iostream>
using namespace std; 

template <class T>
class Queue { 
	public:
        // constructor
        Queue() { 
            size = 0;
            queue = new T[100];
        }

        //member functions
        /////////////////
        //adds instance of data type to que
        void add(T data) { 
            queue[size] = data; 
            size++;
        }

        // prints list 
        void print() { 
            if (size == 0) { 
                cout << "Queue is empty"<<endl; 
                return; 
            } 
            for (int i = 0; i < size; i++) { 
                cout<<queue[i]<<" <- ";
            } 
            cout << endl;
        }
    int size; 
	T* queue; 
}; 

// driver code
//////////////
int main() { 
	Queue<int> q1; 
	q1.add(42); q1.add(2); q1.add(8);  q1.add(1);
	q1.print();
    
	Queue<string> q2;
	q2.add("Dave"); q2.add("John"); q2.add("Amy");
	q2.print();

	return 0; 
}// end main

    // template <class T>
	// Queue<T>::Queue() { 
	// 	// size = 0;
	// 	// queue = new int[100];
	// }