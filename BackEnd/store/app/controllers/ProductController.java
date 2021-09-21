package controllers;

import play.libs.Json;
import play.mvc.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductController extends Controller {

    public Result product() {
        HashMap<String, String> product = new HashMap<String, String>(){
            {
                put("imgUrl", "https://i.imgur.com/W6NIaSu.jpeg");
                put("name", "Bola");
                put("brand", "Nike");
                put("code", "19872008");
                put("sport", "Futebol");
                put("price", "150.00");
            }
        };
        HashMap<String, String> product2 = new HashMap<String, String>() {
            {
                put("imgUrl", "https://i.imgur.com/ItrGSBH.jpeg");
                put("name", "Bola");
                put("brand", "Wilson");
                put("code", "19872008");
                put("sport", "Volei");
                put("price", "200.00");
            }
        };
        HashMap<String, String> product3 = new HashMap<String, String>() {
            {
                put("imgUrl", "https://i.imgur.com/E4kRSOT.jpeg");
                put("name", "Camisa");
                put("brand", "NBA");
                put("code", "19872008");
                put("sport", "Basquete");
                put("price", "300.00");
            }
        };
        HashMap<String, String> product4 = new HashMap<String, String>() {
            {
                put("imgUrl", "https://i.imgur.com/eiOnYsW.jpeg");
                put("name", "Camisa");
                put("brand", "NBA");
                put("code", "39852048");
                put("sport", "Basquete");
                put("price", "300.00");
            }
        };

        List<HashMap<String, String>> listOfMaps = new ArrayList<HashMap<String, String>>();
        listOfMaps.add(product);
        listOfMaps.add(product2);
        listOfMaps.add(product3);
        listOfMaps.add(product4);

        HashMap<String, List> allProducts = new HashMap<String, List>(){
            {
                put("products", listOfMaps);
            }
        };

        return ok(Json.toJson(listOfMaps));
    }
}
