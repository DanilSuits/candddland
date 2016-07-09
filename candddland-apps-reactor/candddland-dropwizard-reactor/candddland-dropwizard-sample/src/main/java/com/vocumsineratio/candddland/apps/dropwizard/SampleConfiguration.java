/**
 * Copyright Vast 2016. All Rights Reserved.
 * <p/>
 * http://www.vast.com
 */
package com.vocumsineratio.candddland.apps.dropwizard;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

/**
 * @author Danil Suits (danil@vast.com)
 */
public class SampleConfiguration extends Configuration {
    @JsonProperty("helloWorld")
    public HelloWorld helloWorld;

    public static class HelloWorld {
        @JsonProperty("message")
        public String message;
    }
}
