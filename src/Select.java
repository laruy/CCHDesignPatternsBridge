public class Select extends Consulta {

    public Select(DatabaseImplementation database) {
        super(database);
    }

    @Override
    public void realizarConsulta(String query) {
        System.out.println("Executando consulta SELECT...");
        database.executeQuery(query);
    }
}