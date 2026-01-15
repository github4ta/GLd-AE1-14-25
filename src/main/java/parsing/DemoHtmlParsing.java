package parsing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static io.restassured.RestAssured.given;

public class DemoHtmlParsing {
    public static void main(String[] args) {
        String html = given().queryParam("q","qwerty")
                                .get("https://booklover.by/search/")
                                .then().extract().asString();

        Document doc = Jsoup.parse(html);
        Elements elements = doc.select("h2.not-found__title");
        Element element = elements.get(0);
        System.out.println(element.text());
    }
}