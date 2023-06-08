package com.example.evalutaion_java;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

// a. initialise le tableau avec la liste des pizzas de la base données
public class HelloController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        recette.setCellValueFactory(new PropertyValueFactory<Pizza, String>("nom"));
        prix.setCellValueFactory(new PropertyValueFactory<Pizza, Double>("prix"));
        ingredients.setCellValueFactory(new PropertyValueFactory<Pizza, Integer>("nbrIngredients"));
        PizzaDao pizzaDao = new PizzaDao();
        List<Pizza> pizzas = pizzaDao.getPizza();
        tab.getItems().addAll(pizzas);

    }

    @FXML
    public void ajouterPizza() {
        Pizza pizza = new Pizza();
        pizza.setNom(text1.getText());
        pizza.setPrix(Double.parseDouble(text2.getText()));
        pizza.setNbrIngredients(Integer.parseInt(text3.getText()));

        PizzaDao pizzaDao = new PizzaDao();
        pizzaDao.ajouterPizza(pizza);
    }



    @FXML
    public void supprimerPizza() {
        PizzaDao pizzaDao = new PizzaDao();
        pizzaDao.supprimerPizza();

    }
    @FXML
    private TableView tab;
    @FXML
    private TableColumn recette;
    @FXML
    private TableColumn prix;
    @FXML
    private TableColumn ingredients;
    @FXML
    private Label pizza;

    @FXML
    private Label nRecette;

    @FXML
    private Label nIngredient;
    @FXML
    private Label nPrix ;
    @FXML
    private TextField text1;
    @FXML
    private TextField text2;
    @FXML
    private TextField text3;
    @FXML
    private Button btnAjouter;
    @FXML
    private Button btnVider;


}