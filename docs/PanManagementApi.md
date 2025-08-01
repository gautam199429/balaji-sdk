# PanManagementApi

All URIs are relative to *http://localhost:1010*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDetailsFromPanNumber**](PanManagementApi.md#getDetailsFromPanNumber) | **POST** /v1/pan/get/details | Fetch PAN details from NSDL |
| [**getDetailsFromPanNumberFromCAse**](PanManagementApi.md#getDetailsFromPanNumberFromCAse) | **GET** /v1/pan/get/details/bycase | Fetch PAN details from DB Case ID |



## getDetailsFromPanNumber

> ModelAPIResponse getDetailsFromPanNumber(X_AUTH_TOKEN, panRequestBody)

Fetch PAN details from NSDL

Fetch PAN details from NSDL

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PanManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        PanManagementApi apiInstance = new PanManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        PanRequestBody panRequestBody = new PanRequestBody(); // PanRequestBody | 
        try {
            ModelAPIResponse result = apiInstance.getDetailsFromPanNumber(X_AUTH_TOKEN, panRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PanManagementApi#getDetailsFromPanNumber");
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
| **panRequestBody** | [**PanRequestBody**](PanRequestBody.md)|  | |

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


## getDetailsFromPanNumberFromCAse

> ModelAPIResponse getDetailsFromPanNumberFromCAse(caseId, X_AUTH_TOKEN)

Fetch PAN details from DB Case ID

Fetch PAN details from DB Case ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PanManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        PanManagementApi apiInstance = new PanManagementApi(defaultClient);
        String caseId = "caseId_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getDetailsFromPanNumberFromCAse(caseId, X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PanManagementApi#getDetailsFromPanNumberFromCAse");
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
| **caseId** | **String**|  | |
| **X_AUTH_TOKEN** | **String**|  | |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

