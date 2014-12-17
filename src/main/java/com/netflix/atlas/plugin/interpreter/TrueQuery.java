/*
 * Copyright 2014 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.atlas.plugin.interpreter;

import com.netflix.servo.monitor.MonitorConfig;

import java.util.Map;

/**
 * A query that always succeeds.
 */
public enum TrueQuery implements Query {
    /** Singleton representing a query that always succeeds. */
    INSTANCE;

    @Override
    public boolean apply(Map<String, String> tags) {
        return true;
    }

    @Override
    public boolean apply(MonitorConfig config) {
        return true;
    }

    @Override
    public String toString() {
        return ":true";
    }
}