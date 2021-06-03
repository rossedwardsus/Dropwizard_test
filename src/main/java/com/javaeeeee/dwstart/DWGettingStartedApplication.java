package com.javaeeeee.dwstart;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.jdbi3.JdbiFactory;
//import org.skife.jdbi;
//import resources.EventResource;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;

public class DWGettingStartedApplication extends Application<DWGettingStartedConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DWGettingStartedApplication().run(args);
    }

    @Override
    public String getName() {
        return "DWGettingStarted";
    }

    @Override
    public void initialize(final Bootstrap<DWGettingStartedConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DWGettingStartedConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
        
        final JdbiFactory factory = new JdbiFactory();
        final Jdbi jdbi = factory.build(environment, configuration.getDataSourceFactory(), "postgresql");
        jdbi.installPlugin(new SqlObjectPlugin());
        environment.jersey().register(new HelloJsonResource(jdbi));

        //final JdbiFactory factory = new JdbiFactory();
        //final DBI jdbi = factory.build(environment, configuration.getDataSourceFactory(), "database");
        //final EventDao eventDao = jdbi.onDemand(EventDao.class);
 
        //e.jersey().register(new EventResource(eventDao));

        //MyDAO mydao = jdbi.onDemand(MyDAO.class);
    

        //environment.jersey().register(new HelloResource());
        //environment.jersey().register(new HelloJsonResource(mydao));

 
    }

}
