class Bst:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

    def insert(self, new_node):
        if self.data > new_node.data:
            if self.left is None:
                print(f"Node {new_node.data} inserted successfully on the left of {self.data}")
                self.left = new_node
            else:
                self.left.insert(new_node)
        else:
            if self.right is None:
                print(f"Node {new_node.data} inserted successfully on the right of {self.data}")
                self.right = new_node
            else:
                self.right.insert(new_node)

    def minimum_value(self):
        if self.left is None:
            print(f"Minimum value: {self.data}")
            return self.data
        return self.left.minimum_value()

    def maximum_value(self):
        if self.right is None:
            print(f"Maximum value: {self.data}")
            return self.data
        return self.right.maximum_value()

    def search_node(self, target, level=1):
        if self.data == target:
            print(f"Node {target} found at level {level}")
            return level
        elif self.data > target:
            if self.left:
                return self.left.search_node(target, level + 1)
            else:
                print(f"Node {target} not found")
                return None
        else:
            if self.right:
                return self.right.search_node(target, level + 1)
            else:
                print(f"Node {target} not found")
                return None 

    def count_nodes(self):
        left_count = self.left.count_nodes() if self.left else 0
        right_count = self.right.count_nodes() if self.right else 0
        return 1 + left_count + right_count

    def count_left_subtree(self):
        if self.left is None:
            return 0
        return self.left.count_nodes()

    def count_right_subtree(self):
        if self.right is None:
            return 0
        return self.right.count_nodes()


# Example Usage:
root = Bst(15)
root.insert(Bst(10))
root.insert(Bst(20))
root.insert(Bst(30))
root.insert(Bst(40))
root.insert(Bst(50))
root.insert(Bst(60))

# Minimum and maximum value
root.minimum_value()
root.maximum_value()

# Search for a node
root.search_node(20)

# Count total nodes and subtree nodes
total_nodes = root.count_nodes()
left_subtree_nodes = root.count_left_subtree()
right_subtree_nodes = root.count_right_subtree()

print(f"Total number of nodes in the tree: {total_nodes}")
print(f"Number of nodes in the left subtree: {left_subtree_nodes}")
print(f"Number of nodes in the right subtree: {right_subtree_nodes}")