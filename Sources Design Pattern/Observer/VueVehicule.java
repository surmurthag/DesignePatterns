
public class VueVehicule implements Observateur
{
  protected Vehicule vehicule;
  protected String texte = "";

  public VueVehicule(Vehicule vehicule)
  {
    this.vehicule = vehicule;
    vehicule.ajoute(this);
    metAJourTexte();
  }

  protected void metAJourTexte()
  {
    texte = "Description " + vehicule.description + 
      " Prix : " + vehicule.prix;
  }

  public void actualise()
  {
    metAJourTexte();
    this.redessine();
  }

  public void redessine()
  {
    System.out.println(texte);
  }
}
