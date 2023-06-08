package com.example.evalutaion_java;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PizzaDao {

    public List<Pizza> getPizza(){
        List<Pizza> pizzas = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/diagne37u_JavaControle", "diagne37u_appli", "32216625");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from PIZZA");
            while(rs.next()){
                pizzas.add(new Pizza(rs.getString("nom"), rs.getDouble("prix"), rs.getInt("nbrIngredients")));
            }
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
        return pizzas;
    }

    public void ajouterPizza(Pizza pizza){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/diagne37u_JavaControle", "diagne37u_appli", "32216625");

            PreparedStatement st = con.prepareStatement("insert into PIZZA(nom, prix, nbrIngredients) values(?,?,?)");
            st.setString(1, pizza.getNom());
            st.setDouble(2, pizza.getPrix());
            st.setInt(3, pizza.getNbrIngredients());
            st.executeUpdate();
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void supprimerPizza() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/diagne37u_JavaControle", "diagne37u_appli", "32216625");

            PreparedStatement st = con.prepareStatement("delete from PIZZA");
            st.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
