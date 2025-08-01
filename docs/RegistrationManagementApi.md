# RegistrationManagementApi

All URIs are relative to *http://localhost:1010*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGSTINDetailsUtilityForVerify**](RegistrationManagementApi.md#getGSTINDetailsUtilityForVerify) | **GET** /v1/registration/forverify/get/details/{gstin} | Get GSTIN details from GSP |
| [**newRegistration**](RegistrationManagementApi.md#newRegistration) | **POST** /v1/registration/create/new | create new case |
| [**verifyPANumberForVerify**](RegistrationManagementApi.md#verifyPANumberForVerify) | **POST** /v1/registration/forverify/pan/verify | Fetch PAN details from NSDL |



## getGSTINDetailsUtilityForVerify

> ModelAPIResponse getGSTINDetailsUtilityForVerify(gstin, X_CLIENT_ID, X_CLIENT_SECRET)

Get GSTIN details from GSP

Get GSTIN status from GSP

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistrationManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        RegistrationManagementApi apiInstance = new RegistrationManagementApi(defaultClient);
        String gstin = "gstin_example"; // String | 
        String X_CLIENT_ID = "X_CLIENT_ID_example"; // String | 
        String X_CLIENT_SECRET = "X_CLIENT_SECRET_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getGSTINDetailsUtilityForVerify(gstin, X_CLIENT_ID, X_CLIENT_SECRET);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistrationManagementApi#getGSTINDetailsUtilityForVerify");
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
| **X_CLIENT_ID** | **String**|  | |
| **X_CLIENT_SECRET** | **String**|  | |

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


## newRegistration

> ModelAPIResponse newRegistration(newCompanyRegistrationRequest)

create new case

create new case

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistrationManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        RegistrationManagementApi apiInstance = new RegistrationManagementApi(defaultClient);
        NewCompanyRegistrationRequest newCompanyRegistrationRequest = new NewCompanyRegistrationRequest(); // NewCompanyRegistrationRequest | 
        try {
            ModelAPIResponse result = apiInstance.newRegistration(newCompanyRegistrationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistrationManagementApi#newRegistration");
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
| **newCompanyRegistrationRequest** | [**NewCompanyRegistrationRequest**](NewCompanyRegistrationRequest.md)|  | |

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


## verifyPANumberForVerify

> ModelAPIResponse verifyPANumberForVerify(pan, X_CLIENT_ID, X_CLIENT_SECRET)

Fetch PAN details from NSDL

Fetch PAN details from NSDL

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistrationManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        RegistrationManagementApi apiInstance = new RegistrationManagementApi(defaultClient);
        String pan = "pan_example"; // String | 
        String X_CLIENT_ID = "X_CLIENT_ID_example"; // String | 
        String X_CLIENT_SECRET = "X_CLIENT_SECRET_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.verifyPANumberForVerify(pan, X_CLIENT_ID, X_CLIENT_SECRET);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistrationManagementApi#verifyPANumberForVerify");
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
| **pan** | **String**|  | |
| **X_CLIENT_ID** | **String**|  | |
| **X_CLIENT_SECRET** | **String**|  | |

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

