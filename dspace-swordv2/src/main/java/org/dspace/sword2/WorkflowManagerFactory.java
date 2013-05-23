/**
 * <!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML 2.0//EN">
 * <html><head>
 * <title>301 Moved Permanently</title>
 * </head><body>
 * <h1>Moved Permanently</h1>
 * <p>The document has moved <a href="https://svn.duraspace.org/dspace/licenses/LICENSE_HEADER">here</a>.</p>
 * </body></html>
 */
package org.dspace.sword2;

import org.dspace.core.PluginManager;
import org.swordapp.server.SwordError;

public class WorkflowManagerFactory
{
	public static WorkflowManager getInstance()
            throws DSpaceSwordException, SwordError
    {
        WorkflowManager manager = (WorkflowManager) PluginManager.getSinglePlugin("swordv2-server", WorkflowManager.class);
        if (manager == null)
        {
            throw new SwordError(DSpaceUriRegistry.REPOSITORY_ERROR, "No workflow manager configured");
        }
        return manager;
	}
}
