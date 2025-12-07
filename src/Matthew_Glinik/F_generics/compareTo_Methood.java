package Matthew_Glinik.F_generics;

public interface compareTo_Methood<E> extends Triple_isEqualTo_Methoods<E>, Triple_isGreaterThan_Methoods<E>, Triple_isLessThan_Methoods<E>, Comparable<E> {
    // 1115
    boolean isEqualTo(E other);
    boolean isGreaterThan(E other);
    boolean isLessThan(E other);

    // 3130 methood
    default int compareTo(E o)
    {
        if(equals(o, (true)))
        {
            return(0);
        }
        else if(greaterThan_s(o, (false)))
        {
            return(1);
        }
        else if(lessThan_s(o, (false)))
        {
            return(-1);
        }

        int return_value = (getComparasionNumber(o));
        if(return_value != 0)
        {
            return(return_value);
        }
        else
        {
            return(getFilterNumber(o));
        }
    }

    /*
    // 3130 (Winter)
    int getComparasionNumber(E o);
    int getFilterNumber(E o);
    */

    // 3130 (Views)
    default int getComparasionNumber(E o)
    {
        return((new compareTo_Methood_Class<E>()).getComparasionNumber(o));
    }
    default int getFilterNumber(E o)
    {
        return((new compareTo_Methood_Class<E>()).getFilterNumber(o));
    }

    class compareTo_Methood_Class<E>
    {
        private int comparasionNumber = 0, filterNumber = -1;
        public int getComparasionNumber(E o)
        {
            return(comparasionNumber);
        }
        public int getFilterNumber(E o)
        {
            return(filterNumber);
        }
    }
}
