class Node:

    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:

    def __init__(self):
        self.head = None
        self.count = 0

    def add(self, data):
        new_node = Node(data)

        if self.head is None:
            self.head = new_node
        else:
            current = self.head

            while current.next:
                current = current.next

            current.next = new_node

        self.count += 1

    def find(self, data):
        current = self.head

        while current:
            if current.data == data:
                return True

            current = current.next

        return False

    def remove(self, data):

        if self.head is None:
            raise ValueError("List is empty")

        if self.head.data == data:
            self.head = self.head.next
            self.count -= 1
            return

        current = self.head

        while current.next:
            if current.next.data == data:
                current.next = current.next.next
                self.count -= 1
                return

            current = current.next

        raise ValueError("Node not found")

    def size(self):
        return self.count

    def is_empty(self):
        return self.count == 0

    def clear(self):
        self.head = None
        self.count = 0