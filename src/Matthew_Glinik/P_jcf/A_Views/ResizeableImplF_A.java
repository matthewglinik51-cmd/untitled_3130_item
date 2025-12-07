package Matthew_Glinik.P_jcf.A_Views;

public class ResizeableImplF_A<E> implements InterfaceA<E> {
    @Override
    public E getFirst() {
        return this.original.getFirst();
    }

    @Override
    public E getLast() {
        return this.original.getLast();
    }

    @Override
    public boolean addFirst(E given_value_to_add) {
        return this.original.addFirst(given_value_to_add);
    }

    @Override
    public E removeLast() {
        return this.original.removeLast();
    }

    @Override
    public E removeFirst() {
        return this.original.removeFirst();
    }

    @Override
    public boolean addLast(E given_value_to_add) {
        return this.original.addLast(given_value_to_add);
    }

    @Override
    public E setFirst(E given_value_to_set) {
        return this.original.setFirst(given_value_to_set);
    }

    @Override
    public E setLast(E given_value_to_set) {
        return this.original.setLast(given_value_to_set);
    }

    /*
    public class Node<E>
    {
        Node<E> previous;
        E data;
        Node<E> next;

        public Node(E data)
        {
            this(null, data, null);
        }

        public Node(Node<E> previous, E data, Node<E> next)
        {
            this.previous = previous;
            this.data = data;
            this.next = next;
        }
    }

    private Node<E> head, tail;
    */

    private InterfaceA<E> original;

    public ResizeableImplF_A(InterfaceA<E> original)
    {
        this.original = original;
    }
}
