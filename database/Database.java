package database;

public class Database implements IDataStorage {

  @Override
  public void saveData(String data) {
    System.out.println("Saving data");
  }

}
