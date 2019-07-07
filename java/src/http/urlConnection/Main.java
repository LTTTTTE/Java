package http.urlConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        new BufferedReader(new InputStreamReader(new URL("https://www.naver.com/").openConnection().getInputStream())).lines().forEach(System.out::println);
    }
}
