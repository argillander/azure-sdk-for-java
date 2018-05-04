/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator;

import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.FindFacesOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.OCRMethodOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.EvaluateMethodOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.MatchMethodOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.FindFacesFileInputOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.FindFacesUrlInputOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.OCRUrlInputOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.OCRFileInputOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.EvaluateFileInputOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.EvaluateUrlInputOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.MatchUrlInputOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.MatchFileInputOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.BodyModel;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.Evaluate;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.FoundFaces;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.MatchResponse;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.OCR;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ImageModerations.
 */
public interface ImageModerations {
    /**
     * Returns the list of faces found.
     *
     * @param findFacesOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the FoundFaces object if successful.
     */
    FoundFaces findFaces(FindFacesOptionalParameter findFacesOptionalParameter);

    /**
     * Returns the list of faces found.
     *
     * @param findFacesOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FoundFaces object
     */
    Observable<FoundFaces> findFacesAsync(FindFacesOptionalParameter findFacesOptionalParameter);

    /**
     * Returns any text found in the image for the language specified. If no language is specified in input then
     *  the detection defaults to English.
     *
     * @param language Language of the terms.
     * @param oCRMethodOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OCR object if successful.
     */
    OCR oCRMethod(String language, OCRMethodOptionalParameter oCRMethodOptionalParameter);

    /**
     * Returns any text found in the image for the language specified. If no language is specified in input then
     *  the detection defaults to English.
     *
     * @param language Language of the terms.
     * @param oCRMethodOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OCR object
     */
    Observable<OCR> oCRMethodAsync(String language, OCRMethodOptionalParameter oCRMethodOptionalParameter);

    /**
     * Returns probabilities of the image containing racy or adult content.
     *
     * @param evaluateMethodOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Evaluate object if successful.
     */
    Evaluate evaluateMethod(EvaluateMethodOptionalParameter evaluateMethodOptionalParameter);

    /**
     * Returns probabilities of the image containing racy or adult content.
     *
     * @param evaluateMethodOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Evaluate object
     */
    Observable<Evaluate> evaluateMethodAsync(EvaluateMethodOptionalParameter evaluateMethodOptionalParameter);

    /**
     * Fuzzily match an image against one of your custom Image Lists. You can create and manage your custom image
     *  lists using &lt;a
     *  href="/docs/services/578ff44d2703741568569ab9/operations/578ff7b12703741568569abe"&gt;this&lt;/a&gt; API.
     *  Returns ID and tags of matching image.&lt;br/&gt;
     *  &lt;br/&gt;
     *  Note: Refresh Index must be run on the corresponding Image List before additions and removals are reflected
     *  in the response.
     *
     * @param matchMethodOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MatchResponse object if successful.
     */
    MatchResponse matchMethod(MatchMethodOptionalParameter matchMethodOptionalParameter);

    /**
     * Fuzzily match an image against one of your custom Image Lists. You can create and manage your custom image
     *  lists using &lt;a
     *  href="/docs/services/578ff44d2703741568569ab9/operations/578ff7b12703741568569abe"&gt;this&lt;/a&gt; API.
     *  Returns ID and tags of matching image.&lt;br/&gt;
     *  &lt;br/&gt;
     *  Note: Refresh Index must be run on the corresponding Image List before additions and removals are reflected
     *  in the response.
     *
     * @param matchMethodOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MatchResponse object
     */
    Observable<MatchResponse> matchMethodAsync(MatchMethodOptionalParameter matchMethodOptionalParameter);

    /**
     * Returns the list of faces found.
     *
     * @param imageStream The image file.
     * @param findFacesFileInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the FoundFaces object if successful.
     */
    FoundFaces findFacesFileInput(byte[] imageStream, FindFacesFileInputOptionalParameter findFacesFileInputOptionalParameter);

    /**
     * Returns the list of faces found.
     *
     * @param imageStream The image file.
     * @param findFacesFileInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FoundFaces object
     */
    Observable<FoundFaces> findFacesFileInputAsync(byte[] imageStream, FindFacesFileInputOptionalParameter findFacesFileInputOptionalParameter);

    /**
     * Returns the list of faces found.
     *
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @param findFacesUrlInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the FoundFaces object if successful.
     */
    FoundFaces findFacesUrlInput(String contentType, BodyModel imageUrl, FindFacesUrlInputOptionalParameter findFacesUrlInputOptionalParameter);

    /**
     * Returns the list of faces found.
     *
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @param findFacesUrlInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FoundFaces object
     */
    Observable<FoundFaces> findFacesUrlInputAsync(String contentType, BodyModel imageUrl, FindFacesUrlInputOptionalParameter findFacesUrlInputOptionalParameter);

    /**
     * Returns any text found in the image for the language specified. If no language is specified in input then
     *  the detection defaults to English.
     *
     * @param language Language of the terms.
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @param oCRUrlInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OCR object if successful.
     */
    OCR oCRUrlInput(String language, String contentType, BodyModel imageUrl, OCRUrlInputOptionalParameter oCRUrlInputOptionalParameter);

