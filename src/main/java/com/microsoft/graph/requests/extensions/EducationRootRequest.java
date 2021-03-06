// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEducationRootRequest;
import com.microsoft.graph.requests.extensions.EducationRootRequest;
import com.microsoft.graph.models.extensions.EducationRoot;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Root Request.
 */
public class EducationRootRequest extends BaseRequest implements IEducationRootRequest {
	
    /**
     * The request for the EducationRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationRootRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationRoot.class);
    }

    /**
     * Gets the EducationRoot from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<EducationRoot> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EducationRoot from the service
     *
     * @return the EducationRoot from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationRoot get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<EducationRoot> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EducationRoot with a source
     *
     * @param sourceEducationRoot the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EducationRoot sourceEducationRoot, final ICallback<EducationRoot> callback) {
        send(HttpMethod.PATCH, callback, sourceEducationRoot);
    }

    /**
     * Patches this EducationRoot with a source
     *
     * @param sourceEducationRoot the source object with updates
     * @return the updated EducationRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationRoot patch(final EducationRoot sourceEducationRoot) throws ClientException {
        return send(HttpMethod.PATCH, sourceEducationRoot);
    }

    /**
     * Creates a EducationRoot with a new object
     *
     * @param newEducationRoot the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EducationRoot newEducationRoot, final ICallback<EducationRoot> callback) {
        send(HttpMethod.POST, callback, newEducationRoot);
    }

    /**
     * Creates a EducationRoot with a new object
     *
     * @param newEducationRoot the new object to create
     * @return the created EducationRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationRoot post(final EducationRoot newEducationRoot) throws ClientException {
        return send(HttpMethod.POST, newEducationRoot);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEducationRootRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (EducationRootRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEducationRootRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (EducationRootRequest)this;
     }

}

