# ElectricityBillDetailsManagementApi

All URIs are relative to *http://localhost:1010*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**updateElectricityBillFromDB**](ElectricityBillDetailsManagementApi.md#updateElectricityBillFromDB) | **GET** /v1/nsdl/get/electricitybill/details/{caseId} | Get electricity bill details from DB |
| [**updateElectricityBillFromNSDL**](ElectricityBillDetailsManagementApi.md#updateElectricityBillFromNSDL) | **POST** /v1/nsdl/update/electricitybill/details/{caseId} | Update electricity bill Details |



## updateElectricityBillFromDB

> ModelAPIResponse updateElectricityBillFromDB(caseId, X_AUTH_TOKEN)

Get electricity bill details from DB

Get electricity bill details from DB

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ElectricityBillDetailsManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        ElectricityBillDetailsManagementApi apiInstance = new ElectricityBillDetailsManagementApi(defaultClient);
        String caseId = "caseId_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.updateElectricityBillFromDB(caseId, X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ElectricityBillDetailsManagementApi#updateElectricityBillFromDB");
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


## updateElectricityBillFromNSDL

> ModelAPIResponse updateElectricityBillFromNSDL(caseId, X_AUTH_TOKEN, nsDLElectricityBillRequest)

Update electricity bill Details

Update electricity bill Details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ElectricityBillDetailsManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        ElectricityBillDetailsManagementApi apiInstance = new ElectricityBillDetailsManagementApi(defaultClient);
        String caseId = "caseId_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        NSDLElectricityBillRequest nsDLElectricityBillRequest = new NSDLElectricityBillRequest(); // NSDLElectricityBillRequest | 
        try {
            ModelAPIResponse result = apiInstance.updateElectricityBillFromNSDL(caseId, X_AUTH_TOKEN, nsDLElectricityBillRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ElectricityBillDetailsManagementApi#updateElectricityBillFromNSDL");
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
| **nsDLElectricityBillRequest** | [**NSDLElectricityBillRequest**](NSDLElectricityBillRequest.md)|  | |

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

