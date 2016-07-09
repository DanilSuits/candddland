package com.vocumsineratio.candddland.apps.dropwizard;

import com.vocumsineratio.candddland.apps.dropwizard.resources.HelloWorld;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * Hello world!
 *
 */
public class Sample extends Application<SampleConfiguration>
{
    @Override
    public void run(SampleConfiguration sampleConfiguration, Environment environment) throws Exception {
        environment.jersey().register(new HelloWorld(sampleConfiguration.helloWorld.message));
    }

    public static void main( String[] args ) throws Exception {
        Sample theApp = new Sample();
        theApp.run(args);
    }

}
