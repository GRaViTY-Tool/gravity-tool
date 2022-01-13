package org.gravity.headless.webapi;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.gravity.typegraph.basic.TypeGraph;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

/**
 * GRaViTY Web API
 *
 * <p>
 * This is the web API of GRaViTY.
 *
 */
@Path("/")
public interface ProgramModelApi {

	/**
	 * Get a program model
	 *
	 * Creates a program model for the given commit and repository.
	 *
	 */
	@GET
	@Path("/pm/git")
	@Produces({ "application/xml" })
	@Operation(summary = "Get a program model", tags = { "pm" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = TypeGraph.class))),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error") })
	Response getPM4Git(@QueryParam("url") @NotNull String url, @QueryParam("commit") @NotNull String commit);

	/**
	 * Get a program model
	 *
	 * Creates a program model for the given commit and repository.
	 *
	 */
	@GET
	@Path("/pm/mvn")
	@Produces({ "application/xml" })
	@Operation(summary = "Get a program model", tags = { "pm" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = TypeGraph.class))),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error") })
	Response getPM4Mvn(@QueryParam("groupId") @NotNull String groupId,
			@QueryParam("artifactId") @NotNull String artifactId, @QueryParam("version") @NotNull String version,
			@QueryParam("repo") String repo);
}
