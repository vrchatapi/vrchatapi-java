# AuthenticationApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelPending2FA**](AuthenticationApi.md#cancelPending2FA) | **DELETE** /auth/twofactorauth/totp/pending | Cancel pending enabling of time-based 2FA codes |
| [**checkUserExists**](AuthenticationApi.md#checkUserExists) | **GET** /auth/exists | Check User Exists |
| [**confirmEmail**](AuthenticationApi.md#confirmEmail) | **GET** /auth/confirmEmail | Confirm Email |
| [**deleteUser**](AuthenticationApi.md#deleteUser) | **PUT** /users/{userId}/delete | Delete User |
| [**disable2FA**](AuthenticationApi.md#disable2FA) | **DELETE** /auth/twofactorauth | Disable 2FA |
| [**enable2FA**](AuthenticationApi.md#enable2FA) | **POST** /auth/twofactorauth/totp/pending | Enable time-based 2FA codes |
| [**getCurrentUser**](AuthenticationApi.md#getCurrentUser) | **GET** /auth/user | Login and/or Get Current User Info |
| [**getRecoveryCodes**](AuthenticationApi.md#getRecoveryCodes) | **GET** /auth/user/twofactorauth/otp | Get 2FA Recovery codes |
| [**logout**](AuthenticationApi.md#logout) | **PUT** /logout | Logout |
| [**registerUserAccount**](AuthenticationApi.md#registerUserAccount) | **POST** /auth/register | Register User Account |
| [**resendEmailConfirmation**](AuthenticationApi.md#resendEmailConfirmation) | **POST** /auth/user/resendEmail | Resend Email Confirmation |
| [**verify2FA**](AuthenticationApi.md#verify2FA) | **POST** /auth/twofactorauth/totp/verify | Verify 2FA code |
| [**verify2FAEmailCode**](AuthenticationApi.md#verify2FAEmailCode) | **POST** /auth/twofactorauth/emailotp/verify | Verify 2FA email code |
| [**verifyAuthToken**](AuthenticationApi.md#verifyAuthToken) | **GET** /auth | Verify Auth Token |
| [**verifyLoginPlace**](AuthenticationApi.md#verifyLoginPlace) | **GET** /auth/verifyLoginPlace | Verify Login Place |
| [**verifyPending2FA**](AuthenticationApi.md#verifyPending2FA) | **POST** /auth/twofactorauth/totp/pending/verify | Verify Pending 2FA code |
| [**verifyRecoveryCode**](AuthenticationApi.md#verifyRecoveryCode) | **POST** /auth/twofactorauth/otp/verify | Verify 2FA code with Recovery code |


<a name="cancelPending2FA"></a>
# **cancelPending2FA**
> Disable2FAResult cancelPending2FA()

Cancel pending enabling of time-based 2FA codes

Cancels the sequence for enabling time-based 2FA.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    try {
      Disable2FAResult result = apiInstance.cancelPending2FA();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#cancelPending2FA");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Disable2FAResult**](Disable2FAResult.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="checkUserExists"></a>
# **checkUserExists**
> UserExists checkUserExists(email, displayName, username, excludeUserId)

Check User Exists

Checks if a user by a given &#x60;username&#x60;, &#x60;displayName&#x60; or &#x60;email&#x60; exist. This is used during registration to check if a username has already been taken, during change of displayName to check if a displayName is available, and during change of email to check if the email is already used. In the later two cases the &#x60;excludeUserId&#x60; is used to exclude oneself, otherwise the result would always be true.  It is **REQUIRED** to include **AT LEAST** &#x60;username&#x60;, &#x60;displayName&#x60; **or** &#x60;email&#x60; query parameter. Although they can be combined - in addition with &#x60;excludeUserId&#x60; (generally to exclude yourself) - to further fine-tune the search.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    String email = "email_example"; // String | Filter by email.
    String displayName = "displayName_example"; // String | Filter by displayName.
    String username = "username_example"; // String | Filter by Username.
    String excludeUserId = "excludeUserId_example"; // String | Exclude by UserID.
    try {
      UserExists result = apiInstance.checkUserExists(email, displayName, username, excludeUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#checkUserExists");
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
| **email** | **String**| Filter by email. | [optional] |
| **displayName** | **String**| Filter by displayName. | [optional] |
| **username** | **String**| Filter by Username. | [optional] |
| **excludeUserId** | **String**| Exclude by UserID. | [optional] |

### Return type

[**UserExists**](UserExists.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a response if a user exists or not. |  -  |
| **400** | Error response when missing at least 1 of the required parameters. |  -  |

<a name="confirmEmail"></a>
# **confirmEmail**
> confirmEmail(id, verifyEmail)

Confirm Email

Confirms the email address for a user

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    String id = "usr_00000000-0000-0000-0000-000000000000"; // String | Target user for which to verify email.
    String verifyEmail = "eml_00000000-0000-0000-0000-000000000000"; // String | Token to verify email.
    try {
      apiInstance.confirmEmail(id, verifyEmail);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#confirmEmail");
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
| **id** | **String**| Target user for which to verify email. | |
| **verifyEmail** | **String**| Token to verify email. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **302** | OK |  -  |

<a name="deleteUser"></a>
# **deleteUser**
> CurrentUser deleteUser(userId)

Delete User

Deletes the account with given ID. Normal users only have permission to delete their own account. Account deletion is 14 days from this request, and will be cancelled if you do an authenticated request with the account afterwards.  **VRC+ NOTE:** Despite the 14-days cooldown, any VRC+ subscription will be cancelled **immediately**.  **METHOD NOTE:** Despite this being a Delete action, the method type required is PUT.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    String userId = "userId_example"; // String | Must be a valid user ID.
    try {
      CurrentUser result = apiInstance.deleteUser(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#deleteUser");
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
| **userId** | **String**| Must be a valid user ID. | |

### Return type

[**CurrentUser**](CurrentUser.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="disable2FA"></a>
# **disable2FA**
> Disable2FAResult disable2FA()

Disable 2FA

Disables 2FA for the currently logged in account

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    try {
      Disable2FAResult result = apiInstance.disable2FA();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#disable2FA");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Disable2FAResult**](Disable2FAResult.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="enable2FA"></a>
# **enable2FA**
> Pending2FAResult enable2FA()

Enable time-based 2FA codes

Begins the sequence for enabling time-based 2FA.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    try {
      Pending2FAResult result = apiInstance.enable2FA();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#enable2FA");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Pending2FAResult**](Pending2FAResult.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getCurrentUser"></a>
# **getCurrentUser**
> CurrentUser getCurrentUser()

Login and/or Get Current User Info

This endpoint does the following two operations:   1) Checks if you are already logged in by looking for a valid &#x60;auth&#x60; cookie. If you are have a valid auth cookie then no additional auth-related actions are taken. If you are **not** logged in then it will log you in with the &#x60;Authorization&#x60; header and set the &#x60;auth&#x60; cookie. The &#x60;auth&#x60; cookie will only be sent once.   2) If logged in, this function will also return the CurrentUser object containing detailed information about the currently logged in user.  The auth string after &#x60;Authorization: Basic {string}&#x60; is a base64-encoded string of the username and password, both individually url-encoded, and then joined with a colon.    &gt; base64(urlencode(username):urlencode(password))  **WARNING: Session Limit:** Each authentication with login credentials counts as a separate session, out of which you have a limited amount. Make sure to save and reuse the &#x60;auth&#x60; cookie if you are often restarting the program. The provided API libraries automatically save cookies during runtime, but does not persist during restart. While it can be fine to use username/password during development, expect in production to very fast run into the rate-limit and be temporarily blocked from making new sessions until older ones expire. The exact number of simultaneous sessions is unknown/undisclosed.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: authHeader
    HttpBasicAuth authHeader = (HttpBasicAuth) defaultClient.getAuthentication("authHeader");
    authHeader.setUsername("YOUR USERNAME");
    authHeader.setPassword("YOUR PASSWORD");

    // Configure API key authorization: twoFactorAuthCookie
    ApiKeyAuth twoFactorAuthCookie = (ApiKeyAuth) defaultClient.getAuthentication("twoFactorAuthCookie");
    twoFactorAuthCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //twoFactorAuthCookie.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    try {
      CurrentUser result = apiInstance.getCurrentUser();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#getCurrentUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CurrentUser**](CurrentUser.md)

### Authorization

[authCookie](../README.md#authCookie), [authHeader](../README.md#authHeader), [twoFactorAuthCookie](../README.md#twoFactorAuthCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Set-Cookie - Successful authentication returns an &#x60;auth&#x60; cookie. <br>  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getRecoveryCodes"></a>
# **getRecoveryCodes**
> TwoFactorRecoveryCodes getRecoveryCodes()

Get 2FA Recovery codes

Gets the OTP (One Time Password) recovery codes for accounts with 2FA-protection enabled.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    try {
      TwoFactorRecoveryCodes result = apiInstance.getRecoveryCodes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#getRecoveryCodes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TwoFactorRecoveryCodes**](TwoFactorRecoveryCodes.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the two factor recovery codes |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="logout"></a>
# **logout**
> Success logout()

Logout

Invalidates the login session.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    try {
      Success result = apiInstance.logout();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#logout");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Success**](Success.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Set-Cookie - Clears the &#x60;auth&#x60; cookie. <br>  * \0Set-Cookie - Clears the &#x60;age&#x60; cookie. <br>  * \0\0Set-Cookie - Clears the &#x60;tos&#x60; cookie. <br>  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="registerUserAccount"></a>
# **registerUserAccount**
> CurrentUser registerUserAccount(registerUserAccountRequest)

Register User Account

~~Register a new user account.~~  **DEPRECATED:** Automated creation of accounts has no legitimate public third-party use case, and would be in violation of ToS §13.2: *By using the Platform, you agree not to: i. [...] use the Platform in a manner inconsistent with individual human usage* This endpoint is documented in the interest of completeness

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    RegisterUserAccountRequest registerUserAccountRequest = new RegisterUserAccountRequest(); // RegisterUserAccountRequest | 
    try {
      CurrentUser result = apiInstance.registerUserAccount(registerUserAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#registerUserAccount");
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
| **registerUserAccountRequest** | [**RegisterUserAccountRequest**](RegisterUserAccountRequest.md)|  | |

### Return type

[**CurrentUser**](CurrentUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Set-Cookie - Successful authentication returns an &#x60;auth&#x60; cookie. <br>  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="resendEmailConfirmation"></a>
# **resendEmailConfirmation**
> Success resendEmailConfirmation()

Resend Email Confirmation

Requests a resend of pending email address confirmation email

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    try {
      Success result = apiInstance.resendEmailConfirmation();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#resendEmailConfirmation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Success**](Success.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="verify2FA"></a>
# **verify2FA**
> Verify2FAResult verify2FA(twoFactorAuthCode)

Verify 2FA code

Finishes the login sequence with a normal 2FA-generated code for accounts with 2FA-protection enabled.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    TwoFactorAuthCode twoFactorAuthCode = new TwoFactorAuthCode(); // TwoFactorAuthCode | 
    try {
      Verify2FAResult result = apiInstance.verify2FA(twoFactorAuthCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#verify2FA");
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
| **twoFactorAuthCode** | [**TwoFactorAuthCode**](TwoFactorAuthCode.md)|  | |

### Return type

[**Verify2FAResult**](Verify2FAResult.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Set-Cookie - Provides a &#x60;twoFactorAuth&#x60; cookie, which can be used to bypasses the 2FA requirement for future logins on the same device. <br>  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="verify2FAEmailCode"></a>
# **verify2FAEmailCode**
> Verify2FAEmailCodeResult verify2FAEmailCode(twoFactorEmailCode)

Verify 2FA email code

Finishes the login sequence with an 2FA email code.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    TwoFactorEmailCode twoFactorEmailCode = new TwoFactorEmailCode(); // TwoFactorEmailCode | 
    try {
      Verify2FAEmailCodeResult result = apiInstance.verify2FAEmailCode(twoFactorEmailCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#verify2FAEmailCode");
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
| **twoFactorEmailCode** | [**TwoFactorEmailCode**](TwoFactorEmailCode.md)|  | |

### Return type

[**Verify2FAEmailCodeResult**](Verify2FAEmailCodeResult.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Set-Cookie - Provides a &#x60;twoFactorAuth&#x60; cookie, which can be used to bypasses the 2FA requirement for future logins on the same device. <br>  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="verifyAuthToken"></a>
# **verifyAuthToken**
> VerifyAuthTokenResult verifyAuthToken()

Verify Auth Token

Verify whether the currently provided Auth Token is valid.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    try {
      VerifyAuthTokenResult result = apiInstance.verifyAuthToken();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#verifyAuthToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**VerifyAuthTokenResult**](VerifyAuthTokenResult.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns wether a provided auth token is valid or not. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="verifyLoginPlace"></a>
# **verifyLoginPlace**
> verifyLoginPlace(token, userId)

Verify Login Place

Verifies a login attempt for a user

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    String token = "token_example"; // String | Token to verify login attempt.
    String userId = "userId_example"; // String | Filter by UserID.
    try {
      apiInstance.verifyLoginPlace(token, userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#verifyLoginPlace");
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
| **token** | **String**| Token to verify login attempt. | |
| **userId** | **String**| Filter by UserID. | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **302** | OK |  -  |

<a name="verifyPending2FA"></a>
# **verifyPending2FA**
> Verify2FAResult verifyPending2FA(twoFactorAuthCode)

Verify Pending 2FA code

Finishes sequence for enabling time-based 2FA.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    TwoFactorAuthCode twoFactorAuthCode = new TwoFactorAuthCode(); // TwoFactorAuthCode | 
    try {
      Verify2FAResult result = apiInstance.verifyPending2FA(twoFactorAuthCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#verifyPending2FA");
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
| **twoFactorAuthCode** | [**TwoFactorAuthCode**](TwoFactorAuthCode.md)|  | |

### Return type

[**Verify2FAResult**](Verify2FAResult.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Set-Cookie - Provides a &#x60;twoFactorAuth&#x60; cookie, which can be used to bypasses the 2FA requirement for future logins on the same device. <br>  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="verifyRecoveryCode"></a>
# **verifyRecoveryCode**
> Verify2FAResult verifyRecoveryCode(twoFactorAuthCode)

Verify 2FA code with Recovery code

Finishes the login sequence with an OTP (One Time Password) recovery code for accounts with 2FA-protection enabled.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    TwoFactorAuthCode twoFactorAuthCode = new TwoFactorAuthCode(); // TwoFactorAuthCode | 
    try {
      Verify2FAResult result = apiInstance.verifyRecoveryCode(twoFactorAuthCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#verifyRecoveryCode");
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
| **twoFactorAuthCode** | [**TwoFactorAuthCode**](TwoFactorAuthCode.md)|  | |

### Return type

[**Verify2FAResult**](Verify2FAResult.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Set-Cookie - Provides a &#x60;twoFactorAuth&#x60; cookie, which can be used to bypasses the 2FA requirement for future logins on the same device. <br>  |
| **401** | Error response due to missing auth cookie. |  -  |

