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
import org.swordapp.server.SwordCollection;

/**
 * @author Richard Jones
 * 
 * Define an abstract interface for classes wishing to generate ATOM Collections
 * for SWORD service documents
 */
public interface AtomCollectionGenerator
{
	/**
	 * Build the ATOM Collection which represents the given DSpace Object
	 * 
	 * @param dso
	 * @return
	 * @throws DSpaceSwordException
	 */
	public SwordCollection buildCollection(Context context, DSpaceObject dso, SwordConfigurationDSpace config) throws DSpaceSwordException;
}
