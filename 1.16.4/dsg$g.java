/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Comparator;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class g
/*     */   extends dlo<dsg.f>
/*     */ {
/*     */   public g(dsg ☃, brt brt1) {
/* 218 */     super(dsg.g(☃), ☃.k, ☃.l, 43, ☃.l - 32, 24);
/*     */     
/* 220 */     Map<brt.b, Map<brt.e<?>, dsg.f>> map = Maps.newHashMap();
/*     */     
/* 222 */     brt.a(new brt.c(this, ☃, brt1, map)
/*     */         {
/*     */           public void b(brt.e<brt.a> ☃, brt.f<brt.a> f1) {
/* 225 */             a(☃, (☃, list, str, a1) -> new dsg.a(this.d.a, ☃, list, str, a1));
/*     */           }
/*     */ 
/*     */           
/*     */           public void c(brt.e<brt.d> ☃, brt.f<brt.d> f1) {
/* 230 */             a(☃, (☃, list, str, d1) -> new dsg.e(this.d.a, ☃, list, str, d1));
/*     */           } private <T extends brt.g<T>> void a(brt.e<T> ☃, dsg.c<T> c1) {
/*     */             ImmutableList immutableList;
/*     */             String str3;
/* 234 */             nr nr1 = new of(☃.b());
/* 235 */             nr nr2 = (new oe(☃.a())).a(k.o);
/*     */             
/* 237 */             T t = this.b.a(☃);
/* 238 */             String str1 = t.b();
/* 239 */             nr nr3 = (new of("editGamerule.default", new Object[] { new oe(str1) })).a(k.h);
/* 240 */             String str2 = ☃.b() + ".description";
/*     */ 
/*     */ 
/*     */             
/* 244 */             if (ekx.a(str2)) {
/* 245 */               ImmutableList.Builder<afa> builder = ImmutableList.builder().add(nr2.f());
/* 246 */               nr nr = new of(str2);
/* 247 */               dsg.h(this.d.a).b(nr, 150).forEach(builder::add);
/* 248 */               immutableList = builder.add(nr3.f()).build();
/* 249 */               str3 = nr.getString() + "\n" + nr3.getString();
/*     */             } else {
/* 251 */               immutableList = ImmutableList.of(nr2.f(), nr3.f());
/* 252 */               str3 = nr3.getString();
/*     */             } 
/*     */             
/* 255 */             ((Map<brt.e<T>, dsg.f>)this.c.computeIfAbsent(☃.c(), ☃ -> Maps.newHashMap())).put(☃, c1.create(nr1, (List<afa>)immutableList, str3, t));
/*     */           }
/*     */         });
/*     */     
/* 259 */     map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(☃ -> {
/*     */           b(new dsg.b(this.a, (new of(((brt.b)☃.getKey()).a())).a(new k[] { k.r, k.o })));
/*     */           ((Map)☃.getValue()).entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(brt.e::a))).forEach(());
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 267 */     super.a(☃, i, j, f);
/* 268 */     if (b(i, j)) {
/* 269 */       dsg.f f1 = a(i, j);
/* 270 */       if (f1 != null)
/* 271 */         dsg.a(this.a, dsg.f.a(f1)); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dsg$g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */