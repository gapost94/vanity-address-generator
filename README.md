## Vanity Address Generator

### Instructions
* Modify `Main.java` and change the variable `desiredAddressPrefix` to whatever prefix you wish for your bitcoin address. 
* Run `Main.java`
* Once the address is found, the program will generate a `wallet` directory:
  * keys.txt file, which includes the address and the private key in WIF and HEX format.
  * legacyAddress.png QR code for the address.
  * privateKey.png QR code for the private key.

### Future work
* Standalone executable.
* Experimentation with other entropy sources.