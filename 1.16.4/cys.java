/*    */ import com.google.gson.GsonBuilder;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cys
/*    */ {
/*    */   public static GsonBuilder a() {
/* 13 */     return (new GsonBuilder())
/* 14 */       .registerTypeAdapter(czd.class, new czd.a())
/* 15 */       .registerTypeAdapter(cyp.class, new cyp.a())
/* 16 */       .registerTypeAdapter(cyr.class, new cyr.a())
/* 17 */       .registerTypeHierarchyAdapter(dbo.class, dbq.a())
/* 18 */       .registerTypeHierarchyAdapter(cyv.c.class, new cyv.c.a());
/*    */   }
/*    */   
/*    */   public static GsonBuilder b() {
/* 22 */     return a()
/* 23 */       .registerTypeAdapter(cyu.class, new cyu.a())
/* 24 */       .registerTypeHierarchyAdapter(czq.class, czo.a())
/* 25 */       .registerTypeHierarchyAdapter(daj.class, dal.a());
/*    */   }
/*    */   
/*    */   public static GsonBuilder c() {
/* 29 */     return b()
/* 30 */       .registerTypeAdapter(cyx.class, new cyx.b())
/* 31 */       .registerTypeAdapter(cyy.class, new cyy.b());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cys.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */