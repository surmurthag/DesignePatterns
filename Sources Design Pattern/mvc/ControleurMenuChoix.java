package com.example.mvc;

import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;

public class ControleurMenuChoix extends Controleur
    implements
    Property.ValueChangeListener {
  private static final long serialVersionUID = 1L;

  public ControleurMenuChoix(BaseVehicules modele) {
    super();
    this.modele = modele;
  }

  public void valueChange(ValueChangeEvent event) {
    BaseVehicules.VehiculeDescription nouvelleDescription =
        (BaseVehicules.VehiculeDescription) event
            .getProperty().getValue();
    if (nouvelleDescription != null)
      modele.setIndiceVehiculeCourant(nouvelleDescription
          .getIndice());
  }

  public void actualise() {
  }
}
