# SessionManagementApi

All URIs are relative to *http://localhost:1010*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approveRejectCompany**](SessionManagementApi.md#approveRejectCompany) | **POST** /v1/session/login | Login |
| [**approveRejectCompany1**](SessionManagementApi.md#approveRejectCompany1) | **GET** /v1/session/logout | Get all case |



## approveRejectCompany

> ModelAPIResponse approveRejectCompany(loginRequestBody)

Login

Login

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SessionManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        SessionManagementApi apiInstance = new SessionManagementApi(defaultClient);
        LoginRequestBody loginRequestBody = new LoginRequestBody(); // LoginRequestBody | 
        try {
            ModelAPIResponse result = apiInstance.approveRejectCompany(loginRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionManagementApi#approveRejectCompany");
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
| **loginRequestBody** | [**LoginRequestBody**](LoginRequestBody.md)|  | |

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


## approveRejectCompany1

> ModelAPIResponse approveRejectCompany1(X_AUTH_TOKEN)

Get all case

Get all case

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SessionManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        SessionManagementApi apiInstance = new SessionManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.approveRejectCompany1(X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionManagementApi#approveRejectCompany1");
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

