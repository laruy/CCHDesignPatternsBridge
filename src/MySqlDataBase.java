public class MySqlDataBase implements DatabaseImplementation {
    @Override
    public void executeQuery(String query) {
        System.out.println("Executando consulta no MySQL: " + query);
    }
}
