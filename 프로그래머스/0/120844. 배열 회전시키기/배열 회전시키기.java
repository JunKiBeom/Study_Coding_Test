import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public Deque<Integer> solution(int[] numbers, String direction) {
        int[] answer = {};
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i : numbers)
            deque.add(i);

        if (direction.equals("right")) {
            int tmp = deque.removeLast();
            deque.addFirst(tmp);
        }
        else {
            int tmp = deque.removeFirst();
            deque.addLast(tmp);
        }

        return deque;
    }
}