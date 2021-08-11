/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.JsonArray;
/*    */ import com.google.gson.JsonElement;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ax
/*    */ {
/* 15 */   private static final Logger a = LogManager.getLogger();
/*    */   private final vk b;
/*    */   private final cza c;
/* 18 */   private final Gson d = cys.a().create();
/*    */   
/*    */   public ax(vk ☃, cza cza1) {
/* 21 */     this.b = ☃;
/* 22 */     this.c = cza1;
/*    */   }
/*    */   
/*    */   public final dbo[] a(JsonArray ☃, String str, dba dba1) {
/* 26 */     dbo[] arrayOfDbo = (dbo[])this.d.fromJson((JsonElement)☃, dbo[].class);
/* 27 */     czg czg = new czg(dba1, this.c::a, ☃ -> null);
/* 28 */     for (dbo dbo : arrayOfDbo) {
/* 29 */       dbo.a(czg);
/* 30 */       czg.a().forEach((str1, str2) -> a.warn("Found validation problem in advancement trigger {}/{}: {}", ☃, str1, str2));
/*    */     } 
/* 32 */     return arrayOfDbo;
/*    */   }
/*    */   
/*    */   public vk a() {
/* 36 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ax.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */