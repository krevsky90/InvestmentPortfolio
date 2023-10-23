package com.investment.portfolio.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * NOTE: the names of fields are case SENSITIVE !!!
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "BONDS")
public class Bond {
    @Id
    @Column(name = "SECID", nullable = false)
    private String SECID;   //this is ISIN

    @Column(name = "SHORTNAME", length = 30, nullable = false)
    private String SHORTNAME;

    //Погашение (дата)
    @Temporal(TemporalType.DATE)
    @Column(name = "MATDATE")
    private Date MATDATE;

    @Column(name = "COUPONVALUE", nullable = false, columnDefinition = "decimal", precision = 5, scale = 2)
    private BigDecimal COUPONVALUE;

    @Column(name = "COUPONPERIOD", nullable = false)
    private Integer COUPONPERIOD;

    //Дата оферты
    @Temporal(TemporalType.DATE)
    @Column(name = "OFFERDATE")
    private Date OFFERDATE;

    //цена номинала
    @Column(name = "LOTVALUE", nullable = false, columnDefinition = "decimal", precision = 5, scale = 2)
    private BigDecimal LOTVALUE;

    // This default constructor is required if there are other constructors.
    public Bond() {
    }

    public String getSECID() {
        return SECID;
    }

    public void setSECID(String SECID) {
        this.SECID = SECID;
    }

    public String getSHORTNAME() {
        return SHORTNAME;
    }

    public void setSHORTNAME(String SHORTNAME) {
        this.SHORTNAME = SHORTNAME;
    }

    public Date getMATDATE() {
        return MATDATE;
    }

    public void setMATDATE(Date MATDATE) {
        this.MATDATE = MATDATE;
    }

    public BigDecimal getCOUPONVALUE() {
        return COUPONVALUE;
    }

    public void setCOUPONVALUE(BigDecimal COUPONVALUE) {
        this.COUPONVALUE = COUPONVALUE;
    }

    public Integer getCOUPONPERIOD() {
        return COUPONPERIOD;
    }

    public void setCOUPONPERIOD(Integer COUPONPERIOD) {
        this.COUPONPERIOD = COUPONPERIOD;
    }

    public Date getOFFERDATE() {
        return OFFERDATE;
    }

    public void setOFFERDATE(Date OFFERDATE) {
        this.OFFERDATE = OFFERDATE;
    }

    public BigDecimal getLOTVALUE() {
        return LOTVALUE;
    }

    public void setLOTVALUE(BigDecimal LOTVALUE) {
        this.LOTVALUE = LOTVALUE;
    }
}
