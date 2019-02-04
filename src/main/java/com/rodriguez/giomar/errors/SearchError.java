package com.rodriguez.giomar.errors;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchError {
    private String error;

    public SearchError(String error) {
        this.error = error;
    }
}
