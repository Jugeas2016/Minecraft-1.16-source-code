/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ import java.util.Objects;
/*    */ import java.util.function.Function;
/*    */ import java.util.stream.Stream;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ public final class od
/*    */ {
/*    */   private static final Map<k, od> a;
/*    */   private static final Map<String, od> b;
/*    */   
/*    */   static {
/* 15 */     a = (Map<k, od>)Stream.<k>of(k.values()).filter(k::d).collect(ImmutableMap.toImmutableMap(Function.identity(), ☃ -> new od(☃.e().intValue(), ☃.f())));
/* 16 */     b = (Map<String, od>)a.values().stream().collect(ImmutableMap.toImmutableMap(☃ -> ☃.d, Function.identity()));
/*    */   }
/*    */   
/*    */   private final int c;
/*    */   @Nullable
/*    */   private final String d;
/*    */   
/*    */   private od(int ☃, String str) {
/* 24 */     this.c = ☃;
/* 25 */     this.d = str;
/*    */   }
/*    */   
/*    */   private od(int ☃) {
/* 29 */     this.c = ☃;
/* 30 */     this.d = null;
/*    */   }
/*    */   
/*    */   public int a() {
/* 34 */     return this.c;
/*    */   }
/*    */   
/*    */   public String b() {
/* 38 */     if (this.d != null) {
/* 39 */       return this.d;
/*    */     }
/*    */     
/* 42 */     return c();
/*    */   }
/*    */   
/*    */   private String c() {
/* 46 */     return String.format("#%06X", new Object[] { Integer.valueOf(this.c) });
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 51 */     if (this == ☃) {
/* 52 */       return true;
/*    */     }
/* 54 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 55 */       return false;
/*    */     }
/* 57 */     od od1 = (od)☃;
/* 58 */     return (this.c == od1.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 63 */     return Objects.hash(new Object[] { Integer.valueOf(this.c), this.d });
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 68 */     return (this.d != null) ? this.d : c();
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static od a(k ☃) {
/* 73 */     return a.get(☃);
/*    */   }
/*    */   
/*    */   public static od a(int ☃) {
/* 77 */     return new od(☃);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static od a(String ☃) {
/* 82 */     if (☃.startsWith("#")) {
/*    */       try {
/* 84 */         int i = Integer.parseInt(☃.substring(1), 16);
/* 85 */         return a(i);
/* 86 */       } catch (NumberFormatException numberFormatException) {
/* 87 */         return null;
/*    */       } 
/*    */     }
/* 90 */     return b.get(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\od.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */