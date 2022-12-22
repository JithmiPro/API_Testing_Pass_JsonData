package com.example.Pro01.DTO;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Merchant_Part7_DTO {

    private String recordType  ;
    private String recordSequence  ;
    private String discountAmount  ;
    private String freightShippingAmount  ;
    private String dutyAmount  ;
    private String destinationPostalZIPcode  ;
    private String shipPostalZIPCode  ;
    private String destinationCountry  ;
    private String vatInvoiceReference ;
    private String orderDate  ;
    private String accountNumber  ;
    private String accountNumberExtension ;
    private String freightShippingVatTax  ;
    private String freightShippingVatTaxRate  ;


    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getRecordSequence() {
        return recordSequence;
    }

    public void setRecordSequence(String recordSequence) {
        this.recordSequence = recordSequence;
    }

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getFreightShippingAmount() {
        return freightShippingAmount;
    }

    public void setFreightShippingAmount(String freightShippingAmount) {
        this.freightShippingAmount = freightShippingAmount;
    }

    public String getDutyAmount() {
        return dutyAmount;
    }

    public void setDutyAmount(String dutyAmount) {
        this.dutyAmount = dutyAmount;
    }

    public String getDestinationPostalZIPcode() {
        return destinationPostalZIPcode;
    }

    public void setDestinationPostalZIPcode(String destinationPostalZIPcode) {
        this.destinationPostalZIPcode = destinationPostalZIPcode;
    }

    public String getShipPostalZIPCode() {
        return shipPostalZIPCode;
    }

    public void setShipPostalZIPCode(String shipPostalZIPCode) {
        this.shipPostalZIPCode = shipPostalZIPCode;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public String getVatInvoiceReference() {
        return vatInvoiceReference;
    }

    public void setVatInvoiceReference(String vatInvoiceReference) {
        this.vatInvoiceReference = vatInvoiceReference;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumberExtension() {
        return accountNumberExtension;
    }

    public void setAccountNumberExtension(String accountNumberExtension) {
        this.accountNumberExtension = accountNumberExtension;
    }

    public String getFreightShippingVatTax() {
        return freightShippingVatTax;
    }

    public void setFreightShippingVatTax(String freightShippingVatTax) {
        this.freightShippingVatTax = freightShippingVatTax;
    }

    public String getFreightShippingVatTaxRate() {
        return freightShippingVatTaxRate;
    }

    public void setFreightShippingVatTaxRate(String freightShippingVatTaxRate) {
        this.freightShippingVatTaxRate = freightShippingVatTaxRate;
    }
}
