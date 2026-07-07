package fr.diginamic.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Exemple d'utilisation de SLF4J pour la journalisation.
 */
public class App {

  /** Logger de la classe. */
  private static final Logger LOG = LoggerFactory.getLogger(App.class);

  /**
   * Point d'entrée du programme.
   *
   * @param args arguments de la ligne de commande
   */
  public static void main(String[] args) {
    LOG.info("Bonjour depuis SLF4J !");
  }
}
