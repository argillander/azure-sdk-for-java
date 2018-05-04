/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.visualsearch.implementation;

import com.microsoft.azure.cognitiveservices.search.visualsearch.models.VisualSearchOptionalParameter;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Retrofit;
import com.microsoft.azure.cognitiveservices.search.visualsearch.BingImages;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.cognitiveservices.search.visualsearch.models.ErrorResponseException;
import com.microsoft.azure.cognitiveservices.search.visualsearch.models.ImageKnowledge;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BingImages.
 */
public class BingImagesImpl implements BingImages {
    /** The Retrofit service to perform REST calls. */
    private BingImagesService service;
    /** The service client containing this operation class. */
    private BingVisualSearchAPIImpl client;

    /**
     * Initializes an instance of BingImagesImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BingImagesImpl(Retrofit retrofit, BingVisualSearchAPIImpl client) {
        this.service = retrofit.create(BingImagesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BingImages to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BingImagesService {
        @FormUrlEncoded
        @POST("images/visualsearch")
        Observable<Response<ResponseBody>> visualSearch(@Header("X-BingApis-SDK") String xBingApisSDK, @Header("Accept-Language") String acceptLanguage, @Header("Content-Type") String contentType, @Header("User-Agent") String userAgent, @Header("X-MSEdge-ClientID") String clientId, @Header("X-MSEdge-ClientIP") String clientIp, @Header("X-Search-Location") String location, @Field("knowledgeRequest") String knowledgeRequest, @Field("image") RequestBody image);

    }


    /**
     * The Image Visual Search API lets you send an image to Bing and get back a list of relevant tags. Each tag contains potential actions a user might be interested in. This section provides technical details about the request format and headers that you use to request actions and the JSON response objects that contain them. For examples that show how to make requests, see [Searching the Web for Images](https://docs.microsoft.com/azure/cognitive-services/bing-image-search/search-the-web).
     *
     * @param visualSearchOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ImageKnowledge object if successful.
     */
    public ImageKnowledge visualSearch(VisualSearchOptionalParameter visualSearchOptionalParameter) {
        return visualSearchWithServiceResponseAsync(visualSearchOptionalParameter).toBlocking().single().body();
    }

    /**
     * The Image Visual Search API lets you send an image to Bing and get back a list of relevant tags. Each tag contains potential actions a user might be interested in. This section provides technical details about the request format and headers that you use to request actions and the JSON response objects that contain them. For examples that show how to make requests, see [Searching the Web for Images](https://docs.microsoft.com/azure/cognitive-services/bing-image-search/search-the-web).
     *
     * @param visualSearchOptionalParameter the object representing the optional parameters to be set before calling this API
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ImageKnowledge> visualSearchAsync(VisualSearchOptionalParameter visualSearchOptionalParameter, final ServiceCallback<ImageKnowledge> serviceCallback) {
        return ServiceFuture.fromResponse(visualSearchWithServiceResponseAsync(visualSearchOptionalParameter), serviceCallback);
    }

    /**
     * The Image Visual Search API lets you send an image to Bing and get back a list of relevant tags. Each tag contains potential actions a user might be interested in. This section provides technical details about the request format and headers that you use to request actions and the JSON response objects that contain them. For examples that show how to make requests, see [Searching the Web for Images](https://docs.microsoft.com/azure/cognitive-services/bing-image-search/search-the-web).
     *
     * @param visualSearchOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImageKnowledge object
     */
    public Observable<ImageKnowledge> visualSearchAsync(VisualSearchOptionalParameter visualSearchOptionalParameter) {
        return visualSearchWithServiceResponseAsync(visualSearchOptionalParameter).map(new Func1<ServiceResponse<ImageKnowledge>, ImageKnowledge>() {
            @Override
            public ImageKnowledge call(ServiceResponse<ImageKnowledge> response) {
                return response.body();
            }
        });
    }

    /**
     * The Image Visual Search API lets you send an image to Bing and get back a list of relevant tags. Each tag contains potential actions a user might be interested in. This section provides technical details about the request format and headers that you use to request actions and the JSON response objects that contain them. For examples that show how to make requests, see [Searching the Web for Images](https://docs.microsoft.com/azure/cognitive-services/bing-image-search/search-the-web).
     *
     * @param visualSearchOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImageKnowledge object
     */
    public Observable<ServiceResponse<ImageKnowledge>> visualSearchWithServiceResponseAsync(VisualSearchOptionalParameter visualSearchOptionalParameter) {
        final String xBingApisSDK = "true";
        final String acceptLanguage = visualSearchOptionalParameter != null ? visualSearchOptionalParameter.acceptLanguage() : null;
        final String contentType = visualSearchOptionalParameter != null ? visualSearchOptionalParameter.contentType() : null;
        final String userAgent = visualSearchOptionalParameter != null ? visualSearchOptionalParameter.userAgent() : this.client.userAgent();
        final String clientId = visualSearchOptionalParameter != null ? visualSearchOptionalParameter.clientId() : null;
        final String clientIp = visualSearchOptionalParameter != null ? visualSearchOptionalParameter.clientIp() : null;
        final String location = visualSearchOptionalParameter != null ? visualSearchOptionalParameter.location() : null;
        final String knowledgeRequest = visualSearchOptionalParameter != null ? visualSearchOptionalParameter.knowledgeRequest() : null;
        final byte[] image = visualSearchOptionalParameter != null ? visualSearchOptionalParameter.image() : new byte[0];

        return visualSearchWithServiceResponseAsync(acceptLanguage, contentType, userAgent, clientId, clientIp, location, knowledgeRequest, image);
    }

