package com.rodriguez.giomar.repository;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.domain.Specifications;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SpecificationsBuilder {
    public static Specification build(String[] query) {
        List<Specification> specs = new ArrayList<>();
        for(String param : query){
            StringTokenizer parts = new StringTokenizer(param, "=,:,>,<", true);
            specs.add(new SearchSpecification(new SearchCriteria(parts.nextToken(), parts.nextToken(), parts.nextToken())));
        }
        Specification result = specs.get(0);
        for(int i = 1; i < specs.size(); i++ ){
            result = Specifications.where(result).and(specs.get(i));
        }
        return result;
    }
}