    /**
     * Returns any text found in the image for the language specified. If no language is specified in input then
     *  the detection defaults to English.
     *
     * @param language Language of the terms.
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @param oCRUrlInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OCR object
     */
    Observable<OCR> oCRUrlInputAsync(String language, String contentType, BodyModel imageUrl, OCRUrlInputOptionalParameter oCRUrlInputOptionalParameter);

    /**
     * Returns any text found in the image for the language specified. If no language is specified in input then
     *  the detection defaults to English.
     *
     * @param language Language of the terms.
     * @param imageStream The image file.
     * @param oCRFileInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OCR object if successful.
     */
    OCR oCRFileInput(String language, byte[] imageStream, OCRFileInputOptionalParameter oCRFileInputOptionalParameter);

    /**
     * Returns any text found in the image for the language specified. If no language is specified in input then
     *  the detection defaults to English.
     *
     * @param language Language of the terms.
     * @param imageStream The image file.
     * @param oCRFileInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OCR object
     */
    Observable<OCR> oCRFileInputAsync(String language, byte[] imageStream, OCRFileInputOptionalParameter oCRFileInputOptionalParameter);

    /**
     * Returns probabilities of the image containing racy or adult content.
     *
     * @param imageStream The image file.
     * @param evaluateFileInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Evaluate object if successful.
     */
    Evaluate evaluateFileInput(byte[] imageStream, EvaluateFileInputOptionalParameter evaluateFileInputOptionalParameter);

    /**
     * Returns probabilities of the image containing racy or adult content.
     *
     * @param imageStream The image file.
     * @param evaluateFileInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Evaluate object
     */
    Observable<Evaluate> evaluateFileInputAsync(byte[] imageStream, EvaluateFileInputOptionalParameter evaluateFileInputOptionalParameter);

    /**
     * Returns probabilities of the image containing racy or adult content.
     *
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @param evaluateUrlInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Evaluate object if successful.
     */
    Evaluate evaluateUrlInput(String contentType, BodyModel imageUrl, EvaluateUrlInputOptionalParameter evaluateUrlInputOptionalParameter);

    /**
     * Returns probabilities of the image containing racy or adult content.
     *
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @param evaluateUrlInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Evaluate object
     */
    Observable<Evaluate> evaluateUrlInputAsync(String contentType, BodyModel imageUrl, EvaluateUrlInputOptionalParameter evaluateUrlInputOptionalParameter);

    /**
     * Fuzzily match an image against one of your custom Image Lists. You can create and manage your custom image
     *  lists using &lt;a
     *  href="/docs/services/578ff44d2703741568569ab9/operations/578ff7b12703741568569abe"&gt;this&lt;/a&gt; API.
     *  Returns ID and tags of matching image.&lt;br/&gt;
     *  &lt;br/&gt;
     *  Note: Refresh Index must be run on the corresponding Image List before additions and removals are reflected
     *  in the response.
     *
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @param matchUrlInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MatchResponse object if successful.
     */
    MatchResponse matchUrlInput(String contentType, BodyModel imageUrl, MatchUrlInputOptionalParameter matchUrlInputOptionalParameter);

    /**
     * Fuzzily match an image against one of your custom Image Lists. You can create and manage your custom image
     *  lists using &lt;a
     *  href="/docs/services/578ff44d2703741568569ab9/operations/578ff7b12703741568569abe"&gt;this&lt;/a&gt; API.
     *  Returns ID and tags of matching image.&lt;br/&gt;
     *  &lt;br/&gt;
     *  Note: Refresh Index must be run on the corresponding Image List before additions and removals are reflected
     *  in the response.
     *
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @param matchUrlInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MatchResponse object
     */
    Observable<MatchResponse> matchUrlInputAsync(String contentType, BodyModel imageUrl, MatchUrlInputOptionalParameter matchUrlInputOptionalParameter);

    /**
     * Fuzzily match an image against one of your custom Image Lists. You can create and manage your custom image
     *  lists using &lt;a
     *  href="/docs/services/578ff44d2703741568569ab9/operations/578ff7b12703741568569abe"&gt;this&lt;/a&gt; API.
     *  Returns ID and tags of matching image.&lt;br/&gt;
     *  &lt;br/&gt;
     *  Note: Refresh Index must be run on the corresponding Image List before additions and removals are reflected
     *  in the response.
     *
     * @param imageStream The image file.
     * @param matchFileInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MatchResponse object if successful.
     */
    MatchResponse matchFileInput(byte[] imageStream, MatchFileInputOptionalParameter matchFileInputOptionalParameter);

    /**
     * Fuzzily match an image against one of your custom Image Lists. You can create and manage your custom image
     *  lists using &lt;a
     *  href="/docs/services/578ff44d2703741568569ab9/operations/578ff7b12703741568569abe"&gt;this&lt;/a&gt; API.
     *  Returns ID and tags of matching image.&lt;br/&gt;
     *  &lt;br/&gt;
     *  Note: Refresh Index must be run on the corresponding Image List before additions and removals are reflected
     *  in the response.
     *
     * @param imageStream The image file.
     * @param matchFileInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MatchResponse object
     */
    Observable<MatchResponse> matchFileInputAsync(byte[] imageStream, MatchFileInputOptionalParameter matchFileInputOptionalParameter);

}