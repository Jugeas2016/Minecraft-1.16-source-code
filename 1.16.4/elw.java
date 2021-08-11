/*     */ import com.google.common.collect.Lists;
/*     */ import it.unimi.dsi.fastutil.objects.Object2ObjectOpenCustomHashMap;
/*     */ import java.util.BitSet;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.function.Predicate;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.tuple.Pair;
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
/*     */ public class elw
/*     */   implements elo
/*     */ {
/*     */   private final List<Pair<Predicate<ceh>, elo>> g;
/*     */   protected final boolean a;
/*     */   protected final boolean b;
/*     */   protected final boolean c;
/*     */   protected final ekc d;
/*     */   protected final ebm e;
/*     */   protected final ebk f;
/*  31 */   private final Map<ceh, BitSet> h = (Map<ceh, BitSet>)new Object2ObjectOpenCustomHashMap(x.k());
/*     */   
/*     */   public elw(List<Pair<Predicate<ceh>, elo>> ☃) {
/*  34 */     this.g = ☃;
/*     */     
/*  36 */     elo elo1 = (elo)((Pair)☃.iterator().next()).getRight();
/*  37 */     this.a = elo1.a();
/*  38 */     this.b = elo1.b();
/*  39 */     this.c = elo1.c();
/*  40 */     this.d = elo1.e();
/*  41 */     this.e = elo1.f();
/*  42 */     this.f = elo1.g();
/*     */   }
/*     */ 
/*     */   
/*     */   public List<eba> a(@Nullable ceh ☃, @Nullable gc gc1, Random random) {
/*  47 */     if (☃ == null) {
/*  48 */       return Collections.emptyList();
/*     */     }
/*     */     
/*  51 */     BitSet bitSet = this.h.get(☃);
/*  52 */     if (bitSet == null) {
/*  53 */       bitSet = new BitSet();
/*  54 */       for (int j = 0; j < this.g.size(); j++) {
/*  55 */         Pair<Predicate<ceh>, elo> pair = this.g.get(j);
/*  56 */         if (((Predicate<ceh>)pair.getLeft()).test(☃)) {
/*  57 */           bitSet.set(j);
/*     */         }
/*     */       } 
/*  60 */       this.h.put(☃, bitSet);
/*     */     } 
/*     */     
/*  63 */     List<eba> list = Lists.newArrayList();
/*  64 */     long l = random.nextLong();
/*  65 */     for (int i = 0; i < bitSet.length(); i++) {
/*  66 */       if (bitSet.get(i)) {
/*  67 */         list.addAll(((elo)((Pair)this.g.get(i)).getRight()).a(☃, gc1, new Random(l)));
/*     */       }
/*     */     } 
/*  70 */     return list;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  75 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  80 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  85 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  90 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public ekc e() {
/*  95 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public ebm f() {
/* 100 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public ebk g() {
/* 105 */     return this.f;
/*     */   }
/*     */   
/*     */   public static class a {
/* 109 */     private final List<Pair<Predicate<ceh>, elo>> a = Lists.newArrayList();
/*     */     
/*     */     public void a(Predicate<ceh> ☃, elo elo1) {
/* 112 */       this.a.add(Pair.of(☃, elo1));
/*     */     }
/*     */     
/*     */     public elo a() {
/* 116 */       return new elw(this.a);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\elw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */