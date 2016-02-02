package org.apache.maven.plugin.eclipse;

import java.io.File;
import java.io.FilenameFilter;

public class EclipsePluginFilenameFilter implements FilenameFilter {
    private final boolean sources;
    
    /**
     * @param sources - if true, will include only plugins that are sources,
     * if false, will exclude sources.
     */
    public EclipsePluginFilenameFilter(boolean sources) {
	this.sources = sources;
    }

    public boolean accept(File dir, String name) {
	if (name.contains("examples_") || name.contains("test_")) {
	    return false;
	} else if (sources) {
	    return name.contains("source_");
	} else {
	    return !name.contains("source_");
	}
    }
}
