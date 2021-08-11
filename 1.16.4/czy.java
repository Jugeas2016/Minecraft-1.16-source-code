/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.Random;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class czy
/*    */   extends dai
/*    */ {
/*    */   private czy(dbo[] ☃) {
/* 14 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public dak b() {
/* 19 */     return dal.r;
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bmb ☃, cyv cyv1) {
/* 24 */     Float float_ = cyv1.<Float>c(dbc.j);
/*    */     
/* 26 */     if (float_ != null) {
/* 27 */       Random random = cyv1.a();
/*    */       
/* 29 */       float f = 1.0F / float_.floatValue();
/* 30 */       int i = ☃.E();
/* 31 */       int j = 0;
/* 32 */       for (int k = 0; k < i; k++) {
/* 33 */         if (random.nextFloat() <= f) {
/* 34 */           j++;
/*    */         }
/*    */       } 
/*    */       
/* 38 */       ☃.e(j);
/*    */     } 
/* 40 */     return ☃;
/*    */   }
/*    */   
/*    */   public static dai.a<?> c() {
/* 44 */     return a(czy::new);
/*    */   }
/*    */   
/*    */   public static class a
/*    */     extends dai.c<czy> {
/*    */     public czy a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 50 */       return new czy(arrayOfDbo);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */