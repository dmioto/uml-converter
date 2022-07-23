package br.com.unesp.uml_converter.models;

import java.util.List;

public class BaseClass {
    
    private String objectName;
    private List<BaseAttr> attributes;

    public BaseClass(String objectName, List<BaseAttr> attributes) {
        this.objectName = objectName;
        this.attributes = attributes;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public List<BaseAttr> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<BaseAttr> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "BaseClass{" + "objectName=" + objectName + ", attributes=" + attributes.toString() + '}';
    }
    
}
