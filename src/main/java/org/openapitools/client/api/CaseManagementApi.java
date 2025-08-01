package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ModelAPIResponse;
import org.openapitools.client.model.NewCaseRequestBody;

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
public class CaseManagementApi {
    private ApiClient apiClient;

    public CaseManagementApi() {
        this(new ApiClient());
    }

    public CaseManagementApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create new case
     * Create new case
     * <p><b>200</b> - OK
     * @param X_AUTH_TOKEN  (required)
     * @param newCaseRequestBody  (required)
     * @return ModelAPIResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelAPIResponse createNewCase(String X_AUTH_TOKEN, NewCaseRequestBody newCaseRequestBody) throws RestClientException {
        return createNewCaseWithHttpInfo(X_AUTH_TOKEN, newCaseRequestBody).getBody();
    }

    /**
     * Create new case
     * Create new case
     * <p><b>200</b> - OK
     * @param X_AUTH_TOKEN  (required)
     * @param newCaseRequestBody  (required)
     * @return ResponseEntity&lt;ModelAPIResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModelAPIResponse> createNewCaseWithHttpInfo(String X_AUTH_TOKEN, NewCaseRequestBody newCaseRequestBody) throws RestClientException {
        Object localVarPostBody = newCaseRequestBody;
        
        // verify the required parameter 'X_AUTH_TOKEN' is set
        if (X_AUTH_TOKEN == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'X_AUTH_TOKEN' when calling createNewCase");
        }
        
        // verify the required parameter 'newCaseRequestBody' is set
        if (newCaseRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'newCaseRequestBody' when calling createNewCase");
        }
        

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
        return apiClient.invokeAPI("/v1/case/create/new", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all case fro company
     * Get all case fro company
     * <p><b>200</b> - OK
     * @param X_AUTH_TOKEN  (required)
     * @return ModelAPIResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelAPIResponse getAllCase(String X_AUTH_TOKEN) throws RestClientException {
        return getAllCaseWithHttpInfo(X_AUTH_TOKEN).getBody();
    }

    /**
     * Get all case fro company
     * Get all case fro company
     * <p><b>200</b> - OK
     * @param X_AUTH_TOKEN  (required)
     * @return ResponseEntity&lt;ModelAPIResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModelAPIResponse> getAllCaseWithHttpInfo(String X_AUTH_TOKEN) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'X_AUTH_TOKEN' is set
        if (X_AUTH_TOKEN == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'X_AUTH_TOKEN' when calling getAllCase");
        }
        

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
        return apiClient.invokeAPI("/v1/case/get/all/case", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all case fro company
     * Get all case fro company
     * <p><b>200</b> - OK
     * @param companyId  (required)
     * @param X_AUTH_TOKEN  (required)
     * @return ModelAPIResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelAPIResponse getAllCaseAdmin(String companyId, String X_AUTH_TOKEN) throws RestClientException {
        return getAllCaseAdminWithHttpInfo(companyId, X_AUTH_TOKEN).getBody();
    }

    /**
     * Get all case fro company
     * Get all case fro company
     * <p><b>200</b> - OK
     * @param companyId  (required)
     * @param X_AUTH_TOKEN  (required)
     * @return ResponseEntity&lt;ModelAPIResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModelAPIResponse> getAllCaseAdminWithHttpInfo(String companyId, String X_AUTH_TOKEN) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'companyId' when calling getAllCaseAdmin");
        }
        
        // verify the required parameter 'X_AUTH_TOKEN' is set
        if (X_AUTH_TOKEN == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'X_AUTH_TOKEN' when calling getAllCaseAdmin");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "companyId", companyId));

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
        return apiClient.invokeAPI("/v1/case/admin/get/all/case", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
