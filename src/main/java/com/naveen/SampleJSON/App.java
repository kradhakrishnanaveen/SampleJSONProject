package com.naveen.SampleJSON;

import java.util.ArrayList;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Gson gson = new Gson();
        

        PolicyInformation polInfo = new PolicyInformation();
        polInfo.setLine("PFLine");
        polInfo.setProduct("Private Motor");
        polInfo.setComments("It is Common for all Coverage Information");
        
        PolicyMainInfo polMainInfo = new PolicyMainInfo();
        polMainInfo.setCommunicationPath("Zurich");
        polMainInfo.setPolicyOwnerName("Naveen K R");
        polMainInfo.setCity("Bangalore");
        polMainInfo.covInfos = new ArrayList<AbstractCovInfo>();
        
        LiabilityCovInfo liabilityCovInfo1 = new LiabilityCovInfo();
        liabilityCovInfo1.numOfCoverages = 5;
        liabilityCovInfo1.liabilityRsvName = "Liability One";
        liabilityCovInfo1.polInfo = polInfo;
        polMainInfo.covInfos.add(liabilityCovInfo1);
        
        LiabilityCovInfo liabilityCovInfo2 = new LiabilityCovInfo();
        liabilityCovInfo2.numOfCoverages = 9;
        liabilityCovInfo2.liabilityRsvName = "Liability Two";
        liabilityCovInfo2.polInfo = polInfo;        
        polMainInfo.covInfos.add(liabilityCovInfo2);
        
        CollisionCovInfo collisionCovInfo = new CollisionCovInfo();
        collisionCovInfo.numOfCoverages = 4;
        collisionCovInfo.colRsvName = "Collision One";
        collisionCovInfo.polInfo = polInfo;        
        polMainInfo.covInfos.add(collisionCovInfo);
        
        ComprehensiveCovInfo compCovInfo = new ComprehensiveCovInfo();
        compCovInfo.numOfCoverages = 6;
        compCovInfo.compRsvName = "Comprehensive One";
        compCovInfo.polInfo = polInfo;        
        polMainInfo.covInfos.add(compCovInfo);
        
        String reqStr = gson.toJson(polMainInfo);
        
        System.out.println("Converted JSON String: \n " + reqStr);
        
        PolicyMainInfo polInfoResp = gson.fromJson(reqStr, PolicyMainInfo.class);
        
        System.out.println("Converted Object from JSON: " + polInfoResp);
        displayPolicyInfo(polInfoResp);      
    }
    
    private static void displayPolicyInfo(PolicyMainInfo polMainInfo) {
    	System.err.println("Object Information");
    	System.out.println("Policy main Information: ");
    	System.out.println(polMainInfo.city);
    	System.out.println(polMainInfo.covInfos.size());
    	for (AbstractCovInfo covInfo : polMainInfo.covInfos) {
    		if (covInfo instanceof LiabilityCovInfo) {
    			System.out.println("LiabilityInformation"); 
    			System.out.println(((LiabilityCovInfo) covInfo).liabilityRsvName);
    			System.out.println(((LiabilityCovInfo) covInfo).polInfo.comments);
    		} else if (covInfo instanceof CollisionCovInfo) {
    			System.out.println("CollisionCovInfo"); 
    			System.out.println(((CollisionCovInfo) covInfo).colRsvName);
    			System.out.println(((CollisionCovInfo) covInfo).polInfo.comments);
    		} else if (covInfo instanceof ComprehensiveCovInfo) {
    			System.out.println("ComprehensiveCovInfo"); 
    			System.out.println(((ComprehensiveCovInfo) covInfo).compRsvName);
    			System.out.println(((ComprehensiveCovInfo) covInfo).polInfo.comments);
    		} else {
    			System.out.println("In Else");
    			System.out.println(covInfo);
    		}
    	}
    }
}
