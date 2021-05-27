package webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import core.rmesExceptions.RmesException;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import model.concepts.ConceptsServices;
import webservice.swagger.IdLabelAltLabel;

@Component
@Path("/concepts")
@Tag(name="Concepts", description="Concept API")
@ApiResponses(value = { 
		@ApiResponse(responseCode = "200", description = "Success"), 
		@ApiResponse(responseCode = "204", description = "No Content"),
		@ApiResponse(responseCode = "400", description = "Bad Request"), 
		@ApiResponse(responseCode = "401", description = "Unauthorized"),
		@ApiResponse(responseCode = "403", description = "Forbidden"), 
		@ApiResponse(responseCode = "404", description = "Not found"),
		@ApiResponse(responseCode = "406", description = "Not Acceptable"),
		@ApiResponse(responseCode = "500", description = "Internal server error") })
public class ConceptsResources   {
	
	static final Logger logger = LogManager.getLogger(ConceptsResources.class);
	
	@Autowired
	ConceptsServices conceptsService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Operation(operationId = "getConcepts", summary = "List of concepts",
	responses = {@ApiResponse(content=@Content(array=@ArraySchema(schema=@Schema(implementation=IdLabelAltLabel.class))))})																 
	public Response getConcepts() {
		String jsonResultat;
		try {
			jsonResultat = conceptsService.getConcepts();
		} catch (RmesException e) {
			return Response.status(e.getStatus()).entity(e.getDetails()).type(MediaType.TEXT_PLAIN).build();
		}
		return Response.status(HttpStatus.SC_OK).entity(jsonResultat).build();
	}
	
}