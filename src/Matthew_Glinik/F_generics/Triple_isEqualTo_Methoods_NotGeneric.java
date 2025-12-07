package Matthew_Glinik.F_generics;

public interface Triple_isEqualTo_Methoods_NotGeneric {
    // 1115
    boolean isEqualTo(isEqualTo_NotGeneric other);

    // 3115
    default boolean equals(isEqualTo_NotGeneric other)
    {
        if(other.getClass() == isEqualTo_NotGeneric.class)
        {
            return(isEqualTo(other));
        }
        else
        {
            return(false);
        }
    }

    @Override
    default boolean equals(Object other)
    {
        if(other instanceof isEqualTo_NotGeneric)
        {
            return(equals((isEqualTo_NotGeneric) other));
        }
        else
        {
            return(false);
        }
    }
}

