/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author kaiqu
 */
public class No {
    private Object object;
    private No proxNo;
    
    public No(Object object, No proxNo){
        this.object = object;
        this.proxNo = proxNo;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public No getProxNo() {
        return proxNo;
    }

    public void setProxNo(No proxNo) {
        this.proxNo = proxNo;
    }
}
