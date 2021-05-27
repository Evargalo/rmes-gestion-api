package fr.insee.rmesgestionapi;

import config.Config;

public class ConceptsQueries {

	public static String conceptsQuery() {
		return "SELECT DISTINCT ?id ?label (group_concat(?altLabelLg1;separator=' || ') as ?altLabel) \n"
				+ "WHERE { GRAPH <"+Config.CONCEPTS_GRAPH+"> { \n"
				+ "?concept skos:notation ?notation . \n"
				+ "BIND (STR(?notation) AS ?id) \n"
			+ "?concept skos:prefLabel ?label . \n"
			+ "FILTER (lang(?label) = '" + Config.LG1 + "') \n"
			+ "OPTIONAL{?concept skos:altLabel ?altLabelLg1 . \n"
			+ "FILTER (lang(?altLabelLg1) = '" + Config.LG1 + "')} \n"
			+ "}} \n"
			+ "GROUP BY ?id ?label \n"
			+ "ORDER BY ?label ";	
	}
	
}
