public class Ex {
    public <E> void printArray(E[] args) {
        for (E x : args) {
            System.out.println(x);
        }
    }

    public static void main(String args[]) {
        Ex ex = new Ex();
        String s[] = {"cat", "dog", "cow"};
        ex.printArray(s);
        Integer i[] = {1, 2, 3, 4, 5};
        ex.printArray(i);
    }
}