public class Main {
    public static void main(String[] args) {
        Consulta selectMySQL = new Select(new MySqlDataBase());
        selectMySQL.realizarConsulta("SELECT * FROM usuarios");

        Consulta selectPostgreSQL = new Select(new PostgresDataBase());
        selectPostgreSQL.realizarConsulta("SELECT * FROM clientes");
    }
}