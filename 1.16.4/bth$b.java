/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.util.Function3;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class b
/*     */ {
/* 193 */   private static final Map<vk, b> b = Maps.newHashMap();
/*     */   static {
/* 195 */     a = new b(new vk("nether"), (☃, gm1, long_) -> new bth(long_.longValue(), (List)ImmutableList.of(Pair.of(new bsv.c(0.0F, 0.0F, 0.0F, 0.0F, 0.0F), ()), Pair.of(new bsv.c(0.0F, -0.5F, 0.0F, 0.0F, 0.0F), ()), Pair.of(new bsv.c(0.4F, 0.0F, 0.0F, 0.0F, 0.0F), ()), Pair.of(new bsv.c(0.0F, 0.5F, 0.0F, 0.0F, 0.375F), ()), Pair.of(new bsv.c(-0.5F, 0.0F, 0.0F, 0.0F, 0.175F), ())), Optional.of(Pair.of(gm1, ☃)), null));
/*     */   }
/*     */ 
/*     */   
/*     */   public static final b a;
/*     */   
/*     */   private final vk c;
/*     */   
/*     */   private final Function3<b, gm<bsv>, Long, bth> d;
/*     */ 
/*     */   
/*     */   public b(vk ☃, Function3<b, gm<bsv>, Long, bth> function3) {
/* 207 */     this.c = ☃;
/* 208 */     this.d = function3;
/* 209 */     b.put(☃, this);
/*     */   }
/*     */   
/*     */   public bth a(gm<bsv> ☃, long l) {
/* 213 */     return (bth)this.d.apply(this, ☃, Long.valueOf(l));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bth$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */