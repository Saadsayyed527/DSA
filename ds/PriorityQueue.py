class Node:
    def __init__(self, data, priority):
        self.data = data
        self.priority = priority
        self.next = None


class PriorityQueue:
    def __init__(self):
        self.front = self.rear = None

    def enqueue(self, new_node):
        if self.front is None or new_node.priority > self.front.priority:
            new_node.next = self.front
            self.front = new_node
        else:
            temp = self.front
            while temp.next and temp.next.priority >= new_node.priority:
                temp = temp.next
            new_node.next = temp.next
            temp.next = new_node

    def peek(self):
        temp = self.front
        print(f"The node with highest priority is {temp.data} with priority of {temp.priority}")

    def print(self):
        temp = self.front
        while temp:
            print(f"({temp.data},{temp.priority}) ->", end=" ")
            temp = temp.next
        print()

    def dequeue_HP(self):
        if self.front:
            highest_priority_node = self.front
            self.front = self.front.next
            print(f"Dequeued element with highest priority: {highest_priority_node.data}")
            return highest_priority_node.data
        else:
            print("Queue is empty")

    # def dequeue(self):  # for deleting node in queue
    #     if self.rear is not None:
    #         temp = self.front
    #         print(f"The deleted node is {temp.data}")
    #         self.front = self.front.next
    #         if self.front is None:  # for deleting last node in queue
    #             self.rear = None
    #         del temp
    #     else:
    #         print("Queue is empty")


q1 = PriorityQueue()
n1 = Node(10, 8)
n2 = Node(20, 4)
n3 = Node(30, 10)
n4 = Node(40, 7) 
q1.enqueue(n1)
q1.enqueue(n2)
q1.enqueue(n3)
q1.enqueue(n4)
q1.print()
q1.peek()
print()
q1.dequeue_HP()
# q1.dequeue()  # will delete the queue with the lowest priority
q1.print()


