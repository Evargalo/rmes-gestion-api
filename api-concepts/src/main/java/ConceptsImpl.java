import fr.insee.rmes-gestion-api.utils.QueryUtils;
import fr.insee.core.exceptions.RmesException;

public class ConceptsImpl implements ConceptsServices {

	@Override
	public String getConcepts()  throws RmesException{
		logger.info("Starting to get concepts list");
		String resQuery = repoGestion.getResponseAsArray(ConceptsQueries.conceptsQuery()).toString();
		return QueryUtils.correctEmptyGroupConcat(resQuery);
	}
	
}
