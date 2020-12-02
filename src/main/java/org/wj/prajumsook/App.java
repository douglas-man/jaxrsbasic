package org.wj.prajumsook;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Hello world!
 * http://localhost:8080/api/rest/sayhi
 */
@Path("/rest")
public class App {

    @GET
    @Path("/sayhi")
    public Response sayHi() {
        return Response.status(Response.Status.OK)
                .entity("Hi, world")
                .build();
    }
}
