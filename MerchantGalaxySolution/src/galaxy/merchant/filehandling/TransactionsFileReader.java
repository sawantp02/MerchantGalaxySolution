package galaxy.merchant.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TransactionsFileReader {
    BufferedReader bufferedReader = null;
    FileReader fileReader;

    public void readTransactionsFile(String filePath) throws IOException {
        String line;
        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            IntergalacticDataProcessor intergalacticDataProcessor = new IntergalacticDataProcessor();

            while ((line = bufferedReader.readLine()) != null) {
                line = line.trim().replaceAll("[\\s]+", " ");
                intergalacticDataProcessor.processIntergalacticData(line);
            }
        } catch (Exception e) {
            System.out.println("Exception while reading trasanction input file : " + e.getMessage());
        } finally {
            bufferedReader.close();
            fileReader.close();
        }
    }
}
