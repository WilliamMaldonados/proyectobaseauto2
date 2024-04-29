package co.com.choucair.certification.proyectobase.runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({Test1.class,Test1Devolution.class,Test1Modify.class, Test2.class, Test2Devolution.class, Test2Modify.class, Test3.class,
        Test3Modify.class,Test3a.class, Test3aModify.class, Test4.class,Test4Devolution.class,Test4Modify.class,Test5.class,Test5Devolution.class,Test5Modify.class })
public class Testmigration {
}
