/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.management.sql.v2014_04_01.AdvisorStatus;
import com.microsoft.azure.management.sql.v2014_04_01.AutoExecuteStatus;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Database Advisor.
 */
@JsonFlatten
public class AdvisorInner extends ProxyResource {
    /**
     * Resource kind.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /**
     * Resource location.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * Gets the status of availability of this advisor to customers. Possible
     * values are 'GA', 'PublicPreview', 'LimitedPublicPreview' and
     * 'PrivatePreview'. Possible values include: 'GA', 'PublicPreview',
     * 'LimitedPublicPreview', 'PrivatePreview'.
     */
    @JsonProperty(value = "properties.advisorStatus", access = JsonProperty.Access.WRITE_ONLY)
    private AdvisorStatus advisorStatus;

    /**
     * Gets the auto-execute status (whether to let the system execute the
     * recommendations) of this advisor. Possible values are 'Enabled' and
     * 'Disabled'. Possible values include: 'Enabled', 'Disabled', 'Default'.
     */
    @JsonProperty(value = "properties.autoExecuteValue", required = true)
    private AutoExecuteStatus autoExecuteValue;

    /**
     * Gets that status of recommendations for this advisor and reason for not
     * having any recommendations. Possible values include, but are not limited
     * to, 'Ok' (Recommendations available), LowActivity (not enough workload
     * to analyze), 'DbSeemsTuned' (Database is doing well), etc.
     */
    @JsonProperty(value = "properties.recommendationsStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String recommendationsStatus;

    /**
     * Gets the time when the current resource was analyzed for recommendations
     * by this advisor.
     */
    @JsonProperty(value = "properties.lastChecked", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastChecked;

    /**
     * Get resource kind.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get resource location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Get gets the status of availability of this advisor to customers. Possible values are 'GA', 'PublicPreview', 'LimitedPublicPreview' and 'PrivatePreview'. Possible values include: 'GA', 'PublicPreview', 'LimitedPublicPreview', 'PrivatePreview'.
     *
     * @return the advisorStatus value
     */
    public AdvisorStatus advisorStatus() {
        return this.advisorStatus;
    }

    /**
     * Get gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'. Possible values include: 'Enabled', 'Disabled', 'Default'.
     *
     * @return the autoExecuteValue value
     */
    public AutoExecuteStatus autoExecuteValue() {
        return this.autoExecuteValue;
    }

    /**
     * Set gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'. Possible values include: 'Enabled', 'Disabled', 'Default'.
     *
     * @param autoExecuteValue the autoExecuteValue value to set
     * @return the AdvisorInner object itself.
     */
    public AdvisorInner withAutoExecuteValue(AutoExecuteStatus autoExecuteValue) {
        this.autoExecuteValue = autoExecuteValue;
        return this;
    }

    /**
     * Get gets that status of recommendations for this advisor and reason for not having any recommendations. Possible values include, but are not limited to, 'Ok' (Recommendations available), LowActivity (not enough workload to analyze), 'DbSeemsTuned' (Database is doing well), etc.
     *
     * @return the recommendationsStatus value
     */
    public String recommendationsStatus() {
        return this.recommendationsStatus;
    }

    /**
     * Get gets the time when the current resource was analyzed for recommendations by this advisor.
     *
     * @return the lastChecked value
     */
    public DateTime lastChecked() {
        return this.lastChecked;
    }

}
