import java.util.LinkedList;

public class ReverseDigits {
    public LinkedList<Integer> addTwoNumbers(LinkedList<Integer> first, LinkedList<Integer> second) {
        LinkedList<Integer> result = new LinkedList<>();
        int temp = 0;

        while (!first.isEmpty() || !second.isEmpty() || temp != 0) {
            int x = first.isEmpty() ? 0 : first.removeFirst();
            int y = second.isEmpty() ? 0 : second.removeFirst();

            int sum = x + y + temp;
            temp = sum / 10;
            result.addLast(sum % 10);
        }
        return result;
    }

    public static void main(String[] args) {
        ReverseDigits instance = new ReverseDigits();

        LinkedList<Integer> first = new LinkedList<>();
        first.add(3);
        first.add(2);
        first.add(1);

        LinkedList<Integer> second = new LinkedList<>();
        second.add(6);
        second.add(5);
        second.add(4);

        LinkedList<Integer> result = instance.addTwoNumbers(first, second);

        System.out.print("The result might be: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

}
