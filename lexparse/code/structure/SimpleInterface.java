package structure;

import java.util.ArrayList;

public class SimpleInterface implements Named {
    private String interfaceName;
    private ArrayList<SimpleInterfaceMethod> methods;

    public SimpleInterface(String interfaceName, ArrayList<SimpleInterfaceMethod> methods) {
        this.interfaceName = interfaceName;
        this.methods = methods;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((interfaceName == null) ? 0 : interfaceName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SimpleInterface other = (SimpleInterface) obj;
        if (interfaceName == null) {
            if (other.interfaceName != null)
                return false;
        } else if (!interfaceName.equals(other.interfaceName))
            return false;
        return true;
    }

    public String getName() {
        return interfaceName;
    }

    public ArrayList<SimpleInterfaceMethod> getMethods() {
        return methods;
    }

    public boolean hasMethod(SimpleInterfaceMethod method){
        return methods.contains(method);
    }

    @Override
    public String toString() {
        return "SimpleInterface [interfaceName=" + interfaceName + "\n\t\tmethods=" + methods + "]";
    }
}
