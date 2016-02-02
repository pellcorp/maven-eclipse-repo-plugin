package org.apache.maven.plugin.eclipse;

public class ExtendedModel extends org.apache.maven.model.Model {
    private boolean isSource;

    public ExtendedModel() {
    }

    public void setIsSource(boolean isSource) {
	this.isSource = isSource;
    }

    public boolean isSource() {
	return isSource;
    }
    
    public String toString() {
	return getGroupId() + ":" + getArtifactId() + ":" + getVersion();
    }
}
