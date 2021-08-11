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
/*    */ 
/*    */ 
/*    */ public class aqj
/*    */ {
/*    */   private final uv d;
/*    */   private final us<Integer> e;
/*    */   private final us<Boolean> f;
/*    */   public boolean a;
/*    */   public int b;
/*    */   public int c;
/*    */   
/*    */   public aqj(uv ☃, us<Integer> us1, us<Boolean> us2) {
/* 23 */     this.d = ☃;
/* 24 */     this.e = us1;
/* 25 */     this.f = us2;
/*    */   }
/*    */   
/*    */   public void a() {
/* 29 */     this.a = true;
/* 30 */     this.b = 0;
/* 31 */     this.c = ((Integer)this.d.<Integer>a(this.e)).intValue();
/*    */   }
/*    */   
/*    */   public boolean a(Random ☃) {
/* 35 */     if (this.a) {
/* 36 */       return false;
/*    */     }
/* 38 */     this.a = true;
/* 39 */     this.b = 0;
/* 40 */     this.c = ☃.nextInt(841) + 140;
/* 41 */     this.d.b(this.e, Integer.valueOf(this.c));
/* 42 */     return true;
/*    */   }
/*    */   
/*    */   public void a(md ☃) {
/* 46 */     ☃.a("Saddle", b());
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(md ☃) {
/* 51 */     a(☃.q("Saddle"));
/*    */   }
/*    */   
/*    */   public void a(boolean ☃) {
/* 55 */     this.d.b(this.f, Boolean.valueOf(☃));
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 59 */     return ((Boolean)this.d.<Boolean>a(this.f)).booleanValue();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aqj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */