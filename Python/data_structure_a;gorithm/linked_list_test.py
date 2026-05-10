import unittest
from linked_list import LinkedList


class TestLinkedList(unittest.TestCase):

    def test_add_first_node(self):
        linked_list = LinkedList()

        linked_list.add(10)

        self.assertEqual(linked_list.head.data, 10)

    def test_add_multiple_nodes(self):
        linked_list = LinkedList()

        linked_list.add(1)
        linked_list.add(2)

        self.assertEqual(linked_list.size(), 2)

    def test_find_existing_node(self):
        linked_list = LinkedList()

        linked_list.add(50)

        self.assertTrue(linked_list.find(50))

    def test_find_missing_node(self):
        linked_list = LinkedList()

        self.assertFalse(linked_list.find(100))

    def test_remove_node(self):
        linked_list = LinkedList()

        linked_list.add(1)
        linked_list.add(2)

        linked_list.remove(1)

        self.assertFalse(linked_list.find(1))

    def test_remove_missing_node_raises_error(self):
        linked_list = LinkedList()

        with self.assertRaises(ValueError):
            linked_list.remove(10)

    def test_clear_empties_list(self):
        linked_list = LinkedList()

        linked_list.add(1)

        linked_list.clear()

        self.assertTrue(linked_list.is_empty())


if __name__ == "__main__":
    unittest.main()