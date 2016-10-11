/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.trafficmanager;

import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.resources.fluentcore.arm.models.GroupableResource;
import com.microsoft.azure.management.resources.fluentcore.arm.models.Resource;
import com.microsoft.azure.management.resources.fluentcore.model.Appliable;
import com.microsoft.azure.management.resources.fluentcore.model.Creatable;
import com.microsoft.azure.management.resources.fluentcore.model.Refreshable;
import com.microsoft.azure.management.resources.fluentcore.model.Updatable;
import com.microsoft.azure.management.resources.fluentcore.model.Wrapper;
import com.microsoft.azure.management.trafficmanager.implementation.ProfileInner;

import java.util.Map;

/**
 * An immutable client-side representation of an Azure traffic manager profile.
 */
@Fluent
public interface Profile extends
        GroupableResource,
        Refreshable<Profile>,
        Wrapper<ProfileInner>,
        Updatable<Profile.Update> {
    /**
     * @return the relative DNS name of the traffic manager profile
     */
    String dnsLabel();

    /**
     * @return fully qualified domain name (FQDN) of the traffic manager profile.
     */
    String fqdn();

    /**
     * @return the DNS Ttime-To-Live (TTL), in seconds
     */
    int ttl();

    /**
     * @return true if the traffic manager profile is disabled, false if enabled
     */
    boolean isDisabled();

    /**
     * @return the routing method used to route traffic to traffic manager profile endpoints
     */
    TrafficRoutingMethod trafficRoutingMethod();

    /**
     * @return profile monitor status which is combination of the endpoint monitor status values for all endpoints in
     * the profile, and the configured profile status
     */
    ProfileMonitorStatus monitorStatus();

    /**
     * @return the port that is monitored to check the health of traffic manager profile endpoints
     */
    int monitoringPort();

    /**
     * @return the path that is monitored to check the health of traffic manager profile endpoints
     */
    String monitoringPath();

    /**
     *
     * @return external endpoints in the traffic manager profile, indexed by the name
     */
    Map<String, ExternalEndpoint> externalEndpoints();

    /**
     *
     * @return Azure endpoints in the traffic manager profile, indexed by the name
     */
    Map<String, AzureEndpoint> azureEndpoints();

    /**
     *
     * @return nested traffic manager profile endpoints in this traffic manager profile, indexed by the name
     */
    Map<String, NestedProfileEndpoint> nestedProfileEndpoints();

    /**
     * The entirety of the traffic manager profile definition.
     */
    interface Definition extends
            DefinitionStages.Blank,
            DefinitionStages.WithGroup,
            DefinitionStages.WithDnsLabel,
            DefinitionStages.WithTrafficRoutingMethod,
            DefinitionStages.WithMonitoringConfiguration,
            DefinitionStages.WithCreate {
    }

    /**
     * Grouping of traffic manager profile definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a traffic manager profile definition.
         */
        interface Blank extends GroupableResource.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the traffic manager profile definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResource.DefinitionStages.WithGroup<WithDnsLabel> {
        }

        /**
         * The stage of the traffic manager profile definition allowing to specify the relative DNS name.
         */
        interface WithDnsLabel {
            /**
             * Specify the relative DNS name of the profile.
             * <p>
             *
             * @param dnsLabel the relative DNS name of the profile
             * @return the next stage of the traffic manager profile definition
             */
            WithTrafficRoutingMethod withDnsLabel(String dnsLabel);
        }

        /**
         * The stage of the traffic manager profile definition allowing to specify the traffic routing method
         * for the profile.
         */
        interface WithTrafficRoutingMethod {
            /**
             * Specify that end user traffic should be routed to the endpoint based on its priority
             * i.e. use the endpoint with highest priority and if it is not available fallback to next highest
             * priority endpoint.
             *
             * @return the next stage of the traffic manager profile definition
             */
            WithMonitoringConfiguration withPriorityRouting();

            /**
             * Specify that end user traffic should be distributed to the endpoints based on the weight assigned
             * to the endpoint.
             *
             * @return the next stage of the traffic manager profile definition
             */
            WithMonitoringConfiguration withWeightedRouting();

            /**
             * Specify that end user traffic should be routed based on the geographic location of the endpoint
             * close to user.
             *
             * @return the next stage of the traffic manager profile definition
             */
            WithMonitoringConfiguration withPerformanceRouting();

            /**
             * Specify the traffic routing method for the profile.
             *
             * @param routingMethod the traffic routing method for the profile
             * @return the next stage of the traffic manager profile definition
             */
            WithMonitoringConfiguration withTrafficRoutingMethod(TrafficRoutingMethod routingMethod);
        }

        /**
         * The stage of the traffic manager profile definition allowing to specify the endpoint monitoring configuration.
         */
        interface WithMonitoringConfiguration {
            /**
             * Specify to use HTTP monitoring for the endpoints that checks for HTTP 200 response from the path '/'
             * at regular intervals, using port 80.
             *
             * @return the next stage of the traffic manager profile definition
             */
            WithEndpoint withHttpMonitoring();

            /**
             * Specify to use HTTPS monitoring for the endpoints that checks for HTTPS 200 response from the path '/'
             * at regular intervals, using port 443.
             *
             * @return the next stage of the traffic manager profile definition
             */
            WithEndpoint withHttpsMonitoring();

            /**
             * Specify the HTTP monitoring for the endpoints that checks for HTTP 200 response from the specified
             * path at regular intervals, using the specified port.
             *
             * @param port the monitoring port
             * @param path  the monitoring path
             * @return the next stage of the traffic manager profile definition
             */
            WithEndpoint withHttpMonitoring(int port, String path);

            /**
             * Specify the HTTPS monitoring for the endpoints that checks for HTTPS 200 response from the specified
             * path at regular intervals, using the specified port.
             *
             * @param port the monitoring port
             * @param path  the monitoring path
             * @return the next stage of the traffic manager profile definition
             */
            WithEndpoint withHttpsMonitoring(int port, String path);
        }

        /**
         * The stage of the traffic manager profile definition allowing to specify endpoint.
         */
        interface WithEndpoint {
            /**
             * Specifies definition of an endpoint to be attached to the traffic manager profile.
             *
             * @param name the name for the endpoint
             * @return the stage representing configuration for the endpoint
             */
            Endpoint.DefinitionStages.Blank<WithCreate> defineNewEndpoint(String name);
        }

        /**
         * The stage of the traffic manager profile definition allowing to specify the DNS TTL.
         */
        interface WithTtl {
            /**
             * Specify the DNS TTL in seconds.
             *
             * @param ttlInSeconds DNS TTL in seconds
             * @return the next stage of the traffic manager profile definition
             */
            WithCreate withTtl(int ttlInSeconds);
        }

        /**
         * The stage of the traffic manager profile definition allowing to disable the profile.
         */
        interface WithProfileStatus {
            /**
             * Specify that the profile needs to be disabled.
             * <p>
             * Disabling the profile will disables traffic to all endpoints in the profile
             *
             * @return the next stage of the traffic manager profile definition
             */
            WithCreate withProfileStatusDisabled();
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for the resource to be created
         * (via {@link WithCreate#create()}), but also allows for any other optional settings to be specified.
         */
        interface WithCreate extends
                Creatable<Profile>,
                Resource.DefinitionWithTags<WithCreate>,
                DefinitionStages.WithTtl,
                DefinitionStages.WithProfileStatus,
                DefinitionStages.WithEndpoint {
        }
    }

    /**
     * Grouping of traffic manager update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the traffic manager profile update allowing to specify the traffic routing method
         * for the profile.
         */
        interface WithTrafficRoutingMethod {
            /**
             * Specify that end user traffic should be routed to the endpoint based on its priority
             * i.e. use the endpoint with highest priority and if it is not available fallback to next highest
             * priority endpoint.
             *
             * @return the next stage of the traffic manager profile update
             */
            Update withPriorityRouting();

            /**
             * Specify that end user traffic should be distributed to the endpoints based on the weight assigned
             * to the endpoint.
             *
             * @return the next stage of the traffic manager profile update
             */
            Update withWeightedRouting();

            /**
             * Specify that end user traffic should be routed based on the geographic location of the endpoint
             * close to user.
             *
             * @return the next stage of the traffic manager profile update
             */
            Update withPerformanceRouting();

            /**
             * Specify the traffic routing method for the profile.
             *
             * @param routingMethod the traffic routing method for the profile
             * @return the next stage of the traffic manager profile update
             */
            Update withTrafficRoutingMethod(TrafficRoutingMethod routingMethod);
        }

        /**
         * The stage of the traffic manager profile update allowing to specify the endpoint monitoring configuration.
         */
        interface WithMonitoringConfiguration {
            /**
             * Specify to use HTTP monitoring for the endpoints that checks for HTTP 200 response from the path '/'
             * at regular intervals, using port 80.
             *
             * @return the next stage of the traffic manager profile update
             */
            Update withHttpMonitoring();

            /**
             * Specify to use HTTPS monitoring for the endpoints that checks for HTTPS 200 response from the path '/'
             * at regular intervals, using port 443.
             *
             * @return the next stage of the traffic manager profile update
             */
            Update withHttpsMonitoring();

            /**
             * Specify the HTTP monitoring for the endpoints that checks for HTTP 200 response from the specified
             * path at regular intervals, using the specified port.
             *
             * @param port the monitoring port
             * @param path  the monitoring path
             * @return the next stage of the traffic manager profile update
             */
            Update withHttpMonitoring(int port, String path);

            /**
             * Specify the HTTPS monitoring for the endpoints that checks for HTTPS 200 response from the specified
             * path at regular intervals, using the specified port.
             *
             * @param port the monitoring port
             * @param path  the monitoring path
             * @return the next stage of the traffic manager profile update
             */
            Update withHttpsMonitoring(int port, String path);
        }

        /**
         * The stage of the traffic manager profile update allowing to specify endpoints.
         */
        interface WithEndpoint {
            /**
             * Specifies definition of an endpoint to be attached to the traffic manager profile.
             *
             * @param name the name for the endpoint
             * @return the stage representing configuration for the endpoint
             */
            Endpoint.UpdateDefinitionStages.Blank<Update> defineNewEndpoint(String name);

            /**
             * Begins the description of an update of an existing Azure endpoint in this profile.
             *
             * @param name the name of the Azure endpoint
             * @return the stage representing updating configuration for the Azure endpoint
             */
            Endpoint.UpdateAzureEndpoint updateAzureEndpoint(String name);

            /**
             * Begins the description of an update of an existing external endpoint in this profile.
             *
             * @param name the name of the external endpoint
             * @return the stage representing updating configuration for the external endpoint
             */
            Endpoint.UpdateExternalEndpoint updateExternalEndpoint(String name);

            /**
             * Begins the description of an update of an existing nested traffic manager profile endpoint
             * in this profile.
             *
             * @param name the name of the nested profile endpoint
             * @return the stage representing updating configuration for the nested traffic manager profile endpoint
             */
            Endpoint.UpdateNestedProfileEndpoint updateNestedProfileEndpoint(String name);
        }

        /**
         * The stage of the traffic manager profile update allowing to specify the DNS TTL.
         */
        interface WithTtl {
            /**
             * Specify the DNS TTL in seconds.
             *
             * @param ttlInSeconds DNS TTL in seconds
             * @return the next stage of the traffic manager profile update
             */
            Update withTtl(int ttlInSeconds);
        }

        /**
         * The stage of the traffic manager profile update allowing to disable or enable the profile.
         */
        interface WithProfileStatus {
            /**
             * Specify that the profile needs to be disabled.
             * <p>
             * Disabling the profile will disables traffic to all endpoints in the profile
             *
             * @return the next stage of the traffic manager profile update
             */
            Update withProfileStatusDisabled();

            /**
             * Specify that the profile needs to be enabled.
             * <p>
             * Enabling the profile will enables traffic to all endpoints in the profile
             *
             * @return the next stage of the traffic manager profile update
             */
            Update withProfileStatusEnabled();
        }
    }

    /**
     * The template for an update operation, containing all the settings that can be modified.
     * <p>
     * Call {@link Update#apply()} to apply the changes to the resource in Azure.
     */
    interface Update extends
            Appliable<Profile>,
            UpdateStages.WithTrafficRoutingMethod,
            UpdateStages.WithMonitoringConfiguration,
            UpdateStages.WithEndpoint,
            UpdateStages.WithTtl,
            UpdateStages.WithProfileStatus,
            Resource.UpdateWithTags<Update> {
    }
}
