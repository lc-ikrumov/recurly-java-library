/*
 * Copyright 2010-2013 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.billing.recurly.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonSetter;

@XmlRootElement(name = "errors")
public class RecurlyErrors extends RecurlyObjects<RecurlyError> {

    @XmlTransient
    private static final String PROPERTY_NAME = "error";

    @JsonSetter(value = PROPERTY_NAME)
    @Override
    public void setRecurlyObject(final RecurlyError value) {
        super.setRecurlyObject(value);
    }

    public RecurlyErrors getStart() {
        return getStart(RecurlyErrors.class);
    }

    public RecurlyErrors getPrev() {
        return getPrev(RecurlyErrors.class);
    }

    public RecurlyErrors getNext() {
        return getNext(RecurlyErrors.class);
    }
}