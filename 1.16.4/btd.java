/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.google.common.collect.Sets;
/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Predicate;
/*    */ import java.util.function.Supplier;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ public class btd extends bsy {
/*    */   public static final Codec<btd> e;
/*    */   
/*    */   static {
/* 15 */     e = bsv.d.fieldOf("biome").xmap(btd::new, ☃ -> ☃.f).stable().codec();
/*    */   }
/*    */   private final Supplier<bsv> f;
/*    */   
/*    */   public btd(bsv ☃) {
/* 20 */     this(() -> ☃);
/*    */   }
/*    */   
/*    */   public btd(Supplier<bsv> ☃) {
/* 24 */     super((List<bsv>)ImmutableList.of(☃.get()));
/* 25 */     this.f = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected Codec<? extends bsy> a() {
/* 30 */     return (Codec)e;
/*    */   }
/*    */ 
/*    */   
/*    */   public bsy a(long ☃) {
/* 35 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public bsv b(int ☃, int i, int j) {
/* 40 */     return this.f.get();
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public fx a(int ☃, int i, int j, int k, int m, Predicate<bsv> predicate, Random random, boolean bool) {
/* 46 */     if (predicate.test(this.f.get())) {
/* 47 */       if (bool) {
/* 48 */         return new fx(☃, i, j);
/*    */       }
/* 50 */       return new fx(☃ - k + random.nextInt(k * 2 + 1), i, j - k + random.nextInt(k * 2 + 1));
/*    */     } 
/*    */     
/* 53 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public Set<bsv> a(int ☃, int i, int j, int k) {
/* 58 */     return Sets.newHashSet((Object[])new bsv[] { this.f.get() });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\btd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */