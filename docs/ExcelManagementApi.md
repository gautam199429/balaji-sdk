# ExcelManagementApi

All URIs are relative to *http://localhost:1010*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllUploadId**](ExcelManagementApi.md#getAllUploadId) | **GET** /v1/excel/getall/uploadid | Get All Upload Id |
| [**getAllUploadIdRecords**](ExcelManagementApi.md#getAllUploadIdRecords) | **GET** /v1/excel/get/uploadid/records | Get All Record inside Upload Id |
| [**uploadExcelFile**](ExcelManagementApi.md#uploadExcelFile) | **POST** /v1/excel/upload | Upload Excel |



## getAllUploadId

> ModelAPIResponse getAllUploadId(X_AUTH_TOKEN)

Get All Upload Id

Get All Upload Id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExcelManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        ExcelManagementApi apiInstance = new ExcelManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getAllUploadId(X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExcelManagementApi#getAllUploadId");
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


## getAllUploadIdRecords

> ModelAPIResponse getAllUploadIdRecords(uploadId, X_AUTH_TOKEN)

Get All Record inside Upload Id

Get All Record inside Upload Id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExcelManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        ExcelManagementApi apiInstance = new ExcelManagementApi(defaultClient);
        String uploadId = "uploadId_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getAllUploadIdRecords(uploadId, X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExcelManagementApi#getAllUploadIdRecords");
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
| **uploadId** | **String**|  | |
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


## uploadExcelFile

> ModelAPIResponse uploadExcelFile(X_AUTH_TOKEN, _file)

Upload Excel

Upload Excel

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExcelManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        ExcelManagementApi apiInstance = new ExcelManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        File _file = new File("/path/to/file"); // File | 
        try {
            ModelAPIResponse result = apiInstance.uploadExcelFile(X_AUTH_TOKEN, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExcelManagementApi#uploadExcelFile");
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
| **_file** | **File**|  | |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

