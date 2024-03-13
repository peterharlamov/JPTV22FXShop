/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22fxshop;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javax.persistence.EntityManager;

/**
 *
 * @author pupil
 */
public class HomeController {
    
    private JPTV22FXShop app;
    private EntityManager em;
    @FXML private VBox vbHomeContent;

    public JPTV22FXShop getApp() {
        return app;
    }
    
    public EntityManager getEntityManager() {
        return em;
    }

    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    public void setApp(JPTV22FXShop app) {
        this.app = app;
        this.em = app.getEntityManager();
    }
}
