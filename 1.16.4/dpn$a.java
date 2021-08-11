/*    */ import java.util.Optional;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ enum a
/*    */ {
/* 28 */   a(new of("gameMode.creative"), "/gamemode creative", new bmb(bup.i)),
/* 29 */   b(new of("gameMode.survival"), "/gamemode survival", new bmb(bmd.kA)),
/* 30 */   c(new of("gameMode.adventure"), "/gamemode adventure", new bmb(bmd.pc)),
/* 31 */   d(new of("gameMode.spectator"), "/gamemode spectator", new bmb(bmd.nD));
/*    */   static {
/* 33 */     e = values();
/*    */   }
/*    */   
/*    */   protected static final a[] e;
/*    */   final nr f;
/*    */   final String g;
/*    */   final bmb h;
/*    */   
/*    */   a(nr ☃, String str1, bmb bmb1) {
/* 42 */     this.f = ☃;
/* 43 */     this.g = str1;
/* 44 */     this.h = bmb1;
/*    */   }
/*    */   
/*    */   private void a(efo ☃, int i, int j) {
/* 48 */     ☃.b(this.h, i, j);
/*    */   }
/*    */   
/*    */   private nr a() {
/* 52 */     return this.f;
/*    */   }
/*    */   
/*    */   private String b() {
/* 56 */     return this.g;
/*    */   }
/*    */   
/*    */   private Optional<a> c() {
/* 60 */     switch (dpn.null.a[ordinal()]) { case 1:
/* 61 */         return Optional.of(b);
/* 62 */       case 2: return Optional.of(c);
/* 63 */       case 3: return Optional.of(d); }
/* 64 */      return Optional.of(a);
/*    */   }
/*    */ 
/*    */   
/*    */   private static Optional<a> b(bru ☃) {
/* 69 */     switch (dpn.null.b[☃.ordinal()]) { case 1:
/* 70 */         return Optional.of(d);
/* 71 */       case 2: return Optional.of(b);
/* 72 */       case 3: return Optional.of(a);
/* 73 */       case 4: return Optional.of(c); }
/* 74 */      return Optional.empty();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dpn$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */