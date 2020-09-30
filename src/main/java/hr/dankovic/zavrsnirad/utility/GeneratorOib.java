/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.dankovic.zavrsnirad.utility;

import java.net.URL;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import us.codecraft.xsoup.Xsoup;

/**
 *
 * @author Marko
 */
public class GeneratorOib {

    public static String getOib() {

        try {
            String html = new Scanner(new URL("http://oib.itcentrala.com/oib-generator/").openStream(), "UTF-8").useDelimiter("\\A").next();

            Document document = Jsoup.parse(html);

            return Xsoup.compile("/html/body/div[1]/div[1]/text()").evaluate(document).get();
        } catch (Exception e) {
            return null;
        }

    }

}
