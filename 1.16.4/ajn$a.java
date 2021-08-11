/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import it.unimi.dsi.fastutil.ints.Int2IntMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.ints.IntSet;
/*     */ import java.util.Objects;
/*     */ import javax.annotation.Nullable;
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
/*     */ public final class a
/*     */   extends ajn.b
/*     */ {
/*     */   @Nullable
/*     */   private IntSet e;
/*     */   @Nullable
/*     */   private IntSet f;
/*     */   @Nullable
/*     */   private Int2IntMap g;
/*     */   
/*     */   public a(Typed<?> ☃, Schema schema) {
/* 268 */     super(☃, schema);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a() {
/* 273 */     this.e = (IntSet)new IntOpenHashSet();
/* 274 */     this.f = (IntSet)new IntOpenHashSet();
/* 275 */     this.g = (Int2IntMap)new Int2IntOpenHashMap();
/*     */     
/* 277 */     for (int ☃ = 0; ☃ < this.b.size(); ☃++) {
/* 278 */       Dynamic<?> dynamic = this.b.get(☃);
/* 279 */       String str = dynamic.get("Name").asString("");
/* 280 */       if (ajn.a().containsKey(str)) {
/* 281 */         boolean bool = Objects.equals(dynamic.get("Properties").get("decayable").asString(""), "false");
/* 282 */         this.e.add(☃);
/* 283 */         this.g.put(a(str, bool, 7), ☃);
/* 284 */         this.b.set(☃, a(dynamic, str, bool, 7));
/*     */       } 
/* 286 */       if (ajn.b().contains(str)) {
/* 287 */         this.f.add(☃);
/*     */       }
/*     */     } 
/*     */     
/* 291 */     return (this.e.isEmpty() && this.f.isEmpty());
/*     */   }
/*     */   
/*     */   private Dynamic<?> a(Dynamic<?> ☃, String str, boolean bool, int i) {
/* 295 */     Dynamic<?> dynamic1 = ☃.emptyMap();
/* 296 */     dynamic1 = dynamic1.set("persistent", dynamic1.createString(bool ? "true" : "false"));
/* 297 */     dynamic1 = dynamic1.set("distance", dynamic1.createString(Integer.toString(i)));
/*     */     
/* 299 */     Dynamic<?> dynamic2 = ☃.emptyMap();
/* 300 */     dynamic2 = dynamic2.set("Properties", dynamic1);
/* 301 */     dynamic2 = dynamic2.set("Name", dynamic2.createString(str));
/* 302 */     return dynamic2;
/*     */   }
/*     */   
/*     */   public boolean a(int ☃) {
/* 306 */     return this.f.contains(☃);
/*     */   }
/*     */   
/*     */   public boolean b(int ☃) {
/* 310 */     return this.e.contains(☃);
/*     */   }
/*     */   
/*     */   private int d(int ☃) {
/* 314 */     if (a(☃)) {
/* 315 */       return 0;
/*     */     }
/* 317 */     return Integer.parseInt(((Dynamic)this.b.get(☃)).get("Properties").get("distance").asString(""));
/*     */   }
/*     */   
/*     */   private void a(int ☃, int i, int j) {
/* 321 */     Dynamic<?> dynamic = this.b.get(i);
/* 322 */     String str = dynamic.get("Name").asString("");
/* 323 */     boolean bool = Objects.equals(dynamic.get("Properties").get("persistent").asString(""), "true");
/* 324 */     int k = a(str, bool, j);
/*     */     
/* 326 */     if (!this.g.containsKey(k)) {
/* 327 */       int n = this.b.size();
/* 328 */       this.e.add(n);
/* 329 */       this.g.put(k, n);
/* 330 */       this.b.add(a(dynamic, str, bool, j));
/*     */     } 
/*     */     
/* 333 */     int m = this.g.get(k);
/* 334 */     if (1 << this.d.b() <= m) {
/* 335 */       agc agc = new agc(this.d.b() + 1, 4096);
/* 336 */       for (int n = 0; n < 4096; n++) {
/* 337 */         agc.a(n, this.d.a(n));
/*     */       }
/* 339 */       this.d = agc;
/*     */     } 
/* 341 */     this.d.a(☃, m);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajn$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */