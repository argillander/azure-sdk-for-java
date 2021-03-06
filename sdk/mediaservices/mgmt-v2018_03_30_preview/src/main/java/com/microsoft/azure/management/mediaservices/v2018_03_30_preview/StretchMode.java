/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for StretchMode.
 */
public enum StretchMode {
    /** Strictly respect the output resolution without considering the pixel aspect ratio or display aspect ratio of the input video. */
    NONE("None"),

    /** Override the output resolution, and change it to match the display aspect ratio of the input, without padding. For example, if the input is 1920x1080 and the encoding preset asks for 1280x1280, then the value in the preset is overridden, and the output will be at 1280x720, which maintains the input aspect ratio of 16:9. */
    AUTO_SIZE("AutoSize"),

    /** Pad the output (with either letterbox or pillar box) to honor the output resolution, while ensuring that the active video region in the output has the same aspect ratio as the input. For example, if the input is 1920x1080 and the encoding preset asks for 1280x1280, then the output will be at 1280x1280, which contains an inner rectangle of 1280x720 at aspect ratio of 16:9, and pillar box regions 280 pixels wide at the left and right. */
    AUTO_FIT("AutoFit");

    /** The actual serialized value for a StretchMode instance. */
    private String value;

    StretchMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a StretchMode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed StretchMode object, or null if unable to parse.
     */
    @JsonCreator
    public static StretchMode fromString(String value) {
        StretchMode[] items = StretchMode.values();
        for (StretchMode item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
