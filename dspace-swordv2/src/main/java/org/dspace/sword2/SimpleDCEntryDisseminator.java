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
import org.swordapp.server.DepositReceipt;
import org.swordapp.server.SwordError;
import org.swordapp.server.SwordServerException;

import java.util.Map;

public class SimpleDCEntryDisseminator extends AbstractSimpleDC implements SwordEntryDisseminator
{
    public SimpleDCEntryDisseminator() { }

    public DepositReceipt disseminate(Context context, Item item, DepositReceipt receipt)
            throws DSpaceSwordException, SwordError, SwordServerException
    {
        SimpleDCMetadata md = this.getMetadata(item);

        Map<String, String> dc = md.getDublinCore();
        for (String element : dc.keySet())
        {
            String value = dc.get(element);
            receipt.addDublinCore(element, value);
        }

        /*
        atom.author = dc.contributor.author
        atom.published = dc.date.created
        atom.rights = dc.rights
        atom.summary = dc.description.abstract
        atom.title = dc.title
        atom.updated = dc.date.created
        */

        Map<String, String> atom = md.getAtom();
        for (String element : atom.keySet())
        {
            String value = atom.get(element);
            if ("author".equals(element))
            {
               receipt.getWrappedEntry().addAuthor(value);
            }
            else if ("published".equals(element))
            {
                receipt.getWrappedEntry().setPublished(value);
            }
            else if ("rights".equals(element))
            {
                receipt.getWrappedEntry().setRights(value);
            }
            else if ("summary".equals(element))
            {
                receipt.getWrappedEntry().setSummary(value);
            }
            else if ("title".equals(element))
            {
                receipt.getWrappedEntry().setTitle(value);
            }
            else if ("updated".equals(element))
            {
                receipt.getWrappedEntry().setUpdated(value);
            }
        }

        return receipt;
    }
}
