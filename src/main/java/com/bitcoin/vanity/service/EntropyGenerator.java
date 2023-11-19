package com.bitcoin.vanity.service;

import com.bitcoin.vanity.model.Entropy;

public class EntropyGenerator {

    public static Entropy generateEntropy() {
        Entropy entropy = new Entropy();
        entropy.setEntropyHex(EntropyRandomiseService.getRandomHexString());
        return entropy;
    }

}
