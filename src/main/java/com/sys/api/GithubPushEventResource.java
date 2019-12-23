
package com.sys.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Unico proposito desta API é ser chamada pelo GitHub, que
 * avisa quando ocorre um PUSH para o projeto.
 */
@Path("/pushEvent")
public class GithubPushEventResource {
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    public Response pushEvent() {
        System.out.println("pushEvent");
        return Response.ok("pushEvent").build();
    }
}
