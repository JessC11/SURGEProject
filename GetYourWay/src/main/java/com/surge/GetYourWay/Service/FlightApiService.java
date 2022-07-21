package com.surge.GetYourWay.service;

import com.surge.GetYourWay.domain.dto.Flight;
import com.surge.GetYourWay.domain.dto.FlightInfo;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightApiService {

    public List<FlightInfo> getFlights(String depart, String arrive) {
        List<FlightInfo> flights = new ArrayList<>();

        String api = "https://app.goflightlabs.com/routes?access_key=";
        String key = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiI0IiwianRpIjoiNzQxOWZkNGFjYmZmZjlkODdjY2E3YWExNjA4NzQ1OTI3NjVjOGZkOTgyZWVjYmE2YTc3NjM4YTgwNDUzODQ2MmI2MWY5YzBkMDBhMzhlNDMiLCJpYXQiOjE2NTgzOTk1MDgsIm5iZiI6MTY1ODM5OTUwOCwiZXhwIjoxNjg5OTM1NTA4LCJzdWIiOiI4OTU0Iiwic2NvcGVzIjpbXX0.QLjhGFrp1Se5ViyxsOmQ0LNfVlxaiOGLqVDBXUHpRsyUgVHS2q4rsMCfGjDDpMMcKIU0jhUhPbOxOxxE_dITqQ";
        String uri = api + key + "&dep_iata=" + depart + "&arr_iata=" + arrive;

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        JSONArray objArray = new JSONArray(result);

        for (int i = 0; i < objArray.length(); i++) {
            FlightInfo f = new FlightInfo();
            JSONObject dep = objArray.getJSONObject(i).getJSONObject("departure");
            JSONObject arr = objArray.getJSONObject(i).getJSONObject("arrival");
            JSONObject air = objArray.getJSONObject(i).getJSONObject("airline");
            f.setDeparture(dep.getString("airport"));
            f.setDepartTime(dep.getString("time"));
            f.setArrival(arr.getString("airport"));
            f.setArrivalTime(arr.getString("time"));
            f.setAirline(air.getString("name"));
            flights.add(f);
        }

        return flights;
    }

}
