package org.apache.maven.plugin.eclipse;

public class ExtendedModel extends org.apache.maven.model.Model {
	private String classifier;

	public ExtendedModel() {
	}

	public void setClassifier(String classifier) {
		this.classifier = classifier;
	}

	public String getClassifier() {
		return classifier;
	}
	
	public String toString() {
		if (classifier != null) {
			return getGroupId() + ":" + getArtifactId() + "-" + classifier;
		} else {
			return getGroupId() + ":" + getArtifactId();
		}
	}
}
