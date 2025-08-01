# CaseManagementApi

All URIs are relative to *http://localhost:1010*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewCase**](CaseManagementApi.md#createNewCase) | **POST** /v1/case/create/new | Create new case |
| [**getAllCase**](CaseManagementApi.md#getAllCase) | **GET** /v1/case/get/all/case | Get all case fro company |
| [**getAllCaseAdmin**](CaseManagementApi.md#getAllCaseAdmin) | **GET** /v1/case/admin/get/all/case | Get all case fro company |



## createNewCase

> ModelAPIResponse createNewCase(X_AUTH_TOKEN, newCaseRequestBody)

Create new case

Create new case

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CaseManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        NewCaseRequestBody newCaseRequestBody = new NewCaseRequestBody(); // NewCaseRequestBody | 
        try {
            ModelAPIResponse result = apiInstance.createNewCase(X_AUTH_TOKEN, newCaseRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CaseManagementApi#createNewCase");
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
| **newCaseRequestBody** | [**NewCaseRequestBody**](NewCaseRequestBody.md)|  | |

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


## getAllCase

> ModelAPIResponse getAllCase(X_AUTH_TOKEN)

Get all case fro company

Get all case fro company

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CaseManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getAllCase(X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CaseManagementApi#getAllCase");
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


## getAllCaseAdmin

> ModelAPIResponse getAllCaseAdmin(companyId, X_AUTH_TOKEN)

Get all case fro company

Get all case fro company

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CaseManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
        String companyId = "companyId_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getAllCaseAdmin(companyId, X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CaseManagementApi#getAllCaseAdmin");
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
| **companyId** | **String**|  | |
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

