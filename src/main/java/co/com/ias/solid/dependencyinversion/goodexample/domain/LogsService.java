package co.com.ias.solid.dependencyinversion.goodexample.domain;

public class LogsService {

    private final Database database;

    public void saveLog(String log) {
        database.save(log);
    }

    public LogsService(Database database) {
        this.database = database;
    }

}
