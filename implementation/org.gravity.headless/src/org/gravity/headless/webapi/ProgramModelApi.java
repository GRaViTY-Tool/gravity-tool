package org.gravity.headless.webapi;

import jakarta.validation.constraints.NotNull;

import org.gravity.typegraph.basic.TypeGraph;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;

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
