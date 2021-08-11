/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dad
/*    */   extends dai
/*    */ {
/*    */   private final czb a;
/*    */   private final boolean b;
/*    */   
/*    */   private dad(dbo[] ☃, czb czb1, boolean bool) {
/* 21 */     super(☃);
/* 22 */     this.a = czb1;
/* 23 */     this.b = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public dak b() {
/* 28 */     return dal.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bmb ☃, cyv cyv1) {
/* 33 */     Random random = cyv1.a();
/* 34 */     return bpu.a(random, ☃, this.a.a(random), this.b);
/*    */   }
/*    */   
/*    */   public static class a extends dai.a<a> {
/*    */     private final czb a;
/*    */     private boolean b;
/*    */     
/*    */     public a(czb ☃) {
/* 42 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     protected a a() {
/* 47 */       return this;
/*    */     }
/*    */     
/*    */     public a e() {
/* 51 */       this.b = true;
/* 52 */       return this;
/*    */     }
/*    */ 
/*    */     
/*    */     public daj b() {
/* 57 */       return new dad(g(), this.a, this.b);
/*    */     }
/*    */   }
/*    */   
/*    */   public static a a(czb ☃) {
/* 62 */     return new a(☃);
/*    */   }
/*    */   
/*    */   public static class b
/*    */     extends dai.c<dad> {
/*    */     public void a(JsonObject ☃, dad dad1, JsonSerializationContext jsonSerializationContext) {
/* 68 */       super.a(☃, dad1, jsonSerializationContext);
/*    */       
/* 70 */       ☃.add("levels", czc.a(dad.a(dad1), jsonSerializationContext));
/* 71 */       ☃.addProperty("treasure", Boolean.valueOf(dad.b(dad1)));
/*    */     }
/*    */ 
/*    */     
/*    */     public dad a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 76 */       czb czb = czc.a(☃.get("levels"), jsonDeserializationContext);
/* 77 */       boolean bool = afd.a(☃, "treasure", false);
/* 78 */       return new dad(arrayOfDbo, czb, bool);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */