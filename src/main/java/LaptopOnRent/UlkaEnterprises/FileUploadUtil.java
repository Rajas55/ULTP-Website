package LaptopOnRent.UlkaEnterprises;

import lombok.SneakyThrows;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileUploadUtil  {
    @SneakyThrows
    public static void saveFile(String uploadDir, MultipartFile multipartFile, String fileName){
        Path uploadPath = Paths.get(uploadDir);
        if (!Files.exists(uploadPath )){
            Files.createDirectories(uploadPath);
        }
        try (InputStream inputStream = multipartFile.getInputStream()){
            Path filePath = uploadPath.resolve(fileName);
            Files.copy(inputStream,filePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e){
            throw new IOException("File Not Saved");
        }

    }





}
