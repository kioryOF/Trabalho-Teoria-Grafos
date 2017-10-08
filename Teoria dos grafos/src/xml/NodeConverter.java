
package xml;

import com.thoughtworks.xstream.converters.SingleValueConverter;
import modelos.Node;

public class NodeConverter implements SingleValueConverter {

    @Override
    public String toString(Object o) {
        return ((Node) o).getId();
    }

    @Override
    public Object fromString(String string) {
        return new Node(string);
    }

    @Override
    public boolean canConvert(Class type) {
        return type.equals(Node.class);
    }

}
