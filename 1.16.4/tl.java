/*    */ import java.io.IOException;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class tl
/*    */   implements oj<sa>
/*    */ {
/*    */   private int a;
/*    */   private String b;
/*    */   private boolean c;
/*    */   
/*    */   public tl() {}
/*    */   
/*    */   public tl(int ☃, String str, boolean bool) {
/* 22 */     this.a = ☃;
/* 23 */     this.b = str;
/* 24 */     this.c = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 29 */     this.a = ☃.i();
/* 30 */     this.b = ☃.e(32767);
/* 31 */     this.c = ☃.readBoolean();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 36 */     ☃.d(this.a);
/* 37 */     ☃.a(this.b);
/* 38 */     ☃.writeBoolean(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(sa ☃) {
/* 43 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public bqy a(brx ☃) {
/* 48 */     aqa aqa = ☃.a(this.a);
/* 49 */     if (aqa instanceof bhr) {
/* 50 */       return ((bhr)aqa).u();
/*    */     }
/* 52 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public String b() {
/* 57 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 61 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\tl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */