package co.com.ias.labs.solid.dependencyinversion.badexample.domain;

public class LogsService {

    public void saveLog(String log) {

        SQLDatabase database = new SQLDatabase();
        database.save(log);

    }

}
