package Matthew_Glinik.P_jcf.A_Views;

public class InterfaceA_Demo {
    static void main()
    {
        InterfaceA<Integer> InterfaceA_E = new InterfaceA_Impl<>();
        InterfaceA_E.setLast(10);
        InterfaceA_E.setFirst(5);
        InterfaceA_E.addLast(20);
        InterfaceA_E.addFirst(23);
    }
}
