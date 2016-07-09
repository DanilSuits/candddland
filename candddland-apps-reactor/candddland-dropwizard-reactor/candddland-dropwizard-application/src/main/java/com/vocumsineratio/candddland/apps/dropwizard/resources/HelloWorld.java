/**
 * Copyright Vast 2016. All Rights Reserved.
 * <p/>
 * http://www.vast.com
 */
package com.vocumsineratio.candddland.apps.dropwizard.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Danil Suits (danil@vast.com)
 */
@Path("helloWorld")
@Produces(MediaType.TEXT_PLAIN)
public class HelloWorld {
    private final String message;

    public HelloWorld(String message) {
        this.message = message;
    }

    @GET
    public Response test () {
        return Response.ok(message).build();
    }
}
