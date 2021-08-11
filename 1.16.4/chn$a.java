/*    */ import com.google.common.collect.Maps;
/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.function.Predicate;
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
/*    */ public enum a
/*    */   implements afs
/*    */ {
/* 35 */   a("WORLD_SURFACE_WG", chn.b.a, chn.b()),
/* 36 */   b("WORLD_SURFACE", chn.b.c, chn.b()),
/* 37 */   c("OCEAN_FLOOR_WG", chn.b.a, chn.c()),
/* 38 */   d("OCEAN_FLOOR", chn.b.b, chn.c()), e("OCEAN_FLOOR", chn.b.b, chn.c()), f("OCEAN_FLOOR", chn.b.b, chn.c()); public static final Codec<a> g; private final String h; static {
/* 39 */     e = new a("MOTION_BLOCKING", 4, "MOTION_BLOCKING", chn.b.c, ☃ -> (☃.c().c() || !☃.m().c()));
/* 40 */     f = new a("MOTION_BLOCKING_NO_LEAVES", 5, "MOTION_BLOCKING_NO_LEAVES", chn.b.b, ☃ -> ((☃.c().c() || !☃.m().c()) && !(☃.b() instanceof bxx)));
/*    */   }
/*    */   private final chn.b i; private final Predicate<ceh> j; private static final Map<String, a> k;
/*    */   static {
/* 44 */     g = afs.a(a::values, a::a);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 50 */     k = x.<Map<String, a>>a(Maps.newHashMap(), ☃ -> {
/*    */           for (a a1 : values())
/*    */             ☃.put(a1.h, a1); 
/*    */         });
/*    */   }
/*    */   
/*    */   a(String ☃, chn.b b1, Predicate<ceh> predicate) {
/* 57 */     this.h = ☃;
/* 58 */     this.i = b1;
/* 59 */     this.j = predicate;
/*    */   }
/*    */   
/*    */   public String b() {
/* 63 */     return this.h;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 67 */     return (this.i == chn.b.c);
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 71 */     return (this.i != chn.b.a);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static a a(String ☃) {
/* 76 */     return k.get(☃);
/*    */   }
/*    */   
/*    */   public Predicate<ceh> e() {
/* 80 */     return this.j;
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 85 */     return this.h;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\chn$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */