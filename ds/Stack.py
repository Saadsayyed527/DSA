class Node:
    def __init__(self, value):
        self.data = value
        self.next = None

class Stack:
    def __init__(self):
        self.top = None

    def push(self,new_node):
        if self.top is None:
            self.top = new_node
        else:
            new_node.next = self.top
            self.top = new_node

    def pop(self):
        temp = self.top
        if temp:
            self.top = temp.next  # will point to next element
            data = temp.data
            del temp  # will remove the top node
            return data
        else:
            print("Stack is empty")
            return None  # Return None if the stack is empty

    def print(self):
        temp = self.top
        print("The stack elements are: ", end="")
        while temp:
            print(temp.data, end=" ")
            temp = temp.next

    def reverse_str(self):
        st3 = Stack()
        str1 = input("Enter the string: ")
        for char in str1:
            n = Node(char)
            st3.push(n)
        temp = st3.top
        while temp:
            print(temp.data, end="")
            temp = temp.next

    def nextGr(self):
        temp = self.top
        list1 = []
        while temp:
            list1.append(temp.data)
            temp = temp.next 
        list1.sort()
        return list1.pop(-2)
    
    def sortSt(self):
        temp = self.top
        list2 = []
        while temp:
            list2.append(temp.data)
            temp = temp.next 
        list2.sort()
        self.top = None
        for item in list2:
            n = Node(item)
            self.push(n)

    def count(self):
        temp = self.top
        count = 0
        while temp:
            count +=1
            temp = temp.next
        return count

    def isEmpty(self):
        if self.top:
            return True
        else:
            return False

    
    def peek(self):
        temp = self.top
        return temp.data

    def reverse(self):
        st1 = Stack()  # create copy of stack
        temp = self.top
        while temp:
            new_node = Node(temp.data)  # create a new node with the same data
            st1.push(new_node)   # insert the new_node in the new stack
            temp = temp.next  # traverse the elements
        st1.print()   # print the new reversed stack
     
    def chk_Balance(self):
        exp = input("Enter expression: ")  # Example: {[()]}
        stack = Stack()
        brackets = {')': '(', ']': '[', '}': '{'}  # Mapping of closing to opening brackets
        opening_brackets = brackets.values()  # Set of opening brackets

        for item in exp:
            if item in opening_brackets:
                stack.push(Node(item))  # Push opening bracket onto the stack
            elif item in brackets:  # If it's a closing bracket
                if stack.isEmpty() or stack.pop().data != brackets[item]:  # Compare data of popped node
                    print("Expression is unbalanced")
                    return  # Exit early if brackets mismatch or stack is empty

        # If the stack is empty at the end, all brackets are balanced
        if stack.isEmpty():
            print("Expression is balanced")
        else:
            print("Expression is unbalanced")



st = Stack()
n1 = Node(10)
n2 = Node(20)
n3 = Node(30)
n4 = Node(40)
n5 = Node(35)
n6 = Node(25)
n7 = Node(60)

# Push elements onto the stack
st.push(n1)
st.push(n2)
st.push(n3)
st.push(n4)
st.push(n5)
st.push(n6)
st.push(n7)

# Print initial stack
print("\nInitial Stack")
st.print()
print("\n")

# Pop an element
print("\nPop an Element")
st.pop()
print("Stack after popping:")
st.print()
print("\n")

# Reverse the stack
print("\nReversed Stack")
st.reverse()
print("\n")

# Peek at the top element
print("\nPeek at the Top Element")
print(f"The top-most element in the stack is: {st.peek()}")
print("\n")

# Check if the stack is empty
print("\nStack Empty Check")
if st.isEmpty():
    print("Stack is not empty")
else:
    print("Stack is empty")
print("\n")

# Count the elements in the stack
print("\nCount Elements in Stack")
print(f"The number of elements in the stack is: {st.count()}")
print("\n")

# Reverse a string using a stack
print("\nReverse a String")
st.reverse_str()
print("\n")

# Print the stack again
print("\nCurrent Stack")
st.print()
print("\n")

# Find the next-to-greatest element in the stack
print("\nNext-to-Greatest Element")
print(f"The next-to-greatest element is: {st.nextGr()}")
print("\n")

# Print the stack again
print("\nStack Before Sorting")
st.print()
print("\n")

# Sort the stack
print("\nSorted Stack")
st.sortSt()
st.print()
print("\n")

# Check balanced parentheses
print("\nCheck Balanced Parentheses")
Stack().chk_Balance()


# st2 = Stack()
# st = Stack()
# n1 = Node(10)
# n2 = Node(20)
# n3 = Node(30)
# n4 = Node(40)
# n5 = Node(35)
# n6 = Node(25)
# n7 = Node(60)
# st.push(n1)
# st.push(n2)
# st.push(n3)
# st.push(n4)
# st.push(n5)
# st.push(n6)
# st.push(n7)
# st.print()
# print()
# print()
# st.pop()
# st.print()
# print()
# print()
# st.reverse()
# print()
# print("the top most element in the stack is: ",st.peek())
# print()
# if st2.isEmpty():
#     print("Stack is not empty")
# else:
#     print("Stack is empty")
# print()
# if st.isEmpty():
#     print("Stack is not empty")
# else:
#     print("Stack is empty")
# print()
# print("The number of elements in the stack are: ",st.count())
# st.reverse_str()
# print()
# st.print()
# print()
# print(st.nextGr())
# st.print()
# print()
# st.sortSt()
# st.print()
# Stack().chk_Balance()
# st.chk_Balance()
