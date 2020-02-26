// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Subscription.
 */
public class Subscription extends Entity implements IJsonBackedObject {


    /**
     * The Resource.
     * Required. Specifies the resource that will be monitored for changes. Do not include the base URL (https://graph.microsoft.com/v1.0/). See the possible resource path values for each supported resource.
     */
    @SerializedName("resource")
    @Expose
    public String resource;

    /**
     * The Change Type.
     * Required. Indicates the type of change in the subscribed resource that will raise a notification. The supported values are: created, updated, deleted. Multiple values can be combined using a comma-separated list.Note: Drive root item notifications support only the updated changeType. User and group notifications support updated and deleted changeType.
     */
    @SerializedName("changeType")
    @Expose
    public String changeType;

    /**
     * The Client State.
     * Optional. Specifies the value of the clientState property sent by the service in each notification. The maximum length is 128 characters. The client can check that the notification came from the service by comparing the value of the clientState property sent with the subscription with the value of the clientState property received with each notification.
     */
    @SerializedName("clientState")
    @Expose
    public String clientState;

    /**
     * The Notification Url.
     * Required. The URL of the endpoint that will receive the notifications. This URL must make use of the HTTPS protocol.
     */
    @SerializedName("notificationUrl")
    @Expose
    public String notificationUrl;

    /**
     * The Expiration Date Time.
     * Required. Specifies the date and time when the webhook subscription expires. The time is in UTC, and can be an amount of time from subscription creation that varies for the resource subscribed to.  See the table below for maximum supported subscription length of time.
     */
    @SerializedName("expirationDateTime")
    @Expose
    public java.util.Calendar expirationDateTime;

    /**
     * The Application Id.
     * Identifier of the application used to create the subscription. Read-only.
     */
    @SerializedName("applicationId")
    @Expose
    public String applicationId;

    /**
     * The Creator Id.
     * Identifier of the user or service principal that created the subscription. If the app used delegated permissions to create the subscription, this field contains the id of the signed-in user the app called on behalf of. If the app used application permissions, this field contains the id of the service principal corresponding to the app. Read-only.
     */
    @SerializedName("creatorId")
    @Expose
    public String creatorId;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
