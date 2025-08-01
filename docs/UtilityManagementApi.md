# UtilityManagementApi

All URIs are relative to *http://localhost:1010*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllDetailsFromDB**](UtilityManagementApi.md#getAllDetailsFromDB) | **GET** /v1/utility/get/all/details | Get All Details |
| [**getCompanyLiteDetailsUtility**](UtilityManagementApi.md#getCompanyLiteDetailsUtility) | **POST** /v1/utility/company/ciin/lookup | Get Company Lite Details from NSDL |
| [**getElectricityDetails**](UtilityManagementApi.md#getElectricityDetails) | **POST** /v1/utility/electricity/details | Get Electricity bill details |
| [**getGSTINDetailsUtility**](UtilityManagementApi.md#getGSTINDetailsUtility) | **GET** /v1/utility/get/details/{gstin} | Get GSTIN details from GSP |
| [**getGSTINStatusUtility**](UtilityManagementApi.md#getGSTINStatusUtility) | **GET** /v1/utility/get/status/{gstin} | Get GSTIN status from GSP |
| [**getIECDetailsUtility**](UtilityManagementApi.md#getIECDetailsUtility) | **POST** /v1/utility/iec/details | Get IEC details from NSDL |
| [**getPreferenceDetailsGSTINUtility**](UtilityManagementApi.md#getPreferenceDetailsGSTINUtility) | **GET** /v1/utility/get/preference/details/{gstin} | Get GSTIN preference from GSP |
| [**getSignatoryDetailsUtility**](UtilityManagementApi.md#getSignatoryDetailsUtility) | **POST** /v1/utility/signatory/details | Get MCA signatory details from NSDL |
| [**getTrackDetailsGSTINUtility**](UtilityManagementApi.md#getTrackDetailsGSTINUtility) | **GET** /v1/utility/get/track/details/{gstin} | Get GSTIN track details from GSP |
| [**updateCompanyMasterDetails**](UtilityManagementApi.md#updateCompanyMasterDetails) | **POST** /v1/utility/company/master/details | Update Company Master Details |
| [**verifyBankUtility**](UtilityManagementApi.md#verifyBankUtility) | **POST** /v1/utility/bank/verify | Verify new bank details |
| [**verifyPANumber**](UtilityManagementApi.md#verifyPANumber) | **POST** /v1/utility/pan/verify | Fetch PAN details from NSDL |



## getAllDetailsFromDB

> ModelAPIResponse getAllDetailsFromDB(filter, X_AUTH_TOKEN)

Get All Details

Get Individual Details from DB

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        UtilityManagementApi apiInstance = new UtilityManagementApi(defaultClient);
        String filter = "PAN"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getAllDetailsFromDB(filter, X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityManagementApi#getAllDetailsFromDB");
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
| **filter** | **String**|  | [enum: PAN, GSTIN, BANK, IEC, ELECTRICITY, SIGNATORY, MASTERDATA] |
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


## getCompanyLiteDetailsUtility

> ModelAPIResponse getCompanyLiteDetailsUtility(X_AUTH_TOKEN, mcASignatoryRequest)

Get Company Lite Details from NSDL

Get MCA signatory details from NSDL

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        UtilityManagementApi apiInstance = new UtilityManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        MCASignatoryRequest mcASignatoryRequest = new MCASignatoryRequest(); // MCASignatoryRequest | 
        try {
            ModelAPIResponse result = apiInstance.getCompanyLiteDetailsUtility(X_AUTH_TOKEN, mcASignatoryRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityManagementApi#getCompanyLiteDetailsUtility");
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
| **mcASignatoryRequest** | [**MCASignatoryRequest**](MCASignatoryRequest.md)|  | |

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


## getElectricityDetails

> ModelAPIResponse getElectricityDetails(X_AUTH_TOKEN, nsDLElectricityBillRequest)

Get Electricity bill details

Get Electricity bill details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        UtilityManagementApi apiInstance = new UtilityManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        NSDLElectricityBillRequest nsDLElectricityBillRequest = new NSDLElectricityBillRequest(); // NSDLElectricityBillRequest | 
        try {
            ModelAPIResponse result = apiInstance.getElectricityDetails(X_AUTH_TOKEN, nsDLElectricityBillRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityManagementApi#getElectricityDetails");
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
| **nsDLElectricityBillRequest** | [**NSDLElectricityBillRequest**](NSDLElectricityBillRequest.md)|  | |

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


## getGSTINDetailsUtility

> ModelAPIResponse getGSTINDetailsUtility(gstin, X_AUTH_TOKEN)

Get GSTIN details from GSP

Get GSTIN status from GSP

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        UtilityManagementApi apiInstance = new UtilityManagementApi(defaultClient);
        String gstin = "gstin_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getGSTINDetailsUtility(gstin, X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityManagementApi#getGSTINDetailsUtility");
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


## getGSTINStatusUtility

> ModelAPIResponse getGSTINStatusUtility(gstin, X_AUTH_TOKEN)

Get GSTIN status from GSP

Get GSTIN status from GSP

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        UtilityManagementApi apiInstance = new UtilityManagementApi(defaultClient);
        String gstin = "gstin_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getGSTINStatusUtility(gstin, X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityManagementApi#getGSTINStatusUtility");
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


## getIECDetailsUtility

> ModelAPIResponse getIECDetailsUtility(X_AUTH_TOKEN, mcASignatoryRequest)

Get IEC details from NSDL

Get IEC details from NSDL

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        UtilityManagementApi apiInstance = new UtilityManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        MCASignatoryRequest mcASignatoryRequest = new MCASignatoryRequest(); // MCASignatoryRequest | 
        try {
            ModelAPIResponse result = apiInstance.getIECDetailsUtility(X_AUTH_TOKEN, mcASignatoryRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityManagementApi#getIECDetailsUtility");
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
| **mcASignatoryRequest** | [**MCASignatoryRequest**](MCASignatoryRequest.md)|  | |

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


## getPreferenceDetailsGSTINUtility

> ModelAPIResponse getPreferenceDetailsGSTINUtility(gstin, fy, X_AUTH_TOKEN)

Get GSTIN preference from GSP

Get GSTIN preference from GSP

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        UtilityManagementApi apiInstance = new UtilityManagementApi(defaultClient);
        String gstin = "gstin_example"; // String | 
        String fy = "fy_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getPreferenceDetailsGSTINUtility(gstin, fy, X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityManagementApi#getPreferenceDetailsGSTINUtility");
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


## getSignatoryDetailsUtility

> ModelAPIResponse getSignatoryDetailsUtility(X_AUTH_TOKEN, mcASignatoryRequest)

Get MCA signatory details from NSDL

Get MCA signatory details from NSDL

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        UtilityManagementApi apiInstance = new UtilityManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        MCASignatoryRequest mcASignatoryRequest = new MCASignatoryRequest(); // MCASignatoryRequest | 
        try {
            ModelAPIResponse result = apiInstance.getSignatoryDetailsUtility(X_AUTH_TOKEN, mcASignatoryRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityManagementApi#getSignatoryDetailsUtility");
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
| **mcASignatoryRequest** | [**MCASignatoryRequest**](MCASignatoryRequest.md)|  | |

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


## getTrackDetailsGSTINUtility

> ModelAPIResponse getTrackDetailsGSTINUtility(gstin, fy, type, X_AUTH_TOKEN)

Get GSTIN track details from GSP

Get GSTIN track details from GSP

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        UtilityManagementApi apiInstance = new UtilityManagementApi(defaultClient);
        String gstin = "gstin_example"; // String | 
        String fy = "fy_example"; // String | 
        String type = "type_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getTrackDetailsGSTINUtility(gstin, fy, type, X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityManagementApi#getTrackDetailsGSTINUtility");
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


## updateCompanyMasterDetails

> ModelAPIResponse updateCompanyMasterDetails(X_AUTH_TOKEN, mcACompanyMasterDataRequest)

Update Company Master Details

Update Company Master Details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        UtilityManagementApi apiInstance = new UtilityManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        MCACompanyMasterDataRequest mcACompanyMasterDataRequest = new MCACompanyMasterDataRequest(); // MCACompanyMasterDataRequest | 
        try {
            ModelAPIResponse result = apiInstance.updateCompanyMasterDetails(X_AUTH_TOKEN, mcACompanyMasterDataRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityManagementApi#updateCompanyMasterDetails");
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
| **mcACompanyMasterDataRequest** | [**MCACompanyMasterDataRequest**](MCACompanyMasterDataRequest.md)|  | |

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


## verifyBankUtility

> ModelAPIResponse verifyBankUtility(X_AUTH_TOKEN, bankAccountVerification)

Verify new bank details

Verify new bank details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        UtilityManagementApi apiInstance = new UtilityManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        BankAccountVerification bankAccountVerification = new BankAccountVerification(); // BankAccountVerification | 
        try {
            ModelAPIResponse result = apiInstance.verifyBankUtility(X_AUTH_TOKEN, bankAccountVerification);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityManagementApi#verifyBankUtility");
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


## verifyPANumber

> ModelAPIResponse verifyPANumber(pan, X_AUTH_TOKEN)

Fetch PAN details from NSDL

Fetch PAN details from NSDL

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        UtilityManagementApi apiInstance = new UtilityManagementApi(defaultClient);
        String pan = "pan_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.verifyPANumber(pan, X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityManagementApi#verifyPANumber");
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

