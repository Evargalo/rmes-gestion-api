import fr.insee.rmes.bauhaus_services.rdf_utils.QueryUtils;
import fr.insee.core.exceptions.RmesException;
import fr.insee.rmes.persistance.sparql_queries.concepts.ConceptsQueries;

public class ConceptsImpl {

	@Override
	public String getConcepts()  throws RmesException{
		logger.info("Starting to get concepts list");
		String resQuery = repoGestion.getResponseAsArray(ConceptsQueries.conceptsQuery()).toString();
		return QueryUtils.correctEmptyGroupConcat(resQuery);
	}
	
}
