package com.smartquote.automation.quotedata;

public class DealCreationData {

	private String partnerProId;
	private String countryCode;
	private String fulllegalname;
	private String firstname;
	private String lastname;
	private String phone;
	private String street;
	private String city;
	private String pL;
	private String rBPdisc;
	private String dealRegID;
	private String SmartQuoteID;
	private String HPPUserId;
	private String Distributor;

	public DealCreationData(String partnerProId, String countryCode, String fulllegalname, String firstname,
			String lastname, String phone, String street, String city, String pL, String rBPdisc, String dealRegID,String SmartQuoteID,String HPPUserId,String Distributor) {
		super();
		this.partnerProId = partnerProId;
		this.countryCode = countryCode;
		this.fulllegalname = fulllegalname;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.street = street;
		this.city = city;
		this.pL = pL;
		this.rBPdisc = rBPdisc;
		this.dealRegID = dealRegID;
		this.SmartQuoteID = SmartQuoteID;
		this.HPPUserId = HPPUserId;
		this.Distributor =Distributor;
	}

	public String getPartnerProId() {
		return partnerProId;
	}

	public void setPartnerProId(String partnerProId) {
		this.partnerProId = partnerProId;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getFulllegalname() {
		return fulllegalname;
	}

	public void setFulllegalname(String fulllegalname) {
		this.fulllegalname = fulllegalname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getpL() {
		return pL;
	}

	public void setpL(String pL) {
		this.pL = pL;
	}

	public String getrBPdisc() {
		return rBPdisc;
	}

	public void setrBPdisc(String rBPdisc) {
		this.rBPdisc = rBPdisc;
	}

	public String getDealRegID() {
		return dealRegID;
	}

	public void setDealRegID(String dealRegID) {
		this.dealRegID = dealRegID;
	}

	public String getSmartQuoteID() {
		return SmartQuoteID;
	}
	public void setSmartQuoteID(String SmartQuoteID) {
		this.SmartQuoteID = SmartQuoteID;
	}

	public String getHPPUserId() {
		return HPPUserId;
	}
	public void setHPPUserId(String HPPUserId) {
		this.HPPUserId = HPPUserId;
	}
	public String getDistributor() {
		return Distributor;
	}
	public void setDistributor(String Distributor) {
		this.Distributor = Distributor;
	}
	

	@Override
	public String toString() {
		return "DealCreationData [partnerProId=" + partnerProId + ", countryCode=" + countryCode
				+ ", fulllegalname=" + fulllegalname + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", phone=" + phone + ", street=" + street + ", city=" + city + ", pL=" + pL + ", rBPdisc=" + rBPdisc
				+ ", dealRegID=" + dealRegID + ", Distributor=" + Distributor+",SmartQuoteID=" + SmartQuoteID +", HPPUserId=" + HPPUserId +"]";
	}

}
