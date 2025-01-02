class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Queue:
    def __init__(self):
        self.front = self.rear = None

    # Enqueue operation: Add an element to the queue
    def enqueue(self, data):
        new_node = Node(data)
        if self.rear is None:  # If the queue is empty
            self.front = self.rear = new_node
            return
        self.rear.next = new_node  # Add new node after the rear
        self.rear = new_node  # Move rear to the new node

    # Dequeue operation: Remove an element from the queue
    def dequeue(self):
        if self.front is None:  # If the queue is empty
            print("Queue is empty!")
            return
        temp = self.front
        self.front = self.front.next
        if self.front is None:  # If the queue becomes empty after dequeue
            self.rear = None
        print(f"Dequeued: {temp.data}")
        return temp.data

    # Reverse the queue using stack
    def reverse(self):
        stack = []
        current = self.front
        while current:  # Push all elements to the stack
            stack.append(current.data)
            current = current.next
        # Pop elements from stack and enqueue them
        while stack:
            self.enqueue(stack.pop())

    # Count occurrences of a particular element in the queue
    def count_occurrences(self, value):
        count = 0
        current = self.front
        while current:
            if current.data == value:
                count += 1
            current = current.next
        return count

    # Search for an element in the queue
    def search(self, value):
        current = self.front
        while current:
            if current.data == value:
                return True
            current = current.next
        return False

    # Merge two queues into one
    def merge(self, other_queue):
        if not self.front:  # If the first queue is empty, just use the second queue
            self.front = other_queue.front
            self.rear = other_queue.rear
            return
        # Otherwise, append the second queue to the end of the first queue
        self.rear.next = other_queue.front
        if other_queue.rear:
            self.rear = other_queue.rear

    # Check if two queues are identical
    def are_identical(self, other_queue):
        current1 = self.front
        current2 = other_queue.front
        while current1 and current2:
            if current1.data != current2.data:
                return False
            current1 = current1.next
            current2 = current2.next
        # If both are None, then the queues are identical
        return current1 is None and current2 is None

    # Print the queue
    def print_queue(self):
        if not self.front:
            print("Queue is empty!")
            return
        current = self.front
        while current:
            print(current.data, end=" -> ")
            current = current.next
        print("None")

# Testing the Queue
q1 = Queue()
q1.enqueue(10)
q1.enqueue(20)
q1.enqueue(30)
q1.print_queue()

q1.dequeue()  # Remove element 10
q1.print_queue()

q1.reverse()  # Reverse the queue
q1.print_queue()

print("Occurrences of 20:", q1.count_occurrences(20))
print("Is 20 in the queue?", q1.search(20))

# Create another queue
q2 = Queue()
q2.enqueue(40)
q2.enqueue(50)
q2.enqueue(60)

# Merge q1 and q2
q1.merge(q2)
q1.print_queue()

# Check if q1 and q2 are identical
print("Are q1 and q2 identical?", q1.are_identical(q2))
