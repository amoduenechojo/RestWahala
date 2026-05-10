import unittest
from stack import Stack


class TestStack(unittest.TestCase):

    def test_stack_is_empty_on_creation(self):
        stack = Stack()

        self.assertTrue(stack.is_empty())

    def test_push_adds_item(self):
        stack = Stack()

        stack.push(10)

        self.assertEqual(stack.peek(), 10)

    def test_push_multiple_items(self):
        stack = Stack()

        stack.push(1)
        stack.push(2)
        stack.push(3)

        self.assertEqual(stack.peek(), 3)

    def test_pop_removes_last_item(self):
        stack = Stack()

        stack.push(1)
        stack.push(2)

        removed = stack.pop()

        self.assertEqual(removed, 2)
        self.assertEqual(stack.size(), 1)

    def test_peek_does_not_remove_item(self):
        stack = Stack()

        stack.push(100)

        stack.peek()

        self.assertEqual(stack.size(), 1)

    def test_clear_removes_all_items(self):
        stack = Stack()

        stack.push(1)
        stack.push(2)

        stack.clear()

        self.assertTrue(stack.is_empty())

    def test_pop_empty_stack_raises_error(self):
        stack = Stack()

        with self.assertRaises(IndexError):
            stack.pop()

    def test_peek_empty_stack_raises_error(self):
        stack = Stack()

        with self.assertRaises(IndexError):
            stack.peek()

    def test_stack_allows_duplicates(self):
        stack = Stack()

        stack.push(5)
        stack.push(5)

        self.assertEqual(stack.size(), 2)

    def test_pop_until_stack_becomes_empty(self):
        stack = Stack()

        stack.push(1)
        stack.push(2)

        stack.pop()
        stack.pop()

        self.assertTrue(stack.is_empty())

    def test_clear_empty_stack(self):
        stack = Stack()

        stack.clear()

        self.assertTrue(stack.is_empty())
if __name__ == "__main__":
    unittest.main()