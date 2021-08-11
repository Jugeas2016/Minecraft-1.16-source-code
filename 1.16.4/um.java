/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.GsonBuilder;
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class um
/*    */   implements oj<uk>
/*    */ {
/* 15 */   private static final Gson a = (new GsonBuilder())
/* 16 */     .registerTypeAdapter(un.c.class, new un.c.a())
/* 17 */     .registerTypeAdapter(un.a.class, new un.a.a())
/* 18 */     .registerTypeAdapter(un.class, new un.b())
/* 19 */     .registerTypeHierarchyAdapter(nr.class, new nr.a())
/* 20 */     .registerTypeHierarchyAdapter(ob.class, new ob.a())
/* 21 */     .registerTypeAdapterFactory(new afl())
/* 22 */     .create();
/*    */   
/*    */   private un b;
/*    */ 
/*    */   
/*    */   public um() {}
/*    */   
/*    */   public um(un ☃) {
/* 30 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 35 */     this.b = afd.<un>a(a, ☃.e(32767), un.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 40 */     ☃.a(a.toJson(this.b));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(uk ☃) {
/* 45 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public un b() {
/* 49 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip\\um.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */