package org.agoncal.fascicle.quarkus.restclient.book;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

// tag::adocSnippet[]
@Path("/api/isbn")
@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient
public interface IsbnProxy {

  @GET
  IsbnNumber generateIsbn(@QueryParam("separator") boolean separator);
}
// end::adocSnippet[]
