package com.bitcoin.vanity;

import com.bitcoin.vanity.misc.PrintUtils;
import com.bitcoin.vanity.model.Entropy;
import com.bitcoin.vanity.model.Wallet;
import com.bitcoin.vanity.service.EntropyGenerator;
import com.bitcoin.vanity.service.NonDeterministicKeyGenerator;
import com.bitcoin.vanity.service.QRCodeGenerator;

public class Main {

    public static void main(String[] args) throws Exception {
        String desiredAddressPrefix = args[0];
        boolean found = false;
        while(!found){
            Entropy entropy = EntropyGenerator.generateEntropy();
            Wallet wallet = NonDeterministicKeyGenerator.generateNonDeterministicKey(entropy);
            if(wallet.getLegacyAddress().startsWith(desiredAddressPrefix)){
                PrintUtils.printKeyPairToFile(wallet);
                QRCodeGenerator.generateQRCode(wallet.getPrivateKeyWif(), "./wallet/privateKey.png");
                QRCodeGenerator.generateQRCode(wallet.getLegacyAddress(), "./wallet/legacyAddress.png");
                System.out.println("Key pair was found successfully");
                found = true;
            }
        }

    }

}