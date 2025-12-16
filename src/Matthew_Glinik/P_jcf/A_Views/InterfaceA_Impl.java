package Matthew_Glinik.P_jcf.A_Views;

public class InterfaceA_Impl<E> implements InterfaceA<E> {
    private E added_Element_First, seted_Element_First, seted_Element_Last, added_Element_Last;

    @Override
    public E getFirst() {
        return seted_Element_First;
    }

    @Override
    public E getLast() {
        return seted_Element_Last;
    }

    @Override
    public boolean addFirst(E given_value_to_add) {
        if(added_Element_First != null)
        {
            return false;
        }

        added_Element_First = given_value_to_add;
        return true;
    }

    @Override
    public E removeLast() {
        E return_value = (added_Element_Last);
        added_Element_Last = null;

        return return_value;
    }

    @Override
    public E removeFirst() {
        E return_value = (added_Element_First);
        added_Element_First = null;

        return return_value;
    }

    @Override
    public boolean addLast(E given_value_to_add) {
        if(added_Element_Last != null)
        {
            return false;
        }

        added_Element_Last = given_value_to_add;
        return true;
    }

    @Override
    public E setFirst(E given_value_to_set) {
        E return_value = (seted_Element_First);

        seted_Element_First = given_value_to_set;

        return return_value;
    }

    @Override
    public E setLast(E given_value_to_set) {
        E return_value = (seted_Element_Last);

        seted_Element_Last = given_value_to_set;

        return return_value;
    }
}
