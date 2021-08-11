/*    */ import java.util.EnumSet;
/*    */ 
/*    */ 
/*    */ public abstract class avv
/*    */ {
/*  6 */   private final EnumSet<a> a = EnumSet.noneOf(a.class);
/*    */   
/*    */   public abstract boolean a();
/*    */   
/*    */   public boolean b() {
/* 11 */     return a();
/*    */   }
/*    */   
/*    */   public boolean C_() {
/* 15 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {}
/*    */ 
/*    */   
/*    */   public void d() {}
/*    */ 
/*    */   
/*    */   public void e() {}
/*    */   
/*    */   public void a(EnumSet<a> ☃) {
/* 28 */     this.a.clear();
/* 29 */     this.a.addAll(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 34 */     return getClass().getSimpleName();
/*    */   }
/*    */   
/*    */   public EnumSet<a> i() {
/* 38 */     return this.a;
/*    */   }
/*    */   
/*    */   public enum a {
/* 42 */     a,
/* 43 */     b,
/* 44 */     c,
/* 45 */     d;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\avv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */