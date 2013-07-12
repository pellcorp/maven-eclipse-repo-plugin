package org.apache.maven.plugin.eclipse;

public class ClassifierModel extends org.apache.maven.model.Model {
	private String classifier;
	
	public ClassifierModel() {
	}
	
	public void setClassifier(String classifier) {
		this.classifier = classifier;
	}
	
	public String getClassifier() {
		return classifier;
	}
}
