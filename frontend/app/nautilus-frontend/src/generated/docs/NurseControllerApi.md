# NautilusBackendApi.NurseControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**nursesListGet**](NurseControllerApi.md#nursesListGet) | **GET** /nurses/list | 
[**nursesNurseIdPost**](NurseControllerApi.md#nursesNurseIdPost) | **POST** /nurses/{nurseId} | 



## nursesListGet

> [Nurse] nursesListGet()



### Example

```javascript
import NautilusBackendApi from 'nautilus_backend_api';

let apiInstance = new NautilusBackendApi.NurseControllerApi();
apiInstance.nursesListGet().then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters

This endpoint does not need any parameter.

### Return type

[**[Nurse]**](Nurse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## nursesNurseIdPost

> Nurse nursesNurseIdPost(nurseId)



### Example

```javascript
import NautilusBackendApi from 'nautilus_backend_api';

let apiInstance = new NautilusBackendApi.NurseControllerApi();
let nurseId = 56; // Number | 
apiInstance.nursesNurseIdPost(nurseId).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nurseId** | **Number**|  | 

### Return type

[**Nurse**](Nurse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

