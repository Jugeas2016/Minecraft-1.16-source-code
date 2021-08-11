/*    */ import com.mojang.serialization.Dynamic;
/*    */ import com.mojang.serialization.DynamicLike;
/*    */ 
/*    */ 
/*    */ public final class bsa
/*    */ {
/*    */   private final String a;
/*    */   private final bru b;
/*    */   private final boolean c;
/*    */   private final aor d;
/*    */   private final boolean e;
/*    */   private final brt f;
/*    */   private final brk g;
/*    */   
/*    */   public bsa(String ☃, bru bru1, boolean bool1, aor aor1, boolean bool2, brt brt1, brk brk1) {
/* 16 */     this.a = ☃;
/* 17 */     this.b = bru1;
/* 18 */     this.c = bool1;
/* 19 */     this.d = aor1;
/* 20 */     this.e = bool2;
/* 21 */     this.f = brt1;
/* 22 */     this.g = brk1;
/*    */   }
/*    */   
/*    */   public static bsa a(Dynamic<?> ☃, brk brk1) {
/* 26 */     bru bru1 = bru.a(☃.get("GameType").asInt(0));
/* 27 */     return new bsa(☃.get("LevelName").asString(""), bru1, ☃
/*    */         
/* 29 */         .get("hardcore").asBoolean(false), ☃
/* 30 */         .get("Difficulty").asNumber().map(☃ -> aor.a(☃.byteValue())).result().orElse(aor.c), ☃
/* 31 */         .get("allowCommands").asBoolean((bru1 == bru.c)), new brt((DynamicLike<?>)☃
/* 32 */           .get("GameRules")), brk1);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String a() {
/* 38 */     return this.a;
/*    */   }
/*    */   
/*    */   public bru b() {
/* 42 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 46 */     return this.c;
/*    */   }
/*    */   
/*    */   public aor d() {
/* 50 */     return this.d;
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 54 */     return this.e;
/*    */   }
/*    */   
/*    */   public brt f() {
/* 58 */     return this.f;
/*    */   }
/*    */   
/*    */   public brk g() {
/* 62 */     return this.g;
/*    */   }
/*    */   
/*    */   public bsa a(bru ☃) {
/* 66 */     return new bsa(this.a, ☃, this.c, this.d, this.e, this.f, this.g);
/*    */   }
/*    */   
/*    */   public bsa a(aor ☃) {
/* 70 */     return new bsa(this.a, this.b, this.c, ☃, this.e, this.f, this.g);
/*    */   }
/*    */   
/*    */   public bsa a(brk ☃) {
/* 74 */     return new bsa(this.a, this.b, this.c, this.d, this.e, this.f, ☃);
/*    */   }
/*    */   
/*    */   public bsa h() {
/* 78 */     return new bsa(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bsa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */