/*    */ import java.util.function.Predicate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dbq
/*    */ {
/* 11 */   public static final dbp a = a("inverted", new dbl.a());
/* 12 */   public static final dbp b = a("alternative", new dbe.b());
/* 13 */   public static final dbp c = a("random_chance", new dbt.a());
/* 14 */   public static final dbp d = a("random_chance_with_looting", new dbu.a());
/* 15 */   public static final dbp e = a("entity_properties", new dbr.a());
/* 16 */   public static final dbp f = a("killed_by_player", new dbs.a());
/* 17 */   public static final dbp g = a("entity_scores", new dbj.b());
/* 18 */   public static final dbp h = a("block_state_property", new dbn.b());
/* 19 */   public static final dbp i = a("match_tool", new dbv.a());
/* 20 */   public static final dbp j = a("table_bonus", new dbf.a());
/* 21 */   public static final dbp k = a("survives_explosion", new dbk.a());
/* 22 */   public static final dbp l = a("damage_source_properties", new dbi.a());
/* 23 */   public static final dbp m = a("location_check", new dbm.a());
/* 24 */   public static final dbp n = a("weather_check", new dbx.b());
/* 25 */   public static final dbp o = a("reference", new dbg.a());
/* 26 */   public static final dbp p = a("time_check", new dbw.b());
/*    */   
/*    */   private static dbp a(String ☃, cze<? extends dbo> cze1) {
/* 29 */     return gm.<dbp, dbp>a(gm.aq, new vk(☃), new dbp(cze1));
/*    */   }
/*    */   
/*    */   public static Object a() {
/* 33 */     return cyt.a(gm.aq, "condition", "condition", dbo::b).a();
/*    */   }
/*    */   
/*    */   public static <T> Predicate<T> a(Predicate<T>[] ☃) {
/* 37 */     switch (☃.length) {
/*    */       case 0:
/* 39 */         return ☃ -> true;
/*    */       case 1:
/* 41 */         return ☃[0];
/*    */       case 2:
/* 43 */         return ☃[0].and(☃[1]);
/*    */     } 
/* 45 */     return object -> {
/*    */         for (Predicate<T> predicate : ☃) {
/*    */           if (!predicate.test((T)object)) {
/*    */             return false;
/*    */           }
/*    */         } 
/*    */         return true;
/*    */       };
/*    */   }
/*    */ 
/*    */   
/*    */   public static <T> Predicate<T> b(Predicate<T>[] ☃) {
/* 57 */     switch (☃.length) {
/*    */       case 0:
/* 59 */         return ☃ -> false;
/*    */       case 1:
/* 61 */         return ☃[0];
/*    */       case 2:
/* 63 */         return ☃[0].or(☃[1]);
/*    */     } 
/*    */     
/* 66 */     return object -> {
/*    */         for (Predicate<T> predicate : ☃) {
/*    */           if (predicate.test((T)object))
/*    */             return true; 
/*    */         } 
/*    */         return false;
/*    */       };
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */