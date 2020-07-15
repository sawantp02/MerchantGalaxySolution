package galaxy.merchant;

import galaxy.merchant.filehandling.TransactionsFileReader;

import java.io.File;

public class MerchantGalaxySolution {
    public static void main(String[] args) {
        String filePath;
        TransactionsFileReader transactionsFileReader = new TransactionsFileReader();
        try {
            if (args.length != 0)
                filePath = args[0];
            else {
                File file = new File("src//galaxy//merchant//input.txt");
                filePath = file.getAbsolutePath();
            }
            transactionsFileReader.readTransactionsFile(filePath);
        } catch (Exception e) {
            System.out.println("Exception while reading input file : " + e.getMessage());
        }
    }
}