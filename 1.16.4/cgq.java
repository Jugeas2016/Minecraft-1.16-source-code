/*    */ import it.unimi.dsi.fastutil.shorts.ShortList;
/*    */ import it.unimi.dsi.fastutil.shorts.ShortListIterator;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Predicate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cgq<T>
/*    */   implements bso<T>
/*    */ {
/*    */   protected final Predicate<T> a;
/*    */   private final brd b;
/* 19 */   private final ShortList[] c = new ShortList[16];
/*    */   
/*    */   public cgq(Predicate<T> ☃, brd brd1) {
/* 22 */     this(☃, brd1, new mj());
/*    */   }
/*    */   
/*    */   public cgq(Predicate<T> ☃, brd brd1, mj mj1) {
/* 26 */     this.a = ☃;
/* 27 */     this.b = brd1;
/* 28 */     for (int i = 0; i < mj1.size(); i++) {
/* 29 */       mj mj2 = mj1.b(i);
/* 30 */       for (int j = 0; j < mj2.size(); j++) {
/* 31 */         cfw.a(this.c, i).add(mj2.d(j));
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public mj b() {
/* 37 */     return cgt.a(this.c);
/*    */   }
/*    */   
/*    */   public void a(bso<T> ☃, Function<fx, T> function) {
/* 41 */     for (int i = 0; i < this.c.length; i++) {
/* 42 */       if (this.c[i] != null) {
/* 43 */         for (ShortListIterator<Short> shortListIterator = this.c[i].iterator(); shortListIterator.hasNext(); ) { Short short_ = shortListIterator.next();
/* 44 */           fx fx = cgp.a(short_.shortValue(), i, this.b);
/* 45 */           ☃.a(fx, function.apply(fx), 0); }
/*    */         
/* 47 */         this.c[i].clear();
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(fx ☃, T t) {
/* 54 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(fx ☃, T t, int i, bsq bsq1) {
/* 59 */     cfw.a(this.c, ☃.v() >> 4).add(cgp.l(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(fx ☃, T t) {
/* 64 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cgq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */