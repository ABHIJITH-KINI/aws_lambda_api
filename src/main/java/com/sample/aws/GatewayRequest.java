package com.sample.aws;

public class GatewayRequest {
	
	private double executionTime;
    private double numberOfRequest;
    private double memoryRequired;
    
	public double getExecutionTime() {
		return executionTime;
	}
	public void setExecutionTime(double executionTime) {
		this.executionTime = executionTime;
	}
	public double getNumberOfRequest() {
		return numberOfRequest;
	}
	public void setNumberOfRequest(double numberOfRequest) {
		this.numberOfRequest = numberOfRequest;
	}
	public double getMemoryRequired() {
		return memoryRequired;
	}
	public void setMemoryRequired(double memoryRequired) {
		this.memoryRequired = memoryRequired;
	}

}
