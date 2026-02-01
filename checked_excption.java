import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class checked_excption {
    public static void main(String[] args) {
        try (FileInputStream fs = new FileInputStream("newfile.txt")) {
            int ch = fs.read(); //return integer format by reading byte stream
            //System.out.println((char) ch);
            while(ch != -1) {
                System.out.print((char) ch);
                ch = fs.read();

            }
            fs.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("IO exception occurred");
        }
    }
}