# MemeberOfManagementApi

All URIs are relative to *http://localhost:1010*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllMemeber**](MemeberOfManagementApi.md#getAllMemeber) | **GET** /v1/utility/get/all/member | Get All Memeber |



## getAllMemeber

> ModelAPIResponse getAllMemeber()

Get All Memeber

Get All Memeber

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MemeberOfManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        MemeberOfManagementApi apiInstance = new MemeberOfManagementApi(defaultClient);
        try {
            ModelAPIResponse result = apiInstance.getAllMemeber();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MemeberOfManagementApi#getAllMemeber");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

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

