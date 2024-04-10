class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    // Method to add elements at the end
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to check if a number contains the digit 3
    static boolean DigitThree(int number) {
        return String.valueOf(number).contains("3");
    }

    // Method to sum primes with digit 3
    int PrimesDigitThree() {
        int sum = 0;
        Node current = head;
        while (current != null) {
            if (DigitThree(current.data)) {
                sum += current.data;
            }
            current = current.next;
        }
        return sum;
    }
}

public class PrimeList {

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 1000;
        SinglyLinkedList allPrimes = new SinglyLinkedList();

        // Fill list with prime numbers up to n
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                allPrimes.add(i);
            }
        }

        // Calculate the sum of primes with 3
        int sum = allPrimes.PrimesDigitThree();

        System.out.println("Sum of prime numbers with the digit '3' from 0 to " + n + " is: " + sum);
    }
}


