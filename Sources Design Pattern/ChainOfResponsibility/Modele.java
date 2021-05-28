public class Modele extends ObjetBase
{
  protected String description;
  protected String nom;

  public Modele(String nom, String description)
  {
    this.description = description;
    this.nom = nom;
  }

  protected String getDescription()
  {
    if (description != null)
      return "Modèle " + nom + " : " + description;
    else
      return null;
  }
}
