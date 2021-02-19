import java.util.Scanner;
import java.net.*;

public class FetchURL {

    public static void main(String[] args) {

        try {
            URL url = new URL("https://www.barbie.com");
            Scanner input = new Scanner(url.openStream());

            int count = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
            }

            input.close();
            System.out.println("The file size is " + count + " bytes");

        }
        catch(Exception e) {
            System.out.println(e);
        }
        

    }
}