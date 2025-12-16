package Matthew_Glinik.P_jcf.A_Views;

public class InterfaceA_Demo {
    public static void main(String[] args)
    {
        InterfaceA<Integer> InterfaceA_E = new InterfaceA_Impl<>();
        InterfaceA_E.setLast(10);
        InterfaceA_E.setFirst(5);
        InterfaceA_E.addLast(20);
        InterfaceA_E.addFirst(23);
        InterfaceA<Integer> InterfaceA_E_VIEW = InterfaceA_E.view();
        InterfaceA<Integer> InterfaceA_E_VIEW_unmodifiable = InterfaceA_E_VIEW.unmodifiable_view();
        InterfaceA<Integer> InterfaceA_E_VIEW_modifiable = InterfaceA_E_VIEW.modifiable_view();
        InterfaceA<Integer> InterfaceA_E_VIEW_resizeable = InterfaceA_E_VIEW.resizeable_view();
    }
}
