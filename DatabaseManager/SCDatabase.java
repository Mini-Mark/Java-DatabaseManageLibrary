/*    */ package DatabaseManager;
/*    */ 
/*    */ import java.sql.ResultSet;
/*    */ import java.sql.SQLException;
/*    */ import java.sql.Statement;
/*    */ 
/*    */ public class SCDatabase extends Connect {
/*    */   private Statement state;
/*    */   
/*    */   private String[] attribute;
/*    */   
/*    */   private String table;
/*    */   
/*    */   private String primarykey;
/*    */   
/*    */   protected SCDatabase(String table, String[] parameter, String primarykey) {
/* 16 */     this.state = getStatement();
/* 17 */     this.attribute = parameter;
/* 18 */     this.table = table;
/* 19 */     this.primarykey = primarykey;
/*    */   }
/*    */   
/*    */   protected ResultSet selectSQL() {
/* 23 */     String sql = "SELECT " + formatAttr(this.attribute) + " FROM " + this.table;
/*    */     try {
/* 28 */       ResultSet QueryData = this.state.executeQuery(sql);
/* 29 */       return QueryData;
/* 30 */     } catch (SQLException ex) {
/* 31 */       System.out.println("ERROR (selectSQL): " + ex.getMessage());
/* 32 */       return null;
/*    */     } 
/*    */   }
/*    */   
/*    */   protected void insertSQL(String[] value) {
/*    */     try {
/* 38 */       this.state.executeUpdate("INSERT INTO " + this.table + " (" + formatAttr(this.attribute) + ") VALUES (" + formatAttr(value) + ")");
/* 39 */     } catch (SQLException ex) {
/* 40 */       System.out.println("ERROR (insertSQL): " + ex.getMessage());
/*    */     } 
/*    */   }
/*    */   
/*    */   protected void deleteSQL(String id) {
/*    */     try {
/* 46 */       this.state.executeUpdate("DELETE FROM " + this.table + " WHERE " + this.primarykey + " = " + id);
/* 47 */     } catch (SQLException ex) {
/* 48 */       System.out.println("ERROR (deleteSQL): " + ex.getMessage());
/*    */     } 
/*    */   }
/*    */   
/*    */   protected void updateSQL(String[] set, String id) {
/*    */     try {
/* 54 */       this.state.executeUpdate("UPDATE " + this.table + " SET " + formatAttr(set) + " WHERE " + this.primarykey + " = " + id);
/* 55 */     } catch (SQLException ex) {
/* 56 */       System.out.println("ERROR (updateSQL): " + ex.getMessage());
/*    */     } 
/*    */   }
/*    */   
/*    */   private String formatAttr(String[] attr) {
/* 61 */     String listAttr = "";
/*    */     byte b;
/*    */     int i;
/*    */     String[] arrayOfString;
/* 62 */     for (i = (arrayOfString = attr).length, b = 0; b < i; ) {
/* 62 */       String value = arrayOfString[b];
/* 63 */       listAttr = String.valueOf(listAttr) + value + ",";
/*    */       b++;
/*    */     } 
/* 65 */     listAttr = listAttr.substring(0, listAttr.length() - 1);
/* 67 */     return listAttr;
/*    */   }
/*    */ }


/* Location:              E:\DatabaseManagerAPI.jar!\DatabaseManager\SCDatabase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */