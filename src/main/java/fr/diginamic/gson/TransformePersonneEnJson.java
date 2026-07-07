package fr.diginamic.gson;

import com.google.gson.Gson;

/**
 * Convertit un objet Personne en représentation JSON.
 */
public class TransformePersonneEnJson {

  /**
   * Point d'entrée du programme.
   *
   * @param args arguments de la ligne de commande
   */
  public static void main(String[] args) {
    Gson gson = new Gson();

    // Objet simple
    Personne p = new Personne("DURAND", 25);

    // Conversion en JSON
    String json = gson.toJson(p);

    System.out.println(json);
  }
}
