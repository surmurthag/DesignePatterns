
public class FormImmatriculationLuxembourg extends
  FormulaireImmatriculation
{
  public FormImmatriculationLuxembourg(FormulaireImpl
    implantation)
  {
    super(implantation);
  }

  protected boolean controleSaisie(String plaque)
  {
    return plaque.length() == 5;
  }
}
