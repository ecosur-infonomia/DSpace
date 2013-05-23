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

import org.dspace.content.Item;
import org.dspace.core.Context;
import org.swordapp.server.Statement;
import org.swordapp.server.SwordError;
import org.swordapp.server.SwordServerException;

public interface SwordStatementDisseminator
{
	public Statement disseminate(Context context, Item item)
        throws DSpaceSwordException, SwordError, SwordServerException;
}
