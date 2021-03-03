package co.com.ias.solid.dependencyinversion.badexample.application;

import co.com.ias.solid.dependencyinversion.badexample.domain.LogsService;

public class BadDependencyMain {

    public static void main(String[] args) {

        LogsService logsService = new LogsService();

        logsService.saveLog("<user> deleted a resource");

    }

}
