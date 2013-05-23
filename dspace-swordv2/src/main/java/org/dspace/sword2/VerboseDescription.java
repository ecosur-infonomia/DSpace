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

import java.text.SimpleDateFormat;
import java.util.Date;

public class VerboseDescription
{
    private StringBuilder sb;

    public VerboseDescription()
    {
        this.sb = new StringBuilder();
    }

    public VerboseDescription append(String s)
    {
        this.sb.append(this.getDatePrefix() + s + "\n");
        return this;
    }

    public String toString()
    {
        return this.sb.toString();
    }

    private String getDatePrefix()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "[" + sdf.format(new Date()) + "] ";
    }
}
