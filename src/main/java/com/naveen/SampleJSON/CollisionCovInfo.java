package com.naveen.SampleJSON;

public class CollisionCovInfo extends AbstractCovInfo {

	String colRsvName;
	PolicyInformation polInfo;
	int numOfCoverages;
	public String getRsvName() {
		return colRsvName;
	}
	public void setRsvName(String rsvName) {
		this.colRsvName = rsvName;
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
		return "LiabilityCovInfo [rsvName=" + colRsvName + ", polInfo=" + polInfo
				+ ", numOfCoverages=" + numOfCoverages + "]";
	}
}
