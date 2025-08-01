# GstinManagementApi

All URIs are relative to *http://localhost:1010*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteGSTIN**](GstinManagementApi.md#deleteGSTIN) | **POST** /v1/gstin/delete/gstin | Delete GSTIN details |
| [**getDetailsGSTIN**](GstinManagementApi.md#getDetailsGSTIN) | **POST** /v1/gstin/get/all/gstin | Get all GSTIN |
| [**getDetailsGSTIN1**](GstinManagementApi.md#getDetailsGSTIN1) | **POST** /v1/gstin/add/gstin | Add new GSTIN |
| [**getGSTINStatus**](GstinManagementApi.md#getGSTINStatus) | **POST** /v1/gstin/update/status | Update GSTIN current status from GSP |
| [**getPreferenceDetailsGSTIN**](GstinManagementApi.md#getPreferenceDetailsGSTIN) | **POST** /v1/gstin/update/preference/details | Update GSTIN preference details GSP |
| [**getTrackDetailsGSTIN**](GstinManagementApi.md#getTrackDetailsGSTIN) | **POST** /v1/gstin/update/track/details | Update GSTIN return track status details GSP |



## deleteGSTIN

> ModelAPIResponse deleteGSTIN(X_AUTH_TOKEN, gstinRequest)

Delete GSTIN details

Delete GSTIN details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GstinManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        GstinManagementApi apiInstance = new GstinManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        GstinRequest gstinRequest = new GstinRequest(); // GstinRequest | 
        try {
            ModelAPIResponse result = apiInstance.deleteGSTIN(X_AUTH_TOKEN, gstinRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GstinManagementApi#deleteGSTIN");
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
| **gstinRequest** | [**GstinRequest**](GstinRequest.md)|  | |

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


## getDetailsGSTIN

> ModelAPIResponse getDetailsGSTIN(caseId, X_AUTH_TOKEN)

Get all GSTIN

Get all GSTIN

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GstinManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        GstinManagementApi apiInstance = new GstinManagementApi(defaultClient);
        String caseId = "caseId_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getDetailsGSTIN(caseId, X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GstinManagementApi#getDetailsGSTIN");
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


## getDetailsGSTIN1

> ModelAPIResponse getDetailsGSTIN1(X_AUTH_TOKEN, gstinRequest)

Add new GSTIN

Add new GSTIN

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GstinManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        GstinManagementApi apiInstance = new GstinManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        GstinRequest gstinRequest = new GstinRequest(); // GstinRequest | 
        try {
            ModelAPIResponse result = apiInstance.getDetailsGSTIN1(X_AUTH_TOKEN, gstinRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GstinManagementApi#getDetailsGSTIN1");
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
| **gstinRequest** | [**GstinRequest**](GstinRequest.md)|  | |

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


## getGSTINStatus

> ModelAPIResponse getGSTINStatus(X_AUTH_TOKEN, gstinRequest)

Update GSTIN current status from GSP

Update GSTIN current status from GSP

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GstinManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        GstinManagementApi apiInstance = new GstinManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        GstinRequest gstinRequest = new GstinRequest(); // GstinRequest | 
        try {
            ModelAPIResponse result = apiInstance.getGSTINStatus(X_AUTH_TOKEN, gstinRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GstinManagementApi#getGSTINStatus");
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
| **gstinRequest** | [**GstinRequest**](GstinRequest.md)|  | |

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


## getPreferenceDetailsGSTIN

> ModelAPIResponse getPreferenceDetailsGSTIN(fy, X_AUTH_TOKEN, gstinRequest)

Update GSTIN preference details GSP

Update GSTIN preference details GSP

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GstinManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        GstinManagementApi apiInstance = new GstinManagementApi(defaultClient);
        String fy = "fy_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        GstinRequest gstinRequest = new GstinRequest(); // GstinRequest | 
        try {
            ModelAPIResponse result = apiInstance.getPreferenceDetailsGSTIN(fy, X_AUTH_TOKEN, gstinRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GstinManagementApi#getPreferenceDetailsGSTIN");
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
| **fy** | **String**|  | |
| **X_AUTH_TOKEN** | **String**|  | |
| **gstinRequest** | [**GstinRequest**](GstinRequest.md)|  | |

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


## getTrackDetailsGSTIN

> ModelAPIResponse getTrackDetailsGSTIN(fy, type, X_AUTH_TOKEN, gstinRequest)

Update GSTIN return track status details GSP

Update GSTIN return track status details GSP

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GstinManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        GstinManagementApi apiInstance = new GstinManagementApi(defaultClient);
        String fy = "fy_example"; // String | 
        String type = "type_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        GstinRequest gstinRequest = new GstinRequest(); // GstinRequest | 
        try {
            ModelAPIResponse result = apiInstance.getTrackDetailsGSTIN(fy, type, X_AUTH_TOKEN, gstinRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GstinManagementApi#getTrackDetailsGSTIN");
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
| **fy** | **String**|  | |
| **type** | **String**|  | |
| **X_AUTH_TOKEN** | **String**|  | |
| **gstinRequest** | [**GstinRequest**](GstinRequest.md)|  | |

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

