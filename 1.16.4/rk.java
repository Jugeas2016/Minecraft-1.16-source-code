/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class rk
/*    */   implements oj<om>
/*    */ {
/*    */   private long a;
/*    */   private long b;
/*    */   
/*    */   public rk() {}
/*    */   
/*    */   public rk(long ☃, long l1, boolean bool) {
/* 16 */     this.a = ☃;
/* 17 */     this.b = l1;
/*    */     
/* 19 */     if (!bool) {
/* 20 */       this.b = -this.b;
/* 21 */       if (this.b == 0L) {
/* 22 */         this.b = -1L;
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 29 */     this.a = ☃.readLong();
/* 30 */     this.b = ☃.readLong();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 35 */     ☃.writeLong(this.a);
/* 36 */     ☃.writeLong(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 41 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public long b() {
/* 45 */     return this.a;
/*    */   }
/*    */   
/*    */   public long c() {
/* 49 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\rk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */