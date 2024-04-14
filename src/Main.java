import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lines = new ArrayList<>();
        String line;
        try {
            BufferedReader rd = new BufferedReader(new FileReader("C:\\Users\\mikel\\Downloads\\texto.txt"));
            while ((line = rd.readLine()) != null){
                lines.add(line);
            }
            for (int i = 0; i < lines.size() ; i++) {
                String a = lines.get(i).replace("{","").replace("}","").replace(";","");
                System.out.println(a);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sc.close();
    }
}