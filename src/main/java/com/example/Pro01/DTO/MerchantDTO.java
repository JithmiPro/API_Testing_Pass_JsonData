package com.example.Pro01.DTO;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MerchantDTO {

private String merchantId;
private String merchantPwd;
private String merchantKey;
private String merchantTxnId;
private String txnType;
private String txnAmt;
private String currCode;
private String instrumentType;
private String productType;
private String cardHolderName;
private String token;
private String body;

    public MerchantDTO(String merchantId, String merchantPwd, String merchantKey, String merchantTxnId, String txnType, String txnAmt, String currCode, String instrumentType, String productType, String cardHolderName, String token, String body) {
        this.merchantId = merchantId;
        this.merchantPwd = merchantPwd;
        this.merchantKey = merchantKey;
        this.merchantTxnId = merchantTxnId;
        this.txnType = txnType;
        this.txnAmt = txnAmt;
        this.currCode = currCode;
        this.instrumentType = instrumentType;
        this.productType = productType;
        this.cardHolderName = cardHolderName;
        this.token = token;
        this.body = body;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantPwd() {
        return merchantPwd;
    }

    public void setMerchantPwd(String merchantPwd) {
        this.merchantPwd = merchantPwd;
    }

    public String getMerchantKey() {
        return merchantKey;
    }

    public void setMerchantKey(String merchantKey) {
        this.merchantKey = merchantKey;
    }

    public String getMerchantTxnId() {
        return merchantTxnId;
    }

    public void setMerchantTxnId(String merchantTxnId) {
        this.merchantTxnId = merchantTxnId;
    }

    public String getTxnType() {
        return txnType;
    }

    public void setTxnType(String txnType) {
        this.txnType = txnType;
    }

    public String getTxnAmt() {
        return txnAmt;
    }

    public void setTxnAmt(String txnAmt) {
        this.txnAmt = txnAmt;
    }

    public String getCurrCode() {
        return currCode;
    }

    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
