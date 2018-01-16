package modelos;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.util.ArrayList;

public class Node {

    private ArrayList<Data> datas;

    @XStreamAsAttribute
    private String id;

    //para clonagem
    public Node(Node original) {
        this.id = original.getId();
        if (original.getData() != null) {
            ArrayList<Data> datasCopy = new ArrayList<>();
            for (int i = 0; i < original.getData().size(); i++) {
                Data data = new Data(original.getData().get(i));
                datasCopy.add(data);
            }
            this.datas = datasCopy;
        }
        this.datas = new ArrayList<>();

    }

    public Node(String id) {
        this.id = id;
        this.datas = new ArrayList<>();
    }

    public Node() {
        this.datas = new ArrayList<>();
    }

    public Node(ArrayList<Data> datas, String id) {
        this.datas = datas;
        this.id = id;
    }

    public ArrayList<Data> getData() {
        return datas;
    }

    public void setData(ArrayList<Data> data) {
        this.datas = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addData(Data data) {
        this.datas.add(data);
    }

    public void getData(int indice) {
        this.datas.get(indice);
    }

}
