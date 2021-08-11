/*     */ import com.google.common.collect.ImmutableList;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class null
/*     */   implements brt.c
/*     */ {
/*     */   null(dsg.g ☃, dsg paramdsg, brt parambrt, Map paramMap) {}
/*     */   
/*     */   public void b(brt.e<brt.a> ☃, brt.f<brt.a> f1) {
/* 225 */     a(☃, (☃, list, str, a1) -> new dsg.a(this.d.a, ☃, list, str, a1));
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(brt.e<brt.d> ☃, brt.f<brt.d> f1) {
/* 230 */     a(☃, (☃, list, str, d1) -> new dsg.e(this.d.a, ☃, list, str, d1));
/*     */   } private <T extends brt.g<T>> void a(brt.e<T> ☃, dsg.c<T> c1) {
/*     */     ImmutableList immutableList;
/*     */     String str3;
/* 234 */     nr nr1 = new of(☃.b());
/* 235 */     nr nr2 = (new oe(☃.a())).a(k.o);
/*     */     
/* 237 */     T t = this.b.a(☃);
/* 238 */     String str1 = t.b();
/* 239 */     nr nr3 = (new of("editGamerule.default", new Object[] { new oe(str1) })).a(k.h);
/* 240 */     String str2 = ☃.b() + ".description";
/*     */ 
/*     */ 
/*     */     
/* 244 */     if (ekx.a(str2)) {
/* 245 */       ImmutableList.Builder<afa> builder = ImmutableList.builder().add(nr2.f());
/* 246 */       nr nr = new of(str2);
/* 247 */       dsg.h(this.d.a).b(nr, 150).forEach(builder::add);
/* 248 */       immutableList = builder.add(nr3.f()).build();
/* 249 */       str3 = nr.getString() + "\n" + nr3.getString();
/*     */     } else {
/* 251 */       immutableList = ImmutableList.of(nr2.f(), nr3.f());
/* 252 */       str3 = nr3.getString();
/*     */     } 
/*     */     
/* 255 */     ((Map<brt.e<T>, dsg.f>)this.c.computeIfAbsent(☃.c(), ☃ -> Maps.newHashMap())).put(☃, c1.create(nr1, (List<afa>)immutableList, str3, t));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dsg$g$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */