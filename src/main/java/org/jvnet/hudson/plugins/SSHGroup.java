package org.jvnet.hudson.plugins;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.logging.Logger;

public class SSHGroup {
    SSHSite[] sites;

    public static final Logger LOGGER = Logger.getLogger(SSHGroup.class.getName());

    public SSHGroup() {

    }

    public SSHGroup(SSHSite[] sites) {
        this.sites = sites;
    }

    @Override
    public String toString() {
        return "SSHGroup [sites=" + this.sites + "]";
    }
}
