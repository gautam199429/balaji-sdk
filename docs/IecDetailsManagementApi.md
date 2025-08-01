# IecDetailsManagementApi

All URIs are relative to *http://localhost:1010*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getIECDetails**](IecDetailsManagementApi.md#getIECDetails) | **GET** /v1/nsdl/get/iec/details/{caseId} | Get IEC details from DB |
| [**updateIECDetails1**](IecDetailsManagementApi.md#updateIECDetails1) | **POST** /v1/nsdl/update/iec/details/{caseId} | Update IEC details from NSDL |



## getIECDetails

> ModelAPIResponse getIECDetails(caseId, X_AUTH_TOKEN)

Get IEC details from DB

Get IEC details from DB

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IecDetailsManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        IecDetailsManagementApi apiInstance = new IecDetailsManagementApi(defaultClient);
        String caseId = "caseId_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getIECDetails(caseId, X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IecDetailsManagementApi#getIECDetails");
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


## updateIECDetails1

> ModelAPIResponse updateIECDetails1(caseId, X_AUTH_TOKEN, mcASignatoryRequest)

Update IEC details from NSDL

Update IEC details from NSDL

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IecDetailsManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        IecDetailsManagementApi apiInstance = new IecDetailsManagementApi(defaultClient);
        String caseId = "caseId_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        MCASignatoryRequest mcASignatoryRequest = new MCASignatoryRequest(); // MCASignatoryRequest | 
        try {
            ModelAPIResponse result = apiInstance.updateIECDetails1(caseId, X_AUTH_TOKEN, mcASignatoryRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IecDetailsManagementApi#updateIECDetails1");
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
| **mcASignatoryRequest** | [**MCASignatoryRequest**](MCASignatoryRequest.md)|  | |

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

