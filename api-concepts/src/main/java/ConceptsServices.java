import fr.insee.rmes.exceptions.RmesException;
import fr.insee.core.exceptions.RmesException;

/**
 * Concept Service Query interface to provide access to concepts in JSON
 *
 **/

public interface ConceptsServices {

	public String getConcepts() throws RmesException ;
	
}
