/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.Optional;
/*    */ import java.util.function.Function;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class daw
/*    */   extends dai
/*    */ {
/* 17 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   private daw(dbo[] ☃) {
/* 20 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public dak b() {
/* 25 */     return dal.f;
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bmb ☃, cyv cyv1) {
/* 30 */     if (☃.a()) {
/* 31 */       return ☃;
/*    */     }
/*    */     
/* 34 */     Optional<bpc> optional = cyv1.c().o().a(bot.b, new apa(new bmb[] { ☃ }, ), cyv1.c());
/* 35 */     if (optional.isPresent()) {
/* 36 */       bmb bmb1 = ((bpc)optional.get()).c();
/*    */       
/* 38 */       if (!bmb1.a()) {
/* 39 */         bmb bmb2 = bmb1.i();
/* 40 */         bmb2.e(☃.E());
/* 41 */         return bmb2;
/*    */       } 
/*    */     } 
/*    */     
/* 45 */     a.warn("Couldn't smelt {} because there is no smelting recipe", ☃);
/* 46 */     return ☃;
/*    */   }
/*    */   
/*    */   public static dai.a<?> c() {
/* 50 */     return a(daw::new);
/*    */   }
/*    */   
/*    */   public static class a
/*    */     extends dai.c<daw> {
/*    */     public daw a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 56 */       return new daw(arrayOfDbo);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\daw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */