package com.sample.aws;

public class CostCalculator {

	public static double computeCost(GatewayRequest request) {
	    final double PER_COMPUTE_COST = 0.00001667;
	    
	    double executionTimeInSec = request.getExecutionTime()/1000;
	    double totalCompute = (request.getNumberOfRequest() * executionTimeInSec) * (request.getMemoryRequired()/1024);
	    double computeCharge = totalCompute * PER_COMPUTE_COST;
	    double requestCharge = (request.getNumberOfRequest()/1000000) * 0.2;
	    
	    return computeCharge + requestCharge;	
	}
}
