package com.example.mvc;

import com.vaadin.Application;
import com.vaadin.ui.Window;

public class MvcApplication extends Application {
  private static final long serialVersionUID = 1L;

  @Override
  public void init() {
    Window mainWindow = new Window("Mvc Application");
    BaseVehicules modele = new BaseVehicules();
    VuePrincipale mainView = new VuePrincipale(modele);
    mainWindow.addComponent(mainView);
    setMainWindow(mainWindow);
  }
}
