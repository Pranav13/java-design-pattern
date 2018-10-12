package com.pranav.proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ProxyInternet implements  Internet {
    private Internet internet = new RealInternet();
    private static List<String> bannedSites;

    static
    {
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }
    @Override
    public void connectTo(String serverhost) throws Exception {
        Predicate<List> checkedBannedSitePredicate = (p->p.contains(serverhost.toLowerCase()));

        if(checkedBannedSitePredicate.test(bannedSites))
        {
            throw new Exception("Access Denied");
        }

        internet.connectTo(serverhost);
    }
}
