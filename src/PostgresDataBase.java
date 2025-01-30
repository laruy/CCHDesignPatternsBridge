public class PostgresDataBase implements DatabaseImplementation{
    @Override
    public void executeQuery(String query) {
        System.out.println("Executando consulta no Postgres: " + query);
    }
}
