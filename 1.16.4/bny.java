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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bny
/*    */   extends boa
/*    */ {
/*    */   private final fx b;
/*    */   protected boolean a = true;
/*    */   
/*    */   public bny(bfw ☃, aot aot1, bmb bmb1, dcj dcj1) {
/* 21 */     this(☃.l, ☃, aot1, bmb1, dcj1);
/*    */   }
/*    */   
/*    */   public bny(boa ☃) {
/* 25 */     this(☃.p(), ☃.n(), ☃.o(), ☃.m(), ☃.i());
/*    */   }
/*    */   
/*    */   protected bny(brx ☃, @Nullable bfw bfw1, aot aot1, bmb bmb1, dcj dcj1) {
/* 29 */     super(☃, bfw1, aot1, bmb1, dcj1);
/*    */     
/* 31 */     this.b = dcj1.a().a(dcj1.b());
/* 32 */     this.a = ☃.d_(dcj1.a()).a(this);
/*    */   }
/*    */   
/*    */   public static bny a(bny ☃, fx fx1, gc gc1) {
/* 36 */     return new bny(☃
/* 37 */         .p(), ☃
/* 38 */         .n(), ☃
/* 39 */         .o(), ☃
/* 40 */         .m(), new dcj(new dcn(fx1
/*    */ 
/*    */             
/* 43 */             .u() + 0.5D + gc1.i() * 0.5D, fx1
/* 44 */             .v() + 0.5D + gc1.j() * 0.5D, fx1
/* 45 */             .w() + 0.5D + gc1.k() * 0.5D), gc1, fx1, false));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public fx a() {
/* 56 */     return this.a ? super.a() : this.b;
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 60 */     return (this.a || p().d_(a()).a(this));
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 64 */     return this.a;
/*    */   }
/*    */   
/*    */   public gc d() {
/* 68 */     return gc.a(n())[0];
/*    */   }
/*    */   
/*    */   public gc[] e() {
/* 72 */     gc[] ☃ = gc.a(n());
/*    */     
/* 74 */     if (this.a) {
/* 75 */       return ☃;
/*    */     }
/*    */     
/* 78 */     gc gc = j();
/*    */ 
/*    */     
/* 81 */     int i = 0;
/* 82 */     for (; i < ☃.length && 
/* 83 */       ☃[i] != gc.f(); i++);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 88 */     if (i > 0) {
/* 89 */       System.arraycopy(☃, 0, ☃, 1, i);
/* 90 */       ☃[0] = gc.f();
/*    */     } 
/* 92 */     return ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bny.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */