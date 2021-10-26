public class problem4 {

    public static void main(String[] args) {
        DLLList<Integer> list = new DLLList<>();
        list.addLast(1);
        list.addLast(5);
        list.addLast(6);
        list.addLast(3);
        list.addLast(2);
        list.addLast(4);

        while (list.hasNext())
        {
            System.out.println(list.next());
        }
    }

}
