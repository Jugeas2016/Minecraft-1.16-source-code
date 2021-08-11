/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class eku
/*    */   extends ack<ekb.a>
/*    */   implements AutoCloseable
/*    */ {
/*    */   private final ekb a;
/*    */   private final String b;
/*    */   
/*    */   public eku(ekd ☃, vk vk1, String str) {
/* 18 */     this.b = str;
/* 19 */     this.a = new ekb(vk1);
/* 20 */     ☃.a(this.a.g(), this.a);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected ekc a(vk ☃) {
/* 26 */     return this.a.a(b(☃));
/*    */   }
/*    */   
/*    */   private vk b(vk ☃) {
/* 30 */     return new vk(☃.b(), this.b + "/" + ☃.a());
/*    */   }
/*    */ 
/*    */   
/*    */   protected ekb.a a(ach ☃, anw anw1) {
/* 35 */     anw1.a();
/* 36 */     anw1.a("stitching");
/* 37 */     ekb.a a = this.a.a(☃, a().map(this::b), anw1, 0);
/* 38 */     anw1.c();
/* 39 */     anw1.b();
/* 40 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ekb.a ☃, ach ach1, anw anw1) {
/* 45 */     anw1.a();
/* 46 */     anw1.a("upload");
/* 47 */     this.a.a(☃);
/* 48 */     anw1.c();
/* 49 */     anw1.b();
/*    */   }
/*    */ 
/*    */   
/*    */   public void close() {
/* 54 */     this.a.f();
/*    */   }
/*    */   
/*    */   protected abstract Stream<vk> a();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eku.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */