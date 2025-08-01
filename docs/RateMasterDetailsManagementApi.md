# RateMasterDetailsManagementApi

All URIs are relative to *http://localhost:1010*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewRate**](RateMasterDetailsManagementApi.md#createNewRate) | **POST** /v1/rate/new/create | Create new rate |
| [**getAllRates**](RateMasterDetailsManagementApi.md#getAllRates) | **GET** /v1/rate/get/all | Get all rates |
| [**getAllServices**](RateMasterDetailsManagementApi.md#getAllServices) | **GET** /v1/rate/get/services | Get all Services |



## createNewRate

> ModelAPIResponse createNewRate(X_AUTH_TOKEN, rateRequest)

Create new rate

Create new rate

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RateMasterDetailsManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        RateMasterDetailsManagementApi apiInstance = new RateMasterDetailsManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        RateRequest rateRequest = new RateRequest(); // RateRequest | 
        try {
            ModelAPIResponse result = apiInstance.createNewRate(X_AUTH_TOKEN, rateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RateMasterDetailsManagementApi#createNewRate");
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
| **rateRequest** | [**RateRequest**](RateRequest.md)|  | |

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


## getAllRates

> ModelAPIResponse getAllRates(X_AUTH_TOKEN)

Get all rates

Get all rates

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RateMasterDetailsManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        RateMasterDetailsManagementApi apiInstance = new RateMasterDetailsManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getAllRates(X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RateMasterDetailsManagementApi#getAllRates");
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


## getAllServices

> ModelAPIResponse getAllServices(X_AUTH_TOKEN)

Get all Services

Get all services

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RateMasterDetailsManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        RateMasterDetailsManagementApi apiInstance = new RateMasterDetailsManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getAllServices(X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RateMasterDetailsManagementApi#getAllServices");
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

