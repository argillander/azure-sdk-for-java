/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_05_01.implementation;

import com.microsoft.azure.management.resources.v2019_05_01.GenericResource;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.resources.v2019_05_01.Identity;
import com.microsoft.azure.management.resources.v2019_05_01.Plan;
import com.microsoft.azure.management.resources.v2019_05_01.Sku;
import java.util.Map;

class GenericResourceImpl extends WrapperImpl<GenericResourceInner> implements GenericResource {
    private final ResourcesManager manager;

    GenericResourceImpl(GenericResourceInner inner,  ResourcesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ResourcesManager manager() {
        return this.manager;
    }



    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Identity identity() {
        return this.inner().identity();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String managedBy() {
        return this.inner().managedBy();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Plan plan() {
        return this.inner().plan();
    }

    @Override
    public Object properties() {
        return this.inner().properties();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
