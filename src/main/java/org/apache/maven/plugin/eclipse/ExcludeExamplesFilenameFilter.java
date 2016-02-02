package org.apache.maven.plugin.eclipse;

import java.io.File;
import java.io.FilenameFilter;

public class ExcludeExamplesFilenameFilter implements FilenameFilter {
	public boolean accept(File dir, String name) {
		return !name.contains("examples");
	}
}
