package model.adt;


public class Lattice {
    public static Security_Class computeLeastUpperBound(Security_Class a,Security_Class b){
        if(a==Security_Class.SECRET || b==Security_Class.SECRET)
            return Security_Class.SECRET;
        return Security_Class.PUBLIC;
    }

    public static boolean isFlowSecure(Security_Class a,Security_Class b){
        return (a==b) || (a==Security_Class.PUBLIC && b==Security_Class.SECRET);
    }
}
