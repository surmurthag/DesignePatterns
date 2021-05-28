package com.example.mvc;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class ControleurBoutonAvisSuivant extends
    Controleur implements
    ClickListener, Observateur {
  private static final long serialVersionUID = 1L;
  protected int indiceAvisCourant;
  protected int nbrAvis;

  public ControleurBoutonAvisSuivant(
      BaseVehicules modele, VuePrincipale vuePrincipale) {
    super();
    this.modele = modele;
    this.vue = vuePrincipale;
    modele.ajoute(this);
    actualise();
  }

  public void buttonClick(ClickEvent event) {
    indiceAvisCourant++;
    if (indiceAvisCourant == nbrAvis)
      indiceAvisCourant = 0;
    vue.afficheAvis(indiceAvisCourant);
  }

  public void actualise() {
    nbrAvis = modele.getNbrAvis();
    indiceAvisCourant = 0;
    vue.afficheAvis(indiceAvisCourant);
  }
}
