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
import org.swordapp.server.SwordError;
import org.swordapp.server.SwordServerException;

import java.io.InputStream;

public interface SwordContentDisseminator
{
    public InputStream disseminate(Context context, Item item)
        throws DSpaceSwordException, SwordError, SwordServerException;

    public boolean disseminatesContentType(String contentType)
        throws DSpaceSwordException, SwordError, SwordServerException;

    public boolean disseminatesPackage(String contentType)
        throws DSpaceSwordException, SwordError, SwordServerException;

    public void setContentType(String contentType);

    public void setPackaging(String packaging);

    public String getContentType();

    public String getPackaging();
}
