# CompanyMasterDetailsManagementApi

All URIs are relative to *http://localhost:1010*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCompanyMasterDetails**](CompanyMasterDetailsManagementApi.md#getCompanyMasterDetails) | **GET** /v1/nsdl/get/master/details/{caseId} | Get company master details from DB |
| [**updateCompanyMasterDetails1**](CompanyMasterDetailsManagementApi.md#updateCompanyMasterDetails1) | **POST** /v1/nsdl/update/master/details/{caseId} | Update Company Master Details |



## getCompanyMasterDetails

> ModelAPIResponse getCompanyMasterDetails(caseId, X_AUTH_TOKEN)

Get company master details from DB

Get company master details from DB

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CompanyMasterDetailsManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        CompanyMasterDetailsManagementApi apiInstance = new CompanyMasterDetailsManagementApi(defaultClient);
        String caseId = "caseId_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getCompanyMasterDetails(caseId, X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyMasterDetailsManagementApi#getCompanyMasterDetails");
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


## updateCompanyMasterDetails1

> ModelAPIResponse updateCompanyMasterDetails1(caseId, X_AUTH_TOKEN, mcACompanyMasterDataRequest)

Update Company Master Details

Update Company Master Details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CompanyMasterDetailsManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        CompanyMasterDetailsManagementApi apiInstance = new CompanyMasterDetailsManagementApi(defaultClient);
        String caseId = "caseId_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        MCACompanyMasterDataRequest mcACompanyMasterDataRequest = new MCACompanyMasterDataRequest(); // MCACompanyMasterDataRequest | 
        try {
            ModelAPIResponse result = apiInstance.updateCompanyMasterDetails1(caseId, X_AUTH_TOKEN, mcACompanyMasterDataRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyMasterDetailsManagementApi#updateCompanyMasterDetails1");
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
| **mcACompanyMasterDataRequest** | [**MCACompanyMasterDataRequest**](MCACompanyMasterDataRequest.md)|  | |

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

