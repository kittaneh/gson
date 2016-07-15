package org.grails.plugins.gson.commons.cfg.exceptions

import org.grails.core.exceptions.GrailsException

public class GrailsConfigurationException extends GrailsException {

    private static final long serialVersionUID = -4535880758562704335L;

    public GrailsConfigurationException() {
        // default
    }

    public GrailsConfigurationException(String message) {
        super(message);
    }

    public GrailsConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

    public GrailsConfigurationException(Throwable cause) {
        super(cause);
    }
}
