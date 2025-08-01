# NsdlEncDcManagementApi

All URIs are relative to *http://localhost:1010*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**decryptData**](NsdlEncDcManagementApi.md#decryptData) | **POST** /v1/crypto/decrypt | Decrypt NSDL response body |
| [**encryptData**](NsdlEncDcManagementApi.md#encryptData) | **POST** /v1/crypto/encrypt | Encrypt NSDL request body |



## decryptData

> ModelAPIResponse decryptData(X_AUTH_TOKEN, nsDLRequestBody)

Decrypt NSDL response body

Decrypt NSDL response body

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NsdlEncDcManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        NsdlEncDcManagementApi apiInstance = new NsdlEncDcManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        NSDLRequestBody nsDLRequestBody = new NSDLRequestBody(); // NSDLRequestBody | 
        try {
            ModelAPIResponse result = apiInstance.decryptData(X_AUTH_TOKEN, nsDLRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NsdlEncDcManagementApi#decryptData");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **X_AUTH_TOKEN** | **String**|  | |
| **nsDLRequestBody** | [**NSDLRequestBody**](NSDLRequestBody.md)|  | |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## encryptData

> ModelAPIResponse encryptData(X_AUTH_TOKEN, body)

Encrypt NSDL request body

Encrypt NSDL request body

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NsdlEncDcManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        NsdlEncDcManagementApi apiInstance = new NsdlEncDcManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        String body = "body_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.encryptData(X_AUTH_TOKEN, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NsdlEncDcManagementApi#encryptData");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **X_AUTH_TOKEN** | **String**|  | |
| **body** | **String**|  | |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

