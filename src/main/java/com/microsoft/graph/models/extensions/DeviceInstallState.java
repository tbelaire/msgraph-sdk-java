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
import com.microsoft.graph.models.generated.InstallState;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Install State.
 */
public class DeviceInstallState extends Entity implements IJsonBackedObject {


    /**
     * The Device Name.
     * Device name.
     */
    @SerializedName("deviceName")
    @Expose
    public String deviceName;

    /**
     * The Device Id.
     * Device Id.
     */
    @SerializedName("deviceId")
    @Expose
    public String deviceId;

    /**
     * The Last Sync Date Time.
     * Last sync date and time.
     */
    @SerializedName("lastSyncDateTime")
    @Expose
    public java.util.Calendar lastSyncDateTime;

    /**
     * The Install State.
     * The install state of the eBook. Possible values are: notApplicable, installed, failed, notInstalled, uninstallFailed, unknown.
     */
    @SerializedName("installState")
    @Expose
    public InstallState installState;

    /**
     * The Error Code.
     * The error code for install failures.
     */
    @SerializedName("errorCode")
    @Expose
    public String errorCode;

    /**
     * The Os Version.
     * OS Version.
     */
    @SerializedName("osVersion")
    @Expose
    public String osVersion;

    /**
     * The Os Description.
     * OS Description.
     */
    @SerializedName("osDescription")
    @Expose
    public String osDescription;

    /**
     * The User Name.
     * Device User Name.
     */
    @SerializedName("userName")
    @Expose
    public String userName;


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
