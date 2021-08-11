/*    */ import java.util.function.Predicate;
/*    */ 
/*    */ public abstract class bmo
/*    */   extends blx
/*    */ {
/*    */   public static final Predicate<bmb> a;
/*    */   public static final Predicate<bmb> b;
/*    */   
/*    */   static {
/* 10 */     a = (☃ -> ☃.b().a(aeg.Y));
/* 11 */     b = a.or(☃ -> (☃.b() == bmd.po));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public bmo(blx.a ☃) {
/* 19 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Predicate<bmb> e() {
/* 24 */     return b();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static bmb a(aqm ☃, Predicate<bmb> predicate) {
/* 31 */     if (predicate.test(☃.b(aot.b))) {
/* 32 */       return ☃.b(aot.b);
/*    */     }
/* 34 */     if (predicate.test(☃.b(aot.a))) {
/* 35 */       return ☃.b(aot.a);
/*    */     }
/* 37 */     return bmb.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public int c() {
/* 42 */     return 1;
/*    */   }
/*    */   
/*    */   public abstract Predicate<bmb> b();
/*    */   
/*    */   public abstract int d();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bmo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */