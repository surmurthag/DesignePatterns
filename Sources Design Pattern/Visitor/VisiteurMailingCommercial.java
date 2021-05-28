public class VisiteurMailingCommercial implements Visiteur
{
  public void visite(SocieteSansFiliale
    societe)
  {
    System.out.println("Envoi d'un email à " +
      societe.getNom() + " adresse : " + societe.getEmail
      () + " Proposition commerciale pour votre société");
  }

  public void visite(SocieteMere societe)
  {
    System.out.println("Envoi d'un email à " +
      societe.getNom() + " adresse : " + societe.getEmail
      () + " Proposition commerciale pour votre groupe");
    System.out.println("Impression d'un courrier à " +
      societe.getNom() + " adresse : " +
      societe.getAdresse() + 
      " Proposition commerciale pour votre groupe");
  }
}
