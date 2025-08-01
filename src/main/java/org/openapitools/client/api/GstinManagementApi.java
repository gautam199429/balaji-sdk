package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GstinRequest;
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
public class GstinManagementApi {
    private ApiClient apiClient;

    public GstinManagementApi() {
        this(new ApiClient());
    }

    public GstinManagementApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete GSTIN details
     * Delete GSTIN details
     * <p><b>200</b> - OK
     * @param X_AUTH_TOKEN  (required)
     * @param gstinRequest  (required)
     * @return ModelAPIResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelAPIResponse deleteGSTIN(String X_AUTH_TOKEN, GstinRequest gstinRequest) throws RestClientException {
        return deleteGSTINWithHttpInfo(X_AUTH_TOKEN, gstinRequest).getBody();
    }

    /**
     * Delete GSTIN details
     * Delete GSTIN details
     * <p><b>200</b> - OK
     * @param X_AUTH_TOKEN  (required)
     * @param gstinRequest  (required)
     * @return ResponseEntity&lt;ModelAPIResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModelAPIResponse> deleteGSTINWithHttpInfo(String X_AUTH_TOKEN, GstinRequest gstinRequest) throws RestClientException {
        Object localVarPostBody = gstinRequest;
        
        // verify the required parameter 'X_AUTH_TOKEN' is set
        if (X_AUTH_TOKEN == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'X_AUTH_TOKEN' when calling deleteGSTIN");
        }
        
        // verify the required parameter 'gstinRequest' is set
        if (gstinRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gstinRequest' when calling deleteGSTIN");
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
        return apiClient.invokeAPI("/v1/gstin/delete/gstin", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all GSTIN
     * Get all GSTIN
     * <p><b>200</b> - OK
     * @param caseId  (required)
     * @param X_AUTH_TOKEN  (required)
     * @return ModelAPIResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelAPIResponse getDetailsGSTIN(String caseId, String X_AUTH_TOKEN) throws RestClientException {
        return getDetailsGSTINWithHttpInfo(caseId, X_AUTH_TOKEN).getBody();
    }

    /**
     * Get all GSTIN
     * Get all GSTIN
     * <p><b>200</b> - OK
     * @param caseId  (required)
     * @param X_AUTH_TOKEN  (required)
     * @return ResponseEntity&lt;ModelAPIResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModelAPIResponse> getDetailsGSTINWithHttpInfo(String caseId, String X_AUTH_TOKEN) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'caseId' is set
        if (caseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'caseId' when calling getDetailsGSTIN");
        }
        
        // verify the required parameter 'X_AUTH_TOKEN' is set
        if (X_AUTH_TOKEN == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'X_AUTH_TOKEN' when calling getDetailsGSTIN");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "caseId", caseId));

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
        return apiClient.invokeAPI("/v1/gstin/get/all/gstin", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add new GSTIN
     * Add new GSTIN
     * <p><b>200</b> - OK
     * @param X_AUTH_TOKEN  (required)
     * @param gstinRequest  (required)
     * @return ModelAPIResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelAPIResponse getDetailsGSTIN1(String X_AUTH_TOKEN, GstinRequest gstinRequest) throws RestClientException {
        return getDetailsGSTIN1WithHttpInfo(X_AUTH_TOKEN, gstinRequest).getBody();
    }

    /**
     * Add new GSTIN
     * Add new GSTIN
     * <p><b>200</b> - OK
     * @param X_AUTH_TOKEN  (required)
     * @param gstinRequest  (required)
     * @return ResponseEntity&lt;ModelAPIResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModelAPIResponse> getDetailsGSTIN1WithHttpInfo(String X_AUTH_TOKEN, GstinRequest gstinRequest) throws RestClientException {
        Object localVarPostBody = gstinRequest;
        
        // verify the required parameter 'X_AUTH_TOKEN' is set
        if (X_AUTH_TOKEN == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'X_AUTH_TOKEN' when calling getDetailsGSTIN1");
        }
        
        // verify the required parameter 'gstinRequest' is set
        if (gstinRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gstinRequest' when calling getDetailsGSTIN1");
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
        return apiClient.invokeAPI("/v1/gstin/add/gstin", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update GSTIN current status from GSP
     * Update GSTIN current status from GSP
     * <p><b>200</b> - OK
     * @param X_AUTH_TOKEN  (required)
     * @param gstinRequest  (required)
     * @return ModelAPIResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelAPIResponse getGSTINStatus(String X_AUTH_TOKEN, GstinRequest gstinRequest) throws RestClientException {
        return getGSTINStatusWithHttpInfo(X_AUTH_TOKEN, gstinRequest).getBody();
    }

    /**
     * Update GSTIN current status from GSP
     * Update GSTIN current status from GSP
     * <p><b>200</b> - OK
     * @param X_AUTH_TOKEN  (required)
     * @param gstinRequest  (required)
     * @return ResponseEntity&lt;ModelAPIResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModelAPIResponse> getGSTINStatusWithHttpInfo(String X_AUTH_TOKEN, GstinRequest gstinRequest) throws RestClientException {
        Object localVarPostBody = gstinRequest;
        
        // verify the required parameter 'X_AUTH_TOKEN' is set
        if (X_AUTH_TOKEN == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'X_AUTH_TOKEN' when calling getGSTINStatus");
        }
        
        // verify the required parameter 'gstinRequest' is set
        if (gstinRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gstinRequest' when calling getGSTINStatus");
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
        return apiClient.invokeAPI("/v1/gstin/update/status", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update GSTIN preference details GSP
     * Update GSTIN preference details GSP
     * <p><b>200</b> - OK
     * @param fy  (required)
     * @param X_AUTH_TOKEN  (required)
     * @param gstinRequest  (required)
     * @return ModelAPIResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelAPIResponse getPreferenceDetailsGSTIN(String fy, String X_AUTH_TOKEN, GstinRequest gstinRequest) throws RestClientException {
        return getPreferenceDetailsGSTINWithHttpInfo(fy, X_AUTH_TOKEN, gstinRequest).getBody();
    }

    /**
     * Update GSTIN preference details GSP
     * Update GSTIN preference details GSP
     * <p><b>200</b> - OK
     * @param fy  (required)
     * @param X_AUTH_TOKEN  (required)
     * @param gstinRequest  (required)
     * @return ResponseEntity&lt;ModelAPIResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModelAPIResponse> getPreferenceDetailsGSTINWithHttpInfo(String fy, String X_AUTH_TOKEN, GstinRequest gstinRequest) throws RestClientException {
        Object localVarPostBody = gstinRequest;
        
        // verify the required parameter 'fy' is set
        if (fy == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fy' when calling getPreferenceDetailsGSTIN");
        }
        
        // verify the required parameter 'X_AUTH_TOKEN' is set
        if (X_AUTH_TOKEN == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'X_AUTH_TOKEN' when calling getPreferenceDetailsGSTIN");
        }
        
        // verify the required parameter 'gstinRequest' is set
        if (gstinRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gstinRequest' when calling getPreferenceDetailsGSTIN");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "fy", fy));

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
        return apiClient.invokeAPI("/v1/gstin/update/preference/details", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update GSTIN return track status details GSP
     * Update GSTIN return track status details GSP
     * <p><b>200</b> - OK
     * @param fy  (required)
     * @param type  (required)
     * @param X_AUTH_TOKEN  (required)
     * @param gstinRequest  (required)
     * @return ModelAPIResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelAPIResponse getTrackDetailsGSTIN(String fy, String type, String X_AUTH_TOKEN, GstinRequest gstinRequest) throws RestClientException {
        return getTrackDetailsGSTINWithHttpInfo(fy, type, X_AUTH_TOKEN, gstinRequest).getBody();
    }

    /**
     * Update GSTIN return track status details GSP
     * Update GSTIN return track status details GSP
     * <p><b>200</b> - OK
     * @param fy  (required)
     * @param type  (required)
     * @param X_AUTH_TOKEN  (required)
     * @param gstinRequest  (required)
     * @return ResponseEntity&lt;ModelAPIResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModelAPIResponse> getTrackDetailsGSTINWithHttpInfo(String fy, String type, String X_AUTH_TOKEN, GstinRequest gstinRequest) throws RestClientException {
        Object localVarPostBody = gstinRequest;
        
        // verify the required parameter 'fy' is set
        if (fy == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fy' when calling getTrackDetailsGSTIN");
        }
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling getTrackDetailsGSTIN");
        }
        
        // verify the required parameter 'X_AUTH_TOKEN' is set
        if (X_AUTH_TOKEN == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'X_AUTH_TOKEN' when calling getTrackDetailsGSTIN");
        }
        
        // verify the required parameter 'gstinRequest' is set
        if (gstinRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gstinRequest' when calling getTrackDetailsGSTIN");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "fy", fy));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));

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
        return apiClient.invokeAPI("/v1/gstin/update/track/details", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
