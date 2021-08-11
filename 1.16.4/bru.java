/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum bru
/*    */ {
/*  8 */   a(-1, ""),
/*  9 */   b(0, "survival"),
/* 10 */   c(1, "creative"),
/* 11 */   d(2, "adventure"),
/* 12 */   e(3, "spectator");
/*    */   
/*    */   private final int f;
/*    */   
/*    */   private final String g;
/*    */   
/*    */   bru(int ☃, String str1) {
/* 19 */     this.f = ☃;
/* 20 */     this.g = str1;
/*    */   }
/*    */   
/*    */   public int a() {
/* 24 */     return this.f;
/*    */   }
/*    */   
/*    */   public String b() {
/* 28 */     return this.g;
/*    */   }
/*    */   
/*    */   public nr c() {
/* 32 */     return new of("gameMode." + this.g);
/*    */   }
/*    */   
/*    */   public void a(bft ☃) {
/* 36 */     if (this == c) {
/* 37 */       ☃.c = true;
/* 38 */       ☃.d = true;
/* 39 */       ☃.a = true;
/* 40 */     } else if (this == e) {
/* 41 */       ☃.c = true;
/* 42 */       ☃.d = false;
/* 43 */       ☃.a = true;
/* 44 */       ☃.b = true;
/*    */     } else {
/* 46 */       ☃.c = false;
/* 47 */       ☃.d = false;
/* 48 */       ☃.a = false;
/* 49 */       ☃.b = false;
/*    */     } 
/* 51 */     ☃.e = !d();
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 55 */     return (this == d || this == e);
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 59 */     return (this == c);
/*    */   }
/*    */   
/*    */   public boolean f() {
/* 63 */     return (this == b || this == d);
/*    */   }
/*    */   
/*    */   public static bru a(int ☃) {
/* 67 */     return a(☃, b);
/*    */   }
/*    */   
/*    */   public static bru a(int ☃, bru bru1) {
/* 71 */     for (bru bru2 : values()) {
/* 72 */       if (bru2.f == ☃) {
/* 73 */         return bru2;
/*    */       }
/*    */     } 
/* 76 */     return bru1;
/*    */   }
/*    */   
/*    */   public static bru a(String ☃) {
/* 80 */     return a(☃, b);
/*    */   }
/*    */   
/*    */   public static bru a(String ☃, bru bru1) {
/* 84 */     for (bru bru2 : values()) {
/* 85 */       if (bru2.g.equals(☃)) {
/* 86 */         return bru2;
/*    */       }
/*    */     } 
/* 89 */     return bru1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bru.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */