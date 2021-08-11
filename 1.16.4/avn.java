/*    */ import java.util.EnumSet;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class avn
/*    */   extends avv
/*    */ {
/* 21 */   private static final Predicate<ceh> a = cer.a(bup.aR);
/*    */   
/*    */   private final aqn b;
/*    */   private final brx c;
/*    */   private int d;
/*    */   
/*    */   public avn(aqn ☃) {
/* 28 */     this.b = ☃;
/* 29 */     this.c = ☃.l;
/* 30 */     a(EnumSet.of(avv.a.a, avv.a.b, avv.a.c));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 35 */     if (this.b.cY().nextInt(this.b.w_() ? 50 : 1000) != 0) {
/* 36 */       return false;
/*    */     }
/*    */     
/* 39 */     fx ☃ = this.b.cB();
/* 40 */     if (a.test(this.c.d_(☃))) {
/* 41 */       return true;
/*    */     }
/* 43 */     if (this.c.d_(☃.c()).a(bup.i)) {
/* 44 */       return true;
/*    */     }
/* 46 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 51 */     this.d = 40;
/* 52 */     this.c.a(this.b, (byte)10);
/* 53 */     this.b.x().o();
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 58 */     this.d = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 63 */     return (this.d > 0);
/*    */   }
/*    */   
/*    */   public int g() {
/* 67 */     return this.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 72 */     this.d = Math.max(0, this.d - 1);
/* 73 */     if (this.d != 4) {
/*    */       return;
/*    */     }
/*    */     
/* 77 */     fx ☃ = this.b.cB();
/*    */     
/* 79 */     if (a.test(this.c.d_(☃))) {
/* 80 */       if (this.c.V().b(brt.b)) {
/* 81 */         this.c.b(☃, false);
/*    */       }
/* 83 */       this.b.B();
/*    */     } else {
/* 85 */       fx fx = ☃.c();
/* 86 */       if (this.c.d_(fx).a(bup.i)) {
/* 87 */         if (this.c.V().b(brt.b)) {
/* 88 */           this.c.c(2001, fx, buo.i(bup.i.n()));
/* 89 */           this.c.a(fx, bup.j.n(), 2);
/*    */         } 
/* 91 */         this.b.B();
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\avn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */