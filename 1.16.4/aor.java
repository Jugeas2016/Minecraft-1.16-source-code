/*    */ import java.util.Arrays;
/*    */ import java.util.Comparator;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum aor
/*    */ {
/*    */   private static final aor[] e;
/* 11 */   a(0, "peaceful"),
/* 12 */   b(1, "easy"),
/* 13 */   c(2, "normal"),
/* 14 */   d(3, "hard");
/*    */   
/*    */   static {
/* 17 */     e = (aor[])Arrays.<aor>stream(values()).sorted(Comparator.comparingInt(aor::a)).toArray(☃ -> new aor[☃]);
/*    */   }
/*    */   
/*    */   private final int f;
/*    */   
/*    */   aor(int ☃, String str1) {
/* 23 */     this.f = ☃;
/* 24 */     this.g = str1;
/*    */   }
/*    */   private final String g;
/*    */   public int a() {
/* 28 */     return this.f;
/*    */   }
/*    */   
/*    */   public nr b() {
/* 32 */     return new of("options.difficulty." + this.g);
/*    */   }
/*    */   
/*    */   public static aor a(int ☃) {
/* 36 */     return e[☃ % e.length];
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static aor a(String ☃) {
/* 41 */     for (aor aor1 : values()) {
/* 42 */       if (aor1.g.equals(☃)) {
/* 43 */         return aor1;
/*    */       }
/*    */     } 
/* 46 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String c() {
/* 53 */     return this.g;
/*    */   }
/*    */   
/*    */   public aor d() {
/* 57 */     return e[(this.f + 1) % e.length];
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */