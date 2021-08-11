/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */ {
/*  80 */   private final List<eba> a = Lists.newArrayList(); private final ebk c; private final boolean d; private ekc e;
/*  81 */   private final Map<gc, List<eba>> b = Maps.newEnumMap(gc.class); private final boolean f; private final boolean g;
/*     */   private final ebm h;
/*     */   
/*     */   private a(boolean ☃, boolean bool1, boolean bool2, ebm ebm1, ebk ebk1) {
/*  85 */     for (gc gc : gc.values()) {
/*  86 */       this.b.put(gc, Lists.newArrayList());
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 101 */     this.c = ebk1;
/* 102 */     this.d = ☃;
/* 103 */     this.f = bool1;
/* 104 */     this.g = bool2;
/* 105 */     this.h = ebm1;
/*     */   } public a(ebf ☃, ebk ebk1, boolean bool) {
/*     */     this(☃.b(), ☃.c().a(), bool, ☃.h(), ebk1);
/*     */   } public a a(gc ☃, eba eba1) {
/* 109 */     ((List<eba>)this.b.get(☃)).add(eba1);
/* 110 */     return this;
/*     */   }
/*     */   
/*     */   public a a(eba ☃) {
/* 114 */     this.a.add(☃);
/* 115 */     return this;
/*     */   }
/*     */   
/*     */   public a a(ekc ☃) {
/* 119 */     this.e = ☃;
/*     */     
/* 121 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public elo b() {
/* 129 */     if (this.e == null) {
/* 130 */       throw new RuntimeException("Missing particle!");
/*     */     }
/* 132 */     return new elx(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\elx$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */