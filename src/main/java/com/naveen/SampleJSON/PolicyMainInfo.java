package com.naveen.SampleJSON;

import java.util.Collection;

public class PolicyMainInfo {

	Collection<AbstractCovInfo> covInfos;
	String policyOwnerName;
	String communicationPath;
	String city;
	public Collection<AbstractCovInfo> getCovInfos() {
		return covInfos;
	}
	public void setCovInfos(Collection<AbstractCovInfo> covInfos) {
		this.covInfos = covInfos;
	}
	public String getPolicyOwnerName() {
		return policyOwnerName;
	}
	public void setPolicyOwnerName(String policyOwnerName) {
		this.policyOwnerName = policyOwnerName;
	}
	public String getCommunicationPath() {
		return communicationPath;
	}
	public void setCommunicationPath(String communicationPath) {
		this.communicationPath = communicationPath;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "PolicyMainInfo [covInfos=" + covInfos + ", policyOwnerName="
				+ policyOwnerName + ", communicationPath=" + communicationPath
				+ ", city=" + city + "]";
	}
	
	
} 
