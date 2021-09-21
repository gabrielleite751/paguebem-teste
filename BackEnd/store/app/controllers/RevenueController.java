package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RevenueController extends Controller {

    /*Vendas por marca nos ultimos 6 meses?
    * Faturamento dos ultimos 6 meses
    * */

    public Result revenues() {

        List<Double> nikeRevenue = new ArrayList<>(Arrays.asList(800.00, 910.00, 720.00, 940.00, 890.00, 860.00, 900.00, 1000.00));
        List<Double> wilsonRevenue = new ArrayList<>(Arrays.asList(400.00, 320.00, 760.00, 640.00, 980.00, 500.00, 400.00, 200.00));
        List<Double> nbaRevenue = new ArrayList<>(Arrays.asList(600.00, 560.00, 620.00, 840.00, 990.00, 700.00, 900.00, 645.00));

        List<Double> revenue = new ArrayList<>();
        revenue.add(nikeRevenue.get(0)+wilsonRevenue.get(0)+nbaRevenue.get(0));
        revenue.add(nikeRevenue.get(1)+wilsonRevenue.get(1)+nbaRevenue.get(1));
        revenue.add(nikeRevenue.get(2)+wilsonRevenue.get(2)+nbaRevenue.get(2));
        revenue.add(nikeRevenue.get(3)+wilsonRevenue.get(3)+nbaRevenue.get(3));
        revenue.add(nikeRevenue.get(4)+wilsonRevenue.get(4)+nbaRevenue.get(4));
        revenue.add(nikeRevenue.get(5)+wilsonRevenue.get(5)+nbaRevenue.get(5));
        revenue.add(nikeRevenue.get(6)+wilsonRevenue.get(6)+nbaRevenue.get(6));
        revenue.add(nikeRevenue.get(7)+wilsonRevenue.get(7)+nbaRevenue.get(7));

        HashMap<String, List> values = new HashMap<String, List>(){
            {
                put("nike", nikeRevenue);
                put("wilson", wilsonRevenue);
                put("nba", nbaRevenue);
                put("total", revenue);
            }
        };

        //Comando para receber um JSON do front
        //JsonNode jsonNode = request.body().asJson();

        return ok(Json.toJson(values));
    }
}