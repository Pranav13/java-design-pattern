package com.pranav.proxy;

import com.pranav.proxy.Internet;
import com.pranav.proxy.ProxyInternet;

public class test {
    public static void main (String[] args)
    {
        Internet internet = new ProxyInternet();
        try
        {
            internet.connectTo("pranav.org");
            internet.connectTo("abc.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
