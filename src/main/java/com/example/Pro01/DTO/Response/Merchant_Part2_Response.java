package com.example.Pro01.DTO.Response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Merchant_Part2_Response {

    public String ruleTrn;

    public String merchantVar1;
    public String merchantVar2;
    public String merchantVar3;
    public String merchantVar4;
    public String recurringPayment;
    public String recurringPmtFlag;
    public String recurringSeqNo;
    public String recurringRemark;
    public String requestToken;
    public String overrideReturnServiceURL;
    public String version;

    public String deviceType;
    public String ruleCom;
    public String cookiesEnabled;
    public String browserName;

    public String ipAddress;
    public String trueIpAddress;
    public String latitude;
    public String longitude;

    public String countryCode;
//public String deviceType;

    public String country;
    public String zipCode;
    public String streetAddress1;
    public String streetAddress2;

    public String cityOrTown;
    public String firstName;
    public String lastName;
    public String companyName;

    public String state;
    public String phoneNumber;
    public String email;

    public Merchant_Part2_Response(String ruleTrn, String merchantVar1, String merchantVar2, String merchantVar3, String merchantVar4, String recurringPayment, String recurringPmtFlag, String recurringSeqNo, String recurringRemark, String requestToken, String overrideReturnServiceURL, String version, String deviceType, String ruleCom, String cookiesEnabled, String browserName, String ipAddress, String trueIpAddress, String latitude, String longitude, String countryCode, String country, String zipCode, String streetAddress1, String streetAddress2, String cityOrTown, String firstName, String lastName, String companyName, String state, String phoneNumber, String email) {
        this.ruleTrn = ruleTrn;
        this.merchantVar1 = merchantVar1;
        this.merchantVar2 = merchantVar2;
        this.merchantVar3 = merchantVar3;
        this.merchantVar4 = merchantVar4;
        this.recurringPayment = recurringPayment;
        this.recurringPmtFlag = recurringPmtFlag;
        this.recurringSeqNo = recurringSeqNo;
        this.recurringRemark = recurringRemark;
        this.requestToken = requestToken;
        this.overrideReturnServiceURL = overrideReturnServiceURL;
        this.version = version;
        this.deviceType = deviceType;
        this.ruleCom = ruleCom;
        this.cookiesEnabled = cookiesEnabled;
        this.browserName = browserName;
        this.ipAddress = ipAddress;
        this.trueIpAddress = trueIpAddress;
        this.latitude = latitude;
        this.longitude = longitude;
        this.countryCode = countryCode;
        this.country = country;
        this.zipCode = zipCode;
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
        this.cityOrTown = cityOrTown;
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }


    public String getRuleTrn() {
        return ruleTrn;
    }

    public void setRuleTrn(String ruleTrn) {
        this.ruleTrn = ruleTrn;
    }

    public String getMerchantVar1() {
        return merchantVar1;
    }

    public void setMerchantVar1(String merchantVar1) {
        this.merchantVar1 = merchantVar1;
    }

    public String getMerchantVar2() {
        return merchantVar2;
    }

    public void setMerchantVar2(String merchantVar2) {
        this.merchantVar2 = merchantVar2;
    }

    public String getMerchantVar3() {
        return merchantVar3;
    }

    public void setMerchantVar3(String merchantVar3) {
        this.merchantVar3 = merchantVar3;
    }

    public String getMerchantVar4() {
        return merchantVar4;
    }

    public void setMerchantVar4(String merchantVar4) {
        this.merchantVar4 = merchantVar4;
    }

    public String getRecurringPayment() {
        return recurringPayment;
    }

    public void setRecurringPayment(String recurringPayment) {
        this.recurringPayment = recurringPayment;
    }

    public String getRecurringPmtFlag() {
        return recurringPmtFlag;
    }

    public void setRecurringPmtFlag(String recurringPmtFlag) {
        this.recurringPmtFlag = recurringPmtFlag;
    }

    public String getRecurringSeqNo() {
        return recurringSeqNo;
    }

    public void setRecurringSeqNo(String recurringSeqNo) {
        this.recurringSeqNo = recurringSeqNo;
    }

    public String getRecurringRemark() {
        return recurringRemark;
    }

    public void setRecurringRemark(String recurringRemark) {
        this.recurringRemark = recurringRemark;
    }

    public String getRequestToken() {
        return requestToken;
    }

    public void setRequestToken(String requestToken) {
        this.requestToken = requestToken;
    }

    public String getOverrideReturnServiceURL() {
        return overrideReturnServiceURL;
    }

    public void setOverrideReturnServiceURL(String overrideReturnServiceURL) {
        this.overrideReturnServiceURL = overrideReturnServiceURL;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getRuleCom() {
        return ruleCom;
    }

    public void setRuleCom(String ruleCom) {
        this.ruleCom = ruleCom;
    }

    public String getCookiesEnabled() {
        return cookiesEnabled;
    }

    public void setCookiesEnabled(String cookiesEnabled) {
        this.cookiesEnabled = cookiesEnabled;
    }

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getTrueIpAddress() {
        return trueIpAddress;
    }

    public void setTrueIpAddress(String trueIpAddress) {
        this.trueIpAddress = trueIpAddress;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreetAddress1() {
        return streetAddress1;
    }

    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    public String getStreetAddress2() {
        return streetAddress2;
    }

    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    public String getCityOrTown() {
        return cityOrTown;
    }

    public void setCityOrTown(String cityOrTown) {
        this.cityOrTown = cityOrTown;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
