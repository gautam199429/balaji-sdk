# BarcodeManagementApi

All URIs are relative to *http://localhost:1010*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewBarCode**](BarcodeManagementApi.md#createNewBarCode) | **GET** /v1/barcode/generatre/barcode | Create new barcode |
| [**getAadharDetails**](BarcodeManagementApi.md#getAadharDetails) | **GET** /v1/barcode/get/aadhar/details | Get aadhar details from Barcode |
| [**getAllBankFromBarcode**](BarcodeManagementApi.md#getAllBankFromBarcode) | **GET** /v1/barcode/get/bank/details | Get all bank details from barcode |
| [**getCompanyMasterDetailsFromBarcode**](BarcodeManagementApi.md#getCompanyMasterDetailsFromBarcode) | **GET** /v1/barcode/get/master/details | Get company master details from barcode |
| [**getDetailsFromPanNumberBarcode**](BarcodeManagementApi.md#getDetailsFromPanNumberBarcode) | **GET** /v1/barcode/get/pan/details | Fetch PAN details from Barcode |
| [**getDetailsGSTINBarcode**](BarcodeManagementApi.md#getDetailsGSTINBarcode) | **GET** /v1/barcode/get/gstin/details | Get all GSTIN From Barcode |
| [**getElectricityDetails1**](BarcodeManagementApi.md#getElectricityDetails1) | **GET** /v1/barcode/get/electricity/details | Get Electricity Bill Details from Barcode |
| [**getGSTINStatusBarcode**](BarcodeManagementApi.md#getGSTINStatusBarcode) | **GET** /v1/barcode/get/gstin/status/{gstin} | Get GSTIN status from DB |
| [**getIECDetailsFromBarcode**](BarcodeManagementApi.md#getIECDetailsFromBarcode) | **GET** /v1/barcode/get/iec/details | Get IEC details from Barcode |
| [**getPreferenceDetailsGSTINBarcode**](BarcodeManagementApi.md#getPreferenceDetailsGSTINBarcode) | **GET** /v1/barcode/get/gstin/preference/details/{gstin} | Get GSTIN preference from DB |
| [**getSignatoryDetailsFromBarcode**](BarcodeManagementApi.md#getSignatoryDetailsFromBarcode) | **GET** /v1/barcode/get/signatory/details | Get MCA signatory details from Barcode |
| [**getTrackDetailsGSTINBarcode**](BarcodeManagementApi.md#getTrackDetailsGSTINBarcode) | **GET** /v1/barcode/get/gstin/track/details/{gstin} | Get GSTIN track details from DB |
| [**sharebarCode**](BarcodeManagementApi.md#sharebarCode) | **POST** /v1/barcode/share/barcode | Share Bar Code |



## createNewBarCode

> ModelAPIResponse createNewBarCode(caseId, X_AUTH_TOKEN)

Create new barcode

Create new barcode

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BarcodeManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        BarcodeManagementApi apiInstance = new BarcodeManagementApi(defaultClient);
        String caseId = "caseId_example"; // String | 
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.createNewBarCode(caseId, X_AUTH_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BarcodeManagementApi#createNewBarCode");
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


## getAadharDetails

> ModelAPIResponse getAadharDetails(barcodeToken)

Get aadhar details from Barcode

Get aadhar details Details from Barcode

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BarcodeManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        BarcodeManagementApi apiInstance = new BarcodeManagementApi(defaultClient);
        String barcodeToken = "barcodeToken_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getAadharDetails(barcodeToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BarcodeManagementApi#getAadharDetails");
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
| **barcodeToken** | **String**|  | |

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


## getAllBankFromBarcode

> ModelAPIResponse getAllBankFromBarcode(barcodeToken)

Get all bank details from barcode

Get all bank details from barcode

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BarcodeManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        BarcodeManagementApi apiInstance = new BarcodeManagementApi(defaultClient);
        String barcodeToken = "barcodeToken_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getAllBankFromBarcode(barcodeToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BarcodeManagementApi#getAllBankFromBarcode");
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
| **barcodeToken** | **String**|  | |

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


## getCompanyMasterDetailsFromBarcode

> ModelAPIResponse getCompanyMasterDetailsFromBarcode(barcodeToken)

Get company master details from barcode

Get company master details from barcode

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BarcodeManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        BarcodeManagementApi apiInstance = new BarcodeManagementApi(defaultClient);
        String barcodeToken = "barcodeToken_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getCompanyMasterDetailsFromBarcode(barcodeToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BarcodeManagementApi#getCompanyMasterDetailsFromBarcode");
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
| **barcodeToken** | **String**|  | |

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


## getDetailsFromPanNumberBarcode

> ModelAPIResponse getDetailsFromPanNumberBarcode(barcodeToken)

Fetch PAN details from Barcode

Fetch PAN details from Barcode

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BarcodeManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        BarcodeManagementApi apiInstance = new BarcodeManagementApi(defaultClient);
        String barcodeToken = "barcodeToken_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getDetailsFromPanNumberBarcode(barcodeToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BarcodeManagementApi#getDetailsFromPanNumberBarcode");
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
| **barcodeToken** | **String**|  | |

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


## getDetailsGSTINBarcode

> ModelAPIResponse getDetailsGSTINBarcode(barcodeToken)

Get all GSTIN From Barcode

Get all GSTIN From Barcode

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BarcodeManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        BarcodeManagementApi apiInstance = new BarcodeManagementApi(defaultClient);
        String barcodeToken = "barcodeToken_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getDetailsGSTINBarcode(barcodeToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BarcodeManagementApi#getDetailsGSTINBarcode");
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
| **barcodeToken** | **String**|  | |

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


## getElectricityDetails1

> ModelAPIResponse getElectricityDetails1(barcodeToken)

Get Electricity Bill Details from Barcode

Get Electricity Bill Details from Barcode

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BarcodeManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        BarcodeManagementApi apiInstance = new BarcodeManagementApi(defaultClient);
        String barcodeToken = "barcodeToken_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getElectricityDetails1(barcodeToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BarcodeManagementApi#getElectricityDetails1");
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
| **barcodeToken** | **String**|  | |

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


## getGSTINStatusBarcode

> ModelAPIResponse getGSTINStatusBarcode(gstin, barcode)

Get GSTIN status from DB

Get GSTIN status from DB

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BarcodeManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        BarcodeManagementApi apiInstance = new BarcodeManagementApi(defaultClient);
        String gstin = "gstin_example"; // String | 
        String barcode = "barcode_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getGSTINStatusBarcode(gstin, barcode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BarcodeManagementApi#getGSTINStatusBarcode");
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
| **barcode** | **String**|  | |

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


## getIECDetailsFromBarcode

> ModelAPIResponse getIECDetailsFromBarcode(barcodeToken)

Get IEC details from Barcode

Get IEC details from Barcode

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BarcodeManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        BarcodeManagementApi apiInstance = new BarcodeManagementApi(defaultClient);
        String barcodeToken = "barcodeToken_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getIECDetailsFromBarcode(barcodeToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BarcodeManagementApi#getIECDetailsFromBarcode");
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
| **barcodeToken** | **String**|  | |

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


## getPreferenceDetailsGSTINBarcode

> ModelAPIResponse getPreferenceDetailsGSTINBarcode(gstin, fy, barcode)

Get GSTIN preference from DB

Get GSTIN preference from DB

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BarcodeManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        BarcodeManagementApi apiInstance = new BarcodeManagementApi(defaultClient);
        String gstin = "gstin_example"; // String | 
        String fy = "fy_example"; // String | 
        String barcode = "barcode_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getPreferenceDetailsGSTINBarcode(gstin, fy, barcode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BarcodeManagementApi#getPreferenceDetailsGSTINBarcode");
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
| **barcode** | **String**|  | |

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


## getSignatoryDetailsFromBarcode

> ModelAPIResponse getSignatoryDetailsFromBarcode(barcodeToken)

Get MCA signatory details from Barcode

Get MCA signatory details from Barcode

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BarcodeManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        BarcodeManagementApi apiInstance = new BarcodeManagementApi(defaultClient);
        String barcodeToken = "barcodeToken_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getSignatoryDetailsFromBarcode(barcodeToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BarcodeManagementApi#getSignatoryDetailsFromBarcode");
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
| **barcodeToken** | **String**|  | |

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


## getTrackDetailsGSTINBarcode

> ModelAPIResponse getTrackDetailsGSTINBarcode(gstin, fy, type, barcode)

Get GSTIN track details from DB

Get GSTIN track details from DB

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BarcodeManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        BarcodeManagementApi apiInstance = new BarcodeManagementApi(defaultClient);
        String gstin = "gstin_example"; // String | 
        String fy = "fy_example"; // String | 
        String type = "type_example"; // String | 
        String barcode = "barcode_example"; // String | 
        try {
            ModelAPIResponse result = apiInstance.getTrackDetailsGSTINBarcode(gstin, fy, type, barcode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BarcodeManagementApi#getTrackDetailsGSTINBarcode");
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
| **barcode** | **String**|  | |

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


## sharebarCode

> ModelAPIResponse sharebarCode(X_AUTH_TOKEN, barCodeShareRequestBody)

Share Bar Code

Share Bar Code

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BarcodeManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1010");

        BarcodeManagementApi apiInstance = new BarcodeManagementApi(defaultClient);
        String X_AUTH_TOKEN = "X_AUTH_TOKEN_example"; // String | 
        BarCodeShareRequestBody barCodeShareRequestBody = new BarCodeShareRequestBody(); // BarCodeShareRequestBody | 
        try {
            ModelAPIResponse result = apiInstance.sharebarCode(X_AUTH_TOKEN, barCodeShareRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BarcodeManagementApi#sharebarCode");
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
| **barCodeShareRequestBody** | [**BarCodeShareRequestBody**](BarCodeShareRequestBody.md)|  | |

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

