package database;

public class DataService {

  private IDataStorage dataStorage;
  
  public void saveData(String data){
    dataStorage.saveData(data);
  }
}
