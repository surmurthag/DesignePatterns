
public class TestVendeur
{

  public static void main(String[] args)
  {
    // initialisation du vendeur du système
    Vendeur leVendeur = Vendeur.Instance();
    leVendeur.setNom("Vendeur Auto");
    leVendeur.setAdresse("Paris");
    leVendeur.setEmail("vendeur@vendeur.com");
    // affichage du vendeur du système
    affiche();
  }

  public static void affiche()
  {
    Vendeur leVendeur = Vendeur.Instance();
    leVendeur.affiche();
  }

}
