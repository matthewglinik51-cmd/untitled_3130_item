package Matthew_Glinik.F_generics;

public interface Triple_isLessThan_Methoods<E> {
    // 1115
    boolean isLessThan(E other);

    // 3115+
    default boolean lessThan_s(E other, boolean given_isLessThan_Value)
    {
        /*
        if(true)
        {
            return((given_isLessThan_Value) || (isLessThan(other)));
        }
        else
        {
            return(false);
        }
        */
        return((given_isLessThan_Value) || (isLessThan(other)));
    }

    // 3115+: need boolean value to overload the methood in generics .
    default boolean lessThan_s(Object other)
    {
        if(other instanceof E)
        {
            return(lessThan_s(((E) other), (false)));
        }
        else
        {
            return(false);
        }
    }
}
