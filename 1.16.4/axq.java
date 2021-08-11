/*    */ import java.util.EnumSet;
/*    */ import java.util.function.Predicate;
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
/*    */ public class axq<T extends aqm>
/*    */   extends axx
/*    */ {
/*    */   protected final Class<T> a;
/*    */   protected final int b;
/*    */   protected aqm c;
/*    */   protected azg d;
/*    */   
/*    */   public axq(aqn ☃, Class<T> clazz, boolean bool) {
/* 22 */     this(☃, clazz, bool, false);
/*    */   }
/*    */   
/*    */   public axq(aqn ☃, Class<T> clazz, boolean bool1, boolean bool2) {
/* 26 */     this(☃, clazz, 10, bool1, bool2, (Predicate<aqm>)null);
/*    */   }
/*    */   
/*    */   public axq(aqn ☃, Class<T> clazz, int i, boolean bool1, boolean bool2, @Nullable Predicate<aqm> predicate) {
/* 30 */     super(☃, bool1, bool2);
/* 31 */     this.a = clazz;
/* 32 */     this.b = i;
/* 33 */     a(EnumSet.of(avv.a.d));
/*    */     
/* 35 */     this.d = (new azg()).a(k()).a(predicate);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 40 */     if (this.b > 0 && this.e.cY().nextInt(this.b) != 0) {
/* 41 */       return false;
/*    */     }
/*    */     
/* 44 */     g();
/* 45 */     return (this.c != null);
/*    */   }
/*    */   
/*    */   protected dci a(double ☃) {
/* 49 */     return this.e.cc().c(☃, 4.0D, ☃);
/*    */   }
/*    */   
/*    */   protected void g() {
/* 53 */     if (this.a == bfw.class || this.a == aah.class) {
/* 54 */       this.c = this.e.l.a(this.d, this.e, this.e.cD(), this.e.cG(), this.e.cH());
/*    */     } else {
/* 56 */       this.c = this.e.l.b(this.a, this.d, this.e, this.e.cD(), this.e.cG(), this.e.cH(), a(k()));
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 62 */     this.e.h(this.c);
/* 63 */     super.c();
/*    */   }
/*    */   
/*    */   public void a(@Nullable aqm ☃) {
/* 67 */     this.c = ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\axq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */