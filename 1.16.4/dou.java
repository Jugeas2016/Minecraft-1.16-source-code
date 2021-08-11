/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dou
/*    */   extends dot
/*    */ {
/* 13 */   private static final nr a = new of("selectWorld.allowCommands");
/* 14 */   private static final nr b = new of("selectWorld.gameMode");
/* 15 */   private static final nr c = new of("lanServer.otherPlayers");
/*    */   
/*    */   private final dot p;
/*    */   private dlj q;
/*    */   private dlj r;
/* 20 */   private String s = "survival";
/*    */   private boolean t;
/*    */   
/*    */   public dou(dot ☃) {
/* 24 */     super(new of("lanServer.title"));
/* 25 */     this.p = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b() {
/* 30 */     a(new dlj(this.k / 2 - 155, this.l - 28, 150, 20, new of("lanServer.start"), ☃ -> {
/*    */             nr nr1;
/*    */             
/*    */             this.i.a((dot)null);
/*    */             
/*    */             int i = aff.a();
/*    */             if (this.i.H().a(bru.a(this.s), this.t, i)) {
/*    */               nr1 = new of("commands.publish.started", new Object[] { Integer.valueOf(i) });
/*    */             } else {
/*    */               nr1 = new of("commands.publish.failed");
/*    */             } 
/*    */             this.i.j.c().a(nr1);
/*    */             this.i.c();
/*    */           }));
/* 44 */     a(new dlj(this.k / 2 + 5, this.l - 28, 150, 20, nq.d, ☃ -> this.i.a(this.p)));
/*    */     
/* 46 */     this.r = a(new dlj(this.k / 2 - 155, 100, 150, 20, oe.d, ☃ -> {
/*    */             if ("spectator".equals(this.s)) {
/*    */               this.s = "creative";
/*    */             } else if ("creative".equals(this.s)) {
/*    */               this.s = "adventure";
/*    */             } else if ("adventure".equals(this.s)) {
/*    */               this.s = "survival";
/*    */             } else {
/*    */               this.s = "spectator";
/*    */             } 
/*    */             h();
/*    */           }));
/* 58 */     this.q = a(new dlj(this.k / 2 + 5, 100, 150, 20, a, ☃ -> {
/*    */             this.t = !this.t;
/*    */             
/*    */             h();
/*    */           }));
/* 63 */     h();
/*    */   }
/*    */   
/*    */   private void h() {
/* 67 */     this.r.a(new of("options.generic_value", new Object[] { b, new of("selectWorld.gameMode." + this.s) }));
/* 68 */     this.q.a(nq.a(a, this.t));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 73 */     a(☃);
/*    */     
/* 75 */     a(☃, this.o, this.d, this.k / 2, 50, 16777215);
/* 76 */     a(☃, this.o, c, this.k / 2, 82, 16777215);
/*    */     
/* 78 */     super.a(☃, i, j, f);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dou.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */