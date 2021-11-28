import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
    static String userName = "abcdlsj";
    static String userEmail = "lisongjianshuai@gmail.com";
    public static void main(String [] args) {
        String cmd = args[0];
        switch (cmd) {
            case "init":
                Path path = Paths.get("./");
                String dirPath = path.toAbsolutePath() + "/.gitlet/";
                File file = new File(dirPath);
                if (!file.exists()) {
                    file.mkdir();
                }
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(dirPath + "./gitlet.conf"));
                    bw.write(String.format("[conf]\nauth=%s\nemail=%s", userName, userEmail));
                    bw.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("not availed cmd");
        }
    }
}
