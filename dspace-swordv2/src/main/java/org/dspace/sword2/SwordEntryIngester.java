/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
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

import org.dspace.content.DSpaceObject;
import org.dspace.core.Context;
import org.swordapp.server.Deposit;
import org.swordapp.server.SwordAuthException;
import org.swordapp.server.SwordError;
import org.swordapp.server.SwordServerException;

public interface SwordEntryIngester
{
    DepositResult ingest(Context context, Deposit deposit, DSpaceObject target, VerboseDescription verboseDescription)
			throws DSpaceSwordException, SwordError, SwordAuthException, SwordServerException;

    DepositResult ingest(Context context, Deposit deposit, DSpaceObject target, VerboseDescription verboseDescription, DepositResult result, boolean replace)
			throws DSpaceSwordException, SwordError, SwordAuthException, SwordServerException;
}
