package database;

public class DataService {

  private IDataStorage dataStorage;

  public DataService(){
    dataStorage = new IDataStorage();
  }
  
  public void saveData(String data){
    dataStorage.saveData(data);
  }
}
