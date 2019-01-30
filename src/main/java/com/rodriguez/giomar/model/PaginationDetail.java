package com.rodriguez.giomar.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaginationDetail {
    private int currentPage;
    private int totalPages;
    private boolean isFirst;
    private boolean isLast;

    public PaginationDetail(int currentPage, int totalPages, boolean isFirst, boolean isLast) {
        this.currentPage = currentPage;
        this.totalPages = totalPages;
        this.isFirst = isFirst;
        this.isLast = isLast;
    }
}
