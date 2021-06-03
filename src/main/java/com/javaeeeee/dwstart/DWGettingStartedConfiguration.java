package com.javaeeeee.dwstart;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import io.dropwizard.db.DataSourceFactory;
import javax.validation.Valid;
//import io.dropwizard.setup.Environment;
//import org.skife.jdbi.v2.DBI;
//import resources.EventResource;

public class DWGettingStartedConfiguration extends Configuration {
    // TODO: implement service configuration


	private String url;
    
    @Valid
    @NotNull
    @JsonProperty("database")
    private DataSourceFactory database = new DataSourceFactory();

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }


    @JsonProperty("database")
    public void setDataSourceFactory(DataSourceFactory factory) {
        this.database = factory;
    }

    @JsonProperty("database")
    public DataSourceFactory getDataSourceFactory() {
        return database;
    }
}
