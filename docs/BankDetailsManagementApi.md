# BankDetailsManagementApi

All URIs are relative to *http://localhost:1010*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewAndVerify**](BankDetailsManagementApi.md#addNewAndVerify) | **POST** /v1/bank/add/verify | Add and verify new bank details |
| [**deleteBank**](BankDetailsManagementApi.md#deleteBank) | **POST** /v1/bank/delete/bank | Delete bank details |
| [**getAllBank**](BankDetailsManagementApi.md#getAllBank) | **GET** /v1/bank/get/all | Get all bank details |



## addNewAndVerify

> ModelAPIResponse addNewAndVerify(X_AUTH_TOKEN, bankAccountVerification)

Add and verify new bank details

Add and verify new bank details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankDetailsManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        BankDetailsManagementApi apiInstance = new BankDetailsManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        BankAccountVerification bankAccountVerification = new BankAccountVerification(); // BankAccountVerification | 
        try {
            ModelAPIResponse result = apiInstance.addNewAndVerify(X_AUTH_TOKEN, bankAccountVerification);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BankDetailsManagementApi#addNewAndVerify");
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
| **bankAccountVerification** | [**BankAccountVerification**](BankAccountVerification.md)|  | |

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


## deleteBank

> ModelAPIResponse deleteBank(X_AUTH_TOKEN, bankAccountVerification)

Delete bank details

Delete bank Details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankDetailsManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        BankDetailsManagementApi apiInstance = new BankDetailsManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        BankAccountVerification bankAccountVerification = new BankAccountVerification(); // BankAccountVerification | 
        try {
            ModelAPIResponse result = apiInstance.deleteBank(X_AUTH_TOKEN, bankAccountVerification);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BankDetailsManagementApi#deleteBank");
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
| **bankAccountVerification** | [**BankAccountVerification**](BankAccountVerification.md)|  | |

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


## getAllBank

> ModelAPIResponse getAllBank(caseId, X_AUTH_TOKEN)

Get all bank details

Get all bank details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BankDetailsManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        BankDetailsManagementApi apiInstance = new BankDetailsManagementApi(defaultClient);
        String caseId = "caseId_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getAllBank(caseId, X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BankDetailsManagementApi#getAllBank");
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

