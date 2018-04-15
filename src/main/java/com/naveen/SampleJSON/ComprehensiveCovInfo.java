package com.naveen.SampleJSON;

public class ComprehensiveCovInfo extends AbstractCovInfo {

	String compRsvName;
	PolicyInformation polInfo;
	int numOfCoverages;
	public String getRsvName() {
		return compRsvName;
	}
	public void setRsvName(String rsvName) {
		this.compRsvName = rsvName;
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
		return "LiabilityCovInfo [rsvName=" + compRsvName + ", polInfo=" + polInfo
				+ ", numOfCoverages=" + numOfCoverages + "]";
	}
}
