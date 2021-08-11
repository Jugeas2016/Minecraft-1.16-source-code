/*    */ import java.io.IOException;
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
/*    */ public class rg
/*    */   implements oj<om>
/*    */ {
/*    */   private String a;
/*    */   private nr b;
/*    */   private ddq.a c;
/*    */   private int d;
/*    */   
/*    */   public rg() {}
/*    */   
/*    */   public rg(ddk ☃, int i) {
/* 25 */     this.a = ☃.b();
/* 26 */     this.b = ☃.d();
/* 27 */     this.c = ☃.f();
/* 28 */     this.d = i;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 33 */     this.a = ☃.e(16);
/* 34 */     this.d = ☃.readByte();
/*    */     
/* 36 */     if (this.d == 0 || this.d == 2) {
/* 37 */       this.b = ☃.h();
/* 38 */       this.c = ☃.<ddq.a>a(ddq.a.class);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 44 */     ☃.a(this.a);
/* 45 */     ☃.writeByte(this.d);
/*    */     
/* 47 */     if (this.d == 0 || this.d == 2) {
/* 48 */       ☃.a(this.b);
/* 49 */       ☃.a(this.c);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 55 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public String b() {
/* 59 */     return this.a;
/*    */   }
/*    */   
/*    */   public nr c() {
/* 63 */     return this.b;
/*    */   }
/*    */   
/*    */   public int d() {
/* 67 */     return this.d;
/*    */   }
/*    */   
/*    */   public ddq.a e() {
/* 71 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\rg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */