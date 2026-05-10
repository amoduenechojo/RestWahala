class Set:

    def __init__(self):
        self.items = []

    def add(self, item):
        if item not in self.items:
            self.items.append(item)

    def remove(self, item):
        if item not in self.items:
            raise KeyError("Item not found")

        self.items.remove(item)

    def contains(self, item):
        return item in self.items

    def is_empty(self):
        return len(self.items) == 0

    def size(self):
        return len(self.items)

    def clear(self):
        self.items.clear()