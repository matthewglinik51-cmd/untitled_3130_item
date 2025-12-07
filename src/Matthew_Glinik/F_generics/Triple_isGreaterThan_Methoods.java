package Matthew_Glinik.F_generics;

public interface Triple_isGreaterThan_Methoods<E> {
    // 1115
    boolean isGreaterThan(E other);

    // 3115+
    default boolean greaterThan_s(E other, boolean given_isGreaterThan_Value)
    {
        /*
        if(true)
        {
            return((given_isGreaterThan_Value) || (isGreaterThan(other)));
        }
        else
        {
            return(false);
        }
        */
        return((given_isGreaterThan_Value) || (isGreaterThan(other)));
    }

    // 3115+: need boolean value to overload the methood in generics .
    /*
    default boolean greaterThan_s(Object other)
    {
        if(other instanceof E)
        {
            return(greaterThan_s(((E) other), (false)));
        }
        else
        {
            return(false);
        }
    }
    */
}
