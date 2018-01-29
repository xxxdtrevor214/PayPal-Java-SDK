package com.paypal.sdk.v1.billingplans.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.v1.billingplans.Plan;
import com.paypal.sdk.v1.billingplans.PlanGetRequest;
import com.paypal.sdk.v1.billingplans.PlanList;
import com.paypal.sdk.v1.billingplans.PlanListRequest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

public class PlanListRequestTest extends TestHarness {

    @Test
    public void testPlanListRequest() throws IOException {
        HttpResponse<Plan> response = PlanCreateRequestTest.createPlan(client());
        assertEquals(response.statusCode(), 201);
        assertNotNull(response.result());
        Plan createdPlan = response.result();

        PlanListRequest listPlanRequest = new PlanListRequest();
        HttpResponse<PlanList> listPlanResponse = client().execute(listPlanRequest);

        assertEquals(listPlanResponse.statusCode(), 200);
        PlanList planList = listPlanResponse.result();

        Plan firstPlan = planList.plans().get(0);
        assertNotNull(firstPlan.id());
        assertNotNull(firstPlan.name());
    }
}
