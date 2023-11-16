package dbtype;

import java.util.Comparator;
import java.util.List;

public class OrderEnforcer implements Comparator<RowField>{
    private final List<RowField> idealOrder;

    public List<RowField> getIdealOrder() {
        return idealOrder;
    }

    public OrderEnforcer(List<RowField> idealOrder){
        this.idealOrder = idealOrder;
    }

    @Override
    public int compare(RowField arg0, RowField arg1) {
        int arg0position = idealOrder.indexOf(arg0);
        int arg1position = idealOrder.indexOf(arg1);

        // positions must be valid, else calling program made a Logical error or json file is corrupted
        assert(arg0position != -1 && arg1position != -1);

        return arg0position - arg1position;
    }
    
}
