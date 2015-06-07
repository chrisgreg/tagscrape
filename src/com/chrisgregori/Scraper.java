package com.chrisgregori;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * Created by Chris on 07/06/2015.
 */
public class Scraper {

    String website;
    Document document;

    public Scraper(String website) throws IOException{
        this.website = website;
        document = Jsoup.connect(website).get();
    }

    public List<String> getHashTags() throws IOException{
        Elements hashTagsElement = document.select("body > div:nth-child(4) > div > div > div > pre");
        String hashTagsHTML = hashTagsElement.html();
        List<String> hashTags = getTagList(hashTagsHTML);

        return hashTags;
    }

    public List<String> getTagList(String originalHTML){
        return Arrays.asList(originalHTML.split(" "));
    }


}