    /**
     * The Image Visual Search API lets you send an image to Bing and get back a list of relevant tags. Each tag contains potential actions a user might be interested in. This section provides technical details about the request format and headers that you use to request actions and the JSON response objects that contain them. For examples that show how to make requests, see [Searching the Web for Images](https://docs.microsoft.com/azure/cognitive-services/bing-image-search/search-the-web).
     *
     * @param acceptLanguage A comma-delimited list of one or more languages to use for user interface strings. The list is in decreasing order of preference. For additional information, including expected format, see [RFC2616](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html). This header and the [setLang](https://docs.microsoft.com/en-us/rest/api/cognitiveservices/bing-images-api-v7-reference#setlang) query parameter are mutually exclusive; do not specify both. If you set this header, you must also specify the [cc](https://docs.microsoft.com/en-us/rest/api/cognitiveservices/bing-images-api-v7-reference#cc) query parameter. To determine the market to return results for, Bing uses the first supported language it finds from the list and combines it with the cc parameter value. If the list does not include a supported language, Bing finds the closest language and market that supports the request or it uses an aggregated or default market for the results. To determine the market that Bing used, see the BingAPIs-Market header. Use this header and the cc query parameter only if you specify multiple languages. Otherwise, use the [mkt](https://docs.microsoft.com/en-us/rest/api/cognitiveservices/bing-images-api-v7-reference#mkt) and [setLang](https://docs.microsoft.com/en-us/rest/api/cognitiveservices/bing-images-api-v7-reference#setlang) query parameters. A user interface string is a string that's used as a label in a user interface. There are few user interface strings in the JSON response objects. Any links to Bing.com properties in the response objects apply the specified language.
     * @param contentType Optional request header. If you set the [modules](https://docs.microsoft.com/en-us/rest/api/cognitiveservices/bing-images-api-v7-reference#modulesrequested) query parameter to RecognizedEntities, you may specify the binary of an image in the body of a POST request. If you specify the image in the body of a POST request, you must specify this header and set its value to multipart/form-data. The maximum image size is 1 MB.
     * @param userAgent The user agent originating the request. Bing uses the user agent to provide mobile users with an optimized experience. Although optional, you are encouraged to always specify this header. The user-agent should be the same string that any commonly used browser sends. For information about user agents, see [RFC 2616](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html). The following are examples of user-agent strings. Windows Phone: Mozilla/5.0 (compatible; MSIE 10.0; Windows Phone 8.0; Trident/6.0; IEMobile/10.0; ARM; Touch; NOKIA; Lumia 822). Android: Mozilla / 5.0 (Linux; U; Android 2.3.5; en - us; SCH - I500 Build / GINGERBREAD) AppleWebKit / 533.1 (KHTML; like Gecko) Version / 4.0 Mobile Safari / 533.1. iPhone: Mozilla / 5.0 (iPhone; CPU iPhone OS 6_1 like Mac OS X) AppleWebKit / 536.26 (KHTML; like Gecko) Mobile / 10B142 iPhone4; 1 BingWeb / 3.03.1428.20120423. PC: Mozilla / 5.0 (Windows NT 6.3; WOW64; Trident / 7.0; Touch; rv:11.0) like Gecko. iPad: Mozilla / 5.0 (iPad; CPU OS 7_0 like Mac OS X) AppleWebKit / 537.51.1 (KHTML, like Gecko) Version / 7.0 Mobile / 11A465 Safari / 9537.53
     * @param clientId Bing uses this header to provide users with consistent behavior across Bing API calls. Bing often flights new features and improvements, and it uses the client ID as a key for assigning traffic on different flights. If you do not use the same client ID for a user across multiple requests, then Bing may assign the user to multiple conflicting flights. Being assigned to multiple conflicting flights can lead to an inconsistent user experience. For example, if the second request has a different flight assignment than the first, the experience may be unexpected. Also, Bing can use the client ID to tailor web results to that client ID’s search history, providing a richer experience for the user. Bing also uses this header to help improve result rankings by analyzing the activity generated by a client ID. The relevance improvements help with better quality of results delivered by Bing APIs and in turn enables higher click-through rates for the API consumer. IMPORTANT: Although optional, you should consider this header required. Persisting the client ID across multiple requests for the same end user and device combination enables 1) the API consumer to receive a consistent user experience, and 2) higher click-through rates via better quality of results from the Bing APIs. Each user that uses your application on the device must have a unique, Bing generated client ID. If you do not include this header in the request, Bing generates an ID and returns it in the X-MSEdge-ClientID response header. The only time that you should NOT include this header in a request is the first time the user uses your app on that device. Use the client ID for each Bing API request that your app makes for this user on the device. Persist the client ID. To persist the ID in a browser app, use a persistent HTTP cookie to ensure the ID is used across all sessions. Do not use a session cookie. For other apps such as mobile apps, use the device's persistent storage to persist the ID. The next time the user uses your app on that device, get the client ID that you persisted. Bing responses may or may not include this header. If the response includes this header, capture the client ID and use it for all subsequent Bing requests for the user on that device. If you include the X-MSEdge-ClientID, you must not include cookies in the request.
     * @param clientIp The IPv4 or IPv6 address of the client device. The IP address is used to discover the user's location. Bing uses the location information to determine safe search behavior. Although optional, you are encouraged to always specify this header and the X-Search-Location header. Do not obfuscate the address (for example, by changing the last octet to 0). Obfuscating the address results in the location not being anywhere near the device's actual location, which may result in Bing serving erroneous results.
     * @param location A semicolon-delimited list of key/value pairs that describe the client's geographical location. Bing uses the location information to determine safe search behavior and to return relevant local content. Specify the key/value pair as &lt;key&gt;:&lt;value&gt;. The following are the keys that you use to specify the user's location. lat (required): The latitude of the client's location, in degrees. The latitude must be greater than or equal to -90.0 and less than or equal to +90.0. Negative values indicate southern latitudes and positive values indicate northern latitudes. long (required): The longitude of the client's location, in degrees. The longitude must be greater than or equal to -180.0 and less than or equal to +180.0. Negative values indicate western longitudes and positive values indicate eastern longitudes. re (required): The radius, in meters, which specifies the horizontal accuracy of the coordinates. Pass the value returned by the device's location service. Typical values might be 22m for GPS/Wi-Fi, 380m for cell tower triangulation, and 18,000m for reverse IP lookup. ts (optional): The UTC UNIX timestamp of when the client was at the location. (The UNIX timestamp is the number of seconds since January 1, 1970.) head (optional): The client's relative heading or direction of travel. Specify the direction of travel as degrees from 0 through 360, counting clockwise relative to true north. Specify this key only if the sp key is nonzero. sp (optional): The horizontal velocity (speed), in meters per second, that the client device is traveling. alt (optional): The altitude of the client device, in meters. are (optional): The radius, in meters, that specifies the vertical accuracy of the coordinates. Specify this key only if you specify the alt key. Although many of the keys are optional, the more information that you provide, the more accurate the location results are. Although optional, you are encouraged to always specify the user's geographical location. Providing the location is especially important if the client's IP address does not accurately reflect the user's physical location (for example, if the client uses VPN). For optimal results, you should include this header and the X-MSEdge-ClientIP header, but at a minimum, you should include this header.
     * @param knowledgeRequest A JSON object containing information about the image. The image and imageInsightsToken fields are mutually exclusive – the body of the request must include only one of them.
     * @param image The uploaded image file. The size of the image is limited to 1 MB and the file name must be "image". The image and imageInsightsToken fields are mutually exclusive – the body of the request must include only one of them.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImageKnowledge object
     */
    public Observable<ServiceResponse<ImageKnowledge>> visualSearchWithServiceResponseAsync(String acceptLanguage, String contentType, String userAgent, String clientId, String clientIp, String location, String knowledgeRequest, byte[] image) {
        final String xBingApisSDK = "true";
        RequestBody imageConverted = RequestBody.create(MediaType.parse("multipart/form-data"), new byte[0]);
        if (image != null) {
            imageConverted = RequestBody.create(MediaType.parse("multipart/form-data"), image);
        }
        return service.visualSearch(xBingApisSDK, acceptLanguage, contentType, userAgent, clientId, clientIp, location, knowledgeRequest, imageConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageKnowledge>>>() {
                @Override
                public Observable<ServiceResponse<ImageKnowledge>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ImageKnowledge> clientResponse = visualSearchDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ImageKnowledge> visualSearchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.client.restClient().responseBuilderFactory().<ImageKnowledge, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ImageKnowledge>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}