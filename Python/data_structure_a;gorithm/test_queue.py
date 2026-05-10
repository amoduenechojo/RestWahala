import unittest
from queue_ds import Queue


class TestQueue(unittest.TestCase):

    def test_queue_is_empty_on_creation(self):
        queue = Queue()

        self.assertTrue(queue.is_empty())

    def test_enqueue_adds_item(self):
        queue = Queue()

        queue.enqueue(10)

        self.assertEqual(queue.peek(), 10)

    def test_queue_follows_FIFO(self):
        queue = Queue()

        queue.enqueue(1)
        queue.enqueue(2)
        queue.enqueue(3)

        removed = queue.dequeue()

        self.assertEqual(removed, 1)

    def test_size_updates_correctly(self):
        queue = Queue()

        queue.enqueue(1)
        queue.enqueue(2)

        self.assertEqual(queue.size(), 2)

    def test_clear_empties_queue(self):
        queue = Queue()

        queue.enqueue(1)

        queue.clear()

        self.assertTrue(queue.is_empty())

    def test_dequeue_empty_queue_raises_error(self):
        queue = Queue()

        with self.assertRaises(IndexError):
            queue.dequeue()


if __name__ == "__main__":
    unittest.main()