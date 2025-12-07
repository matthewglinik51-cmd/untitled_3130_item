package Matthew_Glinik.F_generics;

public interface Triple_isEqualTo_Methoods<E> {
    // 1115
    boolean isEqualTo(E other);

    // 3115 (3115+)
    default boolean equals(E other, boolean given_isEqualTo_Value)
    {
        if(other.getClass() = E.class)
        {
            return((given_isEqualTo_Value) && (isEqualTo(other)));
        }
        else
        {
            return(false);
        }
    }

    // 3115+: need boolean value to overload the methood in generics .
    /*
    default boolean equals(Object other)
    {
        if(other instanceof E)
        {
            return(equals(((E) other), (true)));
        }
        else
        {
            return(false);
        }
    }
    */
}
