import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Mem {
 //   String textMem;
  //  String pathname;


    public void printMem() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Создаем файл. Укажите абсолютный путь к изображению в формате .png");
        String pathname = scanner.nextLine();
        System.out.println("Создаем надпись на картинке. Введите текст");
        String textMem = scanner.nextLine();
        System.out.println("Сохраняем изображение. Укажите абсолютный путь к файлу в формате .png");
        String saveMem = scanner.nextLine();
        creatMem(pathname, textMem, saveMem);
    }

    public void creatMem(String pathname, String textMem, String saveMem) throws IOException {
        File file = new java.io.File(pathname);
        BufferedImage image;
        try {
            image = ImageIO.read(file);
            System.out.println("Файл создан");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Graphics2D g = image.createGraphics();
        g.setColor(Color.RED);
        g.setFont(new Font("Courier New", Font.BOLD, 50));
        g.drawString(textMem, 200, 500);
        try {
            ImageIO.write(image, "png", new File(saveMem));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}




