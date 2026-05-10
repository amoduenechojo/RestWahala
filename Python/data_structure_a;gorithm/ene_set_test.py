import unittest
from ene_set import Set


class TestSet(unittest.TestCase):

    def test_add_item(self):
        my_set = CustomSet()

        my_set.add(10)

        self.assertTrue(my_set.contains(10))

    def test_duplicate_not_added(self):
        my_set = CustomSet()

        my_set.add(10)
        my_set.add(10)

        self.assertEqual(my_set.size(), 1)

    def test_remove_item(self):
        my_set = CustomSet()

        my_set.add(5)

        my_set.remove(5)

        self.assertFalse(my_set.contains(5))

    def test_remove_missing_item_raises_error(self):
        my_set = CustomSet()

        with self.assertRaises(KeyError):
            my_set.remove(100)

    def test_clear_empties_set(self):
        my_set = CustomSet()

        my_set.add(1)

        my_set.clear()

        self.assertTrue(my_set.is_empty())


if __name__ == "__main__":
    unittest.main()