import java.util.*;

class MedianFinder {

    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;

    public MedianFinder() {

        // Max Heap
        left = new PriorityQueue<>(Collections.reverseOrder());

        // Min Heap
        right = new PriorityQueue<>();
    }

    public void addNum(int num) {

        // First put into left
        left.add(num);

        // Move largest from left to right
        right.add(left.poll());

        // Keep left having equal or one extra element
        if (right.size() > left.size()) {
            left.add(right.poll());
        }
    }

    public double findMedian() {

        // Odd number of elements
        if (left.size() > right.size()) {
            return left.peek();
        }

        // Even number of elements
        return (left.peek() + right.peek()) / 2.0;
    }
}