package com.rodriguez.giomar.helper;

import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class LoadJsonTest {
    @Test
    public void from() throws Exception{
        JSONObject json = new JSONObject(LoadJson.from("onePlayer.json"));
        JSONObject expected = new JSONObject("{\n" +
                "  \"playerID\": \"aglerjo01\",\n" +
                "  \"birthYear\": 1887,\n" +
                "  \"birthMonth\": 6,\n" +
                "  \"birthDay\": 12,\n" +
                "  \"birthCountry\": \"USA\",\n" +
                "  \"birthState\": \"OH\",\n" +
                "  \"birthCity\": \"Coshocton\",\n" +
                "  \"deathYear\": \"1971\",\n" +
                "  \"deathMonth\": \"4\",\n" +
                "  \"deathDay\": \"26\",\n" +
                "  \"deathCountry\": \"USA\",\n" +
                "  \"deathState\": \"OH\",\n" +
                "  \"deathCity\": \"Massillon\",\n" +
                "  \"nameFirst\": \"Joe\",\n" +
                "  \"nameLast\": \"Agler\",\n" +
                "  \"nameGiven\": \"Joseph Abram\",\n" +
                "  \"weight\": 165,\n" +
                "  \"height\": 71,\n" +
                "  \"bats\": \"L\",\n" +
                "  \"throwsHand\": \"L\",\n" +
                "  \"debut\": \"1912-10-01\",\n" +
                "  \"finalGame\": \"1915-10-02\",\n" +
                "  \"retroID\": \"aglej101\",\n" +
                "  \"bbrefID\": \"aglerjo01\"\n" +
                "}");
        JSONAssert.assertEquals(expected, json, false);
    }
}