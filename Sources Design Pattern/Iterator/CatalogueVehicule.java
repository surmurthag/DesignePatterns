public class CatalogueVehicule extends
  Catalogue<Vehicule, IterateurVehicule> 
{
  public CatalogueVehicule()
  {
    contenu.add(new Vehicule("véhicule bon marché"));
    contenu.add(new Vehicule("petit véhicule bon marché"));
    contenu.add(new Vehicule("véhicule grande qualité"));
  }

  protected IterateurVehicule creeIterateur()
  {
    return new IterateurVehicule();
  }
}
