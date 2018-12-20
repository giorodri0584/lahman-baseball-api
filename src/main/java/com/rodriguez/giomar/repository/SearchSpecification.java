package com.rodriguez.giomar.repository;

import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Created by giorod on 9/2/2018.
 */
public class SearchSpecification<T> implements Specification<T> {
    private SearchCriteria searchCriteria;

    public SearchSpecification(SearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    // : is like
    // > greaterthan or equal, < lessthan or equal
    //@ equal
    @Override
    public Predicate toPredicate(Root<T> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        if(searchCriteria.getOperation().equalsIgnoreCase(">")){
            return criteriaBuilder.greaterThanOrEqualTo(root.<String> get(searchCriteria.getKey()), searchCriteria.getValue().toString());
        } else if(searchCriteria.getOperation().equalsIgnoreCase("<")){
            return criteriaBuilder.lessThanOrEqualTo(root.<String> get(searchCriteria.getKey()), searchCriteria.getValue().toString());
        }else if(searchCriteria.getOperation().equalsIgnoreCase(":")){
            return criteriaBuilder.like(root.<String> get(searchCriteria.getKey()), searchCriteria.getValue().toString());
        }else if(searchCriteria.getOperation().equalsIgnoreCase("@")){
            return criteriaBuilder.equal(root.<String> get(searchCriteria.getKey()), searchCriteria.getValue().toString());
        }
        return null;
    }
}
