/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Arrays;
/*    */ import java.util.Map;
/*    */ import java.util.stream.Collectors;
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
/* 46 */   a("terrain_matching", 
/*    */     
/* 48 */     ImmutableList.of(new csi(chn.a.a, -1))),
/*    */   
/* 50 */   b("rigid", 
/*    */     
/* 52 */     ImmutableList.of()); public static final Codec<a> c; private static final Map<String, a> d;
/*    */   
/*    */   static {
/* 55 */     c = afs.a(a::values, a::a);
/*    */     
/* 57 */     d = (Map<String, a>)Arrays.<a>stream(values()).collect(Collectors.toMap(a::b, ☃ -> ☃));
/*    */   }
/*    */   private final String e; private final ImmutableList<csy> f;
/*    */   
/*    */   a(String ☃, ImmutableList<csy> immutableList) {
/* 62 */     this.e = ☃;
/* 63 */     this.f = immutableList;
/*    */   }
/*    */   
/*    */   public String b() {
/* 67 */     return this.e;
/*    */   }
/*    */   
/*    */   public static a a(String ☃) {
/* 71 */     return d.get(☃);
/*    */   }
/*    */   
/*    */   public ImmutableList<csy> c() {
/* 75 */     return this.f;
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 80 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cok$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */