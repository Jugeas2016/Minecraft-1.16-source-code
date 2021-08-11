/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.GsonBuilder;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class a
/*    */ {
/* 33 */   protected final Gson a = (new GsonBuilder())
/* 34 */     .registerTypeAdapter(ebg.class, new ebg.b())
/* 35 */     .registerTypeAdapter(ebo.class, new ebo.a())
/* 36 */     .registerTypeAdapter(ebn.class, new ebn.a())
/* 37 */     .registerTypeAdapter(ebs.class, new ebs.a(this))
/* 38 */     .registerTypeAdapter(ebu.class, new ebu.a())
/* 39 */     .create();
/*    */   private cei<buo, ceh> b;
/*    */   
/*    */   public cei<buo, ceh> a() {
/* 43 */     return this.b;
/*    */   }
/*    */   
/*    */   public void a(cei<buo, ceh> ☃) {
/* 47 */     this.b = ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebg$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */