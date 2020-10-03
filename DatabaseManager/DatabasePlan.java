package DatabaseManager;

import java.sql.ResultSet;

public interface DatabasePlan {
  ResultSet getData();
  
  void insertData(String[] paramArrayOfString);
  
  void deleteData(String paramString);
  
  void updateData(String[] paramArrayOfString, String paramString);
}


/* Location:              E:\DatabaseManagerAPI.jar!\DatabaseManager\DatabasePlan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */