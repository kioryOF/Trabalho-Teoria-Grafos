/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

public class Data {

    private String keyId;
    private String data;

    public Data(Data original) {
        if (original.getData() != null) {
            this.data = original.getData();
        }
        if (original.getKeyId() != null) {
            this.keyId = original.getKeyId();
        }

    }

    public Data() {

    }

    public Data(String keyId, String data) {
        this.keyId = keyId;
        this.data = data;
    }

    public Data(String data) {
        this.data = data;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
