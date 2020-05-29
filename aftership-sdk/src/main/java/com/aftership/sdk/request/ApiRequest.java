package com.aftership.sdk.request;

import java.util.Map;
import com.aftership.sdk.exception.ApiException;
import com.aftership.sdk.exception.RequestException;
import com.aftership.sdk.exception.SdkException;

/** Request for Aftership's API interface */
public interface ApiRequest {

//  /**
//   * make a request of api
//   *
//   * @param requestConfig Basic configuration of the request
//   * @param requestData Requested body data
//   * @param responseType Type of response
//   * @param <T> Class of request Data
//   * @param <R> Class of response type
//   * @return ResponseEntity
//   */
//  <T, R> ResponseEntity<R> makeRequest(
//      RequestConfig requestConfig, T requestData, Class<R> responseType);

  /**
   * make a request of api
   * @param method Method of http request
   * @param path path of request url
   * @param queryParams query params
   * @param requestData request data of body
   * @param responseType Type of response
   * @param <T> Class of request Data
   * @param <R> Class of response type
   * @return ResponseEntity
   * @throws SdkException
   */
  <T, R> ResponseEntity<R> makeRequest(
      HttpMethod method, String path, Map<String, String> queryParams, T requestData, Class<R> responseType)
      throws SdkException, RequestException, ApiException;

}
