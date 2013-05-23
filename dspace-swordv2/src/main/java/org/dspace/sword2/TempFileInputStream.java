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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TempFileInputStream extends FileInputStream
{
    private String path;

    public TempFileInputStream(File file)
            throws FileNotFoundException
    {
        super(file);
        this.path = file.getAbsolutePath();
    }

    public void close()
            throws IOException
    {
        super.close();
        File file = new File(this.path);
        file.delete();
    }
}
