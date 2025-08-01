/*
 * e-KYC API
 * e-KYC API , GST verification suite
 *
 * The version of the OpenAPI document: v1
 * Contact: gautam@balajimariline.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.model.ModelAPIResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ElectricityBillerManagementApi
 */
@Ignore
public class ElectricityBillerManagementApiTest {

    private final ElectricityBillerManagementApi api = new ElectricityBillerManagementApi();

    
    /**
     * Get all electricity biller
     *
     * Get all electricity biller
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllBillerTest() {
        String X_AUTH_TOKEN = null;
        ModelAPIResponse response = api.getAllBiller(X_AUTH_TOKEN);

        // TODO: test validations
    }
    
    /**
     * Get all electricity biller by state
     *
     * Get all electricity biller by state
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllBillerByStateTest() {
        String state = null;
        String X_AUTH_TOKEN = null;
        ModelAPIResponse response = api.getAllBillerByState(state, X_AUTH_TOKEN);

        // TODO: test validations
    }
    
    /**
     * Get all state
     *
     * Get all state
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllStateTest() {
        String X_AUTH_TOKEN = null;
        ModelAPIResponse response = api.getAllState(X_AUTH_TOKEN);

        // TODO: test validations
    }
    
}
