/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class cod
/*    */ {
/*    */   private final int a;
/*    */   private final int b;
/*    */   private final int c;
/*    */   private final int d;
/*    */   private final cok.a e;
/*    */   
/*    */   public cod(int ☃, int i, int j, int k, cok.a a1) {
/* 15 */     this.a = ☃;
/* 16 */     this.b = i;
/* 17 */     this.c = j;
/* 18 */     this.d = k;
/* 19 */     this.e = a1;
/*    */   }
/*    */   
/*    */   public int a() {
/* 23 */     return this.a;
/*    */   }
/*    */   
/*    */   public int b() {
/* 27 */     return this.b;
/*    */   }
/*    */   
/*    */   public int c() {
/* 31 */     return this.c;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public <T> Dynamic<T> a(DynamicOps<T> ☃) {
/* 43 */     ImmutableMap.Builder<T, T> builder = ImmutableMap.builder();
/* 44 */     builder
/* 45 */       .put(☃.createString("source_x"), ☃.createInt(this.a))
/* 46 */       .put(☃.createString("source_ground_y"), ☃.createInt(this.b))
/* 47 */       .put(☃.createString("source_z"), ☃.createInt(this.c))
/* 48 */       .put(☃.createString("delta_y"), ☃.createInt(this.d))
/* 49 */       .put(☃.createString("dest_proj"), ☃.createString(this.e.b()));
/*    */     
/* 51 */     return new Dynamic(☃, ☃.createMap((Map)builder.build()));
/*    */   }
/*    */   
/*    */   public static <T> cod a(Dynamic<T> ☃) {
/* 55 */     return new cod(☃
/* 56 */         .get("source_x").asInt(0), ☃
/* 57 */         .get("source_ground_y").asInt(0), ☃
/* 58 */         .get("source_z").asInt(0), ☃
/* 59 */         .get("delta_y").asInt(0), 
/* 60 */         cok.a.a(☃.get("dest_proj").asString("")));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 66 */     if (this == ☃) return true; 
/* 67 */     if (☃ == null || getClass() != ☃.getClass()) return false;
/*    */     
/* 69 */     cod cod1 = (cod)☃;
/*    */     
/* 71 */     if (this.a != cod1.a) return false; 
/* 72 */     if (this.c != cod1.c) return false; 
/* 73 */     if (this.d != cod1.d) return false; 
/* 74 */     return (this.e == cod1.e);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 79 */     int ☃ = this.a;
/* 80 */     ☃ = 31 * ☃ + this.b;
/* 81 */     ☃ = 31 * ☃ + this.c;
/* 82 */     ☃ = 31 * ☃ + this.d;
/* 83 */     ☃ = 31 * ☃ + this.e.hashCode();
/* 84 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 89 */     return "JigsawJunction{sourceX=" + this.a + ", sourceGroundY=" + this.b + ", sourceZ=" + this.c + ", deltaY=" + this.d + ", destProjection=" + this.e + '}';
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */