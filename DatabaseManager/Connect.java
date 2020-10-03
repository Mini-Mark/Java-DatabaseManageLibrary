/*    */ package DatabaseManager;
/*    */ 
/*    */ import java.sql.Connection;
/*    */ import java.sql.DriverManager;
/*    */ import java.sql.Statement;
/*    */ 
/*    */ public class Connect {
/* 11 */   private static String user = "root";
/*    */   
/* 12 */   private static String pass = "";
/*    */   
/* 13 */   private static String local = "localhost";
/*    */   
/* 14 */   private static String port = "3306";
/*    */   
/* 15 */   private static String db = "bookplan";
/*    */   
/*    */   private static Connection con;
/*    */   
/*    */   protected Connect() {
/* 18 */     Connection();
/*    */   }
/*    */   
/*    */   protected static void Connection() {
/*    */     try {
/* 23 */       Class.forName("com.mysql.jdbc.Driver");
/* 24 */       con = DriverManager.getConnection("jdbc:mysql://" + local + ":" + port + "/" + db, user, pass);
/* 25 */     } catch (Exception ex) {
/* 26 */       System.out.println("Error (Connection): " + ex.getMessage());
/* 27 */       con = null;
/*    */     } 
/*    */   }
/*    */   
/*    */   protected Statement getStatement() {
/*    */     try {
/* 34 */       Statement stmt = con.createStatement();
/* 35 */       return stmt;
/* 37 */     } catch (Exception ex) {
/* 38 */       System.out.println("Error (getStatement): " + ex.getMessage());
/* 39 */       return null;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void setUser(String user) {
/* 44 */     Connect.user = user;
/* 45 */     Connection();
/*    */   }
/*    */   
/*    */   public static void setPassword(String pass) {
/* 48 */     Connect.pass = pass;
/* 49 */     Connection();
/*    */   }
/*    */   
/*    */   public static void setPort(String port) {
/* 52 */     Connect.port = port;
/* 53 */     Connection();
/*    */   }
/*    */   
/*    */   public static void setLocal(String local) {
/* 56 */     Connect.local = local;
/* 57 */     Connection();
/*    */   }
/*    */   
/*    */   public static void setDB(String db) {
/* 60 */     Connect.db = db;
/* 61 */     Connection();
/*    */   }
/*    */ }


/* Location:              E:\DatabaseManagerAPI.jar!\DatabaseManager\Connect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */