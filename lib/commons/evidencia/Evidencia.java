package evidencia;

import configuration.BaseTest;
import org.apache.commons.io.FileUtils;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFPictureData;
import org.apache.poi.xslf.usermodel.XSLFPictureShape;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Evidencia extends BaseTest {

    //método para criar diretório
    public void createADirectory(String DirectoryName) {

        //project directory
        String workingDirectory = System.getProperty("user.home");
        String dir = workingDirectory + File.separator + DirectoryName;

        System.out.println("Diretório criado em : " + dir);

        //create a directory in the path

        File file = new File(dir);

        if (!file.exists()) {
            file.mkdir();
            System.out.println("Pasta criada!");
        } else {
            System.out.println("A pasta já existe!");
        }
    }

    public void printScreen(){
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("printOLX.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void openPpt() throws IOException {

            //creating a presentation
        XMLSlideShow ppt = new XMLSlideShow();

        //creating a slide in it
        XSLFSlide slide = ppt.createSlide();

        //reading an image
        File image = new File("C:/Users/701033/Documents/images.png");

        //converting it into a byte array
        byte[] picture = new byte[0];
        try {
            picture = IOUtils.toByteArray(new FileInputStream(image));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //adding the image to the presentation
        int idx = ppt.addPicture(picture, XSLFPictureData.PICTURE_TYPE_PNG);

        //creating a slide with given picture on it
        XSLFPictureShape pic = slide.createPicture(idx);

        //creating a file object
        File file = new File("C:/Users/701033/Parametros/addingimage.pptx");
        FileOutputStream out = new FileOutputStream(file);

    }

    public void closePpt(){
        //saving the changes to a file
        ppt.write(out);
        System.out.println("Imagem adicionada!");
        out.close();
    }

    public static void criacaoSlide(){
        //creating a slide in it
        XSLFSlide slide = ppt.createSlide();
    }

}
