# NautilusBackendApi.RepartiControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**repartiListGet**](RepartiControllerApi.md#repartiListGet) | **GET** /reparti/list | 
[**repartiRepartoIdPost**](RepartiControllerApi.md#repartiRepartoIdPost) | **POST** /reparti/{repartoId} | 



## repartiListGet

> [Reparti] repartiListGet()



### Example

```javascript
import NautilusBackendApi from 'nautilus_backend_api';

let apiInstance = new NautilusBackendApi.RepartiControllerApi();
apiInstance.repartiListGet().then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters

This endpoint does not need any parameter.

### Return type

[**[Reparti]**](Reparti.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## repartiRepartoIdPost

> Reparti repartiRepartoIdPost(repartoId)



### Example

```javascript
import NautilusBackendApi from 'nautilus_backend_api';

let apiInstance = new NautilusBackendApi.RepartiControllerApi();
let repartoId = 56; // Number | 
apiInstance.repartiRepartoIdPost(repartoId).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repartoId** | **Number**|  | 

### Return type

[**Reparti**](Reparti.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

