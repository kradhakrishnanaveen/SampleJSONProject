package com.naveen.SampleJSON;

public class LiabilityCovInfo extends AbstractCovInfo {

	String liabilityRsvName;
	PolicyInformation polInfo;
	int numOfCoverages;
	public String getRsvName() {
		return liabilityRsvName;
	}
	public void setRsvName(String rsvName) {
		this.liabilityRsvName = rsvName;
	}
	public PolicyInformation getPolInfo() {
		return polInfo;
	}
	public void setPolInfo(PolicyInformation polInfo) {
		this.polInfo = polInfo;
	}
	public int getNumOfCoverages() {
		return numOfCoverages;
	}
	public void setNumOfCoverages(int numOfCoverages) {
		this.numOfCoverages = numOfCoverages;
	}
	@Override
	public String toString() {
		return "LiabilityCovInfo [rsvName=" + liabilityRsvName + ", polInfo=" + polInfo
				+ ", numOfCoverages=" + numOfCoverages + "]";
	}	
}
