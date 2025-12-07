package Matthew_Glinik.F_generics;

public interface compareTo_Methood<E> extends Triple_isEqualTo_Methoods<E>, Triple_isGreaterThan_Methoods<E>, Triple_isLessThan_Methoods<E>, Comparable<E> {
    // 1115
    boolean isEqualTo(E other);
    boolean isGreaterThan(E other);
    boolean isLessThan(E other);

    // 3130 methood
    default int compareTo(E o)
    {
        if(equals(o))
        {
            return(0);
        }
        else if(greaterThan_s(o))
        {
            return(1);
        }
        else if(lessThan_s(o))
        {
            return(-1);
        }
    }
}
