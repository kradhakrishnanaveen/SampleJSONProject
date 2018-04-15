package com.naveen.SampleJSON;

import java.math.BigDecimal;

public class AbstractCovInfo implements ICoverageInfo{

	String covName;
	BigDecimal covPrem;
	BigDecimal covTax;
	public String getCovName() {
		return covName;
	}
	public void setCovName(String covName) {
		this.covName = covName;
	}
	public BigDecimal getCovPrem() {
		return covPrem;
	}
	public void setCovPrem(BigDecimal covPrem) {
		this.covPrem = covPrem;
	}
	public BigDecimal getCovTax() {
		return covTax;
	}
	public void setCovTax(BigDecimal covTax) {
		this.covTax = covTax;
	}
	@Override
	public String toString() {
		return "AbstractCovInfo [covName=" + covName + ", covPrem=" + covPrem
				+ ", covTax=" + covTax + "]";
	}	
}
