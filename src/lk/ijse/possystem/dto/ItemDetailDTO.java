/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.possystem.dto;

/**
 *
 * @author Jaliya Roshen
 */
public class ItemDetailDTO {
    
    private String OId;
    private String ICode;
    private int qty;
    private double unitprice;

    public ItemDetailDTO() {
    }

    public ItemDetailDTO(String OId, String ICode, int qty, double unitprice) {
        this.OId = OId;
        this.ICode = ICode;
        this.qty = qty;
        this.unitprice = unitprice;
    }

    /**
     * @return the OId
     */
    public String getOId() {
        return OId;
    }

    /**
     * @param OId the OId to set
     */
    public void setOId(String OId) {
        this.OId = OId;
    }

    /**
     * @return the ICode
     */
    public String getICode() {
        return ICode;
    }

    /**
     * @param ICode the ICode to set
     */
    public void setICode(String ICode) {
        this.ICode = ICode;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the unitprice
     */
    public double getUnitprice() {
        return unitprice;
    }

    /**
     * @param unitprice the unitprice to set
     */
    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    @Override
    public String toString() {
    return "ItemDetailDTO{" + "OId=" + OId + ", ICode=" + ICode + ", qty=" + qty + ", unitPrice=" + unitprice + '}';
    }
     
    
    
    
}
