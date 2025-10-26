// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmosdb.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "azure.cosmos")
public class CosmosProperties {

    private String uri;
    private String key;
    private String secondaryKey;
    private String database;
    private boolean queryMetricsEnabled;
    private boolean responseDiagnosticsEnabled;

}