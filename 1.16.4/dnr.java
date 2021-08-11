/*    */ import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dnr
/*    */   extends dns
/*    */ {
/*    */   private final nr p;
/*    */   private final nr q;
/*    */   private final String r;
/*    */   private final boolean s;
/*    */   
/*    */   public dnr(BooleanConsumer ☃, String str, boolean bool) {
/* 18 */     super(☃, new of(bool ? "chat.link.confirmTrusted" : "chat.link.confirm"), new oe(str));
/*    */     
/* 20 */     this.a = bool ? new of("chat.link.open") : nq.e;
/* 21 */     this.b = bool ? nq.d : nq.f;
/* 22 */     this.q = new of("chat.copy");
/* 23 */     this.p = new of("chat.link.warning");
/* 24 */     this.s = !bool;
/* 25 */     this.r = str;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b() {
/* 30 */     super.b();
/* 31 */     this.m.clear();
/* 32 */     this.e.clear();
/* 33 */     a(new dlj(this.k / 2 - 50 - 105, this.l / 6 + 96, 100, 20, this.a, ☃ -> this.c.accept(true)));
/* 34 */     a(new dlj(this.k / 2 - 50, this.l / 6 + 96, 100, 20, this.q, ☃ -> {
/*    */             g();
/*    */             this.c.accept(false);
/*    */           }));
/* 38 */     a(new dlj(this.k / 2 - 50 + 105, this.l / 6 + 96, 100, 20, this.b, ☃ -> this.c.accept(false)));
/*    */   }
/*    */   
/*    */   public void g() {
/* 42 */     this.i.m.a(this.r);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 47 */     super.a(☃, i, j, f);
/*    */     
/* 49 */     if (this.s)
/* 50 */       a(☃, this.o, this.p, this.k / 2, 110, 16764108); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dnr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */