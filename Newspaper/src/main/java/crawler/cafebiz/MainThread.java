package crawler.cafebiz;

import entity.Newspaper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class MainThread {
    public static void main(String[] args) {
        try {
            Document document = (Document) Jsoup.connect("https://tinhte.vn/").get();
            Elements elements = document.select(".content ~ ol > li > a > article > h3.title");
            for (int i = 0; i < elements.size(); i++) {
                Element element = elements.get(i);
//                Newspaper newspaper = new Newspaper(element.attr("href"), element.attr("title"));
//                System.out.println(newspaper.toString());
                System.out.println(element.html());

            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
