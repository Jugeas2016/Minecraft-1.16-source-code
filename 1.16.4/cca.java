/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.List;
/*     */ import java.util.function.Supplier;
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
/*     */ public class cca
/*     */   extends ccj
/*     */   implements aoy
/*     */ {
/*     */   @Nullable
/*     */   private nr a;
/*     */   @Nullable
/*  32 */   private bkx b = bkx.a;
/*     */   
/*     */   @Nullable
/*     */   private mj c;
/*     */   
/*     */   private boolean g;
/*     */   
/*     */   @Nullable
/*     */   private List<Pair<ccb, bkx>> h;
/*     */   
/*     */   public cca() {
/*  43 */     super(cck.s);
/*     */   }
/*     */   
/*     */   public cca(bkx ☃) {
/*  47 */     this();
/*  48 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static mj a(bmb ☃) {
/*  53 */     mj mj1 = null;
/*  54 */     md md = ☃.b("BlockEntityTag");
/*  55 */     if (md != null && md.c("Patterns", 9)) {
/*  56 */       mj1 = md.d("Patterns", 10).d();
/*     */     }
/*  58 */     return mj1;
/*     */   }
/*     */   
/*     */   public void a(bmb ☃, bkx bkx1) {
/*  62 */     this.c = a(☃);
/*  63 */     this.b = bkx1;
/*  64 */     this.h = null;
/*  65 */     this.g = true;
/*  66 */     this.a = ☃.t() ? ☃.r() : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public nr R() {
/*  71 */     if (this.a != null) {
/*  72 */       return this.a;
/*     */     }
/*  74 */     return new of("block.minecraft.banner");
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public nr T() {
/*  80 */     return this.a;
/*     */   }
/*     */   
/*     */   public void a(nr ☃) {
/*  84 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public md a(md ☃) {
/*  89 */     super.a(☃);
/*     */     
/*  91 */     if (this.c != null) {
/*  92 */       ☃.a("Patterns", this.c);
/*     */     }
/*     */     
/*  95 */     if (this.a != null) {
/*  96 */       ☃.a("CustomName", nr.a.a(this.a));
/*     */     }
/*     */     
/*  99 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, md md1) {
/* 104 */     super.a(☃, md1);
/*     */     
/* 106 */     if (md1.c("CustomName", 8)) {
/* 107 */       this.a = nr.a.a(md1.l("CustomName"));
/*     */     }
/*     */     
/* 110 */     if (n()) {
/* 111 */       this.b = ((btm)p().b()).b();
/*     */     } else {
/* 113 */       this.b = null;
/*     */     } 
/* 115 */     this.c = md1.d("Patterns", 10);
/*     */     
/* 117 */     this.h = null;
/* 118 */     this.g = true;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ow a() {
/* 124 */     return new ow(this.e, 6, b());
/*     */   }
/*     */ 
/*     */   
/*     */   public md b() {
/* 129 */     return a(new md());
/*     */   }
/*     */   
/*     */   public static int b(bmb ☃) {
/* 133 */     md md = ☃.b("BlockEntityTag");
/* 134 */     if (md != null && md.e("Patterns")) {
/* 135 */       return md.d("Patterns", 10).size();
/*     */     }
/* 137 */     return 0;
/*     */   }
/*     */   
/*     */   public List<Pair<ccb, bkx>> c() {
/* 141 */     if (this.h == null && this.g) {
/* 142 */       this.h = a(a(this::p), this.c);
/*     */     }
/*     */     
/* 145 */     return this.h;
/*     */   }
/*     */   
/*     */   public static List<Pair<ccb, bkx>> a(bkx ☃, @Nullable mj mj1) {
/* 149 */     List<Pair<ccb, bkx>> list = Lists.newArrayList();
/*     */     
/* 151 */     list.add(Pair.of(ccb.a, ☃));
/*     */     
/* 153 */     if (mj1 != null) {
/* 154 */       for (int i = 0; i < mj1.size(); i++) {
/* 155 */         md md = mj1.a(i);
/* 156 */         ccb ccb = ccb.a(md.l("Pattern"));
/* 157 */         if (ccb != null) {
/* 158 */           int j = md.h("Color");
/* 159 */           list.add(Pair.of(ccb, bkx.a(j)));
/*     */         } 
/*     */       } 
/*     */     }
/* 163 */     return list;
/*     */   }
/*     */   
/*     */   public static void c(bmb ☃) {
/* 167 */     md md = ☃.b("BlockEntityTag");
/* 168 */     if (md == null || !md.c("Patterns", 9)) {
/*     */       return;
/*     */     }
/*     */     
/* 172 */     mj mj1 = md.d("Patterns", 10);
/* 173 */     if (mj1.isEmpty()) {
/*     */       return;
/*     */     }
/* 176 */     mj1.c(mj1.size() - 1);
/*     */     
/* 178 */     if (mj1.isEmpty()) {
/* 179 */       ☃.c("BlockEntityTag");
/*     */     }
/*     */   }
/*     */   
/*     */   public bmb a(ceh ☃) {
/* 184 */     bmb bmb = new bmb(btw.a(a(() -> ☃)));
/* 185 */     if (this.c != null && !this.c.isEmpty()) {
/* 186 */       bmb.a("BlockEntityTag").a("Patterns", this.c.d());
/*     */     }
/*     */     
/* 189 */     if (this.a != null) {
/* 190 */       bmb.a(this.a);
/*     */     }
/* 192 */     return bmb;
/*     */   }
/*     */   
/*     */   public bkx a(Supplier<ceh> ☃) {
/* 196 */     if (this.b == null) {
/* 197 */       this.b = ((btm)((ceh)☃.get()).b()).b();
/*     */     }
/* 199 */     return this.b;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cca.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */