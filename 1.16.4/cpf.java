/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.util.Function6;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import java.util.Arrays;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.function.Supplier;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cpf
/*     */ {
/*  39 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*     */   public static final Codec<cpf> a;
/*     */   
/*     */   private static final Map<cla<?>, ciw<?, ?>> c;
/*     */   private final gm<bsv> d;
/*     */   private final chv e;
/*     */   
/*     */   static {
/*  48 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)vg.<bsv>a(gm.ay).forGetter(()), (App)chv.a.fieldOf("structures").forGetter(cpf::d), (App)cpe.a.listOf().fieldOf("layers").forGetter(cpf::f), (App)Codec.BOOL.fieldOf("lakes").orElse(Boolean.valueOf(false)).forGetter(()), (App)Codec.BOOL.fieldOf("features").orElse(Boolean.valueOf(false)).forGetter(()), (App)bsv.d.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter(())).apply((Applicative)☃, cpf::new)).stable();
/*     */     
/*  50 */     c = x.<Map<cla<?>, ciw<?, ?>>>a(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put(cla.c, ko.b);
/*     */           ☃.put(cla.q, ko.t);
/*     */           ☃.put(cla.k, ko.k);
/*     */           ☃.put(cla.j, ko.j);
/*     */           ☃.put(cla.f, ko.f);
/*     */           ☃.put(cla.e, ko.e);
/*     */           ☃.put(cla.g, ko.g);
/*     */           ☃.put(cla.m, ko.m);
/*     */           ☃.put(cla.i, ko.h);
/*     */           ☃.put(cla.l, ko.l);
/*     */           ☃.put(cla.o, ko.q);
/*     */           ☃.put(cla.d, ko.d);
/*     */           ☃.put(cla.n, ko.o);
/*     */           ☃.put(cla.b, ko.a);
/*     */           ☃.put(cla.h, ko.y);
/*     */           ☃.put(cla.s, ko.s);
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*  71 */   private final List<cpe> f = Lists.newArrayList();
/*     */   private Supplier<bsv> g;
/*  73 */   private final ceh[] h = new ceh[256];
/*     */   private boolean i;
/*     */   private boolean j = false;
/*     */   private boolean k = false;
/*     */   
/*     */   public cpf(gm<bsv> ☃, chv chv1, List<cpe> list, boolean bool1, boolean bool2, Optional<Supplier<bsv>> optional) {
/*  79 */     this(chv1, ☃);
/*  80 */     if (bool1) {
/*  81 */       b();
/*     */     }
/*  83 */     if (bool2) {
/*  84 */       a();
/*     */     }
/*  86 */     this.f.addAll(list);
/*  87 */     h();
/*  88 */     if (!optional.isPresent()) {
/*  89 */       b.error("Unknown biome, defaulting to plains");
/*  90 */       this.g = (() -> (bsv)☃.d(btb.b));
/*     */     } else {
/*  92 */       this.g = optional.get();
/*     */     } 
/*     */   }
/*     */   
/*     */   public cpf(chv ☃, gm<bsv> gm1) {
/*  97 */     this.d = gm1;
/*  98 */     this.e = ☃;
/*  99 */     this.g = (() -> (bsv)☃.d(btb.b));
/*     */   }
/*     */   
/*     */   public cpf a(chv ☃) {
/* 103 */     return a(this.f, ☃);
/*     */   }
/*     */   
/*     */   public cpf a(List<cpe> ☃, chv chv1) {
/* 107 */     cpf cpf1 = new cpf(chv1, this.d);
/* 108 */     for (cpe cpe : ☃) {
/* 109 */       cpf1.f.add(new cpe(cpe.a(), cpe.b().b()));
/* 110 */       cpf1.h();
/*     */     } 
/* 112 */     cpf1.a(this.g);
/* 113 */     if (this.j) {
/* 114 */       cpf1.a();
/*     */     }
/* 116 */     if (this.k) {
/* 117 */       cpf1.b();
/*     */     }
/* 119 */     return cpf1;
/*     */   }
/*     */   
/*     */   public void a() {
/* 123 */     this.j = true;
/*     */   }
/*     */   
/*     */   public void b() {
/* 127 */     this.k = true;
/*     */   }
/*     */   
/*     */   public bsv c() {
/* 131 */     bsv ☃ = e();
/* 132 */     bsw bsw = ☃.e();
/*     */ 
/*     */     
/* 135 */     bsw.a a = (new bsw.a()).a(bsw.d());
/*     */     
/* 137 */     if (this.k) {
/* 138 */       a.a(chm.b.b, kh.O);
/* 139 */       a.a(chm.b.b, kh.P);
/*     */     } 
/*     */     
/* 142 */     for (Map.Entry<cla<?>, cmy> entry : this.e.a().entrySet()) {
/* 143 */       a.a(bsw.a(c.get(entry.getKey())));
/*     */     }
/*     */     
/* 146 */     boolean bool = ((!this.i || this.d.c(☃).equals(Optional.of(btb.Z))) && this.j);
/*     */     
/* 148 */     if (bool) {
/* 149 */       List<List<Supplier<civ<?, ?>>>> list = bsw.c();
/* 150 */       for (int j = 0; j < list.size(); j++) {
/* 151 */         if (j != chm.b.d.ordinal() && j != chm.b.e.ordinal()) {
/*     */ 
/*     */           
/* 154 */           List<Supplier<civ<?, ?>>> list1 = list.get(j);
/* 155 */           for (Supplier<civ<?, ?>> supplier : list1) {
/* 156 */             a.a(j, supplier);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 161 */     ceh[] arrayOfCeh = g();
/* 162 */     for (int i = 0; i < arrayOfCeh.length; i++) {
/* 163 */       ceh ceh1 = arrayOfCeh[i];
/* 164 */       if (ceh1 != null && !chn.a.e.e().test(ceh1)) {
/* 165 */         this.h[i] = null;
/* 166 */         a.a(chm.b.j, cjl.T.b(new cmd(i, ceh1)));
/*     */       } 
/*     */     } 
/*     */     
/* 170 */     return (new bsv.a())
/* 171 */       .a(☃.c())
/* 172 */       .a(☃.t())
/* 173 */       .a(☃.h())
/* 174 */       .b(☃.j())
/* 175 */       .c(☃.k())
/* 176 */       .d(☃.i())
/* 177 */       .a(☃.l())
/* 178 */       .a(a.a())
/* 179 */       .a(☃.b())
/* 180 */       .a();
/*     */   }
/*     */   
/*     */   public chv d() {
/* 184 */     return this.e;
/*     */   }
/*     */   
/*     */   public bsv e() {
/* 188 */     return this.g.get();
/*     */   }
/*     */   
/*     */   public void a(Supplier<bsv> ☃) {
/* 192 */     this.g = ☃;
/*     */   }
/*     */   
/*     */   public List<cpe> f() {
/* 196 */     return this.f;
/*     */   }
/*     */   
/*     */   public ceh[] g() {
/* 200 */     return this.h;
/*     */   }
/*     */   
/*     */   public void h() {
/* 204 */     Arrays.fill((Object[])this.h, 0, this.h.length, (Object)null);
/*     */     
/* 206 */     int ☃ = 0;
/*     */     
/* 208 */     for (cpe cpe : this.f) {
/* 209 */       cpe.a(☃);
/* 210 */       ☃ += cpe.a();
/*     */     } 
/*     */ 
/*     */     
/* 214 */     this.i = true;
/* 215 */     for (cpe cpe : this.f) {
/* 216 */       for (int i = cpe.c(); i < cpe.c() + cpe.a(); i++) {
/* 217 */         ceh ceh1 = cpe.b();
/* 218 */         if (!ceh1.a(bup.a)) {
/*     */ 
/*     */           
/* 221 */           this.i = false;
/* 222 */           this.h[i] = ceh1;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static cpf a(gm<bsv> ☃) {
/* 230 */     chv chv1 = new chv(Optional.of(chv.c), Maps.newHashMap((Map)ImmutableMap.of(cla.q, chv.b.get(cla.q))));
/*     */ 
/*     */     
/* 233 */     cpf cpf1 = new cpf(chv1, ☃);
/*     */     
/* 235 */     cpf1.g = (() -> (bsv)☃.d(btb.b));
/* 236 */     cpf1.f().add(new cpe(1, bup.z));
/* 237 */     cpf1.f().add(new cpe(2, bup.j));
/* 238 */     cpf1.f().add(new cpe(1, bup.i));
/* 239 */     cpf1.h();
/*     */     
/* 241 */     return cpf1;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cpf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */