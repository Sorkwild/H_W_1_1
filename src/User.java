public class User {
    private final String login;
    private final String password;
    public class Query{
        public void printToLog(){
            System.out.println("Запрос от "+login+" "+password);
        }
    }
    public User(String login, String password){
        this.login = login;
        this.password = password;
    }

    public Query createQuery(){
        Query query = new Query();
        query.printToLog();
        return query;
    }
}