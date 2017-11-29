package com.tigo.customerinformation;

/**
 *
 * @author vperez
 * Esta clase es el modelo de datos que se retorna en el JSON
 */
class UsageInformation {
    
    private String Msisdn;
    private String BillingCycle;
    private String PlanCode;
    private String ClientType;
    private String PlanName;
    private String PlanType;

    /**
     * @return the Msisdn
     */
    public String getMsisdn() {
        return Msisdn;
    }

    /**
     * @param Msisdn the Msisdn to set
     */
    public void setMsisdn(String Msisdn) {
        this.Msisdn = Msisdn;
    }

    /**
     * @return the BillingCycle
     */
    public String getBillingCycle() {
        return BillingCycle;
    }

    /**
     * @param BillingCycle the BillingCycle to set
     */
    public void setBillingCycle(String BillingCycle) {
        this.BillingCycle = BillingCycle;
    }

    /**
     * @return the PlanCode
     */
    public String getPlanCode() {
        return PlanCode;
    }

    /**
     * @param PlanCode the PlanCode to set
     */
    public void setPlanCode(String PlanCode) {
        this.PlanCode = PlanCode;
    }

    /**
     * @return the ClientType
     */
    public String getClientType() {
        return ClientType;
    }

    /**
     * @param ClientType the ClientType to set
     */
    public void setClientType(String ClientType) {
        this.ClientType = ClientType;
    }

    /**
     * @return the PlanName
     */
    public String getPlanName() {
        return PlanName;
    }

    /**
     * @param PlanName the PlanName to set
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * @return the PlanType
     */
    public String getPlanType() {
        return PlanType;
    }

    /**
     * @param PlanType the PlanType to set
     */
    public void setPlanType(String PlanType) {
        this.PlanType = PlanType;
    }
    
}
