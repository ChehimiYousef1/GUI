// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Database {
  private static Database Database_Instance;
  private Database(){}
  public static Database Database_getInstance(){
    if(Database_Instance == null){
      Database_Instance = new Database();
      System.out.println("Successfully creating the database connection");
    }else{
      System.out.println("Database connection already created");
    }
    return Database_Instance;
  }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        System.out.println();
        Database.Database_getInstance();
        Database.Database_getInstance();
    }
}
