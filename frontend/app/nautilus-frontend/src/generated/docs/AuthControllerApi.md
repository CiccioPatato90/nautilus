# NautilusBackendApi.AuthControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loginPost**](AuthControllerApi.md#loginPost) | **POST** /login | 



## loginPost

> String loginPost(opts)



### Example

```javascript
import NautilusBackendApi from 'nautilus_backend_api';

let apiInstance = new NautilusBackendApi.AuthControllerApi();
let opts = {
  'utente': new NautilusBackendApi.Utente() // Utente | 
};
apiInstance.loginPost(opts).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **utente** | [**Utente**](Utente.md)|  | [optional] 

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

