package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.MCACompanyMasterDataRequest;
import org.openapitools.client.model.ModelAPIResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-08-02T01:38:15.284014500+05:30[Asia/Calcutta]")
public class CompanyMasterDetailsManagementApi {
    private ApiClient apiClient;

    public CompanyMasterDetailsManagementApi() {
        this(new ApiClient());
    }

    public CompanyMasterDetailsManagementApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get company master details from DB
     * Get company master details from DB
     * <p><b>200</b> - OK
     * @param caseId  (required)
     * @param X_AUTH_TOKEN  (required)
     * @return ModelAPIResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelAPIResponse getCompanyMasterDetails(String caseId, String X_AUTH_TOKEN) throws RestClientException {
        return getCompanyMasterDetailsWithHttpInfo(caseId, X_AUTH_TOKEN).getBody();
    }

    /**
     * Get company master details from DB
     * Get company master details from DB
     * <p><b>200</b> - OK
     * @param caseId  (required)
     * @param X_AUTH_TOKEN  (required)
     * @return ResponseEntity&lt;ModelAPIResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModelAPIResponse> getCompanyMasterDetailsWithHttpInfo(String caseId, String X_AUTH_TOKEN) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'caseId' is set
        if (caseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'caseId' when calling getCompanyMasterDetails");
        }
        
        // verify the required parameter 'X_AUTH_TOKEN' is set
        if (X_AUTH_TOKEN == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'X_AUTH_TOKEN' when calling getCompanyMasterDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("caseId", caseId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (X_AUTH_TOKEN != null)
        localVarHeaderParams.add("X-AUTH-TOKEN", apiClient.parameterToString(X_AUTH_TOKEN));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ModelAPIResponse> localReturnType = new ParameterizedTypeReference<ModelAPIResponse>() {};
        return apiClient.invokeAPI("/v1/nsdl/get/master/details/{caseId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Company Master Details
     * Update Company Master Details
     * <p><b>200</b> - OK
     * @param caseId  (required)
     * @param X_AUTH_TOKEN  (required)
     * @param mcACompanyMasterDataRequest  (required)
     * @return ModelAPIResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelAPIResponse updateCompanyMasterDetails1(String caseId, String X_AUTH_TOKEN, MCACompanyMasterDataRequest mcACompanyMasterDataRequest) throws RestClientException {
        return updateCompanyMasterDetails1WithHttpInfo(caseId, X_AUTH_TOKEN, mcACompanyMasterDataRequest).getBody();
    }

    /**
     * Update Company Master Details
     * Update Company Master Details
     * <p><b>200</b> - OK
     * @param caseId  (required)
     * @param X_AUTH_TOKEN  (required)
     * @param mcACompanyMasterDataRequest  (required)
     * @return ResponseEntity&lt;ModelAPIResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModelAPIResponse> updateCompanyMasterDetails1WithHttpInfo(String caseId, String X_AUTH_TOKEN, MCACompanyMasterDataRequest mcACompanyMasterDataRequest) throws RestClientException {
        Object localVarPostBody = mcACompanyMasterDataRequest;
        
        // verify the required parameter 'caseId' is set
        if (caseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'caseId' when calling updateCompanyMasterDetails1");
        }
        
        // verify the required parameter 'X_AUTH_TOKEN' is set
        if (X_AUTH_TOKEN == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'X_AUTH_TOKEN' when calling updateCompanyMasterDetails1");
        }
        
        // verify the required parameter 'mcACompanyMasterDataRequest' is set
        if (mcACompanyMasterDataRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mcACompanyMasterDataRequest' when calling updateCompanyMasterDetails1");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("caseId", caseId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (X_AUTH_TOKEN != null)
        localVarHeaderParams.add("X-AUTH-TOKEN", apiClient.parameterToString(X_AUTH_TOKEN));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ModelAPIResponse> localReturnType = new ParameterizedTypeReference<ModelAPIResponse>() {};
        return apiClient.invokeAPI("/v1/nsdl/update/master/details/{caseId}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
