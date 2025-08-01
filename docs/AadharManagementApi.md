# AadharManagementApi

All URIs are relative to *http://localhost:1010*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAadhar**](AadharManagementApi.md#deleteAadhar) | **GET** /v1/aadhar/delete/aadhar | Delete aadhar details |
| [**getAllAadhar**](AadharManagementApi.md#getAllAadhar) | **GET** /v1/aadhar/get/all/aadhar | Get aadhar details |
| [**sendOTPAadhar**](AadharManagementApi.md#sendOTPAadhar) | **POST** /v1/aadhar/send/otp | Send aadhar OTP |
| [**submitOTP**](AadharManagementApi.md#submitOTP) | **POST** /v1/aadhar/submit/otp | Submit aadhar OTP |



## deleteAadhar

> ModelAPIResponse deleteAadhar(caseId, aadharNumber, X_AUTH_TOKEN)

Delete aadhar details

Delete aadhar OTP

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AadharManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        AadharManagementApi apiInstance = new AadharManagementApi(defaultClient);
        String caseId = "caseId_example"; // String | 
        Long aadharNumber = 56L; // Long | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.deleteAadhar(caseId, aadharNumber, X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AadharManagementApi#deleteAadhar");
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
| **aadharNumber** | **Long**|  | |
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


## getAllAadhar

> ModelAPIResponse getAllAadhar(caseId, X_AUTH_TOKEN)

Get aadhar details

Submit aadhar OTP

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AadharManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        AadharManagementApi apiInstance = new AadharManagementApi(defaultClient);
        String caseId = "caseId_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getAllAadhar(caseId, X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AadharManagementApi#getAllAadhar");
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


## sendOTPAadhar

> ModelAPIResponse sendOTPAadhar(caseId, X_AUTH_TOKEN, uidiaRequestBody)

Send aadhar OTP

Send aadhar OTP

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AadharManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        AadharManagementApi apiInstance = new AadharManagementApi(defaultClient);
        String caseId = "caseId_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        UidiaRequestBody uidiaRequestBody = new UidiaRequestBody(); // UidiaRequestBody | 
        try {
            ModelAPIResponse result = apiInstance.sendOTPAadhar(caseId, X_AUTH_TOKEN, uidiaRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AadharManagementApi#sendOTPAadhar");
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
| **uidiaRequestBody** | [**UidiaRequestBody**](UidiaRequestBody.md)|  | |

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


## submitOTP

> ModelAPIResponse submitOTP(caseId, X_AUTH_TOKEN, submitOTP)

Submit aadhar OTP

Submit aadhar OTP

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AadharManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        AadharManagementApi apiInstance = new AadharManagementApi(defaultClient);
        String caseId = "caseId_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        SubmitOTP submitOTP = new SubmitOTP(); // SubmitOTP | 
        try {
            ModelAPIResponse result = apiInstance.submitOTP(caseId, X_AUTH_TOKEN, submitOTP);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AadharManagementApi#submitOTP");
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
| **submitOTP** | [**SubmitOTP**](SubmitOTP.md)|  | |

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

