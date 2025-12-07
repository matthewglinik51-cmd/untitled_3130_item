package Matthew_Glinik.F_generics;

public class Triple_isEqualTo_Methoods_NotInterface {
    private boolean isEqualTo(Triple_isEqualTo_Methoods_NotInterface other)
    {
        return(false);
    }

    // 3115
    public boolean equals(Triple_isEqualTo_Methoods_NotInterface other)
    {
        if(other.getClass() == Triple_isEqualTo_Methoods_NotInterface.class)
        {
            return(isEqualTo(other));
        }
        else
        {
            return(false);
        }
    }

    @Override
    public boolean equals(Object other)
    {
        if(other instanceof Triple_isEqualTo_Methoods_NotInterface)
        {
            return(equals((Triple_isEqualTo_Methoods_NotInterface) other));
        }
        else
        {
            return(false);
        }
    }
}
