package hudson.plugins.findbugs;

import hudson.Extension;
import hudson.plugins.analysis.core.PluginDescriptor;

/**
 * Descriptor for the class {@link FindBugsPublisher}. Used as a singleton. The
 * class is marked as public so that it can be accessed from views.
 *
 * @author Ulli Hafner
 */
@Extension(ordinal = 100)
public final class FindBugsDescriptor extends PluginDescriptor {
    /** The ID of this plug-in is used as URL. */
    static final String PLUGIN_ID = "findbugs";
    /** The URL of the result action. */
    static final String RESULT_URL = PluginDescriptor.createResultUrlName(PLUGIN_ID);
    /** Icon to use for the result and project action. */
    static final String ICON_URL = "/plugin/findbugs/icons/findbugs-32x32.gif";

    /**
     * Creates a new instance of {@link FindBugsDescriptor}.
     */
    public FindBugsDescriptor() {
        super(FindBugsPublisher.class);
    }

    @Override
    public String getDisplayName() {
        return Messages.FindBugs_Publisher_Name();
    }

    @Override
    public String getPluginName() {
        return PLUGIN_ID;
    }

    @Override
    public String getIconUrl() {
        return ICON_URL;
    }
}