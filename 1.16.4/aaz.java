/*    */ import net.minecraft.server.MinecraftServer;
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
/*    */ public class aaz
/*    */   implements tw
/*    */ {
/* 15 */   private static final nr a = new oe("Ignoring status request");
/*    */   
/*    */   private final MinecraftServer b;
/*    */   private final nd c;
/*    */   
/*    */   public aaz(MinecraftServer ☃, nd nd1) {
/* 21 */     this.b = ☃;
/* 22 */     this.c = nd1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(tv ☃) {
/* 27 */     switch (null.a[☃.b().ordinal()]) {
/*    */       case 1:
/* 29 */         this.c.a(ne.d);
/*    */         
/* 31 */         if (☃.c() != w.a().getProtocolVersion()) {
/*    */           nr nr1;
/*    */ 
/*    */ 
/*    */           
/* 36 */           if (☃.c() < 754) {
/* 37 */             nr1 = new of("multiplayer.disconnect.outdated_client", new Object[] { w.a().getName() });
/*    */           } else {
/* 39 */             nr1 = new of("multiplayer.disconnect.incompatible", new Object[] { w.a().getName() });
/*    */           } 
/* 41 */           this.c.a(new ud(nr1));
/* 42 */           this.c.a(nr1);
/*    */         } else {
/* 44 */           this.c.a(new aba(this.b, this.c));
/*    */         } 
/*    */         return;
/*    */       case 2:
/* 48 */         if (this.b.am()) {
/* 49 */           this.c.a(ne.c);
/* 50 */           this.c.a(new abb(this.b, this.c));
/*    */         } else {
/* 52 */           this.c.a(a);
/*    */         } 
/*    */         return;
/*    */     } 
/* 56 */     throw new UnsupportedOperationException("Invalid intention " + ☃.b());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(nr ☃) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public nd a() {
/* 67 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aaz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */