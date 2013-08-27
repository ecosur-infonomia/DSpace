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

import java.util.HashMap;
import java.util.Map;

public class SimpleDCMetadata
{
    private Map<String, String> dublinCore = new HashMap<String, String>();
    private Map<String, String> atom = new HashMap<String, String>();

    public void addDublinCore(String element, String value)
    {
        this.dublinCore.put(element, value);
    }

    public void addAtom(String element, String value)
    {
        this.atom.put(element, value);
    }

    public Map<String, String> getDublinCore()
    {
        return dublinCore;
    }

    public Map<String, String> getAtom()
    {
        return atom;
    }
}
