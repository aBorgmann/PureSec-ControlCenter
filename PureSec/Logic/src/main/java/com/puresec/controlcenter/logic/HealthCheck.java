/**
 * 
 */
package com.puresec.controlcenter.logic;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author alken.borgmann
 *
 */
public class HealthCheck {

	private static Set<String> registredCustomerLinks;

	static {
		registredCustomerLinks = new HashSet<String>();
		registredCustomerLinks.add("http://www.alkenborgmann.de");
		registredCustomerLinks.add("http://www.fabianhoffman.com");
	};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Boolean> statusResults = new HashMap<String, Boolean>();
		for (String link : registredCustomerLinks) {
//			boolean statusResult = getStatus(link);
//			statusResults.put(link, statusResult);
			getHTTPHeader(link);
		}
//		System.out.println(statusResults);
	}

	private static boolean getStatus(String link) {
		try {
			URL siteURL = new URL(link);
			HttpURLConnection connection = (HttpURLConnection) siteURL
					.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();

			int code = connection.getResponseCode();
			if (code == 200) {
				return true;
			}
		} catch (Exception e) {
			return false;
		}
		return false;
	}
	
    public static void getHTTPHeader(String link) {
        try {
 
            URL webSite = new URL(link);
            URLConnection conn = webSite.openConnection();
            Map<String, List<String>> map = conn.getHeaderFields();
 
            System.out.println("Printing All Response Header for URL: "
                    + webSite.toString() + "\n");
 
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
 
            System.out.println("\nGet Response Header By Key ...\n");
            List<String> contentLength = map.get("Content-Length");
 
            if (contentLength == null) {
                System.out
                .println("'Content-Length' doesn't present in Header!");
            } else {
                for (String header : contentLength) {
                    System.out.println("Content-Lenght: " + header);
                }
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
