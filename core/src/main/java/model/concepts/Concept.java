package model.concepts;

import java.util.List;

import model.fields.DatableNote;
import model.fields.Link;
import model.fields.VersionableNote;


public class Concept {

	private String id;
	private String prefLabelLg1;
	private String prefLabelLg2;
	private List<String> altLabelLg1;
	private List<String> altLabelLg2;
	private String creator;
	private String contributor;
	private String disseminationStatus;
	private String additionalMaterial;
	private String valid;
	private List<VersionableNote> versionableNotes;
	private List<DatableNote> datableNotes;
	private List<Link> links;
	private String created;
	private String modified;
	private String isValidated;
	private Boolean creation;
	private Boolean versioning;
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPrefLabelLg1() {
		return prefLabelLg1;
	}
	public void setPrefLabelLg1(String prefLabelLg1) {
		this.prefLabelLg1 = prefLabelLg1;
	}
	public String getPrefLabelLg2() {
		return prefLabelLg2;
	}
	public void setPrefLabelLg2(String prefLabelLg2) {
		this.prefLabelLg2 = prefLabelLg2;
	}
	public List<String> getAltLabelLg1() {
		return altLabelLg1;
	}
	public void setAltLabelLg1(List<String> altLabelLg1) {
		this.altLabelLg1 = altLabelLg1;
	}
	public List<String> getAltLabelLg2() {
		return altLabelLg2;
	}
	public void setAltLabelLg2(List<String> altLabelLg2) {
		this.altLabelLg2 = altLabelLg2;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getContributor() {
		return contributor;
	}
	public void setContributor(String contributor) {
		this.contributor = contributor;
	}
	public String getDisseminationStatus() {
		return disseminationStatus;
	}
	public void setDisseminationStatus(String disseminationStatus) {
		this.disseminationStatus = disseminationStatus;
	}
	public String getAdditionalMaterial() {
		return additionalMaterial;
	}
	public void setAdditionalMaterial(String additionalMaterial) {
		this.additionalMaterial = additionalMaterial;
	}
	public String getValid() {
		return valid;
	}
	public void setValid(String valid) {
		this.valid = valid;
	}
	public List<VersionableNote> getVersionableNotes() {
		return versionableNotes;
	}
	public void setVersionableNotes(List<VersionableNote> versionableNotes) {
		this.versionableNotes = versionableNotes;
	}
	public List<DatableNote> getDatableNotes() {
		return datableNotes;
	}
	public void setDatableNotes(List<DatableNote> datableNotes) {
		this.datableNotes = datableNotes;
	}
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getModified() {
		return modified;
	}
	public void setModified(String modified) {
		this.modified = modified;
	}
	public String getIsValidated() {
		return isValidated;
	}
	public void setIsValidated(String isValidated) {
		this.isValidated = isValidated;
	}
	public Boolean getCreation() {
		return creation;
	}
	public void setCreation(Boolean creation) {
		this.creation = creation;
	}
	public Boolean getVersioning() {
		return versioning;
	}
	public void setVersioning(Boolean versioning) {
		this.versioning = versioning;
	}
	
	
	
}
