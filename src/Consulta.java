public abstract class Consulta {
    protected DatabaseImplementation database;

    public Consulta(DatabaseImplementation database) {
        this.database = database;
    }

    public abstract void realizarConsulta(String query);
}
