public class Update extends Consulta {

    public Update(DatabaseImplementation database) {
        super(database);
    }

    @Override
    public void realizarConsulta(String query) {
        System.out.println("Executando consulta Update...");
        database.executeQuery(query);
    }
}