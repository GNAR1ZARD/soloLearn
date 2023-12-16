// Queue Management
// We continue to develop our Queue management system that we made in the previous module.
// You are asked to add a new functionality: adding two queues together. The result should be a new queue, where the elements of the first queue come first, followed by the second queue's elements.

// Given the Queue class, overload the + operator, so that the code in main works and successfully adds two queues.

// The overloaded operator should return

#include <iostream>
using namespace std;

class Queue
{
    int size;
    int *queue;
    int count = 0;

public:
    Queue() : size(0), queue(new int[100]) {}

    void add(int data)
    {
        queue[size] = data;
        size++;
    } // end func

    void remove()
    {
        if (size == 0)
        {
            cout << "Queue is empty" << endl;
            return;
        }
        else
        {
            for (int i = 0; i < size - 1; i++)
            {
                queue[i] = queue[i + 1];
            }
            size--;
        }
    } // end func

    void print()
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
        std::cout << endl;
    } // end func

    //  const Iterator& operator ++(int);//done
    // add second element list to end of first element list
    Queue operator+(Queue &secondList)
    {
        for (int i = 0; i < 4; i++)
        {
            // cout << secondList.queue[i] << " <- ";
            this->add(secondList.queue[i]);
            // std::cout << "size: " << size << "\n";
        }
        std::cout << endl;
        return (*this);
    }
};

int main()
{
    Queue q1;
    q1.add(42);
    q1.add(2);
    q1.add(8);
    q1.add(1);
    // q1.print();
    Queue q2;
    q2.add(3);
    q2.add(66);
    q2.add(128);
    q2.add(5);
    Queue q3 = q1 + q2;
    q3.print();

    return 0;
}