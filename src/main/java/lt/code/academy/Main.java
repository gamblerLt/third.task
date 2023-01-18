package lt.code.academy;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Main {

    // private final static String FILE_NAME =

    public static void main(String[] args) {

        Main main = new Main();
       main.write;
       // main.read;

      Faker faker = new Faker();

       // ObjectMapper objectMapper = new ObjectMapper();
       // Factory factory = new Factory("UAB", 222, 25, 563);
    }
    private void write() {
        Factory factory = new Factory(new Factory("UAB Laivas",2, 25, 10145.2));

        try(ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream("factory.json"))) {
            objectOutput.writeObject(factory);
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
/*for(int i = 0; i < 100; i++) {
            System.out.println(faker.address().streetAddress());
        }*/

/*
public class WriteJSONExample {

    public static void main(String[] args) {

        JSONObject obj = new JSONObject();
        obj.put("name","foo");
        obj.put("num",new Integer(100));
        obj.put("balance",new Double(1000.21));
        obj.put("is_vip",new Boolean(true));

        try {

            FileWriter file = new FileWriter("c:\\test.json");
            file.write(obj.toJSONString());
            file.flush();
            file.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.print(obj);

    }

}*/