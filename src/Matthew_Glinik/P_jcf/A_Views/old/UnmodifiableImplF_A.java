package Matthew_Glinik.P_jcf.A_Views.old;

public class UnmodifiableImplF_A<E> implements InterfaceA<E> {
    private InterfaceA<E> original;

    public UnmodifiableImplF_A(InterfaceA<E> original)
    {
        this.original = original;
    }

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
        String errorMessage = "the \"unmodifiable_view()\" is used to resize. ";
        //throw new Exception(errorMessage);
        return false;
    }

    @Override
    public E removeLast() {
        String errorMessage = "the \"unmodifiable_view()\" is used to resize. ";
        //throw new Exception(errorMessage);
        return null;
    }

    @Override
    public E removeFirst() {
        String errorMessage = "the \"unmodifiable_view()\" is used to resize. ";
        //throw new Exception(errorMessage);
        return null;
    }

    @Override
    public boolean addLast(E given_value_to_add) {
        String errorMessage = "the \"unmodifiable_view()\" is used to resize. ";
        //throw new Exception(errorMessage);
        return false;
    }

    @Override
    public E setFirst(E given_value_to_set) {
        String errorMessage = "the \"unmodifiable_view()\" is used to modify. ";
        //throw new Exception(errorMessage);
        return null;
    }

    @Override
    public E setLast(E given_value_to_set) {
        String errorMessage = "the \"unmodifiable_view()\" is used to modify. ";
        //throw new Exception(errorMessage);
        return null;
    }
}
