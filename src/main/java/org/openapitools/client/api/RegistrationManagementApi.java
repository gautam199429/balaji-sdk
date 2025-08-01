package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ModelAPIResponse;
import org.openapitools.client.model.NewCompanyRegistrationRequest;

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
public class RegistrationManagementApi {
    private ApiClient apiClient;

    public RegistrationManagementApi() {
        this(new ApiClient());
    }

    public RegistrationManagementApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get GSTIN details from GSP
     * Get GSTIN status from GSP
     * <p><b>200</b> - OK
     * @param gstin  (required)
     * @param X_CLIENT_ID  (required)
     * @param X_CLIENT_SECRET  (required)
     * @return ModelAPIResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelAPIResponse getGSTINDetailsUtilityForVerify(String gstin, String X_CLIENT_ID, String X_CLIENT_SECRET) throws RestClientException {
        return getGSTINDetailsUtilityForVerifyWithHttpInfo(gstin, X_CLIENT_ID, X_CLIENT_SECRET).getBody();
    }

    /**
     * Get GSTIN details from GSP
     * Get GSTIN status from GSP
     * <p><b>200</b> - OK
     * @param gstin  (required)
     * @param X_CLIENT_ID  (required)
     * @param X_CLIENT_SECRET  (required)
     * @return ResponseEntity&lt;ModelAPIResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModelAPIResponse> getGSTINDetailsUtilityForVerifyWithHttpInfo(String gstin, String X_CLIENT_ID, String X_CLIENT_SECRET) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'gstin' is set
        if (gstin == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gstin' when calling getGSTINDetailsUtilityForVerify");
        }
        
        // verify the required parameter 'X_CLIENT_ID' is set
        if (X_CLIENT_ID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'X_CLIENT_ID' when calling getGSTINDetailsUtilityForVerify");
        }
        
        // verify the required parameter 'X_CLIENT_SECRET' is set
        if (X_CLIENT_SECRET == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'X_CLIENT_SECRET' when calling getGSTINDetailsUtilityForVerify");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gstin", gstin);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (X_CLIENT_ID != null)
        localVarHeaderParams.add("X-CLIENT-ID", apiClient.parameterToString(X_CLIENT_ID));
        if (X_CLIENT_SECRET != null)
        localVarHeaderParams.add("X-CLIENT-SECRET", apiClient.parameterToString(X_CLIENT_SECRET));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ModelAPIResponse> localReturnType = new ParameterizedTypeReference<ModelAPIResponse>() {};
        return apiClient.invokeAPI("/v1/registration/forverify/get/details/{gstin}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * create new case
     * create new case
     * <p><b>200</b> - OK
     * @param newCompanyRegistrationRequest  (required)
     * @return ModelAPIResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelAPIResponse newRegistration(NewCompanyRegistrationRequest newCompanyRegistrationRequest) throws RestClientException {
        return newRegistrationWithHttpInfo(newCompanyRegistrationRequest).getBody();
    }

    /**
     * create new case
     * create new case
     * <p><b>200</b> - OK
     * @param newCompanyRegistrationRequest  (required)
     * @return ResponseEntity&lt;ModelAPIResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModelAPIResponse> newRegistrationWithHttpInfo(NewCompanyRegistrationRequest newCompanyRegistrationRequest) throws RestClientException {
        Object localVarPostBody = newCompanyRegistrationRequest;
        
        // verify the required parameter 'newCompanyRegistrationRequest' is set
        if (newCompanyRegistrationRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'newCompanyRegistrationRequest' when calling newRegistration");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

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
        return apiClient.invokeAPI("/v1/registration/create/new", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Fetch PAN details from NSDL
     * Fetch PAN details from NSDL
     * <p><b>200</b> - OK
     * @param pan  (required)
     * @param X_CLIENT_ID  (required)
     * @param X_CLIENT_SECRET  (required)
     * @return ModelAPIResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelAPIResponse verifyPANumberForVerify(String pan, String X_CLIENT_ID, String X_CLIENT_SECRET) throws RestClientException {
        return verifyPANumberForVerifyWithHttpInfo(pan, X_CLIENT_ID, X_CLIENT_SECRET).getBody();
    }

    /**
     * Fetch PAN details from NSDL
     * Fetch PAN details from NSDL
     * <p><b>200</b> - OK
     * @param pan  (required)
     * @param X_CLIENT_ID  (required)
     * @param X_CLIENT_SECRET  (required)
     * @return ResponseEntity&lt;ModelAPIResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModelAPIResponse> verifyPANumberForVerifyWithHttpInfo(String pan, String X_CLIENT_ID, String X_CLIENT_SECRET) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'pan' is set
        if (pan == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pan' when calling verifyPANumberForVerify");
        }
        
        // verify the required parameter 'X_CLIENT_ID' is set
        if (X_CLIENT_ID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'X_CLIENT_ID' when calling verifyPANumberForVerify");
        }
        
        // verify the required parameter 'X_CLIENT_SECRET' is set
        if (X_CLIENT_SECRET == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'X_CLIENT_SECRET' when calling verifyPANumberForVerify");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "pan", pan));

        if (X_CLIENT_ID != null)
        localVarHeaderParams.add("X-CLIENT-ID", apiClient.parameterToString(X_CLIENT_ID));
        if (X_CLIENT_SECRET != null)
        localVarHeaderParams.add("X-CLIENT-SECRET", apiClient.parameterToString(X_CLIENT_SECRET));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ModelAPIResponse> localReturnType = new ParameterizedTypeReference<ModelAPIResponse>() {};
        return apiClient.invokeAPI("/v1/registration/forverify/pan/verify", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
