package com.bitcoin.vanity.misc;

import com.bitcoin.vanity.model.Wallet;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintUtils {

    public static void printKeyPairToFile(Wallet wallet) throws IOException {
        FileWriter fileWriter = new FileWriter("./wallet/keys.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("----------");
        printWriter.println("| Wallet |");
        printWriter.println("----------");
        printWriter.println("Private Key: " + wallet.getPrivateKeyHex());
        printWriter.println("Private Key (WIF): " + wallet.getPrivateKeyWif());
        printWriter.println("Legacy Address: " + wallet.getLegacyAddress());
        printWriter.close();
    }

}
