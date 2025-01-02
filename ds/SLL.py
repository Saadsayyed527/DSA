class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class SinglyLinkedList:
    def __init__(self):
        self.head = None

    def append(self, data):
        new_node = Node(data)
        if not self.head:
            self.head = new_node
            return
        last = self.head
        while last.next:
            last = last.next
        last.next = new_node

    def print_list(self):
        current = self.head
        while current:
            print(current.data, end=' -> ')
            current = current.next
        print('None')

    def insert_at(self, index, data):
        new_node = Node(data)
        if index == 0:
            new_node.next = self.head
            self.head = new_node
            return
        temp = self.head
        for _ in range(index - 1):
            if not temp.next:
                break
            temp = temp.next
        new_node.next = temp.next
        temp.next = new_node

    def delete_last(self):
        if not self.head:
            return
        if not self.head.next:
            self.head = None
            return
        second_last = self.head
        while second_last.next.next:
            second_last = second_last.next
        second_last.next = None

    def search(self, key):
        current = self.head
        while current:
            if current.data == key:
                return True
            current = current.next
        return False

    def find_min_max(self):
        if not self.head:
            return None, None
        min_val = max_val = self.head.data
        current = self.head.next
        while current:
            min_val = min(min_val, current.data)
            max_val = max(max_val, current.data)
            current = current.next
        return min_val, max_val

    def count_even_odd(self):
        even = odd = 0
        current = self.head
        while current:
            if current.data % 2 == 0:
                even += 1
            else:
                odd += 1
            current = current.next
        return even, odd

    def reverse(self):
        prev = None
        current = self.head
        while current:
            next_node = current.next
            current.next = prev
            prev = current
            current = next_node
        self.head = prev

    def merge(self, other_list):
        if not self.head:
            self.head = other_list.head
            return
        last = self.head
        while last.next:
            last = last.next
        last.next = other_list.head

# Testing Singly Linked List
sll = SinglyLinkedList()
sll.append(10)
sll.append(20)
sll.append(30)
sll.print_list()
sll.insert_at(1, 15)
sll.print_list()
sll.delete_last()
sll.print_list()
print("Found 15:", sll.search(15))
print("Min and Max:", sll.find_min_max())
print("Even and Odd Counts:", sll.count_even_odd())
sll.reverse()
sll.print_list()