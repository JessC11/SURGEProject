package com.surge.GetYourWay.service;

import com.surge.GetYourWay.domain.dto.FlightInfo;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightApiService {

    public List<FlightInfo> getFlights(String depart, String arrive, String date) {
        List<FlightInfo> flights = new ArrayList<>();

        String api = "https://app.goflightlabs.com/flights?access_key=";
        String key = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiI0IiwianRpIjoiNTk2OTY5Y2FhMjNlNzdmMmNhNDY1YmU1Y2ZhMGNjZjYyMDU0Nzc5ZmNlYzFhMjhmOTFlYzhlMDNjZGQyODc0Yjc2ZTk3NGVjMjYzOGE2MWIiLCJpYXQiOjE2NTg2MDgxNDIsIm5iZiI6MTY1ODYwODE0MiwiZXhwIjoxNjkwMTQ0MTQyLCJzdWIiOiI5MTk0Iiwic2NvcGVzIjpbXX0.BixFUrckPkpL19XQAQT7X7f7_BRq7TpRx7y-x4tkEkgNMC7TWSOrZONjo9gWh5DgiZ7SJrzc651WT9PWvJi64Q";
        String uri = api + key + "&dep_iata=" + depart + "&arr_iata=" + arrive + "&scheduled_time_dep=" + date;

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);

        JSONArray objArray = new JSONArray(result);

        for (int i = 0; i < objArray.length(); i++) {
            FlightInfo f = new FlightInfo();
            JSONObject dep = objArray.getJSONObject(i).getJSONObject("departure");
            JSONObject arr = objArray.getJSONObject(i).getJSONObject("arrival");
            JSONObject air = objArray.getJSONObject(i).getJSONObject("airline");

            f.setDeparture(dep.getString("airport"));
            f.setDepartTime(dep.getString("scheduled"));
            f.setArrival(arr.getString("airport"));
            f.setArrivalTime(arr.getString("scheduled"));
            f.setAirline(air.getString("name"));
            flights.add(f);
        }

        return flights;
    }

}
