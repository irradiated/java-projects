import java.util.Scanner;
import java.util.ArrayList;
import java.net.URL;

public class Crawler {
    public static void main(String[] args) {
        crawler("http://people.okanagan.bc.ca/akennedy");
    }

    public static void crawler(String startingURL) {
        ArrayList<String> pending = new ArrayList<String>();
        ArrayList<String> visited = new ArrayList<String>();
        pending.add(startingURL);
        while(!pending.isEmpty() && visited.size() <= 10) {
            String urlString = pending.remove(0);

            if (!visited.contains(urlString)) {
                visited.add(urlString);
                System.out.println("Crawl: " + urlString);

                for (String s:getSubURLs(urlString)) {
                    if (!visited.contains(s)) {
                        pending.add(s);
                    }
                }
            }
        }
        System.out.println("Done");
    }

    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<String>();
        try {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            Thread.sleep(500);

            while (input.hasNext()) {
                String line = input.nextLine();
                current = line.indexOf("http:", current);

                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);

                    //(endIndex > 0 && endIndex > current)
                    if (endIndex > 0) {
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    } else {
                        current = -1;
                    }
                }
            }
            input.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
}
