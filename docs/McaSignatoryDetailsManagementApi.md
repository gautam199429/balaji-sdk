# McaSignatoryDetailsManagementApi

All URIs are relative to *http://localhost:1010*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSignatoryDetails**](McaSignatoryDetailsManagementApi.md#getSignatoryDetails) | **GET** /v1/nsdl/get/signatory/details/{caseId} | Get MCA signatory details from DB |
| [**updateSignatoryDetails**](McaSignatoryDetailsManagementApi.md#updateSignatoryDetails) | **POST** /v1/nsdl/update/signatory/details/{caseId} | Update MCA signatory details from NSDL |



## getSignatoryDetails

> ModelAPIResponse getSignatoryDetails(caseId, X_AUTH_TOKEN)

Get MCA signatory details from DB

Get MCA signatory details from DB

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.McaSignatoryDetailsManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        McaSignatoryDetailsManagementApi apiInstance = new McaSignatoryDetailsManagementApi(defaultClient);
        String caseId = "caseId_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getSignatoryDetails(caseId, X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling McaSignatoryDetailsManagementApi#getSignatoryDetails");
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


## updateSignatoryDetails

> ModelAPIResponse updateSignatoryDetails(caseId, X_AUTH_TOKEN, mcASignatoryRequest)

Update MCA signatory details from NSDL

Update MCA signatory details from NSDL

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.McaSignatoryDetailsManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        McaSignatoryDetailsManagementApi apiInstance = new McaSignatoryDetailsManagementApi(defaultClient);
        String caseId = "caseId_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        MCASignatoryRequest mcASignatoryRequest = new MCASignatoryRequest(); // MCASignatoryRequest | 
        try {
            ModelAPIResponse result = apiInstance.updateSignatoryDetails(caseId, X_AUTH_TOKEN, mcASignatoryRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling McaSignatoryDetailsManagementApi#updateSignatoryDetails");
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

