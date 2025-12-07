package Matthew_Glinik.P_jcf.A_Views;

public class ModifiableImplF_A<E> implements InterfaceA<E> {
    // private E[] elements;

    private InterfaceA<E> original;

    public ModifiableImplF_A(InterfaceA<E> original)
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
        String errorMessage = "the \"modifiable_view()\" is used to resize. ";
        throw new Exception(errorMessage);
    }

    @Override
    public E removeLast() {
        String errorMessage = "the \"modifiable_view()\" is used to resize. ";
        throw new Exception(errorMessage);
    }

    @Override
    public E removeFirst() {
        String errorMessage = "the \"modifiable_view()\" is used to resize. ";
        throw new Exception(errorMessage);
    }

    @Override
    public boolean addLast(E given_value_to_add) {
        String errorMessage = "the \"modifiable_view()\" is used to resize. ";
        throw new Exception(errorMessage);
    }

    @Override
    public E setFirst(E given_value_to_set) {
        return this.original.setFirst(given_value_to_set);
    }

    @Override
    public E setLast(E given_value_to_set) {
        return this.original.setLast(given_value_to_set);
    }
}
