package org.eclipse.tycho.nexus.internal.plugin;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import org.sonatype.nexus.plugins.ui.contribution.UiContributionBuilder;
import org.sonatype.nexus.plugins.ui.contribution.UiContributorSupport;

@Named
@Singleton
public class UnzipUiContributor extends UiContributorSupport {
    @Inject
    public UnzipUiContributor(final UnzipPlugin owner) {
        super(owner);
    }
    
    protected void customize(final UiContributionBuilder builder) {
        builder.withDependency(UnzipRepositoryResourceBundle.JS_SCRIPT_PATH);
        builder.withDependency(UnzipRepositoryResourceBundle.JS_SCRIPT_BOOT_PATH);
    }
}
