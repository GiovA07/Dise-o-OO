package io;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import decorator.io.CesarCracker;

public class CesarCrackerTest {
  @Test
  public void cesarCrackerEncryptTest() {
    CesarCracker convert = new CesarCracker();
    String textConverted = convert.encryptText("Esta es una Prueba");
    assertEquals("Hvwd hv xqd Suxhed", textConverted);
  }

  @Test
  public void cesarCrackerDecryptTest() {
    CesarCracker convert = new CesarCracker();
    String textConverted = convert.decryptText("Hvwd hv xqd Suxhed");
    assertEquals("Esta es una Prueba", textConverted);
  }
}
