package com.sample.aws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Collections;

public class LambdaJavaAPI implements RequestHandler<GatewayRequest, GatewayResponse> {

    @Override
    public GatewayResponse handleRequest(GatewayRequest request, Context context) {
    	Double cost = CostCalculator.computeCost(request);
        GatewayResponse response = new GatewayResponse(
        		cost.toString(),
                200,
                Collections.singletonMap("X-Powered-By", "AWS")
        );
        return response;
    }
}
