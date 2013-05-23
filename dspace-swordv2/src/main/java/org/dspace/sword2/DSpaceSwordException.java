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

import org.swordapp.server.SwordServerException;

/**
 * This Exception class can be thrown by the internals of the
 * DSpace SWORD implementation
 * 
 * @author Richard Jones
 *
 */
public class DSpaceSwordException extends Exception
{

	public DSpaceSwordException()
	{
		super();
	}

	public DSpaceSwordException(String arg0, Throwable arg1)
	{
		super(arg0, arg1);
	}

	public DSpaceSwordException(String arg0)
	{
		super(arg0);
	}

	public DSpaceSwordException(Throwable arg0)
	{
		super(arg0);
	}

}
