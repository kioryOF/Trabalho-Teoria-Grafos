package modelos;

public class Key {
    
    private String id;
    private String paraObjeto;
    private String attributeName;
    private String attributeType;
    private String defaultType;
    
    public Key(Key original){
        this.id = original.getId();
        this.paraObjeto = original.getParaObjeto();
        this.attributeName = original.getAttributeName();
        this.attributeType = original.getAttributeType();
        this.defaultType = original.getDefaultType();
    }
    
    public Key(){
        
    }

    public Key(String id, String paraObjeto, String attributeName, String attributeType) {
        this.id = id;
        this.paraObjeto = paraObjeto;
        this.attributeName = attributeName;
        this.attributeType = attributeType;
    }

    public String getDefaultType() {
        return defaultType;
    }

    public void setDefaultType(String defaultType) {
        this.defaultType = defaultType;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParaObjeto() {
        return paraObjeto;
    }

    public void setParaObjeto(String paraObjeto) {
        this.paraObjeto = paraObjeto;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }
    
}
