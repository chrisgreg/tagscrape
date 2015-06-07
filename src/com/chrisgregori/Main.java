package com.chrisgregori;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	    Scraper scraper = new Scraper("http://www.tagsforlikes.com/");
        try {
            scraper.getHashTags();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
