# **HOW TO USE DatabaseManagerAPI **

> Version: 2.0.2 [Release]

***

#### > Settings


```
Connect.setDB("");		//Setting database name
Connect.setUser("");		//Setting database username
Connect.setPassword("");	//Setting database password
Connect.setPort("");		//Setting database port
Connect.setLocal("");		//Setting database ip
```

#### > New Class
```
package [Package name];  
import java.sql.ResultSet;  

import DatabaseManager.DatabasePlan;  
import DatabaseManager.SCDatabase;  

public class [Class name] extends SCDatabase implements DatabasePlan {
	
    private static final String[] attr = new String[]{
    		
	    "major_id",
	    "major_name"
    
    };
    
    private static final String table = "Major";
    
    private static final String primary = "major_id";

    protected [Class name]() {
        super(table, attr, primary);
    }

    @Override
    public void deleteData(String id) {
        deleteSQL(id);
    }

    @Override
    public ResultSet getData() {
        return selectSQL();
    }

    @Override
    public void insertData(String[] value) {
        insertSQL(value);
    }

    @Override
    public void updateData(String[] set, String id) {
        updateSQL(set, id);
    }
}
```

#### > Called

* **Create new object**

```
	[Class name] obj = new [Class name]();
```
  <br />
  
* **Select data from database**

```
	ResultSet rs = obj.getData();
		
	while(rs.next()) {
		System.out.println(rs.getString([Column Name]));
	}
```
  <br />
  

* **Insert data to database**

```
	String[] value = new String[]{
		data1,
		data2,
		data3,
		...
	};
	
	test.insertData(value);
```
  <br />
  

* **Delete data from database**

```
	test.deleteData(id);
```
  <br />
  

* **Edit data into database**

```
	String[] set = new String[]{
		"column1 = value",
		"column2 = value",
		"column3 = value",
		.........
	};
	
	test.updateData(set, id);
```

***
