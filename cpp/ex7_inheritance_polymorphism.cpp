// Queue Management
// Your Queue class is up and working in a customer service company. The company opens up a new branch and asks you to make another version of the Queue for them. The only difference is the way the Queue is displayed: each number on a new line.

// You decide to create a new class called Queue2, which is derived from the Queue class and overrides the print() method, outputting each element of the queue on a new line.

#include <iostream>
using namespace std;

// Queue class 
class Queue
{
    int size;   // holds the current size of the queue
    int *queue; // array to store queue elements

public:
    // constructor initializes an empty queue with allocated memory for 100 elements
    Queue()
    {
        size = 0;
        queue = new int[100];
    }
    // add data to the queue
    virtual void add(int data)
    {
        queue[size++] = data;
    }
    // remove the first item from the queue
    virtual void remove()
    {
        if (size == 0)
        {
            cout << "Queue is empty" << endl;
            return;
        }
        for (int i = 0; i < size - 1; i++)
        {
            queue[i] = queue[i + 1];
        }
        size--;
    }
    // print the queue contents
    virtual void print()
    {
        if (size == 0)
        {
            cout << "Queue is empty" << endl;
            return;
        }
        for (int i = 0; i < size; i++)
        {
            cout << queue[i] << " <- ";
        }
        cout << endl;
    }
    // merge two queues
    Queue operator+(Queue &obj)
    {
        Queue res;
        for (int i = 0; i < this->size; i++)
        {
            res.add(this->queue[i]);
        }
        for (int i = 0; i < obj.size; i++)
        {
            res.add(obj.queue[i]);
        }
        return res;
    }
};

// Queue2 is a variant of Queue that prints each element on a new line
class Queue2
{
    int size;
    int *queue;

public:
    // constructor initializes an empty queue
    Queue2()
    {
        size = 0;
        queue = new int[100];
    }
    // add data to the queue
    void add(int data)
    {
        queue[size++] = data;
    }
    // remove the first item from the queue
    void remove()
    {
        if (size == 0)
        {
            cout << "Queue is empty" << endl;
            return;
        }
        for (int i = 0; i < size - 1; i++)
        {
            queue[i] = queue[i + 1];
        }
        size--;
    }
    // print the queue contents, each on a new line
    virtual void print()
    {
        if (size == 0)
        {
            cout << "Queue is empty" << endl;
            return;
        }
        for (int i = 0; i < size; i++)
        {
            cout << queue[i] << "\n";
        }
    }
    // merge two Queue2 instances
    Queue2 operator+(Queue2 &obj)
    {
        Queue2 res;
        for (int i = 0; i < this->size; i++)
        {
            res.add(this->queue[i]);
        }
        for (int i = 0; i < obj.size; i++)
        {
            res.add(obj.queue[i]);
        }
        return res;
    }
};

// main 
int main()
{
    Queue q1;
    q1.add(42);
    q1.add(2);
    q1.add(8);
    q1.add(1);
    q1.print(); 

    Queue2 q2;
    q2.add(3);
    q2.add(66);
    q2.add(128);
    q2.add(5);
    q2.add(111);
    q2.add(77890);
    q2.print(); 

    return 0;
}
