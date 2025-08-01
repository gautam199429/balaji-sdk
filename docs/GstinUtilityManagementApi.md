# GstinUtilityManagementApi

All URIs are relative to *http://localhost:1010*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllFy**](GstinUtilityManagementApi.md#getAllFy) | **GET** /v1/utility/fy/getall | Get all finacial years |
| [**getAllReturnType**](GstinUtilityManagementApi.md#getAllReturnType) | **GET** /v1/utility/ret/type/getall | Get all return types |
| [**getGSTINStatus1**](GstinUtilityManagementApi.md#getGSTINStatus1) | **GET** /v1/utility/gstin/get/status/{gstin} | Get GSTIN status from DB |
| [**getPreferenceDetailsGSTIN1**](GstinUtilityManagementApi.md#getPreferenceDetailsGSTIN1) | **GET** /v1/utility/gstin/get/preference/details/{gstin} | Get GSTIN preference from DB |
| [**getTrackDetailsGSTIN1**](GstinUtilityManagementApi.md#getTrackDetailsGSTIN1) | **GET** /v1/utility/gstin/get/track/details/{gstin} | Get GSTIN track details from DB |



## getAllFy

> ModelAPIResponse getAllFy(X_AUTH_TOKEN)

Get all finacial years

Get all finacial years

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GstinUtilityManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        GstinUtilityManagementApi apiInstance = new GstinUtilityManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getAllFy(X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GstinUtilityManagementApi#getAllFy");
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
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getAllReturnType

> ModelAPIResponse getAllReturnType(X_AUTH_TOKEN)

Get all return types

Get all return types

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GstinUtilityManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        GstinUtilityManagementApi apiInstance = new GstinUtilityManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getAllReturnType(X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GstinUtilityManagementApi#getAllReturnType");
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
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getGSTINStatus1

> ModelAPIResponse getGSTINStatus1(gstin, caseId, X_AUTH_TOKEN)

Get GSTIN status from DB

Get GSTIN status from DB

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GstinUtilityManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        GstinUtilityManagementApi apiInstance = new GstinUtilityManagementApi(defaultClient);
        String gstin = "gstin_example"; // String | 
        String caseId = "caseId_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getGSTINStatus1(gstin, caseId, X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GstinUtilityManagementApi#getGSTINStatus1");
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
| **gstin** | **String**|  | |
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


## getPreferenceDetailsGSTIN1

> ModelAPIResponse getPreferenceDetailsGSTIN1(gstin, fy, caseId, X_AUTH_TOKEN)

Get GSTIN preference from DB

Get GSTIN preference from DB

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GstinUtilityManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        GstinUtilityManagementApi apiInstance = new GstinUtilityManagementApi(defaultClient);
        String gstin = "gstin_example"; // String | 
        String fy = "fy_example"; // String | 
        String caseId = "caseId_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getPreferenceDetailsGSTIN1(gstin, fy, caseId, X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GstinUtilityManagementApi#getPreferenceDetailsGSTIN1");
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
| **gstin** | **String**|  | |
| **fy** | **String**|  | |
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


## getTrackDetailsGSTIN1

> ModelAPIResponse getTrackDetailsGSTIN1(gstin, fy, type, caseId, X_AUTH_TOKEN)

Get GSTIN track details from DB

Get GSTIN track details from DB

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GstinUtilityManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        GstinUtilityManagementApi apiInstance = new GstinUtilityManagementApi(defaultClient);
        String gstin = "gstin_example"; // String | 
        String fy = "fy_example"; // String | 
        String type = "type_example"; // String | 
        String caseId = "caseId_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getTrackDetailsGSTIN1(gstin, fy, type, caseId, X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GstinUtilityManagementApi#getTrackDetailsGSTIN1");
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
| **gstin** | **String**|  | |
| **fy** | **String**|  | |
| **type** | **String**|  | |
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

