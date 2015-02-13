package com.deepnighttwo.eplbuilder.context;

import com.espertech.esper.client.*;

/**
 * User: mzang
 * Date: 2015-01-07
 * Time: 12:32
 */
public class EsperTestBase {

    EPServiceProvider esperProvider;
    EPRuntime esperRuntime;
    EPAdministrator esperAdmin;

    public EsperTestBase() {
        Configuration configuration = new Configuration();
        configuration.getEngineDefaults().getThreading()
                .setInternalTimerEnabled(false);

//        configuration.addImport(Event.class);

//        configuration.addImport(EventFunc.class);
//        configuration.addVariable("op", Boolean.class, false);


        esperProvider = EPServiceProviderManager.getProvider(EsperTestBase.class.toString(), configuration);
        esperProvider.initialize();
        esperRuntime = esperProvider.getEPRuntime();

        esperAdmin = esperProvider.getEPAdministrator();
    }


}
