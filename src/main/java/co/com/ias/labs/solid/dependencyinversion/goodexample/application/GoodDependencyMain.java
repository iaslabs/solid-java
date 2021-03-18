package co.com.ias.labs.solid.dependencyinversion.goodexample.application;

import co.com.ias.labs.solid.dependencyinversion.goodexample.domain.LogsService;
import co.com.ias.labs.solid.dependencyinversion.goodexample.domain.NoSQLDatabase;
import co.com.ias.labs.solid.dependencyinversion.goodexample.domain.SQLDatabase;

public class GoodDependencyMain {

    public static void main(String[] args) {
        // Using No Relational Database to save log
        LogsService logsService = new LogsService(new NoSQLDatabase());
        logsService.saveLog("<user> deleted a resource");

        // Using relational database
        logsService = new LogsService(new SQLDatabase());
        logsService.saveLog("<user> deleted a resource");
    }

}
