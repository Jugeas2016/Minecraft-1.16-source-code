/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function3;
/*    */ import com.mojang.serialization.DataResult;
/*    */ import com.mojang.serialization.Decoder;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import java.util.Map;
/*    */ import java.util.UUID;
/*    */ import java.util.function.Supplier;
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
/*    */ class b
/*    */ {
/*    */   public final UUID a;
/*    */   public final aya b;
/*    */   public final int c;
/*    */   
/*    */   public b(UUID ☃, aya aya1, int i) {
/* 43 */     this.a = ☃;
/* 44 */     this.b = aya1;
/* 45 */     this.c = i;
/*    */   }
/*    */   
/*    */   public int a() {
/* 49 */     return this.c * this.b.g;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 54 */     return "GossipEntry{target=" + this.a + ", type=" + this.b + ", value=" + this.c + '}';
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public <T> Dynamic<T> a(DynamicOps<T> ☃) {
/* 62 */     return new Dynamic(☃, ☃.createMap((Map)ImmutableMap.of(☃
/* 63 */             .createString("Target"), gq.a.encodeStart(☃, this.a).result().orElseThrow(RuntimeException::new), ☃
/* 64 */             .createString("Type"), ☃.createString(this.b.f), ☃
/* 65 */             .createString("Value"), ☃.createInt(this.c))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static DataResult<b> a(Dynamic<?> ☃) {
/* 71 */     return DataResult.unbox(DataResult.instance().group((App)☃
/* 72 */           .get("Target").read((Decoder)gq.a), (App)☃
/* 73 */           .get("Type").asString().map(aya::a), (App)☃
/* 74 */           .get("Value").asNumber().map(Number::intValue))
/* 75 */         .apply((Applicative)DataResult.instance(), b::new));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\axz$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */