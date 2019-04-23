package thread;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class CrawlerVnexpress {
    public static void main(String[] args) {
        try {
            Document document = Jsoup.connect("https://vnexpress.net/").get();
            Elements element = document.select("");

            for (int i = 0; i < element.size(); i++) {

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
