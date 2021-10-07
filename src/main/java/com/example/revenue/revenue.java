package com.example.revenue;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "revenue")
public class revenue {

    @Id
    private String id;

    private String year;
    private long users_this_year;
    private long total_revenue;
    private List<Integer> qoq_revenue;

    public revenue() {}

    public revenue(String year, long users_this_year, long total_revenue, List<Integer> qoq_revenue) {
        this.year = year;
        this.users_this_year = users_this_year;
        this.total_revenue = total_revenue;
        this.qoq_revenue = qoq_revenue;
    }

    public List<Integer> getQoq_revenue() {
        return qoq_revenue;
    }

    public void setQoq_revenue(List<Integer> qoq_revenue) {
        this.qoq_revenue = qoq_revenue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public long getUsers_this_year() {
        return users_this_year;
    }

    public void setUsers_this_year(long users_this_year) {
        this.users_this_year = users_this_year;
    }

    public long getTotal_revenue() {
        return total_revenue;
    }

    public void setTotal_revenue(long total_revenue) {
        this.total_revenue = total_revenue;
    }
}
