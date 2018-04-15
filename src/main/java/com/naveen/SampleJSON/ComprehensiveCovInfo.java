package com.naveen.SampleJSON;

public class ComprehensiveCovInfo extends AbstractCovInfo {

	String rsvName;
	PolicyInformation polInfo;
	int numOfCoverages;
	public String getRsvName() {
		return rsvName;
	}
	public void setRsvName(String rsvName) {
		this.rsvName = rsvName;
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
		return "LiabilityCovInfo [rsvName=" + rsvName + ", polInfo=" + polInfo
				+ ", numOfCoverages=" + numOfCoverages + "]";
	}
}
