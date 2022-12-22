package com.example.Pro01.DTO;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DeviceFingerprintDTO {
    private String deviceType;
    private String browserLanguage;
    private String cookiesEnabled;
    private String browserName;
    private String ipAddress;
    private String trueIpAddress;
    private String latitude;
    private String longitude;
    private String countryCode;

    public DeviceFingerprintDTO(String deviceType, String browserLanguage, String cookiesEnabled, String browserName, String ipAddress, String trueIpAddress, String latitude, String longitude, String countryCode) {
        this.deviceType = deviceType;
        this.browserLanguage = browserLanguage;
        this.cookiesEnabled = cookiesEnabled;
        this.browserName = browserName;
        this.ipAddress = ipAddress;
        this.trueIpAddress = trueIpAddress;
        this.latitude = latitude;
        this.longitude = longitude;
        this.countryCode = countryCode;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getBrowserLanguage() {
        return browserLanguage;
    }

    public void setBrowserLanguage(String browserLanguage) {
        this.browserLanguage = browserLanguage;
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
}
