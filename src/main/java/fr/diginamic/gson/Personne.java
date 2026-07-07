package fr.diginamic.gson;

/**
 * Représente une personne avec un nom et un âge.
 */
public class Personne {
  private String nom;
  private int age;

  /**
   * Construit une personne.
   *
   * @param nom le nom de la personne
   * @param age l'âge de la personne
   */
  public Personne(String nom, int age) {
    this.nom = nom;
    this.age = age;
  }

  /**
   * Retourne le nom de la personne.
   *
   * @return le nom
   */
  public String getNom() {
    return nom;
  }

  /**
   * Retourne l'âge de la personne.
   *
   * @return l'âge
   */
  public int getAge() {
    return age;
  }
}
