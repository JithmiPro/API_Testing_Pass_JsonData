package com.example.Pro01.DTO;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Merchant_Part3_DTO {


    private String recordType;
    private String recordSequence;
    private String conjunctionTicket;
    private String travelDepartureDate;
    private String exchangeTicket;
    private String carrier;
    private String couponNumber;
    private String fldClass;
    private String stopOver;
    private String cityOfOrigin;
    private String destination;
    private String fareBasisCode;
    private String flightNumber;
    private String departureTime;
    private String departureTimeSegment;
    private String arrivalTime;
    private String arrivalTimeSegment;
    private String fare;
    private String fee;
    private String taxes;
    private String endorsementRestrictions;

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

    public String getConjunctionTicket() {
        return conjunctionTicket;
    }

    public void setConjunctionTicket(String conjunctionTicket) {
        this.conjunctionTicket = conjunctionTicket;
    }

    public String getTravelDepartureDate() {
        return travelDepartureDate;
    }

    public void setTravelDepartureDate(String travelDepartureDate) {
        this.travelDepartureDate = travelDepartureDate;
    }

    public String getExchangeTicket() {
        return exchangeTicket;
    }

    public void setExchangeTicket(String exchangeTicket) {
        this.exchangeTicket = exchangeTicket;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getCouponNumber() {
        return couponNumber;
    }

    public void setCouponNumber(String couponNumber) {
        this.couponNumber = couponNumber;
    }

    public String getFldClass() {
        return fldClass;
    }

    public void setFldClass(String fldClass) {
        this.fldClass = fldClass;
    }

    public String getStopOver() {
        return stopOver;
    }

    public void setStopOver(String stopOver) {
        this.stopOver = stopOver;
    }

    public String getCityOfOrigin() {
        return cityOfOrigin;
    }

    public void setCityOfOrigin(String cityOfOrigin) {
        this.cityOfOrigin = cityOfOrigin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFareBasisCode() {
        return fareBasisCode;
    }

    public void setFareBasisCode(String fareBasisCode) {
        this.fareBasisCode = fareBasisCode;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDepartureTimeSegment() {
        return departureTimeSegment;
    }

    public void setDepartureTimeSegment(String departureTimeSegment) {
        this.departureTimeSegment = departureTimeSegment;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getArrivalTimeSegment() {
        return arrivalTimeSegment;
    }

    public void setArrivalTimeSegment(String arrivalTimeSegment) {
        this.arrivalTimeSegment = arrivalTimeSegment;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getTaxes() {
        return taxes;
    }

    public void setTaxes(String taxes) {
        this.taxes = taxes;
    }

    public String getEndorsementRestrictions() {
        return endorsementRestrictions;
    }

    public void setEndorsementRestrictions(String endorsementRestrictions) {
        this.endorsementRestrictions = endorsementRestrictions;
    }
}
