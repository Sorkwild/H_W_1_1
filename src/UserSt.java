public class UserSt {
    private static String login;
    private static String password;

    static class QuerySt{
        public void printToLog(){
            System.out.println("Запрос от "+login+" "+password);
        }
    }

    public UserSt(String log, String pas){
        this.login = log;
        this.password = pas;
    }

    public void createQuerySt(){
        QuerySt query = new QuerySt();
        query.printToLog();
    }

}