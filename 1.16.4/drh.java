/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.Function;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class drh
/*     */ {
/*     */   private final abw a;
/*     */   private final List<abu> b;
/*     */   private final List<abu> c;
/*     */   private final Function<abu, vk> d;
/*     */   private final Runnable e;
/*     */   private final Consumer<abw> f;
/*     */   
/*     */   public drh(Runnable ☃, Function<abu, vk> function, abw abw1, Consumer<abw> consumer) {
/*  28 */     this.e = ☃;
/*  29 */     this.d = function;
/*  30 */     this.a = abw1;
/*  31 */     this.b = Lists.newArrayList(abw1.e());
/*     */     
/*  33 */     Collections.reverse(this.b);
/*  34 */     this.c = Lists.newArrayList(abw1.c());
/*  35 */     this.c.removeAll(this.b);
/*  36 */     this.f = consumer;
/*     */   }
/*     */   
/*     */   public Stream<a> a() {
/*  40 */     return this.c.stream().map(☃ -> new d(this, ☃));
/*     */   }
/*     */   
/*     */   public Stream<a> b() {
/*  44 */     return this.b.stream().map(☃ -> new c(this, ☃));
/*     */   }
/*     */   
/*     */   public void c() {
/*  48 */     this.a.a((Collection<String>)Lists.reverse(this.b).stream().map(abu::e).collect(ImmutableList.toImmutableList()));
/*  49 */     this.f.accept(this.a);
/*     */   }
/*     */   
/*     */   public void d() {
/*  53 */     this.a.a();
/*     */     
/*  55 */     this.b.retainAll(this.a.c());
/*     */     
/*  57 */     this.c.clear();
/*  58 */     this.c.addAll(this.a.c());
/*  59 */     this.c.removeAll(this.b);
/*     */   }
/*     */   
/*     */   public static interface a {
/*     */     vk a();
/*     */     
/*     */     abv b();
/*     */     
/*     */     nr c();
/*     */     
/*     */     nr d();
/*     */     
/*     */     abx e();
/*     */     
/*     */     default nr f() {
/*  74 */       return e().decorate(d());
/*     */     }
/*     */     
/*     */     boolean g();
/*     */     
/*     */     boolean h();
/*     */     
/*     */     void i();
/*     */     
/*     */     void j();
/*     */     
/*     */     void k();
/*     */     
/*     */     void l();
/*     */     
/*     */     boolean m();
/*     */     
/*     */     default boolean n() {
/*  92 */       return !m();
/*     */     }
/*     */     
/*     */     default boolean o() {
/*  96 */       return (m() && !h());
/*     */     }
/*     */     
/*     */     boolean p();
/*     */     
/*     */     boolean q();
/*     */   }
/*     */   
/*     */   abstract class b implements a {
/*     */     private final abu b;
/*     */     
/*     */     public b(drh this$0, abu ☃) {
/* 108 */       this.b = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     protected abstract List<abu> r();
/*     */     
/*     */     protected abstract List<abu> s();
/*     */     
/*     */     public vk a() {
/* 117 */       return drh.a(this.a).apply(this.b);
/*     */     }
/*     */ 
/*     */     
/*     */     public abv b() {
/* 122 */       return this.b.c();
/*     */     }
/*     */ 
/*     */     
/*     */     public nr c() {
/* 127 */       return this.b.a();
/*     */     }
/*     */ 
/*     */     
/*     */     public nr d() {
/* 132 */       return this.b.b();
/*     */     }
/*     */ 
/*     */     
/*     */     public abx e() {
/* 137 */       return this.b.i();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean g() {
/* 142 */       return this.b.g();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean h() {
/* 147 */       return this.b.f();
/*     */     }
/*     */     
/*     */     protected void t() {
/* 151 */       r().remove(this.b);
/* 152 */       this.b.h().a(s(), this.b, Function.identity(), true);
/* 153 */       drh.b(this.a).run();
/*     */     }
/*     */     
/*     */     protected void a(int ☃) {
/* 157 */       List<abu> list = r();
/* 158 */       int i = list.indexOf(this.b);
/* 159 */       list.remove(i);
/* 160 */       list.add(i + ☃, this.b);
/* 161 */       drh.b(this.a).run();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean p() {
/* 166 */       List<abu> ☃ = r();
/* 167 */       int i = ☃.indexOf(this.b);
/* 168 */       return (i > 0 && !((abu)☃.get(i - 1)).g());
/*     */     }
/*     */ 
/*     */     
/*     */     public void k() {
/* 173 */       a(-1);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean q() {
/* 178 */       List<abu> ☃ = r();
/* 179 */       int i = ☃.indexOf(this.b);
/* 180 */       return (i >= 0 && i < ☃.size() - 1 && !((abu)☃.get(i + 1)).g());
/*     */     }
/*     */ 
/*     */     
/*     */     public void l() {
/* 185 */       a(1);
/*     */     }
/*     */   }
/*     */   
/*     */   class c extends b {
/*     */     public c(drh this$0, abu ☃) {
/* 191 */       super(this$0, ☃);
/*     */     }
/*     */ 
/*     */     
/*     */     protected List<abu> r() {
/* 196 */       return drh.c(this.b);
/*     */     }
/*     */ 
/*     */     
/*     */     protected List<abu> s() {
/* 201 */       return drh.d(this.b);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean m() {
/* 206 */       return true;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void i() {}
/*     */ 
/*     */ 
/*     */     
/*     */     public void j() {
/* 216 */       t();
/*     */     }
/*     */   }
/*     */   
/*     */   class d extends b {
/*     */     public d(drh this$0, abu ☃) {
/* 222 */       super(this$0, ☃);
/*     */     }
/*     */ 
/*     */     
/*     */     protected List<abu> r() {
/* 227 */       return drh.d(this.b);
/*     */     }
/*     */ 
/*     */     
/*     */     protected List<abu> s() {
/* 232 */       return drh.c(this.b);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean m() {
/* 237 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public void i() {
/* 242 */       t();
/*     */     }
/*     */     
/*     */     public void j() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\drh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */