/*    */ import java.io.IOException;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ou
/*    */   implements oj<om>
/*    */ {
/* 15 */   private static final Logger b = LogManager.getLogger();
/*    */   
/*    */   private fx c;
/*    */   
/*    */   private ceh d;
/*    */   
/*    */   sz.a a;
/*    */   
/*    */   private boolean e;
/*    */ 
/*    */   
/*    */   public ou() {}
/*    */ 
/*    */   
/*    */   public ou(fx ☃, ceh ceh1, sz.a a1, boolean bool, String str) {
/* 30 */     this.c = ☃.h();
/* 31 */     this.d = ceh1;
/* 32 */     this.a = a1;
/* 33 */     this.e = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 38 */     this.c = ☃.e();
/* 39 */     this.d = buo.m.a(☃.i());
/* 40 */     this.a = ☃.<sz.a>a(sz.a.class);
/* 41 */     this.e = ☃.readBoolean();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 46 */     ☃.a(this.c);
/* 47 */     ☃.d(buo.i(this.d));
/* 48 */     ☃.a(this.a);
/* 49 */     ☃.writeBoolean(this.e);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 54 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public ceh b() {
/* 58 */     return this.d;
/*    */   }
/*    */   
/*    */   public fx c() {
/* 62 */     return this.c;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 66 */     return this.e;
/*    */   }
/*    */   
/*    */   public sz.a e() {
/* 70 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ou.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */