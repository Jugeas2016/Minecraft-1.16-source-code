/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ import java.util.function.Consumer;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dsg
/*     */   extends dot
/*     */ {
/*     */   private final Consumer<Optional<brt>> a;
/*     */   private g b;
/*  34 */   private final Set<f> c = Sets.newHashSet();
/*     */   private dlj p;
/*     */   @Nullable
/*     */   private List<afa> q;
/*     */   private final brt r;
/*     */   
/*     */   public dsg(brt ☃, Consumer<Optional<brt>> consumer) {
/*  41 */     super(new of("editGamerule.title"));
/*  42 */     this.r = ☃;
/*  43 */     this.a = consumer;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  48 */     this.i.m.a(true);
/*  49 */     super.b();
/*  50 */     this.b = new g(this, this.r);
/*  51 */     this.e.add(this.b);
/*     */     
/*  53 */     a(new dlj(this.k / 2 - 155 + 160, this.l - 29, 150, 20, nq.d, ☃ -> this.a.accept(Optional.empty())));
/*     */ 
/*     */     
/*  56 */     this.p = a(new dlj(this.k / 2 - 155, this.l - 29, 150, 20, nq.c, ☃ -> this.a.accept(Optional.of(this.r))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void e() {
/*  63 */     this.i.m.a(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void at_() {
/*  68 */     this.a.accept(Optional.empty());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/*  73 */     this.q = null;
/*  74 */     this.b.a(☃, i, j, f);
/*     */     
/*  76 */     a(☃, this.o, this.d, this.k / 2, 20, 16777215);
/*  77 */     super.a(☃, i, j, f);
/*     */     
/*  79 */     if (this.q != null) {
/*  80 */       c(☃, this.q, i, j);
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(@Nullable List<afa> ☃) {
/*  85 */     this.q = ☃;
/*     */   }
/*     */   
/*     */   private void h() {
/*  89 */     this.p.o = this.c.isEmpty();
/*     */   }
/*     */   
/*     */   private void a(f ☃) {
/*  93 */     this.c.add(☃);
/*  94 */     h();
/*     */   }
/*     */   
/*     */   private void b(f ☃) {
/*  98 */     this.c.remove(☃);
/*  99 */     h();
/*     */   }
/*     */   
/*     */   public abstract class f extends dlo.a<f> {
/*     */     @Nullable
/*     */     private final List<afa> a;
/*     */     
/*     */     public f(dsg ☃, @Nullable List<afa> list) {
/* 107 */       this.a = list;
/*     */     }
/*     */   }
/*     */   
/*     */   public class b extends f {
/*     */     private final nr b;
/*     */     
/*     */     public b(dsg ☃, nr nr1) {
/* 115 */       super(☃, null);
/* 116 */       this.b = nr1;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f1) {
/* 121 */       dkw.a(☃, (dsg.a(this.a)).g, this.b, k + m / 2, j + 5, 16777215);
/*     */     }
/*     */ 
/*     */     
/*     */     public List<? extends dmi> au_() {
/* 126 */       return (List<? extends dmi>)ImmutableList.of();
/*     */     }
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   static interface c<T extends brt.g<T>> {
/*     */     dsg.f create(nr param1nr, List<afa> param1List, String param1String, T param1T);
/*     */   }
/*     */   
/*     */   public abstract class d extends f {
/*     */     private final List<afa> a;
/* 137 */     protected final List<dmi> b = Lists.newArrayList();
/*     */     
/*     */     public d(dsg ☃, @Nullable List<afa> list, nr nr1) {
/* 140 */       super(☃, list);
/* 141 */       this.a = (dsg.b(☃)).g.b(nr1, 175);
/*     */     }
/*     */ 
/*     */     
/*     */     public List<? extends dmi> au_() {
/* 146 */       return this.b;
/*     */     }
/*     */     
/*     */     protected void a(dfm ☃, int i, int j) {
/* 150 */       if (this.a.size() == 1) {
/* 151 */         (dsg.c(this.c)).g.b(☃, this.a.get(0), j, (i + 5), 16777215);
/* 152 */       } else if (this.a.size() >= 2) {
/* 153 */         (dsg.d(this.c)).g.b(☃, this.a.get(0), j, i, 16777215);
/* 154 */         (dsg.e(this.c)).g.b(☃, this.a.get(1), j, (i + 10), 16777215);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public class a extends d {
/*     */     private final dlj e;
/*     */     
/*     */     public a(dsg ☃, nr nr1, List<afa> list, String str, brt.a a1) {
/* 163 */       super(☃, list, nr1);
/* 164 */       this.e = new dlj(this, 10, 5, 44, 20, nq.a(a1.a()), dlj1 -> { boolean bool = !☃.a(); ☃.a(bool, (MinecraftServer)null); dlj1.a(nq.a(☃.a())); }☃, nr1, a1, str)
/*     */         {
/*     */ 
/*     */ 
/*     */           
/*     */           protected nx c()
/*     */           {
/* 171 */             return nq.a(this.b, this.c.a()).c("\n").c(this.d);
/*     */           }
/*     */         };
/* 174 */       this.b.add(this.e);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 179 */       a(☃, j, k);
/* 180 */       this.e.l = k + m - 45;
/* 181 */       this.e.m = j;
/* 182 */       this.e.a(☃, i1, i2, f);
/*     */     }
/*     */   }
/*     */   
/*     */   public class e extends d {
/*     */     private final dlq e;
/*     */     
/*     */     public e(dsg ☃, nr nr1, List<afa> list, String str, brt.d d1) {
/* 190 */       super(☃, list, nr1);
/*     */       
/* 192 */       this.e = new dlq((dsg.f(☃)).g, 10, 5, 42, 20, nr1.e().c("\n").c(str).c("\n"));
/* 193 */       this.e.a(Integer.toString(d1.a()));
/* 194 */       this.e.a(str -> {
/*     */             if (☃.b(str)) {
/*     */               this.e.l(14737632);
/*     */               dsg.a(this.a, this);
/*     */             } else {
/*     */               this.e.l(16711680);
/*     */               dsg.b(this.a, this);
/*     */             } 
/*     */           });
/* 203 */       this.b.add(this.e);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 208 */       a(☃, j, k);
/* 209 */       this.e.l = k + m - 44;
/* 210 */       this.e.m = j;
/* 211 */       this.e.a(☃, i1, i2, f);
/*     */     }
/*     */   }
/*     */   
/*     */   public class g
/*     */     extends dlo<f> {
/*     */     public g(dsg ☃, brt brt1) {
/* 218 */       super(dsg.g(☃), ☃.k, ☃.l, 43, ☃.l - 32, 24);
/*     */       
/* 220 */       Map<brt.b, Map<brt.e<?>, dsg.f>> map = Maps.newHashMap();
/*     */       
/* 222 */       brt.a(new brt.c(this, ☃, brt1, map)
/*     */           {
/*     */             public void b(brt.e<brt.a> ☃, brt.f<brt.a> f1) {
/* 225 */               a(☃, (☃, list, str, a1) -> new dsg.a(this.d.a, ☃, list, str, a1));
/*     */             }
/*     */ 
/*     */             
/*     */             public void c(brt.e<brt.d> ☃, brt.f<brt.d> f1) {
/* 230 */               a(☃, (☃, list, str, d1) -> new dsg.e(this.d.a, ☃, list, str, d1));
/*     */             } private <T extends brt.g<T>> void a(brt.e<T> ☃, dsg.c<T> c1) {
/*     */               ImmutableList immutableList;
/*     */               String str3;
/* 234 */               nr nr1 = new of(☃.b());
/* 235 */               nr nr2 = (new oe(☃.a())).a(k.o);
/*     */               
/* 237 */               T t = this.b.a(☃);
/* 238 */               String str1 = t.b();
/* 239 */               nr nr3 = (new of("editGamerule.default", new Object[] { new oe(str1) })).a(k.h);
/* 240 */               String str2 = ☃.b() + ".description";
/*     */ 
/*     */ 
/*     */               
/* 244 */               if (ekx.a(str2)) {
/* 245 */                 ImmutableList.Builder<afa> builder = ImmutableList.builder().add(nr2.f());
/* 246 */                 nr nr = new of(str2);
/* 247 */                 dsg.h(this.d.a).b(nr, 150).forEach(builder::add);
/* 248 */                 immutableList = builder.add(nr3.f()).build();
/* 249 */                 str3 = nr.getString() + "\n" + nr3.getString();
/*     */               } else {
/* 251 */                 immutableList = ImmutableList.of(nr2.f(), nr3.f());
/* 252 */                 str3 = nr3.getString();
/*     */               } 
/*     */               
/* 255 */               ((Map<brt.e<T>, dsg.f>)this.c.computeIfAbsent(☃.c(), ☃ -> Maps.newHashMap())).put(☃, c1.create(nr1, (List<afa>)immutableList, str3, t));
/*     */             }
/*     */           });
/*     */       
/* 259 */       map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(☃ -> {
/*     */             b(new dsg.b(this.a, (new of(((brt.b)☃.getKey()).a())).a(new k[] { k.r, k.o })));
/*     */             ((Map)☃.getValue()).entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(brt.e::a))).forEach(());
/*     */           });
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, int i, int j, float f) {
/* 267 */       super.a(☃, i, j, f);
/* 268 */       if (b(i, j)) {
/* 269 */         dsg.f f1 = a(i, j);
/* 270 */         if (f1 != null)
/* 271 */           dsg.a(this.a, dsg.f.a(f1)); 
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dsg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */