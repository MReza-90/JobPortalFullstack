package com.JobQuest.jobportal.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Logger;

public class FileUploadUtil {

    private static final Logger LOGGER = Logger.getLogger(FileUploadUtil.class.getName());

    public static void saveFile(String uploadDir, String filename, MultipartFile multipartFile) throws IOException {

        Path uploadPath = Paths.get(uploadDir);
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
            LOGGER.info("Created directory: " + uploadDir);

        }

        try (InputStream inputStream = multipartFile.getInputStream();) {
            Path path = uploadPath.resolve(filename);
            System.out.println("FilePath " + path);
            System.out.println("fileName " + filename);
            Files.copy(inputStream, path, StandardCopyOption.REPLACE_EXISTING);
            LOGGER.info("Saved file: " + path.toString());

        }
        catch (IOException ioe) {
            LOGGER.severe("Could not save file: " + filename);
            throw new IOException("Could not save image file: " + filename, ioe);
        }
    }
}
