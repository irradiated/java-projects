public class FileReader {
    public static void main(String[] args) {
        Random numgen = new Random();
        File file = new File("./wordlist.txt");
        Scanner fileScan = new Scanner(file);
        StringBuilder sb = new StringBuilder();

        while (fileScan.hasNext()) {
            sb.append(fileScan.nextLine());
            sb.append("\n");
        }
        String[] wordList = sb.toString().split(" ");

        for (int i = 0; i < wordList.length; i++) {
            System.out.println(wordList[i]);
        }
    }
}
